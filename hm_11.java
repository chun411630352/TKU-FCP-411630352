import java.util.Scanner;
public class hm_11 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);

        System.out.println("輸入價格:");
        int x=cin.nextInt();
        System.out.println("輸入價格:");
        int y=cin.nextInt();
        System.out.println("輸入價格:");
        int z=cin.nextInt();

        System.out.println(x+"+"+y+"+"+z+"="+(x+y+z));
        cin.close();
    }
}
