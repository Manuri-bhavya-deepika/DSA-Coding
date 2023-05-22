// Using while loop
// class Reverse 
// {
//     public static void main (String[]args)
//     {
//         int num = 1234, reverse = 0, rem;
//         while (num != 0)
//         {
//             rem = num % 10;
//             reverse = reverse * 10 + rem;
//             num /= 10;
//         }
//         System.out.println ("Reversed Number: " + reverse);
//     }
// }


// Using For loop
// class Reverse
// {
//     public static void main (String[]args)
//     {
//         int num = 124, reverse = 0, rem;
//         for( ;num != 0; num = num/10)
//         {
//             rem = num % 10;
//             reverse = reverse * 10 + rem;
//         }
//         System.out.println ("Reversed Number: " + reverse);
//     }
// }
    

// Using Recursion I
// class Reverse
// {
//     public static void main (String[]args)
//     {
//         int num = 1234, rev = 0;
//         System.out.println ("Reversed Number: " + getReverse(num, rev));
//     }
//     static int getReverse (int num, int rev)
//     {
//         if (num == 0)
//         return rev;
//         int rem = num % 10;
//         rev = rev * 10 + rem;
//         return getReverse (num / 10, rev);
//     }
// }


// Using Recursion II
// class Reverse
// {
//     public static void main (String[]args)
//     {
//         int num = 120;
//         getReverse (num);
//     }
//     static void getReverse (int num)
//     {
//         if (num == 0)
//         return;
//         int rem = num % 10;
//         System.out.print (rem);
//         getReverse (num / 10);
//     }
// }


class Reverse
{
    public static void main (String[]args)
    {
        int num = -1234;
        boolean isNegative = num < 0 ? true: false;
        if (isNegative) 
        {
            System.out.print("-");
            num = num * -1;
        }
        getReverse(num);
    }
    static void getReverse(int num)
    {
        if (num == 0)
        return;
        int rem = num % 10;
        System.out.print(rem);
        getReverse(num / 10);
    }
}