package Esercizio_Planet;

public class Program {
    public static void main(String[] args) {
        Planet planet1 = new Planet("Terra", 5.97e24, 1.08e12, 5.52, 6.37e6, true, 7_900_000_000L, false, 1, 0.367);
        Planet planet2 = new Planet("Marte", 6.39e23, 1.63e11, 3.93, 3.39e6, false, 0, false, 2, 0.25);
        Planet planet3 = new Planet("Giove", 1.90e27, 1.43e15, 1.33, 6.99e7, false, 0, true, 79, 0.538);
    
        System.out.println(planet1);
        System.out.println(planet2);
        System.out.println(planet3);
    
        double g = 6.67430e-11;
        System.out.println("L'accelerazione gravitazionale di " + planet1.getName() + " è " + planet1.getGravitationalAcceleration(5.5));
    }
}
