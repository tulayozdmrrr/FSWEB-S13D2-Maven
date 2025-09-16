package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Demo için testleri çalıştırın (MainTest.java)");
    }

    // Palindrom kontrolü
    public static boolean isPalindrome(int number) {
        int original = Math.abs(number);
        int reversed = 0;
        int temp = original;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return original == reversed;
    }

    // Mükemmel sayı kontrolü
    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    // Sayıyı kelimelere çevir
    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";
        if (number == 0) return "Zero";

        StringBuilder sb = new StringBuilder();
        int reversed = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversed);

        while (reversed > 0) {
            int digit = reversed % 10;
            sb.append(digitToWord(digit)).append(" ");
            reversed /= 10;
        }

        // Kaybolan sıfırları ekleme (ör. 100 -> "One Zero Zero")
        for (int i = 0; i < originalDigitCount - reversedDigitCount; i++) {
            sb.append("Zero ");
        }

        return sb.toString().trim();
    }

    // Yardımcı metod: sayıyı ters çevir
    private static int reverse(int number) {
        int reversed = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return reversed;
    }

    // Yardımcı metod: rakam sayısını bul
    private static int getDigitCount(int number) {
        if (number == 0) return 1;
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // Yardımcı metod: rakamı kelimeye çevir
    private static String digitToWord(int digit) {
        switch (digit) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "";
        }
    }
}
