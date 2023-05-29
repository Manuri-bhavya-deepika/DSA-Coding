// class Factor
// {
//     public static void main(String[] args) 
//     {
//         int num = 10;
//         System.out.println( "Factors of " + num + " are " );
//         for(int i = 1; i <= num; i++)
//         {
//             if(num % i == 0)
//             System.out.println(i + " "); 
//         }

//     }
// }


// class Factor
// {
//     public static void main (String[]args)
//     {
//         int num = 100;
//         getFactors (num);
//     }
//     static void getFactors (int num)
//     {
//         for (int i = 1; i <= (num/2); i++)
//         {
//             if (num % i == 0)
//             {
//                 System.out.print(i + " ");
//             }
//         }
// 		System.out.print(num);
//     }
// }


// class Factor
// {
//     public static void main(String[] args)
//     {
//         int num = 100;
//         getFactors (num);
//     }
//     static void getFactors (int n)
//     {
//         for(int i = 1; i <= Math.sqrt(n); ++i)
//         {
//             if (n % i == 0)
//             {
//                 if(i == n / i)
//                 System.out.print(i);
//                 else
//                 System.out.print(i + ", " + n/i + ", ");
//             }
//         }
//     }
// }


// class Factor
// {
//     public static void main (String[]args)
//     {
//         int num = 100;
//         getFactors (num);
//     }
//     static void getFactors (int num)
//     {
//         int i;
//         boolean flag = false;
//         for(i = 1; i <= Math.sqrt(num); i++)
//         {
//             if (num % i == 0)
//             System.out.print(i + " ");
//             if(i == num/i) 
//             flag = true; 
//         } 
//         if(flag)
//         i -= 2; 
//         for(; i >= 1; i--)
//         {
//             if (num % i == 0)
//             System.out.print(num/i + " ");
//         } 
//     }
// }


class Factor
{
    public static void main(String[] args) 
    {
        int num = -100;
        System.out.print("Factors of " + num + " are: ");
        for(int i = num; i <= Math.abs(num); ++i) 
        {
            if(i == 0) 
            {
                continue;
            }
            else 
            {
                if (num % i == 0) 
                {
                    System.out.print(i + " ");
                }
            }
        }
    }
}