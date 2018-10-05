package YuPengLu;

public class YuPengLuLib {
    public static boolean isPalindrome(String input) {
        String output = "";
        for (int i = input.length(); i > 0; i--) {
            output = output + input.substring(i - 1, i); //creates a separate string that starting from the last character of input and ending with the first character
        }
        return (input.equals(output));
    }

    public static String dateStr(String input) {
        String output = "";
        String mm = input.substring(0, 2);
        String dd = input.substring(3, 5);     //set each part of the date to their own variable//
        String yy = input.substring(6);
        output = output + dd + " - " + mm + " - " + yy; //rearranges the date variables with the added "-"
        return output;
    }

    public static int sumUpTo(int input) {
        int output = 0;
        for (int i = 1; i < input; i++) { //adds up all the whole numbers from 1 to the input//
            output = output + i;
        }
        return output + input; //loop did not add the input value so that was added at the end
    }

    public static boolean isFibonacci(int input) {
        int x = 0;
        int i = 1;
        if (input == x || input == i) {
            return true; //returns true if the input is equal to the first 2 numbers in fib. sequence//
        }
        int y = i; // a third variable is needed so we have a variable for the sum and for the 2 numbers that make up the sum(2 numbers before)//
        while (i < input) {  // repeats the sequence up until i goes over the input//
            i = y + x;       //sets i to the sum of the last 2 numbers//
            y = x;          //moves y up one step in the sequence//
            x = i;          // x will act as the number that comes before i//
        }
        return (i == input);
    }

    public static String cutOut(String mainStr, String subStr) {
        int x = mainStr.indexOf(subStr); //find the index in which subStr starts in mainStr//
        String output = "";
        output = output + mainStr.substring(0, x) + mainStr.substring((x + subStr.length()));  //recreate the string that skips subStr//
        return output;
    }
}





