/*
 * CS2050 - Computer Science II - Summer 2021
 * Instructor: Thyago Mota
 * Description: Activity 02 - Dice
 * Date: June 9, 2021
 */
package Classwork.Done.activity_02_design;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    public int sides;
    public int value;

    private final int INITIAL_VALUE = 1;
    private final int DEFAULT_SIDES = 6;
    private final int MIN_SIDES = 2;

    public Dice(int sides) {
        if (sides >= MIN_SIDES) {
            this.sides = sides;
            sides = 2;
        }
        else {
            this.sides = MIN_SIDES;
        }
    }

    public Dice() {
        this.sides = DEFAULT_SIDES;
        value = INITIAL_VALUE;
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        Random value = new Random();
        int newValue = value.nextInt(sides);
    }

    public static void main(String[] args){
        Dice die = new Dice(sides);

        System.out.println("Enter number of sides for die: ");
        Scanner sideNumber = new Scanner(System.in);
        System.out.println("You have chosen a " + sides + " sided die.");

        
    }



}
