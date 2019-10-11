import java.util.Scanner;
public class Fald {
    static double G = 9.80665;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Indtast højde i meter: ");
        if (scan.hasNextDouble() || scan.hasNextInt()) {
            double h = scan.nextDouble();
            if (h < 0)
                System.out.println("Invalid højde");
            else {
                double tid = Math.sqrt((2 * h) / G);
                double v = G * tid;
                System.out.println("Tid for fald: " + tid + " sekunder");
                System.out.println("Hastighed i slut " + v + " meter/sekunder");
            }
        }
        else
            System.out.println("Ikke et tal");
    }
}