package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();
    public CarServiceImpl() {
        cars.add(new Car("Tesla", "Model S", 2022));
        cars.add(new Car("Honda", "CR-V", 2021));
        cars.add(new Car("Ford", "Boyard", 2020));
        cars.add(new Car("BNW", "X5", 2019));
        cars.add(new Car("Mercedes", "Gelik", 2018));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
