import java.io.*;
import java.util.*;
import java.lang.*; 
import java.math.*;

public class sol{
    public static int[] solution(int area) {

        int a[]=new int[10];
        int temp = area;
        int j, count=0;

        for(int i=0; temp!=0; i++){
            j = (int)Math.sqrt(temp) | 0;
            temp = temp - (j*j);
            a[i] = (j*j);
        }
        
        for(int i=0; a[i]!=0; i++)
            count ++;

        int b[]=new int[count];

        for(int i=0; a[i]!=0; i++)
            b[i] = a[i];

        return b;
    }

    public static void main(String []args){
        
        Scanner myObj = new Scanner(System.in);
        int area = myObj.nextInt();
       
        int i;
        int[] a = solution(area);

        for (i = 0; i<a.length; i++){
            System.out.print( a[i]+ " ");
        }
    }
}
