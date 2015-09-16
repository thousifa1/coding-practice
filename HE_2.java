/* IMPORTANT: class must not be public. */
/* https://www.hackerearth.com/code-monk-array-strings/algorithm/chandu-and-consecutive-letters/
/*
 * uncomment this if you want to read input.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
           String line1 = br.readLine();
		   
		   char c[] = line1.toCharArray();
		   
		   int n = line1.length();
		   
		   int j=1;
		   int z =0;
		   
		   while(j<=n-1&& z<n-1)
		   {
			if(c[j]==c[z])
			{
				c[j]='0';
				j++;
			}
			else{z=j;j=j+1;}
			
		   }
		   for(int s=0;s<n;s++ )
		   {if(c[s]!='0'){System.out.print(c[s]);}}
			System.out.println();
		   
        }
        

    }
}
