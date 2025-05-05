package Collection_F_praktice.car;


import java.util.ArrayList;
import java.util.List;

public class Carlist {

    private List<Car> cars;

    // Constructor
    public Carlist() {
        cars = new ArrayList<>();
    }

    // Method to add a car
    public void addCar(Car car) {
        cars.add(car);
    }

    // Method to get all cars
    public List<Car> getCars() {
        return cars;
    }

    // Display all cars
    @Override
    public String toString() {
        return "CarList " + cars;
    }

    public void  findcar(String car){
        for (Car c : cars) {
            if(c.getCarName()== car){
               System.out.println(" find car "+c.getCarName());
            }
        }
        
    }

}
