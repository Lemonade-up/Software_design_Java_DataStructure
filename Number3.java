public class Number3{
    public int BinaryConDeci(int binaryNumber){
        int decimal;
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
        Number3 objik = new Number3();
        System.out.println(input + " ---> " + Output);
    }
}