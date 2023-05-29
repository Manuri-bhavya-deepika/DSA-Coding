// class Perfectnumber
// {
//     public static void main (String[]args)
//     {
//         int n = 28, sum = 0;
//         for (int i = 1; i < n; i++)
//         {
//             if (n % i == 0)
//  	        sum = sum + i;
//         }
//         if (sum == n)
//         System.out.println (n + " is a perfect number");
//         else
//         System.out.println (n + " is not a perfect number");
//     }
// }


// class Perfectnumber
// {
//     public static void main (String[]args)
//     {
//         int num = 28, sum = 0, i = 1;
//         while(i < num)
//         {
//             if(num % i == 0)
//             sum = sum + i;
//             i++;
//         }
//         if (sum == num)
//         System.out.println (num + " Is a perfect number");
//         else
//         System.out.println (num + " Is not a perfect number");
//     }
// }


// class Perfectnumber
// {
//     public static void main (String[]args)
//     {
//         int num = 29, sum = 0, i = 1;
//         while(i <= num/2)
//         {
//             if(num % i == 0)
//             sum = sum + i;
//             i++;
//         }
//         if (sum == num)
//         System.out.println (num + " Is a perfect number");
//         else
//         System.out.println (num + " Is not a perfect number");
//     }
// }


// class Perfectnumber
// {
//     public static void main (String[]args)
//     {
//         int num = 28;
//         if (isPerfect(num))
//         System.out.println (num + " Is a perfect number");
//         else
//         System.out.println (num + " Is not a perfect number");
//     }
//     private static boolean isPerfect(int num) 
//     {
//         int sum = 0;
//         for (int i = 1; i <= num/2; i++)
//         {
//             if (num % i == 0)
//             sum = sum + i;
//         }
//         if (sum == num)
//         return true;
//         return false;
//     }
// }


// class Perfectnumber
// {
//     static long sum = 0;
//     static long isPerfect(long num, int i)
//     {
//         if(i <= num/2)
//         {
//             if(num % i ==0)
//             sum = sum + i;
//             i++;
//             isPerfect(num, i);
//         }
//         return sum;
//     }
//     public static void main(String args[])
//     {
//         long num = 28;
//         if(isPerfect(num, 1) == num)
//         System.out.println(num+" is a perfect number");
//         else
//         System.out.println(num+" is not a perfect number");
//     }
// }


class Perfectnumber
{
    public static void main (String[]args)
    {
        int n = 90;
        if(n == getDivisorsSum(n))
        System.out.println (n + " is a perfect number");
        else
        System.out.println (n + " is not a perfect number");
    }
    static int getDivisorsSum(int n)
    {
        int sum = 0;
        for(int i = 1; i < Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                if(i == 1)
                sum = sum + i;
                else if(i == n/i)
                sum = sum + i;
                else
                sum = sum + i + n/i;
            }
        }
        return sum;
    }
}