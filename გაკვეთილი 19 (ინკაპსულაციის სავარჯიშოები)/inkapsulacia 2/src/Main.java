public class Main {
    public static void main(String[] args) {
        // n1
//        Person lekso = new Person("Lekso", 16);
//        System.out.println(lekso.getAge());
//        lekso.setAge(19);
//        System.out.println(lekso.getAge());
//        lekso.setAge(1);
//        System.out.println(lekso.getAge());

        // n2
        BankAccount account = new BankAccount("abc");
        account.setPassword("pass");
        account.deposit(5000.45, "pass");
        account.deposit(19_000.98, "pass");
        account.deposit(4563.65, "araswori");
        account.deposit(150_000.89, "asdf");
        account.withdraw(4567.89, "pass");
        account.withdraw(4567.89, "pass");
        account.withdraw(4567.89, "asdf");
    }
}