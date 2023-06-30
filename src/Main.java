//This is my client class
public class Main {

    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("car",4);
        System.out.println(car);
        //Since the getInstance method in VehicleFactory is static, we can directly call it.

        Vehicle bike = VehicleFactory.getInstance("bike",2);
        System.out.println(bike);

    }
}