/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perevertish;
import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    public void run() {
        System.out.println("=== Перевёртыш ===");
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chStr = str.toCharArray();
        char[] rChStr = new char[str.length()];
        for (int i = 0; i < rChStr.length; i++) {
            rChStr[i] = chStr[(chStr.length -1) - i];
        }
        String rStr = new String(rChStr);
        System.out.println("Перевёртыш: "+rStr);
    }
}
