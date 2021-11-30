import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double cost;
        double newCost;

        double kdvCost;
        System.out.println("Plase enter the cost:");
        cost=scanner.nextDouble();
        double kdv=(cost>=1000) ? 0.08 : 0.158;
        kdvCost=kdv*cost;
        newCost=cost+kdvCost;
        System.out.println("Total Cost " +newCost+ " tl");
        System.out.println("KDV Cost " +kdvCost+ " tl");
        System.out.println("KDV value " +kdv+" tl");


    }
}
