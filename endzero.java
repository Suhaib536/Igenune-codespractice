public class endzero {
   public static void main(String[] args) {
    int[] arr = {5,6,7,0,0,4,0,6,0};
    for(int i=0; i<arr.length-1; i++){
        if(arr[i]!=0){
            System.out.print(arr[i]+" ");
        }
    }
    for(int j= arr.length-1;j>=0;j--){
       if(arr[j]==0){
            System.out.print(arr[j]+" ");
        } 
    }
   } 
}
