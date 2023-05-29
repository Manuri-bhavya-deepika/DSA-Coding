class Usingarray
{
  static int MAX = 100;
  int top;
  int a[] = new int[MAX];	// Maximum size of Stack


  boolean isEmpty ()
  {
    return (top < 0);
  }
  Usingarray ()
  {
    top = -1;
  }

  boolean push (int x)
  {
    if (top >= (MAX - 1))
      {
	System.out.println ("Overflow condition reached");
	return false;
      }
    else
      {
	a[++top] = x;
	System.out.println (x + " pushed into stack");
	return true;
      }
  }


  int pop ()
  {
    if (top < 0)
      {
	System.out.println ("Underflow condition reached");
	return 0;
      }
    else
      {
	int x = a[top--];
	return x;
      }
  }


  int peek ()
  {
    if (top < 0)
      {
	System.out.println ("Underflow condition");
	return 0;
      }
    else
      {
	int x = a[top];
	return x;
      }
  }
}

class Main
{
  public static void main (String args[])
  {
    Usingarray ua = new Usingarray ();
      ua.push (20);
      ua.push (40);
      ua.push (60);
      System.out.println ("element poped out : " + ua.pop ());
  }
}
