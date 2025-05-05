package Collection_F_praktice.car;

public class Car {

    private int carId;
    private String carName;
    private long price;


    // Constructor
    public Car(int carId, String carName, long price) {
        this.carId = carId;
        this.carName = carName;
        this.price = price;

    }

    // Getters
    public int getCarId() { return carId; }
    public String getCarName() { return carName; }
    public long getPrice() { return price; }


    // ToString method for displaying car details
    @Override
    public String toString() {
        return "Car{ID=" + carId + ", Name='" + carName + "', Price=" + price ;
            
    }  

}
