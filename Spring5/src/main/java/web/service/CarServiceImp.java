package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{


    private static final List<Car> CARS = CarDaoImp.CARS;

    @Override
    public List<Car> getCars(int count) {
        if(count == 0||count >5){
            return CARS;
        }
        return CARS.stream().limit(count).collect(Collectors.toList());
    }
}