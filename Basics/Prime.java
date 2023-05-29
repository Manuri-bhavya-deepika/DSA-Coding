// iteration
// class Prime
// {
//     public static void main (String[]args)
//     {
//         int n = 23;
//         checkPrime(n);
//     }
//     private static void checkPrime(int n) 
//     {
//         int count = 0;
//         if (n < 2)
//         System.out.println ("The given is number " + n + " is not prime");
//         for (int i = 1; i <= n; i++) 
//         { 
//             if (n % i == 0) 
//             count += 1; 
//         } 
//         if (count > 2)
//         System.out.println ("The given is number " + n + " is not prime");
//         else
//         System.out.println ("The given is number " + n + " is prime");
//     }
// }


// using break condiiton
// class Prime
// {
//     public static void main (String[]args)
//     {
//         int i, n = 13;
//         boolean isprime = true;
//         if (n < 2)
//         {
//             isprime = false;
//         }
//         else
//         {
//             for (i = 2; i < n; i++)
//             {
//                 if (n % i == 0)
//                 {
//                     isprime = false;
//                     break;
//                 }
//             }
//         }
//         String result = isprime ? "Prime" : "not Prime";
//         System.out.println ("The number " + n + " is : " + result);
//     }
// }



//Optimization by n/2 iterations 
// class Prime
// {
//     public static void main (String[]args)
//     {
//         int i,n = 33;
//         boolean isprime= true;
//         if(n < 2)
//         {
//             isprime = false;
//         }
//         else
//         {
//             for(i=2; i <= n/2; i++)
//             {
//                 if(n % i == 0)
//                 {
//                     isprime = false;
//                     break;
//                 }
//             }
//         }
//         String result = isprime ? "Prime" : "not Prime";
//         System.out.println ("The number " + n + " is : " + result);
//    }
// }


// Optimization by √n
class Prime
{
    public static void main (String[]args)
    {
        int i,n = 29;
        boolean isprime= true;
        if(n < 2)
        {
            isprime = false;
        }
        else
        {
            for(i=2; i <= Math.sqrt(n); i++)
            {
                if(n % i == 0)
                {
                    isprime = false;
                    break;
                }
            }
        }
        String result = isprime ? "Prime" : "not Prime";
        System.out.println ("The number " + n + " is : " + result);
    }
}
