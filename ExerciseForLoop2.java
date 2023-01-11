package testpingjava;

import java.util.Scanner;

public class ExerciseForLoop2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i =1; i<=n; i++){
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if(number>max){
                max = number;
            }
        }

        int salvage = sum-max;
        if(max==salvage){
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        } else{
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(max-salvage));
        }
    }
}
