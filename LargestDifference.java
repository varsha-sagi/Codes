/*Given an array of integers, find and return the largest
difference between two elements such that the smaller
element precedes the larger element
Input:
6
7 9 5 6 3 2
output: 
2
*/

import java.util.*;
public class HelloWorld {
    public static int findLargestDifference(int[] arr) 
    {
        int max=0,diff;
        for(int i=0;i<arr.length-1;i++) 
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[j]>arr[i])
                {
                    diff=arr[j]-arr[i];
                    if(diff>max) 
                    {
                        max=diff;
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int max = findLargestDifference(arr);
        System.out.println("Largest Difference is: " + max);
    }
}
