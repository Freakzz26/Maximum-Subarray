import java.util.Scanner;

public class MaximumSubArray {
    static void maximumArray(int[] arr, int n, int b ){
        int result=0;
        int sum=0;
        for (int i=0;i<n;i++)
        {
            for (int j=i;j<n;j++)
            {
                sum=0;
                for (int k=i;k<=j;k++)
                {
                    sum=sum+arr[k];
                    if(sum<=b)
                    {
                        result=Math.max(result,sum);
                    }
                }

            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for (int i= 0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int b=scanner.nextInt();
        maximumArray(arr,size,b);
    }
}
