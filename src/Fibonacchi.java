import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstterm = 0, secondTerm = 1, nextTerm;
        for (int i = 1; i <= n; i++) {

            System.out.println(firstterm + ", ");
            nextTerm = firstterm + secondTerm;
            firstterm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}
