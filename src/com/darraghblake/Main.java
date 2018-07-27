package com.darraghblake;

public class Main {

    public static void main(String[] args) {
        numberToWords(-222);
    }

    public static void numberToWords(int number) {
        int length = getDigitCount(number);
        int reverseN = reverse(number);
        int reverseLength = 0;
        StringBuilder word = new StringBuilder();
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number > 0) {
            while (reverseN > 0) {
                switch (reverseN % 10) {
                    case 0:
                        word.append("Zero");
                        break;
                    case 1:
                        word.append("One");
                        break;
                    case 2:
                        word.append("Two");
                        break;
                    case 3:
                        word.append("Three");
                        break;
                    case 4:
                        word.append("Four");
                        break;
                    case 5:
                        word.append("Five");
                        break;
                    case 6:
                        word.append("Six");
                        break;
                    case 7:
                        word.append("Seven");
                        break;
                    case 8:
                        word.append("Eight");
                        break;
                    case 9:
                        word.append("Nine");
                        break;
                    default:
                        word.append("Invalid Number");
                        break;
                }
                reverseLength += 1;
                reverseN /= 10;
                if (reverseLength > 0 && reverseLength != length && word.toString() != "Invalid Value") {
                    word.append(" ");
                }
            }
        }
        for (int i = reverseLength; i < length; i++) {
            if (reverseN != i) {
                word.append("Zero");
            }
        }
        System.out.println(word);
    }

    public static int reverse(int number) {
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
