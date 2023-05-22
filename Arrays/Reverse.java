// iterative method
// class Reverse
// {
//     public static void main(String args[])
//     {
//         int arr[] = {10, 20, 30, 40, 50};
//         int n=arr.length;
//         for(int i=n-1; i>=0; i--)
//         System.out.print(arr[i]+" "); 
//     }
// }

//swapping 
class Reverse
{
  public static void main(String args[])
  {

     int arr[] = {10, 20, 30, 40, 50};
     int n=arr.length;
     int start = 0, end = n-1;
    while(start<end)
    {
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
     }
    for(int i=0; i<n; i++)
       System.out.print(arr[i]+" "); 
    }
}

//using recursion
// class Reverse
// {
//    static void reverseRecursive(int arr[], int start, int end)
//    {
//        if (start >= end)
//        return;
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//        // recursive call to swap arr[start+1] & arr[end-1]
//       reverseRecursive(arr, start + 1, end - 1);
//    } 
//    public static void main(String args[])
//    {
//        int arr[] = {10, 20, 30, 40, 50};
//        int n=arr.length;
//        int start = 0, end = n-1;
//        reverseRecursive(arr, start, end);
//        for(int i=0; i<n; i++)
//        System.out.print(arr[i]+" "); 
//     }
// }