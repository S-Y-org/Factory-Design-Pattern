//Vehicle class is the super class
//So i will create the factory of that super class
//This factory will return me the instances of the sub-classes
//The naming convention for this class is that we give 'Factory' last
// and name of 'Super class'  first
public class VehicleFactory {

    public static Vehicle getInstance(String type, int wheel){
        if(type == "car"){
            return new Car(wheel); //we give the type,it returns us the instance. This is
            // the sole purpose of the factory class
        } else if (type == "bike") {
            return new Bike(wheel);
        }
        return null;
    }
}
