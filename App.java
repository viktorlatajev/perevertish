/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perevertish;

import java.util.Arrays;
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
        StringBuilder sbStr = new StringBuilder(str);
        System.out.println("Перевёртыш 2: "+sbStr.reverse().toString());
        System.out.println("Второе слово в строке: ");
        int firstSpace = str.indexOf(" ");
        String str2 = str.substring(firstSpace+1);
        int nextSpace = str2.indexOf(" ");
        String secondWord = "";
        if(firstSpace < 0){
            System.out.println("Второго слова нет");
        }
        else if(nextSpace > 0){
            secondWord = str.substring(firstSpace+1, nextSpace+firstSpace+1);
        }else{
            secondWord = str2;
        }
        System.out.println(secondWord);
        
    }
}
