package practical;

public class charRhombus {
public static void main(String[] args) {
	char ch='D';
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=4-i;j++) {
			System.out.print(" ");
		}
		
		for(int c=4;c>=1;c++) {
			System.out.print(ch--);
			
		}
//		ch--;
		System.out.println();
	}
}
}
