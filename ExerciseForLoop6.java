package testpingjava;

import java.util.Scanner;

public class ExerciseForLoop6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String actor_name = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i<= n; i++){
            String evaluator = scanner.nextLine();
            double evaluator_points = Double.parseDouble(scanner.nextLine());
            int length = evaluator.length();
            points += (length*evaluator_points)/2;
            if(points>1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!%n", actor_name, points);
                break;
            }
        }
        if(points<=1250.5){
            System.out.printf("Sorry, %s you need %.1f more!", actor_name, Math.abs(1250.5-points));
        }
    }
}