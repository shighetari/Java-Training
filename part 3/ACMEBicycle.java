public class ACMEBicycle implements Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    // The compiler will now require that methods
    // changeCadence, changeGear, speedUp, and applyBrakes
    // all be implemented. Compilation will fail if those
    // methods are missing from this class.

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

/*Implementing an interface allows a class to become more formal about the behavior it promises to provide.
Interfaces form a contract between the class and the outside world, and this contract is enforced at build time
by the compiler. If your class claims to implement an interface, all methods defined by that interface must appear
in its source code before the class will successfully compile.

Note: To actually compile the ACMEBicycle class, you will need to add the public keyword
to the beginning of the implemented interface methods
 */