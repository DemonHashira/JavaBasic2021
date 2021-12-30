public class Car implements Comparable<Car>{

    private String model;
    private String serialNumber;

    public Car(String model, String serialNumber) {
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public Car(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
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
                "model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public int compareTo( Car o ) {
        if (this.serialNumber.equals(o.serialNumber)) {
            return -1;
        }
        return -0;
    }
}
