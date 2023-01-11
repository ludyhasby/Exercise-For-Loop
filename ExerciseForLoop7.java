package testpingjava;

import java.util.Scanner;

public class ExerciseForLoop7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double funi = 0;
        double blanc = 0;
        double kilimanjaro = 0;
        double k2 = 0;
        double everest =0;
        double total = 0;

        for(int i = 1; i<=n; i++){
            int b = Integer.parseInt(scanner.nextLine());
            total += b;
             if(b<=5){
                 funi += b;
             } else if(b>=6 && b <=12){
                 blanc += b;
             } else if(b>= 13 && b <= 25){
                 kilimanjaro += b;
             } else if(b>=26 && b<=40){
                 k2 += b;
             } else{
                 everest += b;
             }
        }
        System.out.printf("%.2f%%%n", funi/total*100);
        System.out.printf("%.2f%%%n", blanc/total*100);
        System.out.printf("%.2f%%%n", kilimanjaro/total*100);
        System.out.printf("%.2f%%%n", k2/total*100);
        System.out.printf("%.2f%%%n", everest/total*100);
    }
}
