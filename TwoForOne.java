import java.util.Arrays;

public class TwoForOne {

    public static void main(String args[]) {
        String[] ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(ss);
        int headLen = 20 - "Ascend".length();
            System.out.print("Ascend");
            for (int k = 0; k < headLen; k++) { System.out.print(" "); }
            System.out.print("Descend");
            System.out.println();
            System.out.println();
        for (int i = 0; i < ss.length; i++) {
            int spaces = 20 - ss[i].length();
            System.out.print(ss[i]);
            for (int j = 0; j < spaces; j++) { System.out.print(" "); }
            System.out.print(ss[ss.length - i - 1]);
            System.out.println();
        }
    }

}