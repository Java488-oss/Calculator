package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;;

public class Main {
    private static int num1;
    private static int num2;
    private static  boolean flag=false;

    public static void main(String[] args) throws Exception {
        Score score = new Score();
        RomanNumber rom = new RomanNumber();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();

        String[] array = str.split(" ", 3);

        reader.close();

        try{

            num1=Integer.parseInt(array[0]);
            num2=Integer.parseInt(array[2]);
            for(int i=0;i<10;i++){
                if(num1==i&&num2==i){
                    flag=true;
                }
            }
            if (num1 > 0 && num1 <= 10 && num2 > 0 && num2 <= 10&&flag ) {
                score.scoreInt(array, num1, num2);
            } else {
                throw new  NumberFormatException("A number less than 1 or greater than 10");
            }
        } catch (NumberFormatException e){
            int temp = rom.main(array[0]);
            int temp1 = rom.main(array[2]);
                if(temp > 0 && temp <= 10 && temp1 > 0 && temp1 <= 10){
                    score.scoreRom(array, temp, temp1);
                }
                else {
                    System.out.println("A number less than 1 or greater than 10");
                }
        }
    }
}
