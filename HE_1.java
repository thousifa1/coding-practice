/* IMPORTANT: class must not be public. */
/* https://www.hackerearth.com/code-monk-array-strings/algorithm/terrible-chandu/ */
/*
 * uncomment this if you want to read input. */
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
            int n = line1.length();
            char c[] = line1.toCharArray();
            for(int p=0;p<n/2;p++)
            {
            	char z = c[p];
            	char z1 =c[n-1-p];
            	c[p]=z1;
            	c[n-p-1]=z;
            }
           for(int j=0;j<n;j++)
           {System.out.print(c[j]);}
           System.out.println();
           
        }
        

       
    }
}
