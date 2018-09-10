import java.util.ArrayList;

public class ExpressionSolver {

    public static void main (String[] args) {
        System.out.println(solver("3 + 5"));
        System.out.println(solver("3 - 53 * 5"));
        System.out.println(solver("3 / 5"));
        System.out.println(solver("5 / 5 * 2 + 8 / 2 + 5"));
        System.out.println(solver("5 * 5 + 2 / 2 - 8 + 5 * 5 – 2"));
    }

    public static double solver (String input) {
        String[] arr = input.split(" ");
        ArrayList list = product(arr);
        double res = sum(list);
        return res;
    }

    public static ArrayList product (String[] arr) {
        ArrayList list = new ArrayList<String>();
        for (int i = 1; i < arr.length - 1; i+=2) {
            double a = Double.parseDouble(arr[i - 1]);
            String b = arr[i];
            double c = Double.parseDouble(arr[i + 1]);
            switch (arr[i]) {
                case "*": list.add(Double.toString(a * c));
                    break;
                case "/": list.add(Double.toString(a / c));
                    break;
                default: list.add(b);
            }
        }
        return list;
    }

    public static double sum (ArrayList list) {
        double res = 0;
        for (int i = 1; i < list.size() - 1; i+=2) {
            double a = Double.parseDouble(list.get(i - 1));
            double b = Double.parseDouble(list.get(i));
            double c = Double.parseDouble(list.get(i + 1));
            switch (b) {
                case "+": list.add(Double.toString(a + c));
                    break;
                case "-": list.add(Double.toString(a - c));
                    break;
            }
        }
        return res;
    }

}