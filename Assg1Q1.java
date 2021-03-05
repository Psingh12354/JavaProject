
public class Assg1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,3,6,1,2,7,9};
		int start=0,end=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==6 && arr[j]==7){
					start=i;
					end=j;
				}
			}
		}
		int sum1=0;
		int sum2=0;
		for(int i=0;i<start;i++){
			sum1+=arr[i];
		}
		for(int i=end+1;i<arr.length;i++){
			sum2+=arr[i];
		}
		System.out.println(sum1+sum2);

	}

}
