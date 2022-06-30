class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}

/* The syntax of the Java programming language may look new to you, but the design of this class is based
on the previous discussion of bicycle objects. The fields cadence, speed, and gear represent the object's state,
and the methods (changeCadence(), changeGear(), speedUp() etc.) define its interaction with the outside world.

You may have noticed that the Bicycle class does not contain a main() method.
That is because it is not a complete application; it is just the blueprint for bicycles that might be used in an application.
The responsibility of creating and using new Bicycle objects belongs to some other class in your application.
(BicycleDemo class that creates two separate Bicycle objects and invokes their methods)
 */