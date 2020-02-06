import org.junit.Test;
import reflection.ReflectionExample;

import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionTest {
    @Test
    public void reflectionExampleTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<ReflectionExample> reflectClass = ReflectionExample.class;
        String className = reflectClass.getName();
        System.out.println("This class is: " + className);
        System.out.println();

        int classModifier = reflectClass.getModifiers();
        System.out.println("This class is private? " + Modifier.isPrivate(classModifier));
        System.out.println("This class is protected? " + Modifier.isProtected(classModifier));
        System.out.println("This class is public? " + Modifier.isPublic(classModifier));
        System.out.println("This class is abstract? " + Modifier.isAbstract(classModifier));
        System.out.println("This class is static? " + Modifier.isStatic(classModifier));
        System.out.println("This class is interface? " + Modifier.isInterface(classModifier));
        System.out.println("This class is volatile? " + Modifier.isVolatile(classModifier));
        System.out.println("This class is synchronized? " + Modifier.isSynchronized(classModifier));
        System.out.println();

        Class<?>[] interfaces = reflectClass.getInterfaces();
        System.out.println("These are class interfaces " + Arrays.toString(reflectClass.getInterfaces()));
        System.out.println();

        Class<?> classSuper = reflectClass.getSuperclass().getNestHost();
        System.out.println("Who's my parent class? " + classSuper);
        System.out.println();

        Method[] availableMethods = reflectClass.getMethods();

        for (Method method : availableMethods) {
            System.out.println("Method name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType());
            System.out.println("Parameters: " + Arrays.toString(method.getParameters()));
            System.out.println();
        }

        Constructor<?> constructor = reflectClass.getConstructor(int.class);

        Class<?>[] parameterTypes = constructor.getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            System.out.println(parameterType.getName());
        }

        ReflectionExample instance = reflectClass.getConstructor(int.class).newInstance(10);
        Field idCode = instance.getClass().getDeclaredField("_idCode");
        idCode.setAccessible(true);
        System.out.println("Private field name: " + idCode.getName());
        System.out.println("Private field value: " + idCode.get(instance));
        System.out.println();

        String methodToExecute = "getPrivate";
        Method privateMethod = instance.getClass().getDeclaredMethod(methodToExecute, null);
        privateMethod.setAccessible(true);

        String returnValue = (String) privateMethod.invoke(instance, null);
        System.out.println("Private method: " + returnValue);

        Class<?>[] methodParameters = new Class[]{Integer.TYPE, String.class};
        methodToExecute = "getOtherPrivate";
        privateMethod = instance.getClass().getDeclaredMethod(methodToExecute, methodParameters);
        privateMethod.setAccessible(true);

        Object[] params = new Object[]{10, "Hola"};
        returnValue = (String) privateMethod.invoke(instance, params);
        System.out.println("Private method: " + returnValue);
    }
}
