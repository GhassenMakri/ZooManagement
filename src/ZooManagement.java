import java.util.Scanner;

public class ZooManagement {
    private String zooName;
    private int nbrCages;

    public static void main(String[] args) {
        ZooManagement zooManagement = new ZooManagement();
        zooManagement.getUserInput();

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tigre", 4, true);
        Animal elephant = new Animal("Elephantidae", "Éléphant", 10, true);

        Zoo myZoo = new Zoo(zooManagement.zooName, "Paris", zooManagement.nbrCages);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);

        myZoo.displayZooInfo();

        Animal bear = new Animal("Ursidae", "Ours", 3, true);
        System.out.println("Ajout de l'animal ours : " + myZoo.addAnimal(bear));

        System.out.println("Le zoo est plein : " + myZoo.isZooFull());



        myZoo.displayZooInfo();
        System.out.println("Le zoo est plein : " + myZoo.isZooFull());

        System.out.println("Suppression de l'animal 'Lion' : " + myZoo.removeAnimal(lion));
        myZoo.displayZooInfo();
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.nextLine();

        System.out.print("Entrez le nombre de cages (max 25) : ");
        while (true) {
            nbrCages = scanner.nextInt();
            if (nbrCages > 25) {
                System.out.println("Le nombre maximum de cages est 25. Veuillez entrer à nouveau.");
            } else {
                break;
            }
        }
        scanner.close();
    }

    public void displayZooInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }
}
