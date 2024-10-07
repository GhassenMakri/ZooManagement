class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int animalCount;

    public Zoo(String name, String city, int nbrCages) {
        if (nbrCages > 25) {
            System.out.println("Le nombre de cages ne peut pas dépasser 25. Initialisation à 25.");
            this.nbrCages = 25;
        } else {
            this.nbrCages = nbrCages;
        }
        this.name = name;
        this.city = city;
        this.animals = new Animal[this.nbrCages];
        this.animalCount = 0;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Impossible d'ajouter " + animal.name + ": le zoo est plein.");
            return false;
        }

        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                System.out.println("L'animal " + animal.name + " est déjà présent dans le zoo.");
                return false;
            }
        }

        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null;
                animalCount--;
                return true;
            }
        }
        System.out.println("L'animal " + animal.name + " n'est pas trouvé dans le zoo.");
        return false;
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo :");
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public void displayZooInfo() {
        displayZoo();
        displayAnimals();
    }
}
