package com.company;

public class RomanNumber {

    public int main(String letter) {
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
}
