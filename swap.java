
// Swap Function in Java
// Author: Ryan Rosier
// Reviewer: 
// Team: Haskers


class swap{
	
	private static final Exception LRNotInstantiated = null;
	
	public static void main(String[] args) throws Exception{
		int[] after = {3,4,5,1,2};
		int[] before = {1,2,5,3,4}; 
//		
//		int[] after = {3,4,1,2};
//		int[] before = {1,2,3,4}; 
//		
//		int[] after = {1,2,3,4,5,6};
//		int[] before = {};
		
		if(before.length == 0 && after.length == 0){
			System.out.println("L and R are not instantiated");
			throw LRNotInstantiated;
		}
		else if(before.length == 0 || after.length == 0){
			int[] answer = swapAssign(before, after);
			for(int p=0; p<answer.length; p++){
				System.out.print(answer[p] + " ");
			}
		}
		else{
			System.out.println(swapCheck(before,after));
		}
	}
	
	public static int[] swapAssign(int[] before, int[] after){
		int[] L;
		int[] R;
		int len = 0;
		
		if(before.length == 0){
			R = new int[after.length];
			len = after.length;
			
			int[] left;
			int[] right;
			int half;
			
			if(len%2 == 0){
				half = len/2;
				left = new int[half];
				right = new int[half];
				
				for(int i=0; i<len; i++){
					if(i<half){
						left[i] = after[i];
					}
					else{
						right[i-half] = after[i];
					}
				}
				
				for(int e=0; e<R.length; e++){
					if(e<half){
						R[e] = right[e];
					}
					else{
						R[e] = left[e-half];
					}
				}
				return R;
			}
			else{
				half = len/2 + 1;
				left = new int[half+1];
				right = new int[half];
				
				for(int i=0; i<len; i++){
					if(i<half){
						left[i] = after[i];
					}
					else{
						right[i-half] = after[i];
					}
				}
				
				for(int e=0; e<R.length; e++){
					if(e<half){
						R[e] = right[e];
					}
					else{
						R[e] = left[e-half];
					}
				}
				R[half-1] = after[half-1];
				return R;
			}
			
		}
		else{
			L = new int[before.length];
			len = before.length;
			
			int[] left;
			int[] right;
			int half;
			
			if(len%2 == 0){
				half = len/2;
				left = new int[half];
				right = new int[half];
				
				for(int i=0; i<len; i++){
					if(i<half){
						left[i] = before[i];
					}
					else{
						right[i-half] = before[i];
					}
				}
				
				for(int e=0; e<L.length; e++){
					if(e<half){
						L[e] = right[e];
					}
					else{
						L[e] = left[e-half];
					}
				}
				return L;
			}
			else{
				half = len/2 + 1;
				left = new int[half+1];
				right = new int[half];
				
				for(int i=0; i<len; i++){
					if(i<half){
						left[i] = before[i];
					}
					else{
						right[i-half] = before[i];
					}
				}
				
				for(int e=0; e<L.length; e++){
					if(e<half){
						L[e] = right[e];
					}
					else{
						L[e] = left[e-half];
					}
				}
				L[half-1] = before[half-1];
				return L;
			}
		}
	}
	
	public static boolean swapCheck(int[] before, int[] after){
		int half;
		
		if(after.length == before.length){
			if(after.length % 2 == 0){
				half = after.length/2;
				
				for(int i=0; i<before.length; i++){
					if(half+i<after.length){
						if(!(before[i] == after[half+i])){
							return false;
						}
					}
					else{
						if(!(before[i] == after[i-half])){
							return false;
						}
					}
				}
				return true;
			}
			else{
				half = (after.length/2)+1;
			}
			for(int i=0; i<before.length; i++){
				if(half+i<after.length){
					if(!(before[i] == after[half+i])){
						return false;
					}
				}
				else if(i==half-1){
					if(!(before[i] == after[half-1])){
						return false;
					}
				}
				else{
					if(!(before[i] == after[i-half])){
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}
}