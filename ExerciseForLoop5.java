package testpingjava;

import java.util.Scanner;

public class ExerciseForLoop5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int sanction = 0;

        for(int i = 1; i<=n; i++){
            String web = scanner.nextLine();
            switch(web){
                case "Facebook" :
                    sanction += 150;
                    break;
                case "Instagram":
                    sanction += 100;
                    break;
                case "Reddit":
                    sanction += 50;
                    break;
                default:
                    sanction += 0;
                    break;
            }
        }
        int salvage = salary - sanction;
        if(salvage<=0){
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salvage);
        }
    }
}
