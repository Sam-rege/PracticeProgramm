/*
Assume there is a water jug 3/4th filled. 
the vollume of the jug is 2000ml. 
the task given is, we need to empty the 
water by pouring them into glass of capacity
225ml. 
WAJP to calculate the approximate number of 
glasses required to empty the water in the jug
(Store the given data and then compute required data)
*/

class  N4
{
	public static void main(String[] args) 
	{
		int jug_volume = 2000 ; 
		double water_volume = jug_volume * ( 3.0 / 4.0 ) ; 
		int glass_volume  = 225  ; 
		int no_of_glass =  (int)(water_volume / glass_volume) ;
		System.out.println(no_of_glass) ;
	}
}