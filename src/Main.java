
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner d=new Scanner(System.in);
        int N=d.nextInt();
        String a[]=new String[N];
        for(int i=0;i<N;i++){
            a[i]=d.next();
        }
        for(int i=0;i<N;i++){
          while(a[i]==a[i+2]&&i+3<a.length){
              a[i+2]=a[i+3];
          }
        }
    }
}