// public class OOPS {
//     public static void main(String[] args) {
//         Pen P1 = new Pen();
//         P1.setColor("blue");
//         System.out.println(P1.getColor());
//         P1.setTip(5);
//         System.out.println(P1.getTip());
//         //p1.setColor("Yellow");
//         P1.setColor("Yellow");
//         System.out.println(P1.getColor());
//     }
// }



// class Pen{
//     //properties or attributes
//    private String color;
//     private int tip;
    
// String getColor(){
//     return this.color;

//     int getTip(){
//         return this.tip;
//     }

// }
//     //behaviours or functions
//     void setColor(String newColor){
//         this.color = newColor;
//     }

//     void setTip(int Tip){
//         this.tip=Tip;
//     }
// }










////////////////Constructors
// public class OOPS{
//     public static void main(String args[]){
//         Student s1 = new Student();
//     }
// }
//     class Student{
//         String name;
//         int roll;

//     Student(){
//         System.out.println("constructor is called...");

//     }

//     }





////////Types of constructor
// Non - parameterized
//parametrized
// copy


//shallow copy = refrences ,chsnges reflect
//Deep copy = new creation ,changes reglect





//inheritance types
// single level
// multi level inheritance
//hierarchial
//hybrid
//multiple inheritance  = not in java but happen c++










//function/method overloading
// public class OOPS{
//     public static void main(String[] args) {
//         Calculator calc= new Calculator();
//         System.out.println(calc.sum(1,2));
//         System.out.println(calc.sum((float)1.5,(float)2.5));
//         System.out.println(calc.sum(1,2,3));
//     }
// }


// class Calculator{
//     int sum(int a,int b){
//         return a+b;
//     }

//     float sum(float a,float b){
//         return a+b;
//     }

//     int sum(int a,int b,int c){
//        return a+b+c;
//     }
   
// }









//abstraction = cannot create instance or object for it
// public class OOPS{
// public static void main(String[] args) {
//    Mustang  myHorse = new Mustang();

// }
// }


// abstract class Animal{
//     String color;

//     Animal(){
//         System.out.println("Animal constructor called");
//     }
//     void eat(){
//         System.out.println("animal eats");
//     }
//     abstract void walk();
// }

// class Horse extends Animal{
//     Horse(){
//         System.out.println("horse constructor called");
//     }
//     void changeColor(){
//         color="dark brown";
//     }
//     void walk(){
//         System.out.println("walks on 4 legs");

//     }
// }

// class Mustang extends Horse{
//     Mustang(){
//         System.out.println("mustang constructor called");
//     }
// }
// class Chicken extends Animal{

//      void changeColor(){
//         color="yellow";
//     }
//     void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }







//Interface = Interface is a blueprint of a class
// by the use of interface we can implement multiple inheritance.
//aslo we can implement total abstraction.
// public class OOPS{
//     public static void main(String[] args) {
//         Queen q = new Queen();
//         q.moves();
//     }

// }


// interface chessPlayer{
//     void moves();
// }

// class Queen implements chessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right.diagonal(in all 4 directions)");
//     }
// }


// class Rook implements chessPlayer{
//     public void moves(){
//         System.out.println("up.down,left,right");
//     }
// }

// class King implements chessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right.diagonal(by one step)");
//     }
// }













////////////static keyword = used to share same variable or method of given class
// public class OOPS{
//     public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.schoolName = "skncoe"; 

//        Student s2 = new Student();
//        System.out.println(s2.schoolName);

//        Student s3 = new Student();
//        s3.schoolName = "ABC";
//     }
// }



// class Student{
//     String name;
//     int roll;

//     static String schoolName;

//     void setName(String name){
//         this.name = name;
//     }

//     String getName(){
//         return this.name;
//     }
// }







///////////Super Keyword = used to refer immediate parent class object.
// ->to access parents properties
// ->to access parents functions
// ->to access parents constructor

// public class OOPS{
//     public static void main(String[] args) {
//             Horse h = new Horse();
//             System.out.println(h.color);
//     }
// }

// class Animal{
//     String color;
//     Animal(){
//         System.out.println("animal constructor is called");
//     }

// }

// class Horse extends Animal{
//     Horse(){
//         super.color="brown";
//         System.out.println("horse constructor is called");
//     }
// }




































































































































































































































































































































































































































































































































































































































































































































































































































































