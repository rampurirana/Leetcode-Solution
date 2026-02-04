public class ValidParenthesis {
    public static void main(String[] args){
        String s = "()[]{}";
        System.out.println(CheckValidParen(s));
    }

    public static boolean CheckValidParen(String s){
        while (true){
            if(s.contains("()")){
                s = s.replace("()", "");
            } else if(s.contains("{}")){
                s = s.replace("{}", "");
            } else if(s.contains("[]")){
                s = s.replace("[]", "");
            } else {
                return s.isEmpty();
            }
        }
    }
}
