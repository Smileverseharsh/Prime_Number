package Apna;

import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        System.out.print("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        for (int i=1; i<n/2;i++){
            if (n%i == 0){
                flag ++;
            }
        }
        if (flag == 1){
            System.out.println("Number is prime");

        }else 
            System.out.println("Number is not Prime");
        
    }
    
}
