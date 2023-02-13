package Pattern_Star;

public class Pattern_6 {
	public static void main(String[] args) {
		for(int i=1;i<6;i++) {
			for(int j=6;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
