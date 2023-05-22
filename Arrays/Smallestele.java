//iterative 
// class Smallestele
// {
//     public static void main(String args[])
//     {
//         int arr[] = {12, 13, 1, 10, 34, 10};
//         int min = arr[0];
//         for(int i=0; i<arr.length; i++) 
//         { 
//             if(min > arr[i])
//             {
//                 min = arr[i];
//             }
//         }
//         System.out.print(min); 
//     }
// }

//Recursion using top-down approach
class Smallestele
{ 
   static int getmin(int arr[], int n)
   {
       if(n==1)
       return arr[0];
       return Math.min(arr[n-1], getmin(arr, n-1));
   }
   public static void main(String args[])
   {
      int arr[] = {12, 13, 1, 10, 34, 10};
      int n = arr.length;
      System.out.print(getmin(arr, n)); 
   }
}

//Recursion using  Bottom-up approach
// class Smallestele
// { 
//    static int getmin(int arr[], int i, int end)
//    {
//       int min;
//       if(i == end-1)
//       return (arr[i] < arr[i + 1]) ? arr[i] : arr[i + 1];
//       min = getmin(arr, i + 1, end);
//       return (arr[i] < min) ? arr[i] : min;
//    }

//    public static void main(String args[])
//    {
//      int arr[] = {12, 13, 1, 10, 34, 10};
//      int end = arr.length-1;
//      System.out.print(getmin(arr, 0, end)); 
//    }
// }