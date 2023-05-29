class Linearsearch
{
    private static void Linear(int arr[],int item)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==item)
            {
            System.out.println(i);
            return;
            }
        }
        System.out.println("not found");
    }
public static void main(String args[])
{
    int arr[]={2,5,4,7,3};
    int item=4;
    Linear(arr,item);
}
}

// Time Complexity   :  	O(n)
// Best Case	     :      O(1)
// Worst Case	     :      O(n)
// Space Complexity	 :      O(1)
// Avg. Comparisons	 :      (n+1)/2