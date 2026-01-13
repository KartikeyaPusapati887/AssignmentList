import java.util.Scanner;
public class Problem16 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int  numberOfStudents=input.nextInt();
        System.out.println("The number of possible handshakes is "+numberOfStudents*(numberOfStudents-1)/2.0);
    }
}
