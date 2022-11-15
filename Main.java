public class Main{
    public static void main(String args[]){
        int[] arr = new int[]{0,0,0,0,1,0,1,2,2,1,};
        
        int max = 0;
        int element = 0;
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j])
                 count++;
            }
            if(count > max){
                max = count;
                element = arr[i];
            }
        }
        System.out.println("Element : "+ element);
        System.out.print("Count : "+ max);
    }
}
