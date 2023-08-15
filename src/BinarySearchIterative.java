import java.util.Scanner;

public class BinarySearchIterative {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size=pk.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter elements in the array : ");
        for (int i=0;i<size;i++){
            arr[i]=pk.nextInt();
        }
        System.out.println();
        System.out.print("Enter key value : ");
        int key=pk.nextInt();
        boolean ans=binarySearch(arr,key);
        System.out.println(ans);
    }
    static boolean binarySearch(int[] arr,int key){
        int n=arr.length;
        int start=0,end=n-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (key==arr[mid]){
                return true;
            } else if (key<arr[mid]) {
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return false;
    }
}
