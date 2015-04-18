/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*

You are given an array S of N strings numbered from 0 to N-1. You build string sequence Ti by the following rules:

T0 = S0
Ti = Ti-1 + reverse(Ti-1) + Si
Now please answer M queries: by non-negative integer x output x-th character of the TN-1 in 0-based indexation. It's guaranteed that x-th character of the TN-1 exists.

Input
The first line contains T - the number of test cases. Then T test cases follow.
Each test case starts with line containing 2 integers: N and M. Next N lines describe array S - one string per line. Then M lines follow describing queries - one non-negative integer per line.

Output
Output T lines. Each line should contain one string containing answers for the corresponding test case. Don't separate answers which belong to one test case by whitespaces or anything else.

Constraints

T ≤ 100
length of each Si ≤ 100
N ≤ 50
M ≤ 1000
N ≤ 5 in 40% of the test data


2
3 7
a
b
c
0
1
2
3
4
5
6
2 6
ty
qwe
0
2
3
4
6
1



Sample Output (Plaintext Link)
aabbaac
tytqey





*/

import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.sql.Types.NULL;


 class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        int T = Integer.parseInt(line1);
        
        int i=0;
        
        for(i=0;i<T;i=i+1)
        {    
        
            //System.out.println("Hello Bitch");
            String line = br.readLine();
            String[] inp = line.split(" ");
            int N = Integer.parseInt(inp[0]);
            int M = Integer.parseInt(inp[1]);
            //System.out.println(M+N+T);
            
            String[] foo = new String[N];
            for(int k=0 ;k<N;k=k+1)
            {   
                String line2 = br.readLine();
                foo[k] = line2;    
            }
            
            String[] zoo = new String[M];
            for(int k=0 ;k<M;k=k+1)
            {   
                String line2 = br.readLine();
                zoo[k] = line2;    
            }
            Stack<Character> stack1 = new Stack<Character>();
            Stack<Character> stack2 = new Stack<Character>();
            int z=0;
            for(z=0;z<foo[0].length();z=z+1)
            {
                stack1.push(foo[0].charAt(z));
                
            }
            for(int z1=1;z1<N;z1=z1+1)
            {
                 stack2.addAll(stack1);
                 while(stack2.isEmpty()==false)
                 { 
                     char test_me=stack2.pop(); 
                     stack1.push(test_me);
                    // System.out.println("DAD");
                     //System.out.println(test_me);
                 }
                 int z2=0;
                for(z2=0;z2<foo[z1].length();z2++)
            {   char test_us =foo[z1].charAt(z2); 
                stack1.push(test_us);
               // System.out.println("MOM");
                //System.out.println(test_us);
                
            }
            }
            char[] cop;
            int  k = stack1.size(); 
             cop = new char[k];
             System.out.println(k);
             //System.out.println("Test");
             int z3=0;
            while(stack1.isEmpty()==false){
               
              char baz= stack1.pop();
               
                   cop[k-1-z3]=baz;
                   //System.out.println("Hi"+ baz);
                   z3 = z3+1;  
               
            
            }
            String fin_answer = "" ;
           for(int z4=0 ;z4<M;z4=z4+1)
            {   
                
               int poi=Integer.parseInt(zoo[z4]);
               fin_answer +=cop[poi];
            }
            
            /*System.out.println("TESTing");
            for(int g1=0;g1<k;g1++){
            System.out.println(cop[g1]);
            }*/
           System.out.println(fin_answer);
        }
            
            
        }
          
    
    }
    

