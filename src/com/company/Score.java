package com.company;

public class Score{
  private   static  RomOrArabic rOa = new RomOrArabic();

    public void scoreInt(String[] array,int one,int two)throws Exception {
        if (array[1].equals("/")) {
            System.out.println(one / two);
        } else if (array[1].equals("+")) {
            System.out.println(one + two);
        } else if (array[1].equals("-")) {
            System.out.println(one - two);
        } else if (array[1].equals("*")) {
            System.out.println(one * two);
        }
    }
    public void scoreRom(String[] array,int one,int two)throws Exception {

        if (array[1].equals("/")) {
            rOa.convertIntegerToRoman(one / two);
        } else if (array[1].equals("+")) {
            rOa.convertIntegerToRoman(one + two);
        } else if (array[1].equals("-")) {
            rOa.convertIntegerToRoman(one - two);
        } else if (array[1].equals("*")) {
            rOa.convertIntegerToRoman(one * two);
        }
    }
}