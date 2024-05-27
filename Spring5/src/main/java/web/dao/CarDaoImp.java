package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    public static final List<Car> CARS = new ArrayList<>();

    static {
        CARS.add(new Car("Q5", "Audi", 2010));
        CARS.add(new Car("M5", "BMW", 2012));
        CARS.add(new Car("Altezza", "Toyota", 2005));
        CARS.add(new Car("QX56", "Infinity", 2010));
        CARS.add(new Car("21099", "Vaz", 2000));
    }
}