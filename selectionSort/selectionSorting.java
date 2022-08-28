package selectionSort;

//Program to sort array in ascending order using Selection Sort technique
//By Arshiya Sharma
import java.util.Scanner;
public class selectionSorting
{
    int[] input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\fEnter the length of the array:");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            arr[i]=scan.nextInt();
        }
        return arr;
    }
    void sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min_idx=i;
            //finding minimum element
            for(int j=i+1;j<arr.length;j++)
                if(arr[j]<arr[min_idx])
                    min_idx=j;
            //swapping element in first element
            int temp=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;
        }
        display(arr);
    }
    void display(int arr[])
    {
        //prints array
        System.out.print("----------------\nSorted array:");
        for(int i=0;i<arr.length;i++)
            System.out.print(" "+arr[i]);
    }
    public static void main(String ar[])
    {
        selectionSorting obj = new selectionSorting();
        int arr[]=obj.input();
        obj.sort(arr);
    }
}