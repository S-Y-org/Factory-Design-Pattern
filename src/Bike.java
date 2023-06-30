public class Bike extends Vehicle{
    int wheel;

    Bike(int wheel){
        this.wheel = wheel;
    }
    /*it is not necessary to explicitly write the constructor as public. In Java, if you do not specify an access modifier for a constructor, it is automatically assigned the default access modifier, which is public if no other access modifier is specified for the class.

Therefore, if you write a constructor without any access modifier, it will be treated as public by default.*/
    @Override
    public int getWheel() {
        return this.wheel;
    }
}
