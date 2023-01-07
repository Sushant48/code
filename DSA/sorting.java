import java.util.*;

public class sorting {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static int max(int[] arr, int end){
        int max=0;
        for(int i=0; i<=end; i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }

    static void bubble(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean order = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    order=true;
                }
            }
            if(!order){
                break;
            }
        }
    }

    static void selection(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int last = arr.length - i - 1;
            int maxIndex = max(arr, last);
            swap(arr,maxIndex,last);
        }
    }

    static void insertion(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void cycle(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
}