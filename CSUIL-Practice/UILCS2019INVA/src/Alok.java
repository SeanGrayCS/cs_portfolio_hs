import java.util.*;
import java.io.*;
public class Alok {
    public static void main(String[] args) throws IOException{
        String name = "alok";

        Scanner scanner = new Scanner(new File("./jud/" + name + ".dat"));
        double total = 0;
        int counter = 0;
        while(scanner.hasNextDouble()){
            counter++;
            total += scanner.nextDouble();
        }
        System.out.printf("$%.2f", total);
        System.out.println();
        double average = total / counter;
        System.out.printf("$%.2f", average);
    }
}
