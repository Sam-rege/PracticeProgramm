class OR1 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		System.out.println(a<b || ++a>b++);//true
		System.out.println(a);//10
		System.out.println(b);//20
	}
}
