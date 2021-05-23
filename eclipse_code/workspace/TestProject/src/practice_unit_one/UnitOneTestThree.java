package practice_unit_one;

public class UnitOneTestThree {
	public static void main(String[] args){
		String printText = "I love Java";
		int printMode = 7;
		
//		System.out.print(" ");
//		System.out.print("*");
//		for(int i=0; i<(printMode - 1)*2;i++){
//			System.out.print(" ");
//		}
//		System.out.print("*");
//		System.out.print(" ");
		for(int i=0;i<7;i++){
			

			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			if(i==6){
				System.out.print("*");
				break;
			}
			System.out.print("*");
			
			for(int j=i;j<=(printMode-i)*2;j++){
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int j=(printMode-i)*2;j<(printMode*2+1);j++){
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
}
