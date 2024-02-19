import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {

        int n=0, flag=0, m=0;
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        m=n/2;
        if(n==0 || n==1 )
            System.out.println("Number is not prime");

        for(int i=2;i<=m;i++)
        {
            if (n%i==0)
            {

                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(n+" is a prime number");
        }
        else {
            System.out.print(n+" is not a prime number");
        }

























//        int n, flag =0,m=0;
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        m=n/2;
//        if(n==0 || n==1 )
//            System.out.println("Number is not prime");
//        else {
//            for(int i=2;i<=m;i++)
//            {
//                if(n%i==0)
//                {
//                    System.out.println(n+"is not a prime number");
//                    flag=1;
//                    break;
//                }
//            }
//        }
//        if(flag==0)
//            System.out.println(n+" is a prime number");
    }
}
