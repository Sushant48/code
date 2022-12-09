import java.util.*;

public class calculator{
    public static void main(String args[]){
        while(true){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the operation you want to do:\n1:+(Addition)\n2:-(Substraction)\n3:*(Multiplication)\n4:/(Division)\n5:%(Remainder)\n6:exit");
        int s=sc.nextInt();
        System.out.println();

        System.out.print("Enter the two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println();
        int r;

        while(true){
        switch(s){
            case 1 : r=a+b;
         System.out.println("Result="+r);
            break;
            case 2 : r=a-b;
            System.out.println("Result="+r);
            break;
            case 3 : r=a*b;
            System.out.println("Result="+r);
            break;
            case 4 :if(b!=0){
            System.out.println(a/b);
            }
            else{
                System.out.println("b can't be zero");
            }
            break;
            case 5 : r=a%b;
            System.out.println("Result="+r);
            break;
        }
        if(s==6){
            break;
        }
    }
}
}
}