package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;;

public class Main {

    public static void main(String[] args) throws Exception {
        Score score = new Score();
        RomanNumber rom = new RomanNumber();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();

        String[] array = str.split(" ", 3);

        int num1;
        int num2;
        try {
            num1 = Integer.parseInt(array[0]);
            num2 = Integer.parseInt(array[2]);
            if (num1 > 0 && num1 <= 10 && num2 > 0 && num2 <= 10) {
                score.scoreInt(array, num1, num2);
            } else {
                System.out.println("A number less than 1 or greater than 10");
            }
        } catch (Exception e) {

            int temp = rom.main(array[0]);
            int temp1 = rom.main(array[2]);
            score.scoreRom(array, temp, temp1);
        }
    }
}
