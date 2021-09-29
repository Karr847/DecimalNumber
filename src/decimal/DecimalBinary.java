package decimal;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalBinary {
    public static void main(String[] args) {

        int decimalNumber;
        int i=0;
        int binaryNumber[]=new int[1000];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter decimal number");
        decimalNumber=input.nextInt();
        while (decimalNumber !=0) {
            binaryNumber[i] = decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
            i++;
        }
            System.out.print("Binary number value is:");
            for (int j=i-1;j>=0;j--){
                System.out.print(""+binaryNumber[j]);
            }
        }

    }
