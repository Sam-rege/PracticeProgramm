class AND4 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		System.out.println(a<b && ++a>b++);//false
		System.out.println(a);//11
		System.out.println(b);//20
	}
}
