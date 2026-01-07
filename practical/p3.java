package practical;

public class p3 {
public static void main(String[] args) {
	char ch='Z';
	for(int r=1;r<=4;r++) {
		for(int c=1;c<=r;c++) {
			System.out.print(ch);
		}
		System.out.println();
		ch--;
	}
}
}
