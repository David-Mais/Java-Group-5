public class Car implements Comparable<Car> {
    private int id;
    private String model;

    public Car(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.getId() - o.getId();
    }

//    @Override
//    public int compareTo(Car o) {
//        return this.getModel().compareTo(o.getModel());
//    }
}
