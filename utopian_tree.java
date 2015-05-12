//// https://www.hackerrank.com/challenges/utopian-tree

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int tree_height = 1;
            int cycles = s.nextInt();
            int c=0;
            for(c=0;c<cycles;c++)
            {     
                if(c%2==0){
                    tree_height = 2*tree_height;
                }
                else{
                    tree_height = tree_height+1;
                    }
            }  
            System.out.println(tree_height);
            }            
        
    }
    }
