
public class AsteriskWar {

	public static void main(String[] args) {
		
		//a
		
		for(int i = 1; i <= 12; i++){
			for(int k = 12; k >= i; k--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//b
		for(int i = 1; i < 11; i++){
			for(int s = 9; s >= i; s--){
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//c
		int counterC;
		for(int i = 0; i < 10; i++){
			counterC = 0;
			while(counterC < i){
				System.out.print(" ");
				counterC++;
			}
			for(int k = 0; k + counterC < 10; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//d
		int counterD = 0;
		for(int i = 1; i < 6; i++){
			for(int k = 4; k > counterD; k--){
				System.out.print(" ");
			}
			for(int j = 1; j < i*2; j++){
				System.out.print("*");
			}
			counterD++;
			System.out.println();
		}
		int counterDD;
		for(int i = 4; i >= 0; i--){
		 	counterDD = (i+1) * 2;
			for(int k = 4; k > i; k--){
				System.out.print(" ");
			}
			for(int j = 1; j < counterDD; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
