package Esercizio_Star;

public class Program {
    public static void main(String[] args) {
        Star sun = new Star("Sun", 3.28e26, 1.9885e30, 1.41e18, 4.6e9);
        Star sirius = new Star("Sirius", 25.4, 2.02, 1.71, 2.37e8);
        Star vega = new Star("Vega", 40, 2.135, 2.362, 455e6);

        System.out.println(sun.toString());
        System.out.println(sirius.toString());
        System.out.println(vega.toString());
    }
}
