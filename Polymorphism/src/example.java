class Adder{
	static int add(int a,int b)
    {
        return a+b;
    }
	static double add(int a,double b)
    {
        return a;
    }
}
public class example {

	public static void main(String args[]) 
	{
		System.out.println(Adder.add(11,11));
	} 
}
