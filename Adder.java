class Adder
{
 static int add(int a, int b)
{
 return a+b;
}


static float add(float a, float b)
{
 return a+b;
}

static int add(int a, int b, int c)
{
 return a+b+c;
}

static float add(float a, float b,float c)
{
 return a+b+c;
}

public static void main(String args[])
{
 //Adder a=new Adder(); 
 System.out.println(Adder.add(2,4));
 System.out.println(Adder.add(2.5f,4.9f));
 System.out.println(Adder.add(8,3,7));
 System.out.println(Adder.add(6.4f,7.2f,6.3f));
}
}



