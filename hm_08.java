import java.util.Scanner;
public class hm_08 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("請輸入姓名:");
        String name=cin.next();
        System.out.println("請輸入年齡:");
        int age=cin.nextInt();
        System.out.println("請輸入城市:");
        String city=cin.next();

        System.out.println(name+", "+age+" years old"+" from "+city);
    }
}
