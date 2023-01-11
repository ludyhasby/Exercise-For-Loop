package testpingjava;

import java.util.Scanner;

public class ExerciseForLoop8 {
    public static void main(String[] arsg){
        Scanner scanner = new Scanner(System.in);
        int tour = Integer.parseInt(scanner.nextLine());
        int intial_point = Integer.parseInt(scanner.nextLine());
        int points =0;
        double total = tour;
        double win = 0;

        for(int i = 1; i<=tour; i++){
            String stage = scanner.nextLine();
            if(stage.equals("W")){
                points += 2000;
                win += 1;
            } else if(stage.equals("F")){
                points += 1200;
            } else if(stage.equals("SF")){
                points += 720;
            }
        }
        System.out.printf("Final points: %d%n", points+intial_point);
        System.out.printf("Average points: %d%n", points/tour);
        System.out.printf("%.2f%%", win/total*100);
    }
}
