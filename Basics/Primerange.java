// class Primerange 
// {
//     public static void main (String[]args)
//     {
//         int lower = 1, upper = 20;
//         for (int i = lower; i <= upper; i++)
//         if (isPrime (i))
//         System.out.println (i);
//     }
//     static boolean isPrime (int n)
//     {
//         int count = 0;
//         if (n < 2)
//         return false;
//         for (int i = 2; i < n; i++)
//         {
//             if (n % i == 0)
//             return false;
//         }
//         return true;
//     }
// }


// class Primerange
// {
//     public static void main (String[]args)
//     {
//         int lower = 1, upper = 20;
//         for (int i = lower; i <= upper; i++)
//         if (isPrime (i))
//         System.out.println (i);
//     }
//     static boolean isPrime (int n)
//     {
//         int count = 0;
//         if (n < 2)
//         return false;
//         for (int i = 2; i < n / 2; i++)
//         {
//             if (n % i == 0)
//             return false;
//         }
//         return true;
//     }
// }


// class Primerange
// {
//     public static void main (String[]args)
//     {
//         int lower = 1, upper = 20;
//         for (int i = lower; i <= upper; i++)
//         if (isPrime (i))
//         System.out.println (i);
//     }
//     static boolean isPrime (int n)
//     {
//         int count = 0;
//         if (n < 2)
//         return false;
//         for (int i = 2; i < Math.sqrt (n); i++)
//         {
//             if (n % i == 0)
//             return false;
//         }
//         return true;
//     }
// }


class Primerange
{
    public static void main (String[]args)
    {
        int lower = 1, upper = 20;
        for (int i = lower; i <= upper; i++)
        if (isPrime (i))
        System.out.println (i);
    }
    static boolean isPrime (int n)
    {
        if (n <= 1)
        return false;
        else if (n == 2)
        return true;
        else if (n % 2 == 0)
        return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
            return false;
        }
        return true;
    }
}