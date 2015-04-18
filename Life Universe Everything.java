    import java.util.Scanner;
class life {
  
       public static void main(String[] args) {
     int []a = new int[1000]; 
     int i=0;
     int k;
     Scanner s = new Scanner(System.in);
        do{
       
        k=s.nextInt();       
        if(i==0&&k==42){break;
        }
         a[i]=k;
         i=i+1; 
          
     }   while(k!=42);
     for(int j=0;j<i-1;j++){
     System.out.println(a[j]);
     }
     }
     }
