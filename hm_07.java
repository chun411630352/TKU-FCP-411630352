import java.util.Scanner;
public class hm_07 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);

        System.out.println("請輸入圓的半徑:");
        double r=cin.nextDouble();
        System.out.println("area="+(r*r*Math.PI));
    }
}
