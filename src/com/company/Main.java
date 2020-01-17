package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;;

public class Main {
    private static  boolean flag=false;

    public static void main(String[] args) throws Exception {
        Score score = new Score();
        RomOrArabic rOm = new RomOrArabic();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] array = str.split(" ", 3);

        reader.close();

        try{
            int num1=Integer.parseInt(array[0]);
            int num2=Integer.parseInt(array[2]);
            for(int i=0;i<10;i++){
                if(num1==i&&num2==i){
                    flag=true;
                }
            }

            if (num1 > 0 || num1 <= 10 && num2 > 0 || num2 <= 10 && flag) {
                score.scoreInt(array, num1, num2);
            }
            else {
                System.out.println("Введеное число больше 10 или меньше 0");
            }
        }

        catch (NumberFormatException e){
            int temp = rOm.convertRomaToInteger(array[0]);
            int temp1 = rOm.convertRomaToInteger(array[2]);

            if(temp > 0 && temp <= 10 && temp1 > 0 && temp1 <= 10){
                score.scoreRom(array, temp, temp1);
            }
            else if(flag==false){
                throw new  NumberFormatException("Вы ввели не верную конструкцию");
            }
            else {
                System.out.println("Введеное число больше X или меньше I");
            }
        }
    }
}