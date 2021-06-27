/*
 * CS2050 - Computer Science II - Summer 2021
 * Instructor: Thyago Mota
 * Description: Activity 01 - BSheep
 * Name: Lena Hamilton
 * Date: June 2, 2021
 */
import java.util.Scanner;

public class BSheep {

    static final int MIN_NUM_SHEEP = 2;

    public static void main(String[] args) {
        int MIN_NUM_SHEEP = 2;
        int xMin = 0;
        int yMin = 0;
        int xMax = 0;
        int yMax = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("How many sheep?");
        int nSheep = sc.nextInt();

        if (nSheep >= MIN_NUM_SHEEP) {
            System.out.println("Number of sheep: " + nSheep);

            for (int i = 0; i < nSheep; i++) {
                System.out.println("Sheep coordinates: 2");
                int x = sc.nextInt();
                int y = sc.nextInt();

                if (x < xMin)
                    xMin = x;
                if (x > xMax)
                    xMax = x;
                if (y < yMin)
                    yMin = y;
                if (y > yMax)
                    yMax = y;
            }
            System.out.println("Fence coordinates: " + "(" + xMin + "," + yMin + ") "
            + "(" + xMin + "," + yMax + ") "
            + "(" + xMax + "," + yMax + ") "
            + "(" + xMin + "," + yMax + ")");

        }
        else 
            System.out.println("Number of sheep must be at least " + MIN_NUM_SHEEP + " to have a fence.");

    }
} // end of class definition