package online.dars.lesson3.task5;

public final class Car {
    private final String carNumber;
    private final String model;

    public Car(String carNumber, String model) {
        this.carNumber = carNumber;
        this.model = model;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNumber='" + carNumber + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
