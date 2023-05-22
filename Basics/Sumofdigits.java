// using brute force
// class Sumofdigits 
// {
//     public static void main (String[]args)
//     {
//         int num = 12345, sum = 0;
//         while(num!=0)
//         {
//             sum += num % 10;
//             num = num / 10;
//         }
//        System.out.println ("Sum of digits : " + sum);
//     }
// }


// Using Recursion I
// class Sumofdigits
// {
//     public static void main (String[]args)
//     {
//         int num = 12345, sum = 0;
//         System.out.println ("Sum of digits : " + getSum (num, sum));
//     }
//     static int getSum (int num, int sum)
//     {
//         if (num == 0)
//         return sum;
//         sum += num % 10;
//         return getSum (num / 10, sum);
//     }
// }


// Using Recursion II
// class Sumofdigits
// {
//     public static void main (String[]args)
//     {
//         int num = 12345;
//         System.out.println ("Sum of digits : " + getSum (num));
//     }
//     static int getSum (int num)
//     {
//         if (num == 0)
//         return 0;
//         return (num % 10) + getSum (num / 10);
//     }
// }


// Using ACSII Table
class Sumofdigits
{
    public static void main (String[]args)
    {
        String num = "9876543219876543219876";
        System.out.println ("Sum of digits : " + getSum (num));
    }
    static int getSum (String num)
    {
        int sum = 0;
        for (int i = 0; i < num.length (); i++)
        {
            sum = sum + num.charAt (i) - 48;
        }
        return sum;
    }
}
