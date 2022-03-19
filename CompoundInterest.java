import java.util.Scanner;
import java.lang.Math;


public class CompoundInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the intial principal balance:");
        int P = sc.nextInt();
        
        System.out.println("Enter the interest rate:");
        double r = sc.nextDouble();
        

        System.out.println("Enter the time period:");
        int t = sc.nextInt();

        double F = P * (Math.pow(1 + r/100,t));

        System.out.printf("Final Amount : %.2f", F);
        


    }


    
}


//sample commit