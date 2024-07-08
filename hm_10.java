import java.util.Scanner;
public class hm_10 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);

        System.out.println("輸入華氏溫度:");
        double f=cin.nextDouble();
        double c= (f - 32) * 5/9;
        System.out.println(c);
    }
}
