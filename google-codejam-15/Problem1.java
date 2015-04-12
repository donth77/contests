import java.util.*;
import java.lang.*;
import java.io.*;

class Problem1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int lineNum = 0;
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){ 
            String line = input.nextLine(); 
            lineNum++;
            if(lineNum == 1){

            }else{
            	System.out.print("Case #" + (lineNum - 1)+ ": ");
				String[] tokens = line.split("\\s+");
				String shynessStr = tokens[1];
				findNumberToInvite(shynessStr);
				System.out.println();
				
			}
        }
	}
		
	public static void findNumberToInvite(String str){
		int[] shyness = new int[str.length()];
		for (int i = 0; i < str.length(); i++){
    		String c = str.substring(i, i + 1);
    		shyness[i] = Integer.parseInt(c);
		}
		
		int numStanding = 0;
		int numToInvite = 0;
		
		for(int i = 0; i < shyness.length; i++){
			if(numStanding >= i && shyness[i]  > 0) {
				numStanding += shyness[i];
			}else{
				while(numStanding <= i){
					numStanding++;
					numToInvite++;
				}
			}
		}
		System.out.print(numToInvite);
	}
}
