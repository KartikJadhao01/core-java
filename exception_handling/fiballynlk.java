package task;

public class fiballynlk {
	public static void main(String[] args) {
		int a[]=new int[2];
		a[0]=252;
		a[1]=306;
		
		
		try {
			a[2]=448;
		}
		
		catch(Exception ex) {
			System.out.println(ex);
		}
		
		finally{
			System.out.println("Fianlly block executed");
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
}
