import java.util.Scanner;

public class Number3{
    public int BinaryConDeci(int binaryNumber){
        int decimal = 0;
        int p = 0;
        while(true){
            if(binaryNumber == 0)   break;
            else{
                int temp = binaryNumber%10;
                decimal += temp*Math.pow(2,p);
                binaryNumber = binaryNumber/10;
                p++;
            }
        }
    return decimal;
    }
    public static void main(String args[]){
        Scanner inputScan = new Scanner(System.in);
        Number3 objik = new Number3();
        int input;

        System.out.println("Enter Input:");
        input = inputScan.nextInt();


        System.out.println(input + " ---> " + objik.BinaryConDeci(input));
    }
}
