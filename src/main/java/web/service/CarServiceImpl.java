package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{

    private final List<Car> carsList = new ArrayList<>();{
        carsList.add(new Car("car1",111,"red"));
        carsList.add(new Car("car2",222,"blue"));
        carsList.add(new Car("car3",333,"green"));
        carsList.add(new Car("car4",444,"yellow"));
        carsList.add(new Car("car5",555,"black"));
    }

    @Override
    public List<Car> getCountCars(Integer count) {
        if(count==0){
            return carsList;
        }
        return carsList.stream().limit(count).collect(Collectors.toList());

    }
}
