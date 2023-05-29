// using iteration
// class Fibonacci 
// {
//     public static void main (String[]args)
//     {
//         int num = 15;
//         int a = 0, b = 1;
//         System.out.print (a + " , " + b + " , ");
//         int nextTerm;
//         for (int i = 2; i < num; i++)
//         {
//             nextTerm = a + b;
//             a = b;
//             b = nextTerm;
//             System.out.print (nextTerm + " , ");
//         }
//     }
// }


// using recursion
// class Fibonacci
// {
//     static int a = 0, b = 1, nextTerm;
//     public static void main (String[]args)
//     {
//         int n = 15;
//         System.out.print (a + " , " + b + " , ");
//         Fib (n - 2);
//     }
//     static int Fib (int n)
//     {
//         if (n > 0)
//         {
//             nextTerm = a + b;
//             a = b;
//             b = nextTerm;
//             System.out.print (nextTerm + " , ");
//             Fib (n - 1);
//         }
//         return 0;
//     }
// }


// using formula
class Fibonacci
{
    static int a = 0, b = 1, nextTerm;
    public static void main (String[]args)
    {
        int n = 15;
        fib (n);
    }
    static void fib (int n)
    {
        int f[] = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        System.out.print (f[0] + " , " + f[1] + " , ");
        for (int i = 2; i < n; i++)
        {
            f[i] = f[i - 1] + f[i - 2];
            System.out.print (f[i] + " , ");
        }
    }
}