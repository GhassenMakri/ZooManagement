public class Animal {

    String family;
    String name;
    int age;
    boolean isMammal;


    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public void displayAnimalInfo() {
        String mammalInfo = isMammal ? "est un mammifère." : "n'est pas un mammifère.";
        System.out.println("Animal: " + name + ", Famille: " + family + ", Âge: " + age + " ans, " + mammalInfo);
    }

    @Override
    public String toString() {
        String mammalInfo = isMammal ? "mammifère" : "non mammifère";
        return "Animal [Nom=" + name + ", Famille=" + family + ", Âge=" + age + " ans, " + mammalInfo + "]";
    }

}
