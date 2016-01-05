import java.util.Arrays;
public class Sorts{
    public static void insertion(int[]input){
	for(int i=0;i<input.length;i++){
	    int j=i-1;
	    int val = input[i];
	    while(j>=0 && val<=input[j]){
		int temp = input[j];
		input[j] = val;
		input[j+1] = temp;
		j--;
	    }
	    
		//System.out.println(Arrays.toString(input) );
	        //System.out.println(input[i]+","+input[j]);
	}
    }

    public static void selection(int[]input){
	int sortedDex = -1;
	int currMin = Integer.MAX_VALUE;
	int currDex = -1;
	for(int i=0;i<input.length;i++){
	    //System.out.print(Arrays.toString(input)+",");
	    for(int j = sortedDex+1; j<input.length;j++){
		currMin = Math.min(currMin, input[j]);
		if(currMin == input[j]){
		    currDex = j;
		}
	    }
	    input[currDex] = input[sortedDex+1];
	    input[sortedDex+1] = currMin;
	    sortedDex++;
	    currMin = Integer.MAX_VALUE;
	    //System.out.println(Arrays.toString(input));
	}
	
    }
    
}
