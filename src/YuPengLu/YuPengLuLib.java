package YuPengLu;

public class YuPengLuLib {
    public static boolean isPalindrome(String input){
        String output = "";
                for(int i = input.length();i>0;i--) {
                    output = output + input.substring(i-1,i);
                }
                return (input.equals(output));
    }
    public static String dateStr(String input) {
        String output = "";
        String mm = input.substring(0, 2);
        String dd = input.substring(3, 5);
        String yy = input.substring(6);
        output = output + dd + " - " + mm + " - " + yy;
        return output;
    }
    public static int sumUpTo(int input) {
        int output = 0;
        for(int i = 1; i < input; i++){
            output = output + i;
        }
        return output + input;


    }
}
