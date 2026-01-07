package practical;

public class p4 {
public static void main(String[] args) {
	for(int r=1;r<=5;r++) {
		for(int c=1;c<=r;c++) {
			if(r%2==0) {
				System.out.print(5);
			}
			else {
				System.out.print("@");
			}
		}
		System.out.println();
	}
}
}
