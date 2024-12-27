public class Outer {
    String text = "hello";
    private int secret = 999;

    public void somethingElse() {
//        System.out.println(notSecret); ვერ მივვწვდებით
        Inner inner = new Inner();
        System.out.println(inner.notSecret);
    }

    public class Inner {
        public int notSecret = 3;

        public void doSomething() {
            System.out.println(text);
            System.out.println(secret);
        }
    }
}
