import java.util.*;
class First_Non_repeating_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String str = sc.nextLine();
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0 ; i<str.length() ; i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i) , map.get(str.charAt(i)) + 1);
            }
            else{
                map.put(str.charAt(i) , 1);
            }
        }
        
        int flag = 0;
        for(int i=0 ; i<str.length() ; i++){
            if(map.get(str.charAt(i)) == 1){
                System.out.println("First non-repeating occurance character is := " + str.charAt(i) + " At position "+ i);
                flag = 1;
                break;
            }
        }
        
        if(flag == 0){
            System.out.println("No such letter is non-repeating ");
        }
    }
}
