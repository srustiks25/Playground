
import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Get the n value
	    Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
 
	    for(int cur_row = 1; cur_row <= n; ++cur_row)
	    {
             // Handle stars for each row
	         for(int cur_col = 1; cur_col <= n; ++cur_col)
	         {
                
	                // When row no and col no are equal, print "*"
                    // Otherwise print space
	                if((cur_row == cur_col) ||
	                  (cur_row + cur_col == n + 1))
	                {
	                    System.out.print("*");
	                }
                    
	                else
	                {
	                    System.out.print(" ");
	                }
	         }
	         System.out.println();
	    }
	}
}