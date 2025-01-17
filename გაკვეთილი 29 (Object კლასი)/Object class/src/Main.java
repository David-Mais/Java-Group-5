import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // toString()
//        Human human = new Human("Davit", 20);
//        String humanObjectString = human.toString();
//        System.out.println(humanObjectString);
//        System.out.println(human);

        // getClass()
//        Human human = new Human("Davit", 20);
//        System.out.println(human.getClass());
//        System.out.println(human.getClass().getName());

//        A random = getRandomClass();
//        System.out.println(random.getClass().getName());
//
//        if (random.getClass().getName().equals("B")) {
//            System.out.println("Random class is B");
//        } else {
//            System.out.println("Random class is C");
//        }
//        System.out.println(random.getClass().getSuperclass().getName());

        // clone()
        // shallow copy
//        Human human = new Human("Davit", 20);
//        Human humanCopy = human;
//        System.out.println(human);
//        System.out.println(humanCopy);
//        humanCopy.setAge(30);
//        System.out.println(human);
//        System.out.println(humanCopy);

        // deep copy
//        Human human = new Human("Davit", 20);
//        Human humanCopy = new Human(
//                human.getName(),
//                human.getAge()
//        );
//        System.out.println(human);
//        System.out.println(humanCopy);
//        humanCopy.setAge(99);
//        System.out.println(human);
//        System.out.println(humanCopy);

        // clone
//        Human human = new Human("Davit", 20);
//        Human humanCopy = (Human) human.clone();
//        humanCopy.setAge(99);
//        System.out.println(humanCopy);
//        System.out.println(human);


        // hashCode()
//        Human human = new Human("Davit", 20);
//        Human humanCopy = human;
//        Human human2 = new Human("Davit", 20);
//        System.out.println(human.hashCode());
//        System.out.println(humanCopy.hashCode());
//        System.out.println(human2.hashCode());

//        Human human = new Human("Davit", 20);
//        Human human2 = new Human("Davit", 20);
//        System.out.println(human.hashCode());
//        System.out.println(human2.hashCode());

//        System.out.println("JUapb".hashCode());
//        System.out.println("IuBpb".hashCode());

        // equals()
//        System.out.println("hello".equals("hello"));

//        System.out.println(4==4);
//        System.out.println(true==false);
        Human human = new Human("Davit", 20);
        Human human2 = new Human("Davit", 20);
        System.out.println(human.equals(human2));
        Human human3 = human;
        System.out.println(human.equals(human3));
        System.out.println(human == human3);
    }

    public static A getRandomClass() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if (randomNumber == 0) {
            return new B();
        } else {
            return new C();
        }
    }
}