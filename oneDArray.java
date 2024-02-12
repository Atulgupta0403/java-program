class oneDArray{
    public static void main(String[] args){
        int a[]={1,2,3,4};

        int nums[]=new int[4];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;

        String names[]={"Atul" ,"Aditya"};

        System.out.println(names[0]);
        System.out.println(names[1]);

        for(int i=0; i<4;i++){
            System.out.print(nums[i]+" ");
        }
        
        System.out.println(" ");

        a[2]=10;
        
        for(int i=0; i<4;i++){
            System.out.print(a[i]+" ");
        }
    }
}


// import java.util.Scanner;

// public class oneDArray {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.println("Enter numbers to find their sum (enter a non-numeric value to finish):");

//         double sum = 0;
//         while (true) {
//             System.out.print("Enter a number: ");
//             if (scanner.hasNextDouble()) {
//                 double number = scanner.nextDouble();
//                 sum += number;
//             } else {
//                 break; // Exit the loop if the input is not a number
//             }
//         }
        
//         System.out.println("The sum of the numbers is: " + sum);
        
//         scanner.close();
//     }
// }
