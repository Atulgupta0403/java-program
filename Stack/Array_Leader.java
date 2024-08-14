// Given an array arr of n positive integers, your task is to find all the leaders in the array. An element of the array is considered a leader if it is greater than all the elements on its right side or if it is equal to the maximum element on its right side. The rightmost element is always a leader.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Array_Leader {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0 ; i<n ; i++){
            stack.push(arr[i]);
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        
        int res = arr[n-1];
        for(int i=0 ; i<n ; i++){
                
            if(res <= stack.peek()){
                al.add(stack.peek());
                res = stack.pop();
            }
            else{
                stack.pop();
            }
        }
        
        Collections.reverse(al);
        
        return al;
    }   

    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int n = arr.length;

        ArrayList al = leaders(n,arr);
        System.out.println(al);
    }
}
