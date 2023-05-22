//naive approach
// class Sortarr
// { 
//     public static void main(String[] args) 
//     { 
//        int arr[]={10, 40, 30, 20}; 
//        int temp = 0; 
//        for (int i = 0; i < arr.length; i++) 
//        { 
//         for (int j = i+1; j < arr.length; j++) 
//         { 
//             if(arr[i] > arr[j]) 
//             { 
//                 temp = arr[i]; 
//                 arr[i] = arr[j]; 
//                 arr[j] = temp; 
//             } 
//         } 
//        }
//     for (int i = 0; i < arr.length; i++) 
//     { 
//         System.out.print(arr[i] + " "); 
//     } 
//   } 
// }


//inbuilt function
import java.util.Arrays;
class Sortarr
{
    public static void main(String[] args) 
    {
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
