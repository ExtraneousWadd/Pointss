public class RectangleRunner {
    public static void main(String [] args) {
        Rectangle Plot1 = new Rectangle(150, 200);
        Rectangle Plot2 = new Rectangle(125);
        Rectangle Plot3 = new Rectangle();


        Plot1.setWidth(75);
        Plot2.setWidth(75);
        Plot2.setLength(75);
        Plot3.setWidth(75);


        int seed = Plot1.calculateArea() + Plot2.calculateArea() + Plot3.calculateArea();
        System.out.println("The total amount of seed required for all three plots is: " + seed);










    }
}

