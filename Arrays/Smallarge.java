//iterative method
// class Smallarge
// {
//     public static void main(String args[])
//     {
//         int arr[] = {12, 13, 1, 10, 34, 10};
//         int largest = arr[0], smallest=arr[0];
//         for(int i=0; i<arr.length; i++) 
//         { 
//             if(smallest > arr[i])
//             smallest = arr[i];
//             if(largest < arr[i])
//             largest = arr[i];
//         }
//         System.out.println(smallest);
//         System.out.println(largest);
//    }
// }

//recursion using top-down approach
class Smallarge
{
  static int getmin(int arr[], int n)
  {
    if(n==1)
    return arr[0];
    return Math.min(arr[n-1], getmin(arr, n-1));
  }
  static int getmax(int arr[], int n)
  {
     if(n==1)
      return arr[0];
      return Math.max(arr[n-1], getmax(arr, n-1));
  }
  public static void main(String args[])
  {
    int arr[] = {12, 13, 1, 10, 34, 10};
    int n = arr.length;
    System.out.println(getmin(arr, n));
    System.out.println(getmax(arr, n)); 
   }
}


//recursion using bottom-up approach
// class Smallarge
// {
//    static int minimum(int arr[], int i, int end)
//    {
//      int min;
//      if(i == end-1)
//      return (arr[i] < arr[i + 1]) ? arr[i] : arr[i + 1];
//      min = minimum(arr, i + 1, end);
//      return (arr[i] < min) ? arr[i] : min; 
//     } 
//     static int maximum(int arr[], int i, int end) 
//     { 
//         int max;
//         if(i == end-1) 
//         return (arr[i] > arr[i + 1]) ? arr[i] : arr[i + 1];
//         max = maximum(arr, i + 1, end);
//         return (arr[i] > max) ? arr[i] : max;
//    }
//    public static void main(String args[])
//    {

//        int arr[] = {12, 13, 1, 10, 34, 10};
//        int n = arr.length;
//        System.out.println(minimum(arr, 0, n-1));
//        System.out.println(maximum(arr, 0, n-1)); 
//    }
// }