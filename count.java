import java.util.*;

public class count{
 public static void main(String args[]){

    int pos=0;
    int neg=0;
    int zeros=0;
    int i;

    do{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num>0){
            pos=pos + 1;
        }else if(num<0){
            neg=neg + 1;
        }else{
            zeros=zeros + 1;
        }
        System.out.println("If want to continue press 1 , to stop press 0");
        i=sc.nextInt();
    } while(i==1);

    System.out.println("Positive numbers: "+ pos);
    System.out.println("Negative numbers: "+ neg);
    System.out.println("Zeros: "+ zeros);
 }   
}