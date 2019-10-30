package string;

import java.util.Scanner;

public class MyString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String index=sc.next();
        String str=sc.next();
      System.out.print( search(index,str));
    }
    public static int search(String index,String str){
        String index1[]=index.split("");
        String str1[]=str.split("");
        if(index1.length>str1.length) return -1;
        int n=1;
       int j=1;
       while (n<=index1.length&&j<=str1.length){
           if((index1[n-1]).equals(str1[j-1])){
               ++n;
               ++j;
           }else{


                   j=j-n+2;
                   n=1;

               }



       }
        if(n>index1.length) return j-n;
       return -1;
    }
}
