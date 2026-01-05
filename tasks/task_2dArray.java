package core;

public class task_2dArray {
public static void main(String[] args) {
	short nos[][]=new short[2][2];
	nos[0][0]=11;
	nos[0][1]=22;
	nos[1][0]=33;
	nos[1][1]=44;
	
	for(int row=0;row<nos.length;row++) {
		for(int col=0;col<nos.length;col++) {
			System.out.print(nos[row][col]+" ");
		}
		System.out.println();
	}
}
}
