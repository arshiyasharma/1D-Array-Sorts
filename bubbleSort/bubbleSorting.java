package bubbleSort;

//Program to sort array in ascending or descending order using Bubble Sort technique
//By Arshiya Sharma
import java.util.Scanner;
public class bubbleSorting
{
    private byte choice;
    int[] input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array:");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            arr[i]=scan.nextInt();
        }
        System.out.print("\nDo you want to sort it in:\n1.Ascending Order\n2.Descending Order\n->");
        choice=scan.nextByte();
        return arr;
    }
    void sort(int arr[])
    {
        switch(choice)
        {
            case 1:
                for(int i=arr.length-1;i>=0;i--)
                {
                    for(int j=0;j<=i-1;j++)
                        if(arr[j]>arr[j+1])
                        {
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                }
                display(arr);
                break;
            case 2:
                for(int i=arr.length-1;i>=0;i--)
                {
                    for(int j=0;j<=i-1;j++)
                        if(arr[j]<arr[j+1])
                        {
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                }
                display(arr);
                break;
            default:
                System.out.println("\nWrong input, retry.\n");
                String ar[]={};
                main(ar);
        }
    }
    void display(int arr[])
    {
        //prints array
        System.out.print("\n----------------\nSorted array:");
        for(int i=0;i<arr.length;i++)
            System.out.print(" "+arr[i]);
    }
    public static void main(String []ar)
    {
        bubbleSorting obj = new bubbleSorting();
        int arr[]=obj.input();
        obj.sort(arr);
    }
}