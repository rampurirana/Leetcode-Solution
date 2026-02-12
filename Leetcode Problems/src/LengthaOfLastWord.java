public class LengthaOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s){
        int i = s.length() - 1;

        //Skip all spaces from the end
        while ( i >= 0 && s.charAt(i) == ' '){
            i--;
        }

        int count = 0;

        //Count character of last word
        while (i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }
}
