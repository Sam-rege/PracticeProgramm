class I5  
{
	public static void main(String[] args) 
	{
		int a = 10  ; 
		int b = a++ ; 
		int c ; 
		c  =  ++b + ++a - b++ ;
		System.out.println( a );
		System.out.println( b );
		System.out.println( c );
	}
}
