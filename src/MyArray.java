public class MyArray {
    public static void main(String args[]){

      System.out.println( get(16,9));

Sort s=new Sort();
int a[]={5,2,5,6,7,8,9,2,9,8,10};
int b[]=s.bubble_sort(a);
int index=s.binery_search(b,7);
        System.out.println(index);
for(int i=0;i<a.length;i++){
    System.out.print(b[i]+" ");
}
    }
    public static int get(int p,int q){
        int max,min;
       max=p>=q?p:q;
       min=p<q?p:q;
       if(min==0) return max;
       int r=max%min;

        return get(min,r);
    }
}
class  Sort{
  public int[]  bubble_sort(int[] a){
      int b;
      int c[]=a;
      for(int i=0;i<c.length;i++){
         for(int j=i+1;j<a.length;j++){
            if (c[i]>c[j]){
                b=c[i];
                c[i]=c[j];
                c[j]=b;
            }
         }
      }
      return c;
  }

public int binery_search(int a[],int n){
      int mid,b;

       mid=a.length/2;
    int c[]=new int[mid+1];
      if(a[mid]==n) return mid;
      if (n>a[mid]){
          for (int i=mid;i<a.length;i++){
              c[i]=a[i];
          }
      }else {
          for (int i=0;i<mid;i++){
              c[i]=a[i];
          }
      }


      return binery_search(c,n);
}

}