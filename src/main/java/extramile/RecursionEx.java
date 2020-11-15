package extramile;

public class RecursionEx {

    public int getSum(int number) {

        if (number == 0) {
            return 0;
        } else {
            return getSum(number - 1) + number;
        }
    }

    public int length(String word) {
        //EXIT
        if (word == null) {
            return 0;
        } else if (word.isEmpty()) {
            return 0;
        } else {
            //RE-ENTRY
            return length(word.substring(1)) + 1;
        }
    }

    public int getSumOfEven(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return getSumOfEven(n - 1) + n;
        } else {
            return getSumOfEven(n - 1);
        }

    }

    public String reverse(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        } else {
            return word.charAt(word.length() - 1) + reverse(word.substring(0, word.length() - 1));
        }
    }


    public boolean palindrome1(String word) {
        return word.equalsIgnoreCase(reverse(word));
    }

    public int sumOfDigits(int number) {

        if (number == 0) {
            return 0;
        } else {
            return (number % 10) + sumOfDigits(number / 10);
        }
    }
}