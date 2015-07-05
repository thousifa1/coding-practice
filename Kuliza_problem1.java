/* IMPORTANT: class must not be public. */

import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
		
		String line1 = br.readLine();
        String line2 = br.readLine();
		
		String[] a1 = line1.split(" ");
		String[] b1 = line2.split(" ");
		
		int[] a = new int[N];
		int[] b = new int[N];
		
		for(int i=0;i<N;i++){
		a[i]= Integer.parseInt(a1[i]);	
		b[i]= Integer.parseInt(b1[i]);
		}
		
		int j=0;
		int change1,change2 = 0;
		int max1=0;
		int max2=0;
		while(j<N-1)
		{
			change1 =Math.abs(a[j+1]-a[j]);
			change2 =Math.abs(b[j+1]-b[j]);
			
			if(change1>max1){max1 = change1;}
			if(change2>max2){max2 = change2;}
			
			j=j+1;
		}
		
		if(max1>max2){System.out.println("Dom");
		System.out.print(max1);}
		else if(max1<max2){System.out.println("Brian");
		System.out.print(max2);}
		else{System.out.print("Tie");}
		
		 
        

       
    }
}
