import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter x value");
        int x = keyboard.nextInt();
        if(x > 5)
            System.out.println("A");
        else if(x < 10)
            System.out.println("B");
        else
            System.out.println("C");

    }
}
