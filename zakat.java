/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zakat;

import java.util.Scanner;

/**
 *
 * @author ichsa
 */
public class Zakat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your total wealth (in currency): ");
        double totalWealth = scanner.nextDouble();
        
        double zakat = calculateZakat(totalWealth);
        
        System.out.printf("Your Zakat Maal is: %.2f\n", zakat);
        
        scanner.close();
        
     
    }
    public static double calculateZakat(double wealth) {
        final double ZAKAT_RATE = 0.025; // 2.5%
        return wealth * ZAKAT_RATE;
    }
}

