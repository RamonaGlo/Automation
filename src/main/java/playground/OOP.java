package playground;

public class OOP {

    public static void main(String[] args) {
        Shape triangle = new Triangle(2, 4, 2, "red");
        Shape square = new Square(3);
        System.out.println(square.toString());
        triangle.draw();
        square.draw();


    }
}
