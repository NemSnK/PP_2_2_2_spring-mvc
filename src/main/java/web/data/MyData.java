package web.data;

import web.model.Car;


import java.util.ArrayList;
import java.util.Arrays;

public class MyData {
    private static final ArrayList<Car> listCar =
            new ArrayList(Arrays.asList(new Car("Ivanov", "Audi", "M123MM47"),
                    new Car("Petrov", "BMW", "M321MM47"),
                    new Car("Sidorov", "Audi", "H123HH47"),
                    new Car("Smirnov", "Mercedes", "H321HH47"),
                    new Car("Semenov", "Porsche", "T123TT47")));

    public static ArrayList<Car> getListCar() {
        return listCar;
    }
}
