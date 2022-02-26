

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        String[] keys = {"id","name","email","body"};
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<keys.length;i++){
                String q =  String.format("Enter Your %s:",keys[i]);
                System.out.print(q);
                keys[i] = sc.nextLine();
            }
        }
        System.out.println(new Com(Integer.parseInt(keys[0]),keys[1], keys[2],keys[3]).toString());
    }
}
