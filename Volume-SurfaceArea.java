import java.util.Scanner;

public class MyProgram{
    public static void main(String[] args){
        
    //Creation of Scanner object called "s"
    Scanner s = new Scanner (System.in);

    //Prompts the user to enter a value for length
    System.out.printf("Enter length: ");
    double length = s.nextDouble();

    //Prompts the user to enter a value for width
    System.out.printf("Enter width: ");
    double width = s.nextDouble();

    //Prompts the user to enter a value for height
    System.out.printf ("Enter height: ");
    double height = s.nextDouble();

    //Calculates the volume
    double volume = length * width * height;

    //Performs calculations that are needed for the final calculation of surface area
    double surfaceArea_calc1 = 2 * (length * width);
    double surfaceArea_calc2 = 2 * (length * height);
    double surfaceArea_calc3 = 2 * (width * height);

    //Performs the final calculation for surface area
    double surfaceArea_final_calc = surfaceArea_calc1 + surfaceArea_calc2 + surfaceArea_calc3;
    
    //output
    //Displays volume value rounded to two decimal places
    System.out.println("Volume: ");
    System.out.printf("%.2f", volume);
    
    System.out.println(" ");
    
    System.out.print("Surface Area: ");
    System.out.printf("%.2f", surfaceArea_final_calc);
    
    }
}