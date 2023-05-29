// class Perfectsquare 
// {
//     static boolean isPerfectSquare(int x)
//     {
//         if (x >= 0) 
//         {
//             int sr = (int)Math.sqrt(x);
//             return ((sr * sr) == x);
//         }
//         return false;
//     }
//     public static void main(String[] args)
//     {
//         int x = 84;
//         if (isPerfectSquare(x))
//         System.out.print("True");
//         else
//         System.out.print("False");
//     }
// }


import java.io.*;
class Perfectsquare
{
    static void checkperfectsquare(int n)
    {
        if (Math.ceil((double)Math.sqrt(n)) == Math.floor((double)Math.sqrt(n)))
        {
            System.out.print("True");
	    }
        else
        {
            System.out.print("False");
	    }
    }
    public static void main(String[] args)
    {
        int n = 25;
        checkperfectsquare(n);
    }
}
