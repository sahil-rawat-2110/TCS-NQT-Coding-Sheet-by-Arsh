//5 All divisors of a natural number


import java.util.Scanner;

public class allDivisorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        if(number==0){
            System.out.println("Enter a valid number ");
            return;
        }
        for(int i = 1; i<=number; i++){
            if(number%i==0){
                System.out.print(i + " ");
            }
        }
    }
}
