import java.util.Scanner;

//import edu.princeton.cs.algs4.StdIn;
//import java.util.Stack;
//public class Main {
//    public static void main(String args[]) {
//        List l = new List();
//        for (int i = 0; i < 100; i++) {
//            Node f = new Node(i);
//            l.addNode(f);
//        }
//
//        l.print();
//    }
//}
//public class Main{
//    public static void main(String args[]){
//  Scanner sc = new Scanner(System.in);
//        System.out.println("请输入：");
//
//        int m=sc.nextInt();
//        int a[]=new int[m];
//        for(int i=0;i<m;i++){
//            a[i]=sc.nextInt();
//        }
//        int line=sc.nextInt();
//        for(int i=0;i<line;i++){
//            int l=sc.nextInt();
//            int r=sc.nextInt();
//            int k=sc.nextInt();
//
//            System.out.println(search(l,r,k,a));
//        }
//
//    }
//    public static int search(int i,int r,int k,int a[]){
//        int n=0;
//        for(int j=i-1;j<r;j++){
//           if(a[j]==k){
//                n++;
//            }
//        }
//        return n;
//    }
//}
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int s= (int) Math.sqrt(N);
        String d=sc.next();
        int r=N-(int)Math.pow(s,2)-1;
        int n=1+2*(s/2);
   print(n,d,"");
        System.out.println(r);
    }
    public static void print(int s,String d,String f){
            for(int j=0;j<s;j++){
                System.out.print(d+" ");
            }
            System.out.println();
        String g=f+"  ";
        System.out.print(g);
        if(s-1==0) {
            for(int j=0;j<s;j++){
                System.out.print(d+" ");
            }
            System.out.println();
        }else {
            print(s-2,d,g);

        }

    }
}