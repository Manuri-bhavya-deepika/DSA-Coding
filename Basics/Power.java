// without while loop
// class Power
// {
//  	public static void main(String[] args) 
//     {
//         double base = 1.5;
//         double expo1 = 2.5;
//         double expo2 = -2.5;
//         double res1, res2;
//         res1 = Math.pow(base, expo1);
//         res2 = Math.pow(base, expo2);
//         System.out.println(base + " ^ " + expo1 + " = " + res1 );
//         System.out.println(base + " ^ " + expo2 + " = " + res2 );
//  	}
// }


// with while loop
class Power
{
    public static void main(String[] args) 
    {
        double base = 1.5;
        int expo = 2;
        double res = 1.0;
        while (expo != 0) 
        {
            res *= base;
            expo--;
        }
        System.out.println("Result = " + res); 
	}
}