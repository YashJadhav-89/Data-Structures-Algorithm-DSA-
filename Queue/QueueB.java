////IMPLEMENTATION USING ARRAY
// package Queue;

// public class QueueB {

//     static class Queue {
//         private int[] arr;
//         private int size;
//         private int rear;
//         private int front;

//         Queue(int n) {
//             arr = new int[n];
//             size = n;
//             rear = -1;
//             front = -1;
//         }

//         public boolean isEmpty() {
//             return rear == -1 && front == -1;
//         }

//         public boolean isFull(){
//             return (rear+1)%size == front;
//         }

//         // implementation using array for adding an element
//         public void add(int data) {
//             if(isFull()){
//                 System.out.println("Queue is full");
//                 return;
//             }
//            if(front == -1){
//             front = 0;
//            }
//             rear = (rear + 1)%size;
//             arr[rear] = data;
//         }

//         // remove
//         public int remove() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//           int result = arr[front];
//             front = (front+1)%size;
//             //last el delete
//             if(rear == front){
//                 rear = front = -1;
//             }else{
//                 front = (front+1)%size;
//             }
//             return result;
//         }

//         // peek
//         public int peek() {
//             if (isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return arr[front];
//         }

//         @Override
//         public String toString() {
//             if (isEmpty()) {
//                 return "Queue is empty";
//             }
//             StringBuilder sb = new StringBuilder();
//             sb.append("Queue: ");
//             for (int i = 0; i <= rear; i++) {
//                 sb.append(arr[i]).append(" ");
//             }
//             return sb.toString();
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue(3);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(4);
//         System.out.println(q.remove());
//         q.add(5);

  

//         while (!q.isEmpty()) {
//             System.out.println("Peek: " + q.peek());
//             q.remove();
//         }

//         System.out.println(q);
//     }
// }








// package Queue;

// public class QueueB {

//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Queue {
//         private Node head = null;
//         private Node tail = null;

//         public boolean isEmpty() {
//             return head == null;
//         }

//         // Add
//         public void add(int data) {
//             Node newNode = new Node(data);
//             if (head == null) {
//                 head = tail = newNode;
//                 return;
//             }
//             tail.next = newNode;
//             tail = newNode;
//         }

//         // Remove
//         public int remove() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             int front = head.data;
//             // single element
//             if (tail == head) {
//                 tail = head = null;
//             } else {
//                 head = head.next;
//             }
//             return front;
//         }
    
//         // Peek
//         public int peek() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//         public static void main(String[] args) {
//             Queue q = new Queue();
//             q.add(1);
//             q.add(2);
//             q.add(3);

//             while (!q.isEmpty()) {
//                 System.out.println(q.peek());
//                 q.remove();
//             }
//         }
    
// }






//implementation of queue using java collection framework
// import java.util.*;
// public class QueueB{
//     public static void main(String args[]){
//         // Queue<Integer> q = new LinkedList<>();
//                    //OR//
//          Queue<Integer> q = new ArrayDeque<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);


//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }







//queue using 2 stacks question
//  import java.util.*;

//  public class QueueB{
//     static class Queue{
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         public static boolean isEmpty() {
//             return s1.isEmpty();
//         }

//         //add
//           public static void add(int data){
//             while(!s1.isEmpty()){
//                 s2.push(s1.pop());
//             }

//             s1.push(data);

//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//           }

//           //remove 
//           public static int remove(){
//             if(isEmpty()){
//                 System.out.println("queue empty");
//                 return -1;
//             }

//             return s1.pop();
//           }

//           //peek
//           public static int peek(){
//             if(isEmpty()){
//                 System.out.println("queue empty");
//                 return -1;
//             }

//             return s1.peek();
//           }
//     }

//     public static void main(String args[]){
//          Queue q = new Queue();
//          q.add(1);
//          q.add(2);
//          q.add(3);

//          while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//          }
//     }
//  }






// import java.util.*;
// public class QueueB{
//     public static void printNonRepeating(String str){
//         int freq[] = new int[26];
//         Queue<Character> q = new LinkedList<>();

//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             q.add(ch);
//             freq[ch-'a']++;

//             while(!q.isEmpty() && freq[q.peek()-'a']>1){
//                 q.remove();
               
//             }

//             if(q.isEmpty()){
//                 System.out.print(-1+" ");
//             }else{
//                 System.out.print(q.peek()+" ");
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         String str = "aabccxb";
//         printNonRepeating(str);

//     }
// }







// import java.util.*;

// public class QueueB{
//     public static void reverse(Queue<Integer> q){
//         Stack<Integer> s = new Stack<>();

//         while(!q.isEmpty()){
//             s.push(q.remove());
//         }

//         while(!s.isEmpty()){
//             q.add(s.pop());
//         }


//     }


//     public static void main(String args[]){
//         Queue<Integer> q= new LinkedList<>();

//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);


//         reverse(q);

//         //print Q
//         while(!q.isEmpty()){
//             System.out.print(q.remove()+" ");

//         }

//         System.out.println();
//     }
// }









//Deque --> double ended queue
// import java.util.*;

// public class QueueB{
//     public static void main(String args[]){
//         Deque<Integer> deque = new LinkedList<>();
//        deque.addFirst(1);
//        deque.addFirst(2);
//        deque.addFirst(3);
//        deque.addFirst(4);
//        System.out.println(deque);
//        deque.removeLast();
//        System.out.println(deque);

//        System.out.println("first ele = "+deque.getFirst());
//        System.out.println("last ele = "+deque.getLast());
//     }
// }











//implementation stack&queue using deque


// import java.util.*;

// public class QueueB{
//     static class Stack{
//         Deque<Integer> deque = new LinkedList<>();

//         public void push(int data){
//             deque.addLast(data);
//         }

//         public int pop(){
//             return deque.removeLast();
//         }

//         public int peek(){
//             return deque.getLast();
//         }
//     }

//     public static void main(String args[]){
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         System.out.println("peek = "+ s.peek());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//     }
         

// }

// import java.util.*;

// public class QueueB{
//   static class Queue{
//         Deque<Integer> deque = new LinkedList<>();

//         public void add(int data){
//             deque.addLast(data);
//         }

//         public int remove(){
//             return deque.removeFirst();
//         }

//         public int peek(){
//             return deque.getFirst();
//         }
//     }


//     public static void main(String args[]){
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//       System.out.println("peek = " + q.peek());
//       System.out.println(q.remove());
//       System.out.println(q.remove());
//       System.out.println(q.remove());
//     }
// }


import java.util.*;
public class QueueB{
    static void generatePrintBinary(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n-->0){
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1+"0");
            q.add(s2+"1");
        }

    }
    public static void main(String args[]){
        int n= 10;
        generatePrintBinary(n);
    }
}