import java.util.Scanner;
public class ch3_13 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);

        System.out.println("What's your name?");
        String name=cin.next();
        System.out.println("How old are you?");
        int age=cin.nextInt();
        System.out.println(name+", "+age+" years old.");
        cin.close();    //將cin關閉
    }
}
