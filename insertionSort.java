import java.util.Scanner;
class insertionSort
{
    Scanner sc=new Scanner(System.in);
    int a[],n;
    char order;
    void input()
    {
        System.out.print("\fEnter the length of array:");
        n=sc.nextInt();
        a=new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter 'a' for ascending or 'd' for descending sort - ");
        for(int loopvar=1;loopvar==1;)
        {
            order = sc.next().charAt(0);
            if(order=='a' || order=='d')
                loopvar++;
            else
                System.out.print("Wrong Input! Try again - ");
        }
    }

    void sort()
    {
        int small=a[0],large=a[0],pos=0;
        if(order == 'a')
        {
            for(int i=0;i<a.length;i++)
            {
                int temp = a[i];
                for(int j=i;j>=0;j--)
                {
                    if(j==0 || a[j-1]<=temp)
                    {
                        a[j]=temp;
                        break;
                    }
                    else
                        a[j]=a[j-1];
                }
            }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                if(large<a[i])
                {
                    large=a[i];
                    pos=i;
                }
            }
            a[pos]=a[0];
            a[0]=large;
            for(int i=1;i<n;i++)
            {
                int j=i,temp=a[i];
                while(temp>a[j-1])
                {
                    a[j]=a[j-1];
                    j=j-1;
                }
                a[j]=temp;
            }
        }
    }

    void print()
    {
        System.out.print("\nThe arranged array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }

    public static void main(String args[])
    {
        insertionSort obj=new insertionSort();
        obj.input();
        obj.sort();
        obj.print();
    }
}
//arshiya sharma
