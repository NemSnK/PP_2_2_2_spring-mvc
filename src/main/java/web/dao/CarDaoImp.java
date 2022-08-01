package web.dao;

import web.data.MyData;
import web.model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
    @Override
    public List<Car> getCars(int count) {
        return count >= 0 ? MyData.getListCar().stream().limit(count).collect(Collectors.toList()) : null;
    }
}