public class Main {

    public static void main(String... args) {
        Circle circle = new Circle(1.0d);
        Square square = new Square(1.0d);
        System.out.println("Circle: " + circle.surface());
        System.out.println("Square: " + square.surface());
    }
}
/* run the following command to see the output:
java --enable-preview Main

expected output:
"Circle: 3.141592653589793
 Square: 1.0 "
-------------------------------------------------------
Most IDEs support the use of preview features, which not only
allows you to use preview features in your favorite IDE but also help those IDEs
to support those features shortly after they become permanent and final.

By the way, artifacts that require nonfinal features shouldn't be distributed.
 For example, do not distribute an artifact that leverages a preview feature on Maven Central
 because the artifact will run only on a specific Java feature release.*/