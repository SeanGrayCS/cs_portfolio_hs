import java.util.*;
import java.io.*;
public class Nina {
    public static void main(String[] args) throws Exception {
        String name = "nina";
        Scanner in = new Scanner(new File("./jud/" + name + ".dat"));

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            double r = in.nextDouble();

            double s = 2*r*Math.sin(Math.PI/5);
            double a = 5*s*s/(4*Math.tan(Math.PI/5));

            double p = s*5;

            System.out.print("LOCATION #" + i + " ");
            if (a > 43560) {
                System.out.print("WILL NOT FIT");
            } else {
                System.out.printf("%.2f ", a);
                System.out.printf("%.2f", p);
            }
            System.out.print("\n");
        }
    }
}
