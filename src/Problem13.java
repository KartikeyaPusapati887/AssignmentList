import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int side=input.nextInt();
        int perimeter=side*4;
        System.out.println("The length of the side is "+side+ " whose perimeter is "+perimeter);
    }
}
