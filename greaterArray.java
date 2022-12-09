import java.util.*;

public class greaterArray{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int numbers[]=new int[num];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        System.out.println("Enter the numbers");
        for(int i=0; i<num; i++){
            numbers[i]=sc.nextInt();
        }

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("Greater number: " +max);
        System.out.println("Smaller number: " +min);
        }
    }