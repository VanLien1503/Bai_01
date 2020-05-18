import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int arr[]={33,5,7,4,9,3,13,24,23};

        // thuật toán chen
        int n=arr.length;
        for (int i=1;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j--;
            }
            for (int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
