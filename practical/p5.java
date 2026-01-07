package practical;

public class p5 {
public static void main(String[] args) {
	for(int r=5;r>=1;r--) {
		for(int c=1;c<=r;c++) {
			if(c%2==0) {
				System.out.print("* ");
			}
			else {
				System.out.print("# ");
			}
		}
		System.out.println();
	}
}
}
