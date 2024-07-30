import java.util.Arrays;

public class Largest_Rectangle {
    public static void main(String[] args){

        int arr[] = {4,2,1,5,6,3,2,4,2};
        int n = arr.length;
        
        int next[] = new int[n];
        int prev[] = new int[n];
        
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ;j<n ; j++){
                if(arr[i] > arr[j]){
                    next[i] = j;
                    break;
                    
                }
                
            }
            if(next[i] == 0){
                next[i] = n;
            }
        }
        
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<i ; j++){
                if(arr[i] > arr[j]){
                    prev[i] = j;
                }
            }
            if(prev[i] == 0){
                prev[i] = -1;
            }
        }
        
        // width --
        
        int width[] = new int[n];
        // width = next(i) - prev(i) - 1
        
        for(int i=0 ; i<n ; i++){
            width[i] = next[i] - prev[i] - 1;
        }
        
        int area[] = new int[n];
        
        for(int i=0 ; i<n ; i++){
            area[i] = arr[i]*width[i];
        }
        
        // final result -- maximum from area array
        
        int max = -1;
        for(int i=0 ; i<n ; i++){
            if(area[i] > max){
                max = area[i];
            }
        }
        
        
        
        System.out.println( "Original Array " + Arrays.toString(arr));
        System.out.println( "next smallest " + Arrays.toString(next));
        System.out.println( "previous smallest " + Arrays.toString(prev));
        System.out.println( "width " + Arrays.toString(width));
        System.out.println( "Area " + Arrays.toString(area));
        System.out.println( "largest rectangle in the Histogram is := " + max);
    }
}
