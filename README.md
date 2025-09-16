# Java Number Utilities

Bu proje, Java'da sayılarla ilgili bazı algoritma ve OOP uygulamalarını içermektedir. 
Amaç, palindrom sayılar, mükemmel sayılar ve sayıların kelimelere çevrilmesini öğrenmek ve test etmektir.

## Özellikler

### 1. Palindrom Sayılar
- `isPalindrome(int number)` metodu ile sayının palindrom olup olmadığını kontrol eder.
- Negatif sayılar için işareti göz ardı eder.
- Örnek:
```java
Main.isPalindrome(-1221); // true
Main.isPalindrome(707);   // true
Main.isPalindrome(11212); // false
