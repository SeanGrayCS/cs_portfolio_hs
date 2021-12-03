import java.util.*;
import java.io.*;
public class Dasha{
    public static void main(String[] args) throws IOException{
        String name = "dasha";
        Scanner scanner = new Scanner(new File("./jud/" + name + ".dat"));
        long lines = scanner.nextLong();
        for(long j = 0; j < lines; j++){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long m = scanner.nextLong();
            long init = scanner.nextLong();
            long x1 = (a * init + b) % m;
            ArrayList<Long> nums = new ArrayList<>();
            nums.add(x1);
            for(int i = 1; i < m; i++){
                long num = (a * nums.get(i - 1) + b) % m;
                nums.add(num);
            }
            TreeSet<Long> unique = new TreeSet<>();
            for(long num : nums){
                unique.add(num);
            }
            System.out.println(unique.size() + " / " + m);
        }
    }
}
