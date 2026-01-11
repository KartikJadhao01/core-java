package arrays;

public class indexofNum {
    public static void main(String[] args) {
        int[] arr={1,9,8,5,4};
        int x=5;
        int ans=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
