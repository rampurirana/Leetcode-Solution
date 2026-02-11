public class IndexFirstOccurrence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(FirstOccur(haystack, needle));
    }

    public static int FirstOccur(String haystack, String needle){

//        return haystack.indexOf(needle);

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i, i + needle.length()).equals(needle)){
                    return i;
                }
            }
        }

        return -1;
    }
}
