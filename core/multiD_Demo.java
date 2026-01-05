package core;

public class multiD_Demo {
public static void main(String[] args) {
	int numbers[][][]= {{{5,6},{7,8}},{{9,0},{4,3}}};
	for(int i=0;i<numbers.length;i++) {
		for(int j=0;j<numbers.length;j++) {
			for(int k=0;k<numbers.length;k++) {
				System.out.print(numbers[i][j][k]+" ");
			}
			System.out.println();
		}
	}
}
}
