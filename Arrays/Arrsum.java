
//iterative method
// class Arrsum
// {
//    public static void main(String args[])
//    {
//        int arr[] = {12, 13, 1, 10, 34, 10};
//        int sum = 0;
//        for(int i=0; i<arr.length; i++)
//        {
//          sum = sum + arr[i];
//        }
//        System.out.print(sum); 
//    }
// }

//using recursion(top-down approach)
class Arrsum
{
   static int getSum(int arr[], int index, int len)
   {
        if(index==len-1)
        return arr[index];
        return arr[index] + getSum(arr, index+1, len);
   }
   public static void main(String args[])
   {
      int arr[] = {12, 13, 1, 10, 34, 10};
      int n = arr.length;
      System.out.print(getSum(arr, 0, n)); 
   }
}

//using recursion(bottom up approach)
// class Arrsum
// {
//    static int getSum(int arr[], int index)
//    {
//         if(index==0)
//         return arr[index];
//         return arr[index] + getSum(arr, index-1);
//    }
//    public static void main(String args[])
//    {
//       int arr[] = {12, 13, 1, 10, 34, 10};
//       int n = arr.length;
//       System.out.print(getSum(arr, n-1)); 
//    }
// }