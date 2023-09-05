package hw1;

public class hw1_3 {
	public static void main (String[] args) {
		int a = 256559 ;
		int num1 = a/(60*60*24) ;
		int b = a%(60*60*24) ;
		int num2 = b/(60*60) ;
		int c = b%(60*60) ;
		int num3 = c/60 ;
		int num4 = c%60 ;
		System.out.println(num1+"天"+num2+"小時"+num3+"分"+num4+"秒");
				
	}

}
