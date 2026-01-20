public class PalindromeNumber {
    public static void main(String[] args){
        System.out.println(IsPalindrome(121));
    }

    public static boolean IsPalindrome(int x){
        if( x < 0 ){
            return false;
        }

        int originalNum = x;
        int reverseNum = 0;

        while( x != 0 ){
            int digit = x % 10;
            reverseNum = reverseNum * 10 + digit;
            x = x / 10; // For sort the original value
        }

        return originalNum == reverseNum;
    }
}