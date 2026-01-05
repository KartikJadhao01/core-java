package core;

public class twoDArraydemo {
public static void main(String[] args) {
	short nos[][]= {{11,22},{33,44}};
	
	for(int row=0;row<nos.length;row++) {
		for(int col=0;col<nos.length;col++) {
			System.out.print(nos[row][col]+" ");
		}
		System.out.println();
	}
}
}
