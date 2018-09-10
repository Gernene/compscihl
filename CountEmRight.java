import java.util.Scanner;

public class CountEmRight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean prompt = true;
        while (prompt == true) {
            System.out.println("String:");
            String input = sc.nextLine();
            if (input.equals("EXIT")) prompt = false;
            else {
                String str = StripSpace(input);
                System.out.println(Count(str));
            }
        }
    }

    public static String StripSpace(String str) {
        String[] spacelessArr = str.split(" ");
        String spacelessStr = "";
        for (String val : spacelessArr) {
            spacelessStr += val;
        }
        System.out.println(spacelessStr);
        return spacelessStr;
    }

    public static int Count(String str) {
        String strNew = str.toUpperCase().concat("x");
        String[] sp = strNew.split("SA");
        return sp.length - 1; 
    }

}
