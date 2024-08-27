class Solution {
    public boolean isPalindrome(int number) {
        if (number < 0 || (number != 0 && number % 10 == 0)) {
            return false;
        }

        int reverseNumber = 0;
        while(number>reverseNumber)
        {
            int remainder = number%10; 
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }

        return number == reverseNumber || number == reverseNumber / 10;
    }
}