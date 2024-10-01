public class Zoo {

    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int animalCount;
    public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animalCount = 0;
    }


    public void displayZoo() {
        System.out.println("Nom du Zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
    }


    public boolean addAnimal(Animal animal) {
        if (animalCount < nbrCages) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            System.out.println("Le zoo est plein, impossible d'ajouter plus d'animaux.");
            return false;
        }
    }

    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Il n'y a pas d'animaux dans le zoo.");
        } else {
            System.out.println("Liste des animaux dans le zoo:");
            for (int i = 0; i < animalCount; i++) {
                System.out.println("Animal " + (i + 1) + ": " + animals[i].toString());
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equalsIgnoreCase(animal.name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null;
                animalCount--;
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zoo [Nom=").append(name)
                .append(", Ville=").append(city)
                .append(", Nombre de cages=").append(nbrCages)
                .append("]\nAnimaux:\n");
        for (Animal animal : animals) {
            if (animal != null) {
                sb.append(animal.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
