public class SumOf {
    public static boolean print(int c){
        for(int i=0; i<c; i++){
            for(int j=0; j<c; j++){
                 if(i*i+j*j==c){
                    return true;
                 }
            }
            
        }
        return false;
    }
    public static void main(String[] args){
        int c=1;
      boolean n=  print(c);
      System.out.println(n);
    }
    
}
// int low=1;
// int high=c;

// while(low<=high){
//  int mid=(low+high)/2;
//    if(mid*mid==c){
//      return true;
//    }
//      if((mid*mid)+(mid-1)*(mid-1)==c){
//          return true;
//      }
//      else if((mid*mid)+(mid-1)*(mid-1)>c){
//          high=mid-1;
//      }
//      else{
//          low=mid+1;
//      }
   
// }
// return false;
