/*
 * CS2050 - Computer Science II - Summer 2021
 * Instructor: Thyago Mota
 * Description: Activity 02 - Account
 * Date:
 */
import java.util.Scanner;

public class Account {

    private int accountNum;
    private String name;
    public double balance;

    public Account(int accountNum, String name, double balance) {
        this.name = name;
        this.accountNum = accountNum;

        if (balance > 0.0) {
            this.balance = balance;
        }

    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount < balance) {
            balance = balance - withdrawAmount;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }


    public int getAccountNum() {
        return accountNum;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        

    }

}
