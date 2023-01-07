import java.util.*;

public class EvenDigit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Nums= ");
        int size= in.nextInt();
        int[] nums=new int[size];
        
        for(int i=0; i<nums.length; i++){
            nums[i]=in.nextInt();
        }
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int count=0;
        for(int i=0; i<nums.length; i++){
            int digit=0;
            int element=nums[i];

            while(element!=0){
                element=element/10;
                digit++;
            }
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
}
