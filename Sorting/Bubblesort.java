class Bubblesort 
{
    public static void Bubble(int arr[]) 
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 1; j < n-i; j++) 
            {
                if (arr[j-1] > arr[j]) 
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {5, 2, 8, 1, 9};
        Bubble(arr);
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
        

//optimized way
// class Bubblesort 
// {
//     public static void bubble(int arr[]) 
//     {
//         int n = arr.length;
//         boolean swapped;
//         for (int i = 0; i < n-1; i++) 
//         {
//             swapped = false;
//             for (int j = 0; j < n-i-1; j++) 
//             {
//                 if (arr[j] > arr[j+1])
//                 {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swapped = true;
//                 }
//             }
//             // If no swaps were made in the inner loop, the array is already sorted
//             if (!swapped) 
//             {
//                 break;
//             }
//         }
//     }

//     public static void main(String[] args) 
//     {
//         int[] arr = {5, 2, 8, 1, 70,6};
//         bubble(arr);
//         System.out.print("Sorted array: ");
//         for (int i = 0; i < arr.length; i++) 
//         {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
