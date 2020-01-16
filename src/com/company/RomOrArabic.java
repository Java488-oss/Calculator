package com.company;

public class RomOrArabic extends Main {
   private static int numbers[]  = {1, 4, 5, 9, 10, 50, 100, 500, 1000 };

   private static String letters[]  = { "I", "IV", "V", "IX", "X", "L", "C", "D", "M"};
   static int ss;

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
