package com.darraghblake;

public class Main {

    public static void main(String[] args) {
        numberToWords(1000);
    }

    public static void numberToWords(int number) {
        int length = getDigitCount(number);
        String word = "";
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reverse = reverseNumber(number);
            for (int i = length; i > 0; i--) {
                if (reverse != i) {
                    word += "Zero ";
                }
            }
            while (reverse > 0) {
                switch (reverse % 10) {
                    case 0:
                        word = word + "Zero ";
                        break;
                    case 1:
                        word = word + "One ";
                        break;
                    case 2:
                        word = word + "Two ";
                        break;
                    case 3:
                        word = word + "Three ";
                        break;
                    case 4:
                        word = word + "Four ";
                        break;
                    case 5:
                        word = word + "Five ";
                        break;
                    case 6:
                        word = word + "Six ";
                        break;
                    case 7:
                        word = word + "Seven ";
                        break;
                    case 8:
                        word = word + "Eight ";
                        break;
                    case 9:
                        word = word + "Nine ";
                        break;
                    default:
                        word = word + "Invalid Number";
                        break;
                }
                reverse /= 10;
            }
        }

        System.out.println(word);
    }

    public static int reverseNumber(int number) {
        if (number < 0) {
            number = number * -1;
        }
        int reverse = 0;
        while (number > 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        return number >= 0 ? ("" + number).length() : -1;
    }

}
