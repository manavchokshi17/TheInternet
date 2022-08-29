package Practice;

public class IntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = 0,sum2 = 0;
		int arr1[] = {1,2,3,4,6};
		int arr2[] = {1,2,3,4};
	for(int i=0; i<arr1.length;i++) {
		
		 sum1 = sum1+ arr1[i];
		}
	for(int j=0;j<arr2.length;j++) {
		
		 sum2 =sum2+ arr2[j];
		
	}
	System.out.println(sum1);
	System.out.println(sum2);
	 int remain_num = sum1-sum2;
			 System.out.println(remain_num);
	
	}

}