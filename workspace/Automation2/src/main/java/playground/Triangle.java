package playground;

public class Triangle implements Shape{
    private int firstLat; //defini
    private int secondLat;
    private int thirdLat;
    private String color;
     Triangle(int firstLat,int secondLat, int thirdLat, String color ){//constructor
         this.firstLat = firstLat; // initializare = dai valoare
         this.secondLat = secondLat;
         this.thirdLat = thirdLat;
         this.color = color;
     }
    public void draw() {
         int perimetru = firstLat+secondLat+thirdLat;
        System.out.println("Perimetru este " + perimetru +" "+ "and the color is" + " " + color);
    }
}
