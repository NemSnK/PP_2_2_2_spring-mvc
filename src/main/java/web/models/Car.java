package web.models;

import java.util.Objects;

public class Car {
    private String owner;
    private String model;
    private String number;

    public Car() {
    }

    public Car(String owner, String model, String number) {
        this.owner = owner;
        this.model = model;
        this.number = number;
    }

    public String getOwner() { return owner; }

    public void setOwner(String owner) { this.owner = owner; }

    public String getNumber() { return number; }

    public void setNumber(String number) { this.number = number; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(owner, car.owner) && Objects.equals(model, car.model) &&
                Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, model, number);
    }
}
