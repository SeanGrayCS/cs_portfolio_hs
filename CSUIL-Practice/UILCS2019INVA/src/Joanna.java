import java.util.*;
import java.io.*;

public class Joanna {
    public static void main(String [] args) throws IOException{
        String name = "joanna";
        Scanner in = new Scanner(new File("./jud/" + name + ".dat"));
        int runs = in.nextInt();
        in.nextLine();
        for (int run = 1; run <= runs; run++){
            double hourly = in.nextDouble();
            double hours = in.nextDouble();
            double laptop = in.nextDouble();
            double access = in.nextDouble();
            double tax = in.nextDouble();

            double net = hourly * hours;
            //net = ((int)(Math.ceil(net * 100.0))) / 100.0;
            //System.out.println(net);
            net *= (1.0 - .0765);
            //System.out.println(net);
            net = ((int)(Math.ceil(net * 100.0))) / 100.0;
            net *= 10;
             //(1.0 - .0765);
            double purchase = (laptop + access) * (1 + tax / 100.0);
            double extra = net - purchase;

            String amount = String.format("%,4.2f", net);
            amount = String.format("%8s", amount);
            System.out.println("Net Pay:  $" + amount);
             amount = String.format("%,4.2f", purchase);
             amount = String.format("%8s", amount);
             System.out.println("Purchase: $" + amount);
            
            amount = String.format("%,4.2f", extra);
            amount = String.format("%8s", amount);
            System.out.println("Fun Cash: $" + amount);

            System.out.println("*********");
        }
    }
}
