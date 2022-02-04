import java.io.*;

public class Main {

    public static void main(String[] args) {

        // test
        Animal frog = new Animal("frog");
        Animal cat  = new Animal("cat");
        Animal dog  = new Animal("dog");
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();

        try (ObjectOutputStream oos = new ObjectOutputStream(byteStream)) {
            oos.writeInt(3);
            oos.writeObject(frog);
            oos.writeObject(dog);
            oos.writeObject(cat);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Animal[] animalArray = deserializeAnimalArray(byteStream.toByteArray());

        for (Animal animal : animalArray) {
            System.out.println(animal.getName());
        }
    }

    /**
     * Deserializes array of Animal.
     * @param data Serialized array of Animal
     * @return Deserialized array of Animal.
     */
    public static Animal[] deserializeAnimalArray(byte[] data) {

        ByteArrayInputStream byteStream = new ByteArrayInputStream(data);
        Animal deserializedAnimal;
        Animal[] animalArray;

        try (ObjectInputStream ois = new ObjectInputStream(byteStream)) {
            int size = ois.readInt();
            animalArray = new Animal[size];
            for (int i = 0; i < size; ++i) {
                deserializedAnimal = (Animal) ois.readObject();
                animalArray[i] = deserializedAnimal;
            }
        }
        catch (Exception ex) {
            throw new IllegalArgumentException();
        }
        return animalArray;
    }

}
