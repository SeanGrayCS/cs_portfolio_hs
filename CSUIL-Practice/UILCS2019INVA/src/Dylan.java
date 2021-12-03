import java.util.*;
import java.io.*;

public class Dylan {
    public static void main(String [] args) throws IOException{
        String name = "dylan";
        Scanner in = new Scanner(new File("./jud/" + name + ".dat"));
        int runs = in.nextInt();
        in.nextLine();
        for (int run = 1; run <= runs; run++){
            long k = in.nextLong();
            long r = in.nextLong();
            long c = in.nextLong();

            long ans = (r - 1) * 2 * k;
            if (c > k){
                ans += (c - k) * 2 - 1;
            }
            else{
                ans += (k - c) * 2;
            }
            System.out.println(ans);
        }
    }
}
