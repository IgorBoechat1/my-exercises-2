package io.codeforall.fanstatics;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.PasswordInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Prompt prompt = new Prompt(System.in,System.out);

        System.out.println("Hello Hello Sunshine");
        System.out.println("Please Insert your login");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        String name = scanner.nextLine();

        PasswordInputScanner questionName = new PasswordInputScanner();
        System.out.println("Password: ");
        String pass = questionName.getUserInput(scanner);



    }

}












