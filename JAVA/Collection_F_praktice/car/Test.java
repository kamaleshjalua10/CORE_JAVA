package Collection_F_praktice.car;

public class Test {
    public static void main(String[] args) {
        
        Carlist carList = new Carlist();

        // Creating and adding cars to the list
       Car car1= new Car(1, "BMW", 6000000);
       Car car2=  new Car(2, "Audi", 5500000);
       Car car3= new Car(3, "Mercedes", 7000000);


       carList.addCar(car1);
       carList.addCar(car2);
       carList.addCar(car3);


      

        // carList.findcar("BMW");

        System.out.println(carList.toString());

        // System.out.println(carList.getCars());

        // Printing the list of cars
        // System.out.println(carList +" ");
        // System.out.println(carList.getCars());
    }
      
}    
