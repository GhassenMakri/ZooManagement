import java.util.ArrayList;
import java.util.Scanner;

public class ZooManagment {


    public static void main(String[] args) {

        Zoo myZoo = new Zoo("my zoo", "Tunis", 5);

        Animal lion = new Animal("Félins", "Lion", 5, true);
        Animal elephant = new Animal("Éléphants", "Éléphant", 10, true);
        Animal crocodile = new Animal("Reptiles", "Crocodile", 7, false);
        Animal tiger = new Animal("Félins", "Tigre", 4, true);
        Animal zebra = new Animal("Équidés", "Zèbre", 6, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(crocodile);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(zebra);

        myZoo.displayAnimals();

        int lionIndex = myZoo.searchAnimal(lion);
        if (lionIndex != -1) {
            System.out.println("Le Lion est trouvé à l'indice: " + lionIndex);
        } else {
            System.out.println("Le Lion n'a pas été trouvé dans le zoo.");
        }

        Animal panda = new Animal("Ursidés", "Panda", 3, true);
        int pandaIndex = myZoo.searchAnimal(panda);
        if (pandaIndex != -1) {
            System.out.println("Le Panda est trouvé à l'indice: " + pandaIndex);
        } else {
            System.out.println("Le Panda n'a pas été trouvé dans le zoo.");
        }

    }
}
