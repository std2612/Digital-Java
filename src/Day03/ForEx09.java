package Day03;

public class ForEx09 {

	public static void main(String[] args) {
		/* *****
		 * *****
		 * *****
		 * *****
		 * *****
		 */
		for(int i=1; i<=5; i+=1) {
			for(int j=1; j<=5; j+=1) {
				System.out.print("*");
			}
			System.out.println();
		}
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		for(int i=1; i<=5; i+=1) {
			for(int j=1; j<=i; j+=1) {
				System.out.print("*");
			}
			System.out.println();			
		}
		/*     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * */
		for(int i=1; i<=5; i+=1) {
			for(int j=1; j<=5-i; j+=1) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j+=1) {
				System.out.print("*");
			}
			System.out.println();			
		}
				
	}

}
