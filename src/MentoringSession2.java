//import java.util.Arrays;

public class MentoringSession2 {
	public static void main(String[] args) {
		see();
		hear();
		smell();
		taste("cold");
		feel();
	}

	
	//reopen a closed website
	//google settings
	public static void see() {
		// TODO Auto-generated method stub
		System.out.println("It'is red");
	}

	public static void hear() {
		// TODO Auto-generated method stub
		System.out.println("It's bird chirp");
	}

	public static void smell() {
		// TODO Auto-generated method stub
		System.out.println("It's rose smell");
	}

	public static void taste(String taste) {
		// TODO Auto-generated method stub
		if(taste != "taste") {
			feel();
		}else {
		System.out.println("It's sweet");
		}
	}

	public static void feel() {
		// TODO Auto-generated method stub
		System.out.println("It's cold "); //skin
	}
}
	
//	char[] alpha = new char[26];
//	for (int i = 0; i < 26; i++) {
//		alpha[i] = (char) (97 + i);
//	}
//	System.out.println(Arrays.toString(alpha));
//	
//	char[] alpha1 = new char[alpha.length];
//
//	for (int i = 0; i < alpha1.length; i++) {
//		alpha1[i] = alpha[(i+1)%alpha1.length];
//	}
//	System.out.println(Arrays.toString(alpha1));
//    int size = 7;
//	int[] nums = new int[size];
//	for (int i = 0; i < size; i++) {
//		nums[i] = i;// scan.nextInt();
//	}
//	// WRITE YOUR CODE HERE
//	System.out.println(Arrays.toString(nums));
//	int[] nums1 = new int[size];
//	for (int i = 0; i < size; i++) {
//		// if(i==size-1){
//		// nums1[size-1] = nums[0];
//		// }else{
//		// nums1[i] = nums[i+1];
//		// }
//		nums1[i] = nums[(i + 2) % size];
//	}
//	System.out.println(Arrays.toString(nums1));
//
//}
