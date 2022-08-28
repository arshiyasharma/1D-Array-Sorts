package exchangeSort;

//Program to sort array in ascending order using Exchange Sort technique
//By Arshiya Sharma
import java.util.Scanner;
public class exchangeSorting
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
            //comparing to all subsequent values
            for(int j=i+1;j<arr.length;j++)
                if(arr[j]<arr[i])
                {
                    //swapping with minimum element
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
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
    public static void main(String []ar)
    {
        exchangeSorting obj = new exchangeSorting();
        int arr[]=obj.input();
        obj.sort(arr);
    }
}