package practical;

public class p2 {
public static void main(String[] args) {
	for(int r=5;r>=1;r--) {
		for(int c=1;c<=r;c++) {
			if(c%2==0) {
				System.out.print(0);
			}
			else {
				System.out.print(1);
			}
		}
		System.out.println();
	}
}
}
