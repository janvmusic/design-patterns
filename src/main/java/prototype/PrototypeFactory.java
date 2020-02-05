package prototype;

public class PrototypeFactory {
    public Animal getClone(Animal animalSample) {
        return animalSample.makeCopy();
    }
}
