import java.util.*;
import java.io.*;
public class Raghav {
    public static void main(String[] args) throws IOException{
        String name = "raghav";
        Scanner scanner = new Scanner(new File("./jud/" + name + ".dat"));
        for(int i = 1; i <= 50; i++){
            double num = scanner.nextDouble();
            if(i % 2 == 0){num *= 2;}
            if(i % 2 == 1){num += 7;}
            if(i % 3 == 0){num *= 5;}
            if(i % 5 == 0){num -= 11;}
            if(i % 7 == 0){num = Math.pow(num, 2);}
            if(i % 10 == 0){num /= 10;}
            if(i % 11 == 0){num = Math.sqrt(num);}
            int result = (int) num;
            System.out.println(result);
            
        }
    }
}
