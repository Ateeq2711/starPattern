package Pattern_Star;

public class Pattern_8 {
	public static void main(String[] args) {
		int n=7,k=1,s=n/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=s;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=k;j++) {
				if(j==1 || j==k) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if(i<=n/2) {
				s--;
				k=k+2;
			}else {
				s++;
				k=k-2;
			}
		}

	}

}
