import java.util.Scanner;
public class hm_09 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("輸入長方形的寬:");
        double width=cin.nextDouble();
        System.out.println("輸入長方形的長:");
        double length=cin.nextDouble();

        System.out.println("area= "+(width*length));
    }
}
