public class Person {
    public static final int limbs = 4;
    static String species = "Humanoid";

    private String name;
    private int age;
    private final String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public static String getSpecies() {
//        printInfo();
        return species;
    }

    public void printInfo() {
        System.out.println("Here is info");
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("უარყოფითი ასაკი არ არსებობს");
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
//        this.id = id += "9";
    }

    public String getId() {
        return id;
    }

    public static void printGeneralPersonInfo() {
        System.out.println("Limbs: " + limbs);
        System.out.println("Species: " + species);
//        System.out.println("Id: " + getId());
    }
}
