import java.util.Scanner;
public class calculatePercentage{

    public static void main(String[] args){
        Scanner po = new Scanner(System.in);

        System.out.print("Enter your Maths marks:");
        int M = po.nextInt();

        System.out.print("Enter your Physics marks:");
        int P = po.nextInt();

        System.out.print("Enter your Chemistry marks:");
        int C = po.nextInt();

        System.out.print("Enter your Physical Education marks :");
        int PE = po.nextInt();

        System.out.print("Enter your computer science marks:");
        int CS = po.nextInt();

        float percentage = (float)(M + C + P + PE + CS)/5;
        System.out.print("Your percentage is :");
        System.out.println(percentage);
    }
}