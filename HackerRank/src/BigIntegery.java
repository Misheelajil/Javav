import java.io.*;
import java.util.*;
import java.math.BigInteger; 
public class BigIntegery {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    BigInteger A,B,C,D;
    A  = input.nextBigInteger();
    B  = input.nextBigInteger(); 
    C= A.add(B);
    D = A.multiply(B);
    System.out.println(C);
    System.out.println(D);
    }
}

