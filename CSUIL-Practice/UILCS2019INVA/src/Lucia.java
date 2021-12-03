import java.util.*;
import java.io.*;

public class Lucia {
    public static void main(String [] args) throws IOException{
        String name = "lucia";
        Scanner in = new Scanner(new File("./jud/" + name + ".dat"));
        Node root = new Node(in.nextInt());
        while(in.hasNextInt()){
            int num = in.nextInt();
            root.add(num);
        }
        System.out.println("Preorder: " + root.preorder().trim());
        System.out.println("Postorder: " + root.postorder().trim());
    }

    private static class Node{
        Node left;
        Node mid;
        Node right;
        int num;
        public Node(int num){
            this.num = num;
        }

        public void add(int x){
            if (num - 5 > x){
                if (left == null){
                    left = new Node(x);
                }
                else{
                    left.add(x);
                }
                
            }
            else if(x - 5 > num){
                if (right == null){
                    right = new Node(x);
                }
                else{
                    right.add(x);
                }
            }
            else{
                if (mid == null){
                    mid = new Node(x);
                }
                else{
                    mid.add(x);
                }
            }
        }

        public String preorder(){
            String s = "";
            s += num + " ";
            if (left != null){
                s += left.preorder();
            }
            if (mid != null){
                s += mid.preorder();
            }
            if (right != null){
                s += right.preorder();
            }
            return s;
        }

        public String postorder(){
            String s = "";
            if (left != null){
                s += left.postorder();
            }
            if (mid != null){
                s += mid.postorder();
            }
            if (right != null){
                s += right.postorder();
            }
            s += num + " ";
            return s;
        }
    }
}
