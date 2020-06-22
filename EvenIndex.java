package arrays;

public class EvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={11,12,12,4,5,2};
		System.out.println("Even index");
		for(int i=0;i<a.length;i+=2)
		{
		System.out.println(a[i]);
		//i++;
		}
		System.out.println("odd index");
		for(int i=1;i<a.length;i+=2)
		{
		System.out.println(a[i]);
		//i++;
		}
	}                                                                                                                                                                                                                                                                                                                                                                                                                               
}
