// ///stack using LinkedList
// import java.util.ArrayList;

// public class StackB1 {

//     static class Node {
//         int data;
//         Node next;
//         Node (int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Stack{
//        static Node head = null;

//        public static boolean isEmpty(){
//         return head == null;
//        }

//       //push
//       public static void push(int data){
//           Node newNode = new Node(data);

//           if(isEmpty()){
//             head = newNode;
//             return;
//           }

//           newNode.next = head;
//           head = newNode;
//       }

//       //pop
//       public static int pop(){
//         if(isEmpty()){
//             return -1;
//         }
//         int top = head.data;
//         head = head.next;
//         return top;
//       }


//       //peek
//       public static int peek(){
//         if(isEmpty()){
//             return -1;

//         }
//         return head.data;
//       }

//     }


//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
     
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
 
//     }
// }





// import java.util.*;

// public class StackB1 {
//     public static void main(String args[]){
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }






// import java.util.*;

// public class StackB1{
//     public static void pushAtBottom(Stack<Integer> s,int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s,data);
//         s.push(top);

//     }

//     public static String reverseSring(String str){
//         Stack<Character> s = new Stack<>();
//         int idx = 0;
//         while(idx<str.length()){
//             s.push(str.charAt(idx));
//             idx++;
//         }

//         StringBuilder result = new StringBuilder("");
//             while(!s.isEmpty()){
//                 char curr = s.pop();
//                 result.append(curr);
//             }

//             return result.toString();
//     }

//     public static void main(String[] args) {
// //         Stack<Integer> s = new Stack<>();
// //         s.push(1);
// //         s.push(2);
// //         s.push(3);

// //         pushAtBottom(s,4);
// //         while(!s.isEmpty()){
// // System.out.println(s.pop());
// //         }



//    String str = "abc";
//    String result = reverseSring(str);
//    System.out.println(result);
//     }
// }










//stock span problem

// import java.util.*;

// public class StackB1{
//     public static void stockSpan(int stocks[],int span[]){
//         Stack<Integer> s = new Stack<>();
//         span[0] =1;
//         s.push(0);

//         for(int i=1;i<stocks.length;i++){
//             int currPrice = stocks[i];
//             while(!s.isEmpty() && currPrice > stocks[s.peek()]){
//                 s.pop();

//             }
//             if(s.isEmpty()){
//                 span[i] = i+1;
//             }else{
//                 int prevHigh = s.peek();
//                 span[i] = i - prevHigh;
//             }
//             s.push(i);
//         }
//     }
//     public static void main(String[] args) {
//         int stocks[] = {100,80,60,70,60,85,100};
//         int span[] = new int[stocks.length];
//         stockSpan(stocks,span);

//         for(int i=0; i<span.length; i++){
//             System.out.println(span[i]+"");
//         }
//     }
// }












///NEXT GREATER ELEMENT 

// import java.util.*;

// public class StackB1{  //time complexity of this code  ==> O(n)
//     public static void main(String args[]){
//     int arr [] = {6,8,0,1,3};
//     Stack<Integer> s= new Stack<>();
//     int nxtGreater[] = new int[arr.length];


//     for(int i=arr.length-1; i>=0; i--){
//         //1 while
//         while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
//             s.pop();
//         }

//         //2 if-else
//         if(s.isEmpty()){
//             nxtGreater[i] = -1;

//         }else{
//             nxtGreater[i] = arr[s.peek()];

//         }

//         //3 push in s
//         s.push(i);
//     }

//     for(int i=0; i<nxtGreater.length;i++){
//         System.out.print(nxtGreater[i]+" ");

//     }
//     System.out.println();
// }
// }










//Valid parenthesis checker
//  import java.util.*;

//  public class StackB1{
//     public static boolean isValid(String str){      //O(n)
//         Stack<Character> s = new Stack<>();

//         for(int i=0;i<str.length(); i++){
//             char ch = str.charAt(i);

//             if(ch=='(' || ch=='{' || ch=='['){//opening
//               s.push(ch);
//             }
//             else{
//                 //closing condition
//                 if(s.isEmpty()){
//                     return false;
//                 }
//                 if( (s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch =='}') || (s.peek()=='[' && ch==']')){
//                     s.pop();
//                 }else{
//                     return false;
//                 }

//             }
//         }

//         if(s.isEmpty()){
//             return true;
//         }else{
//             return false;
//         }
//     }

//     public static void main(String args[]){
//         String str = "({})[]";
//         System.out.println(isValid(str));
//     }
//  }






//Duplicate parentheses question == contains extra pair of parentheses
// import java.util.*;

// public class StackB1{
// public static boolean isDuplicate(String str){
//     Stack<Character> s = new Stack<>();
//   for(int i=0; i<str.length(); i++){
//     char ch = str.charAt(i);

//     //closing
//     if(ch==')'){
//         int count = 0;
//         while(!s.isEmpty() && s.peek() != '('){
//              s.pop();
//              count++;
//         }
//         if(count<1){
//             return true;
//         }else{
//             s.pop();
//         }
//     }else{
//         //opening
//         s.push(ch);
//     }
//   }
//   return false;
  
// }

// public static void main(String args[]){
//     String str = "((a+b))"; //true
//     String str2 = "(a-b)";  //false
//     System.out.println(isDuplicate(str2));
// }

// }








//max area in histogram
import java.util.*;
public class StackB1{

    public static void maxArea(int arr[]){   //O(n)
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //next smaller Right
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller left
        s = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = arr.length;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }


        //current area: width = j-i-1 = nsr[i]-nsl[i]-1
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = height*width;
            maxArea = Math.max(currArea,maxArea);
        }

        System.out.println("Max area in Histogram = " + maxArea);


    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3}; //heights in histogram
        maxArea(arr);

    }
}















