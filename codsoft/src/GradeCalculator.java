import java.io.*;
import java.util.Scanner;

public class GradeCalculator {
        public static void main (String[] args){
            float[] marks = new float[5];
            float sum=0, avg;
            int i;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the marks of 5 subject:");
            for (i=0;i<5;i++){
                marks[i]=sc.nextFloat();
            }
            for (i=0;i<5;i++)
                sum+=marks[i];
                avg=sum/5;

                System.out.print("Grade= ");
                if(avg>=90){
                    System.out.println("A+");
                } else if (avg<90 && avg>=80) {
                    System.out.println("A");
                } else if (avg<80 && avg>=70) {
                    System.out.println("B+");
                } else if (avg<70 && avg>=60) {
                    System.out.println("B");
                } else if (avg<60 && avg>=50) {
                    System.out.println("C+");
                } else if (avg<50 && avg>=40) {
                    System.out.println("C");
                }
                else {
                    System.out.println("F");
                }

            System.out.println("Total Marks:"+ sum);
            System.out.println("Average percentage is "+ avg);
        }
}
