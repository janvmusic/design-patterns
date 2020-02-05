import org.junit.Test;
import prototype.PrototypeFactory;
import prototype.Sheep;

public class PrototypePatternTest {

    @Test
    public void prototypePatternTest() {
        PrototypeFactory animalMaker = new PrototypeFactory();
        Sheep sally = new Sheep();
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);
        System.out.println(clonedSheep);
        System.out.println("Sally hashcode: " + System.identityHashCode(sally));
        System.out.println("Cloned hashcode: " + System.identityHashCode(clonedSheep));
    }
}
