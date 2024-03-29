// import java.io.*;
// import java.lang.Math;
// class Primefactors
// {
//     public static int isprime(int n)
//     {
//         for(int i = 2; i<=Math.sqrt(n); i++)
//         {
//             if(n%i==0)
//             return 0;
//         }
//         return 1;
//     }
//     public static void primeFactors(int n)
//     {
//         for(int i = 2; i<= n; i++)
//         {
//             if(isprime(i)==1)
//             {
//                 int x = n;
//                 while(x%i==0)
//                 {
//                     System.out.print(i + " ");
//                     x /= i;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args)
//     {
//        int n = 90;
//        primeFactors(n);
//     }
// }



import java.io.*;
import java.lang.Math;
class Primefactors
{
    public static void primeFactors(int n)
    {
        while (n % 2 == 0) 
        {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) 
        { 
            while (n % i == 0) 
            { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 
        if (n > 2)
        System.out.print(n);
    }
    public static void main(String[] args)
    {
        int n = 90;
        primeFactors(n);
    }
}