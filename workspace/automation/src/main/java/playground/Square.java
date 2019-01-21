package playground;

public class Square implements Shape {
    private int lat; //defini
    private String color;

    Square(int lat){//constructor
        this.lat = lat; // initializare = dai valoare
        this.color = color;
    }
    public void draw() {
        int perimetru = lat*4;
        System.out.println("Perimetru este " + perimetru + " " + "and the color is" + " " + color);
    }
}
