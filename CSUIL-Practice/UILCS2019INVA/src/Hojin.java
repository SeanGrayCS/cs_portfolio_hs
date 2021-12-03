import java.util.*;
import java.io.*;
public class Hojin {
    public static void main(String[] args) throws IOException{
        String name = "hojin";
        Scanner scanner = new Scanner(new File("./jud/" + name + ".dat"));

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Case #" + i + ": ");

            long cat = scanner.nextLong();
            long dog = scanner.nextLong();
            long temp = dog;

            if (cat < dog) {
                dog = cat;
                cat = temp;
            }

            while (dog != 0) {
                temp = dog;
                dog = cat % dog;
                cat = temp;
            }

            System.out.println(cat);

        }
    }
}
