import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner mec=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number= mec.nextInt();
        int tempNumber=number;
        int basValue;
        int totalNumber=0;

        while (tempNumber!=0){
            basValue=tempNumber%10;
            totalNumber=basValue+totalNumber;
            tempNumber/=10;
        }
        System.out.println(number+" the sum of the digits of the number: "+totalNumber);
    }
}
