public class Demo {
    private String demo;

    private Demo(String demo) {
        this.demo = demo;
    }

    public static Demo of(String demo) {
        if (demo.equals("sisulele")) {
            return null;
        }
        return new Demo(demo);
    }
}
