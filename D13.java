class D13
{
	public static void main(String[] args) 
	{
		System.out.println("Main Begin ");
		{
			int a  ; 
			a = 10  ; 
			System.out.println("nested block begin") ; 
			System.out.println(a )  ; // 10
			a = 20  ; 
			System.out.println("nested block end") ; 
		}
		System.out.println(a) ;// a is not found  
		System.out.println("Main End  ");
	}
}
