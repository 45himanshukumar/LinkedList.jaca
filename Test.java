public class Test {
    public static void main(String[] args) {
        int nums1
    int n=nums1.length;
        int n1=nums2.length;
        int minn=Integer.MAX_VALUE;
        int min=0;
        int comman=0;
          for(int i=0; i<n; i++){
            for(int j=0; j<n1; j++){
                if(nums1[i]==nums2[j]){
                     min=nums1[i];
                     min= Math.min(min,minn);
                     return min;
                }
            }
          }
         
        return -1;
        
    }
}
    

