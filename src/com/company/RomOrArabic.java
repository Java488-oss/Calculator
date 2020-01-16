package com.company;

public class RomOrArabic extends Main {
   private static int numbers[]  = {1, 4, 5, 9, 10, 50, 100, 500, 1000 };

   private static String letters[]  = { "I", "IV", "V", "IX", "X", "L", "C", "D", "M"};

    public int convertRomaToInteger(String letter) {
        if (letter.equals("I")) {
            return 1;
        } else if (letter.equals("II")) {
            return 2;
        } else if (letter.equals("III")) {
            return 3;
        } else if (letter.equals("IV")) {
            return 4;
        } else if (letter.equals("V")) {
            return 5;
        } else if (letter.equals("VI")) {
            return 6;
        } else if (letter.equals("VII")) {
            return 7;
        } else if (letter.equals("VIII")) {
            return 8;
        } else if (letter.equals("IX")) {
            return 9;
        } else if (letter.equals("X")) {
            return 10;
        } else {
            return 0;
        }
    }

    public static void convertIntegerToRoman(int number)
    {
        String romanValue = "";

        int N = number;

        while ( N > 0 )
        {
            for (int i = 0; i < numbers.length; i++)
            {
                if ( N < numbers[i] )
                {
                    N -= numbers[i-1];
                    romanValue += letters[i-1];
                    break;
                }
            }
        }
        System.out.println(romanValue);
    }
}
