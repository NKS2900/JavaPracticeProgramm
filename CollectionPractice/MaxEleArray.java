package CollectionPractice;

public class MaxEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int[] a={5,4,6,12,9,5,11};
		 int max=a[0];
		 for( i=1;i<a.length;i++)
		 {
		      if(a[i]>max)
			  {
			     max=a[i];
			     
			  }
		 }
		 System.out.print(max+" is max element in list ");
			}

}
