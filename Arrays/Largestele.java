//iterative
// class Largestele
// {
//     public static void main(String args[])
//     {
//         int arr[] = {12, 13, 1, 10, 34, 10};
//         int max = arr[0];
//         for(int i=0; i<arr.length; i++)
//         {
//             if(max < arr[i])
//             {
//                 max = arr[i];
//             }
//         }
//         System.out.print(max); 
//     }
// }

//Using recursion Top-down Approach
class Largestele
{ 
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
      System.out.print(getmax(arr, n)); 
   }
}

//Bottom-up approach
// class Largestele
// { 
//    static int maximum(int arr[], int i, int end)
//    {
//       int max;
//       if(i == end-1)
//          return (arr[i] > arr[i + 1]) ? arr[i] : arr[i + 1];
//          max = maximum(arr, i + 1, end);
//          return (arr[i] > max) ? arr[i] : max;
//    }
//    public static void main(String args[])
//    {
//      int arr[] = {12, 13, 1, 10, 34, 10};
//      int end = arr.length-1;
//      System.out.print(maximum(arr, 0, end)); 
//    }
// }
