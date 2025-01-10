class N1  
{
	public static void main(String[] args) 
	{
		double a = 20.23  ; 
		int b  ; 
		b = a  ; // copy a to b 
				 // copy double to int 
				 // tries to convert double to int 
				 // since not possible we get CTE 
		System.out.println(a);
		System.out.println(b);
	}
}
