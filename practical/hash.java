package practical;

public class hash {
public static void main(String[] args) {
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=3;j++) {
			if(i==2&&j==2) {
				System.out.print("0");
			}
			else {
				System.out.print("#");
			}
		}
		System.out.println();
	}
}
}
