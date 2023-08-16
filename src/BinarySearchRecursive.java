import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter length of the array : ");
        int size=pk.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter elements in the array : ");
        for (int i=0;i<size;i++){
            arr[i]=pk.nextInt();
        }
        System.out.println();
        System.out.print("Enter target : ");
        int target=pk.nextInt();
        boolean ans=binarySearch(arr,0,size-1,target);
        System.out.print("Ans : "+ans);
    }
    static boolean binarySearch(int[] arr,int start,int end,int target){
        if (start>end)
            return false;
        int mid=start+(end-start)/2;
        if (target==arr[mid])
            return true;
        else if (target<arr[mid])
            return binarySearch(arr,start,mid-1,target);
        else
            return binarySearch(arr,mid+1,end,target);
    }
}
