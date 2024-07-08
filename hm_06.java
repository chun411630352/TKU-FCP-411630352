import java.util.Scanner;
public class hm_06 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);

        System.out.println("請輸入一整數:");
        int x=cin.nextInt();
        System.out.println("請再輸入一個整數:");
        int y=cin.nextInt();
        System.out.println(x+"+"+y+"="+(x+y));
    }
}
