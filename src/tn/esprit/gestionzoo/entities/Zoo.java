package tn.esprit.gestionzoo.entities;


public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int animalCount;

    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        this.city = city;

        if (nbrCages > 25) {
            System.out.println("Le nombre de cages ne peut pas dépasser 25. Initialisation à 25.");
            this.nbrCages = 25;
        } else {
            this.nbrCages = nbrCages;
        }
        this.animals = new Animal[this.nbrCages];
        this.animalCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Le nom du zoo ne peut pas être vide. Réinitialisation à 'tn.esprit.gestionzoo.entities.Zoo par défaut'.");
            this.name = "tn.esprit.gestionzoo.entities.Zoo par défaut";
        } else {
            this.name = name;
        }
    }


    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Impossible d'ajouter " + animal.getName() + ": le zoo est plein.");
            return false;
        }

        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                System.out.println("L'animal " + animal.getName() + " est déjà présent dans le zoo.");
                return false;
            }
        }

        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null;
                animalCount--;
                return true;
            }
        }
        System.out.println("L'animal " + animal.getName() + " n'est pas trouvé dans le zoo.");
        return false;
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo :");
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
    }

    public void displayZooInfo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
        System.out.println("Nombre d'animaux : " + animalCount);
        displayAnimals();
    }
}
