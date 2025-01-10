/*
design a code for e-wallet, do the following scenarios. 
1. initially wallet has 250rs. 
2. user will add 500rs to the wallet.
3. user will shop for 200 bugs 
4. user will transfer 100 bugs to his frnd 
5. what is the amount left in the wallet 

*/
class  A4 
{
	public static void main(String[] args) 
	{
		double wallet = 250 ; 
		System.out.println("wallet balance = " + wallet ) ;
		// add 500 rs 
		System.out.println("500 is added ") ;
		wallet = wallet + 500 ; 
		System.out.println("wallet balance = " + wallet ) ;
		// shop for 200 bugs 
		System.out.println("shopped for 200 ") ;
		wallet = wallet - 200 ; // update 
		System.out.println("wallet balance = " + wallet ) ; // 300.0 
		// transfer 100 to frnd 
		System.out.println("transfered 100 to a frnd ") ;
		wallet = wallet - 100 ; 
		System.out.println("wallet balance = " + wallet ) ; // 200.0 
	}
}
