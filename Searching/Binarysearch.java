//iterative bs
class Binarysearch 
{
    public static int binarySearchIterative(int[] arr, int item) 
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == item) 
            {
                return mid;
            } 
            else if (arr[mid] < item) 
            {
                low = mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 7 };
        int item = 4;
        int result = binarySearchIterative(arr, item);
        if (result == -1) 
        {
            System.out.println("Item not found");
        } 
        else 
        {
            System.out.println("Item found at index " + result);
        }
    }
}


// Recursive binarysearch
// class Binarysearch 
// {
//     public static int binarySearchRecursive(int arr, int low, int high, int item) 
//     {
//         if (high >= low) 
//         {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] == item) 
//             {
//                 return mid;
//             } 
//             else if (arr[mid] > item) 
//             {
//                 return binarySearchRecursive(arr, low, mid - 1, item);
//             } 
//             else 
//             {
//                 return binarySearchRecursive(arr, mid + 1, high, item);
//             }
//         }
//         return -1; 
//     }

//     public static void main(String[] args)
//     {
//         int[] arr = {2, 3, 4, 5, 7};
//         int item = 4;
//         int result = binarySearchRecursive(arr,0, arr.length - 1, item);
//         if (result == -1) 
//         {
//             System.out.println("Item not found");
//         } 
//         else 
//         {
//             System.out.println("Item found at index " + result);
//         }
//     }
// }
