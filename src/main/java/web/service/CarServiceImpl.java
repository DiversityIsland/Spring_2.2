package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService{
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1L, "Toyota", 4));
        cars.add(new Car(2L, "Honda", 9));
        cars.add(new Car(3L, "Nissan", 13));
        cars.add(new Car(4L, "Mazda", 6));
        cars.add(new Car(5L, "Hyundai", 8));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count <= 0) {
            return null;
        }

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
