/**
 * SumZero
 */
public class SumZero {

    static int[] sumZero2(int n) {
        int []ans=new int[n]; 
        for(int i=0;i<n;i++){
         ans[i]=i*2-n+1;
        }
        return ans;
     }

    static int[] sumZero(int n) {
        int[] arr=new int[n];
        int d=-(n/2);
   if(n%2!=0)
   {
       for(int i=0;i<n;i++)
       {
       arr[i]=d;
       d=d+1;
       }
   }
   else
   {
       for(int i=0;i<n;i++)
       {
       if(d==0)
       d=d+1;

       arr[i]=d;
       d+=1;

       }
   }
  
   return arr;
}
}