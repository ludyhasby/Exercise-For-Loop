package testpingjava;

import java.util.Scanner;

public class ExerciseForLoop4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double machine_price = Double.parseDouble(scanner.nextLine());
        int toy_price = Integer.parseInt(scanner.nextLine());

        double money = 0.00;
        int toys = 0;

        for(int i = 1; i <= n; i++){
            if(i%2==0){
                money += (10.00*(i/2));
            } else{
                toys += 1;
            }
        }
        money = money + (toys*toy_price)-((n/2)*1);
        if(money>=machine_price){
            System.out.printf("Yes! %.2f", money-machine_price);
        } else{
            System.out.printf("No! %.2f", Math.abs(money-machine_price));
        }
    }
}
