import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 public class IFElSE {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
	    if(n<=100)
	    {
            if(n%2==1){
              ans = "Weird";
            }
            else {
                if (n >= 2 && n <= 5) {
                    ans = "Not Weird";
                } else if (n >= 6 && n <= 20) {
                    ans = "Weird";
                } else {
                    ans = "Not Weird";
                }
            
               //Complete the code                
            }
            System.out.println(ans);
	   }  
	   else {
	   System.out.println("The given value is should be <100");           
          }
        }
    }
