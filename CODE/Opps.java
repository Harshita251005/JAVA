// import java.util.*;
// // import bank;
// // class Pen {
// //     String color;
// //     String type;

// //     public void write() {
// //         System.out.println("writing something");
// //     }

// //     public void printColor() {
// //         System.out.println(this.color);
// //     }
// // }

// // class Student {
// //     String name;
// //     int age;

// // public void printInfo() {
// //     System.out.println(this.name);
// //     System.out.println(this.age);
// // }

// // Student(){
// // System.out.println("constructor called");
// // }

// // Student(String name, int age){
// // this.name = name;
// // this.age = age;
// // }

// // Student(Student s2) {
// //     this.name = s2.name;
// //     this.age = s2.age;
// // }

// // Student() {

// // }

// //     public void printInfo(String name){
// //         System.out.println(name);
// //     }

// //     public void printInfo(int age){
// //         System.out.println(age);
// //     }

// //     public void printInfo(String name, int age){
// //         System.out.println(name + " " + age);
// //     }
// // }

// // class Shape {
// //     // String color;
// //     public void area(){
// //         System.out.println("display area");
// //     }
// // }

// // class Triangle extends Shape{
// //     public void area( int l, int h){
// //         System.out.println(1/2*l*h);
// //     }
// // }

// // class EquilateralTriangle extends Triangle{
// //     public void area(int l,int h){
// //         System.out.println(1/2*l*h);
// //     }
// // }

// // class Circle extends Shape{
// //     public void area(int r){
// //         System.out.println((3.14)*r*r);
// //     }
// // }
// public class Opps {
//     public static void main(String[] args) {
//         // Student s1 = new Student();
//         // s1.name = "abc";
//         // s1.age = 22;
//         // s1.printInfo();

//         // Student s1 = new Student("aman", 24);
//         // s1.printInfo();

//         // Student s1 = new Student();
//         // s1.name = "aman";
//         // s1.age = 24;

//         // Student s2 = new Student(s1);
//         // s2.printInfo();
//         // Pen pen1 = new Pen();
//         // pen1.color = "blue";
//         // pen1.type = "gel";

//         // Pen pen2 = new Pen();
//         // pen2.color = "black";
//         // pen2.type = "ballpen";

//         // // pen1.write();
//         // pen1.printColor();
//         // pen2.printColor();

//         // Student s1 = new Student();
//         // s1.name = "aman";
//         // s1.age = 24;
//         // s1.printInfo(s1.name,s1.age);

//         // Triangle t1 = new Triangle();
//         // t1.color = "red";
//         // bank.Account account1= new bank.Account();  
//         // account1.name = "customer1";                                  

//         package bank;

//             class Account
//         {        
//             public String name;
//             protected String email;        
//             private String password;   

//             //getters and setters
//             public String getPassword(){
//                 // return this.password;
//                 setPassword(randomPass);
//                 return this.password;
//             }
//             public void setPassword(String pass){
//                 this.password = pass;
//             }
//         }
//            public class Bank{
//            public static void main(String[] args) {
//             Account account1 = new Account();
//             account1.name = "and";    
//             account1.email = "bjnkm";
//             // account1.password = "asd";
//             account1.setPassword("abcd");
//             System.out.println(account1.getPassword());
//         }
//     }         
//     }
// }

// abstract class Animal{
//     abstract void walk();
//     Animal(){
//         System.out.println("you are creating a new animal");
//     }
//     public void eat()
//     {
//         System.out.println("Animal eats");
//     }
// }
// class Horse extends Animal{
//     Horse(){
//         System.out.println("created a horse");
//     }
//     public void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }

// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }

// public class Opps{
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         horse.walk();
//         // Animal animal = new Animal();
//         // animal.walk();
//         horse.eat();
//     }
// }

// interface Animal{
//     int eyes = 2;
//     void walk();
// }

// interface Herbivour{

// }

// class Horse implements Animal Herbivour{
//     public void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }

// public class Opps{
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         horse.walk();
//     }
// }

// class Student {
//     String name;
//     static String school;

//     public static void changeSchool() {
//         school = "newschool";
//     }
// }

// public class Opps {
//     public static void main(String[] args) {
//         Student.school = "ABCD";
//         Student student1 = new Student();
//         student1.name = "tony";
//         System.out.println(student1.school);
//     }
// }





// package Jan_27_OOPs;

// class car {
//     String brand;
//     String color;
//     int speed;

//     car(){  // user made default constructor
//         brand = "";
//         color = "white";
//         speed = 60;
//     }
//     car(String b, String c, int s){
//         brand = b;
//         color = c;
//         speed = s;
//     }

//     void print(){
//         System.out.println("Brand : " + brand);
//         System.out.println("Color : " + color);
//         System.out.println("Speed : " + speed);
//     }

//     static void display(){
//         System.out.println("A static method");
//         // System.out.println(brand);  // access non static data member

//         // access non-static data member
//         car temp = new car();
//         System.out.println(temp.brand);
//     }
// }

// public class class_and_objects {
//     public static void main(String[] args) {
        
//         car car1 = new car();
//         car1.brand = "kia";
//         car1.color = "black";
//         car1.speed = 100;
//         car1.print();

//         car car2 = new car("skoda", "white", 110);
//         car2.print();
//         car.display();
//     }
// }




// package Jan_28_OOPs;
// class Car {
//     private String brand;
//     private String color;
//     int speed;

//     Car(String brand, String color, int speed){
//         this.brand = brand;
//         this.color = color;
//         this.speed = speed;
//     }

//     Car(Car other){     // copy constructor
//         this.brand = other.brand;
//         this.color = other.color;
//         this.speed = other.speed;
//     }

//     String getBrand(){
//         return this.brand;
//     }

//     void setColor(String color){
//         this.color = color;
//     }

//     String getColor(){
//         return this.color;
//     }

//     void print(){
//         System.out.println("Brand : " + brand);
//         System.out.println("Color : " + color);
//         System.out.println("Speed : " + speed);
//     }

// }

// class Array{
//     int [] arr;
//     Array(int size){
//         arr = new int[size];
//     }
//     Array(Array other){     // copy constructor
//         this.arr = other.arr; // shallow copy

//         // Deep copy
//         this.arr = new int[other.arr.length];
//         for(int i=0 ; i < other.arr.length ; i++){
//             this.arr[i] = other.arr[i];
//         }
//     }
// }

// public class copy_constructor {
//     public static void main(String[] args) {
        
//         Array obj1 = new Array(10);
//         Array obj2 = new Array(obj1);
//         obj1.arr[2] = 10; // change obj1 arr
//         System.out.println(obj2.arr[2]);


//         Car car1 = new Car("Fortuner", "White", 120);
//         Car car2 = new Car(car1);
//     }
// }




// package Jan_28_OOPs;

// class car {
//     private String brand;
//     private String color;
//     int speed;

//     // car(){  // user made default constructor
//     //     brand = "";
//     //     color = "white";
//     //     speed = 60;
//     // }
//     car(String brand, String color, int speed){
//         this.brand = brand;
//         this.color = color;
//         this.speed = speed;

//         // this.print();
//     }

//     String getBrand(){
//         return this.brand;
//     }

//     void setColor(String color){
//         this.color = color;
//     }

//     String getColor(){
//         return this.color;
//     }

//     void print(){
//         System.out.println("Brand : " + brand);
//         System.out.println("Color : " + color);
//         System.out.println("Speed : " + speed);
//     }

// }

// public class encapsulation {
//     public static void main(String[] args) {
        
//         car car1 = new car("Fortuner", "Black", 120);
//         // car1.brand = ""; invalid due to private member

//         car1.setColor("White");
//         System.out.println(car1.getColor());

//     }
// }



// package Jan_29_OOPs;

// class employe{
//     int salary;
//     String name;
//     employe(){
//         System.out.println("Employee");
//     }
// }

// class engineer extends employe{     // single level inheritance
//     int bonus;
//     engineer(){
//         System.out.println("Engineer");
//     }
// }

// public class inheritance {
//     public static void main(String[] args) {
        
//         engineer e1 = new engineer();
//         e1.name = "Jai";

//         employe emp1 = new employe();

//         System.out.println(e1 instanceof engineer);     // e1 belongs to engineer
//         System.out.println(e1 instanceof employe);      // e1 belongs to employee
//         System.out.println(emp1 instanceof engineer);   // emp1 does not belongs to engineer


//         employe emp2 = new engineer();      // valid syntax
//         // engineer emp = new employe();    // invalid syntax
//     }
// }


// package Jan_30_OOPs;

// class employe{
//     int salary;
//     String name;
//     employe(int salary, String name){
//         this.name = name;
//         this.salary = salary;
//     }
//     void print(){
//         System.out.println("Parent class");
//     }
// }
// class engineer extends employe{
//     int bonus;
//     engineer(int bonus){
//         // System.out.println(this.salary);    // salary is not initialized 
//         super(1000, "Jai");
//         this.bonus = bonus;
//     }
//     void print(){
//         super.print();  // access hidden methods in parent class
//         System.out.println("Child class");
//     }
// }

// public class inheritance {
//     public static void main(String[] args) {
        
//         engineer e1 = new engineer(1000);
//         e1.print();
//     }
// }


// import java.util.Scanner;

// public class Class26 {
//     //Polymorphism ->
//     //many forms
//     //a function can be declared by multiple ways

//     //types og polymorphism->
//     //1. Compile time->
//     //->executes at compile time.
//     //->function declaration must be different.
//     //eg-> same bowler bowling pace and spin with different run-up
//     //achieved by method-overloading.


//     //2. Run Time->
//     //executes at run-time
//     //function declaration is almost same.
//     //eg->a pacer bowling slower with almost same bowling action.
//     //achieved by method overriding.

//     static int add(int a,int b){
//         return a+b;
//     }
//     static int add(int a,int b,int c){
//         return a+b+c;
//     }
    // static String add(String a,int b){
    //     return a+b;
    // }


//     package Lec_26_Feb_4_OOPs;

//     public class compile_time_polymorphism {
    
//         static int add(int a){
//             return 10;
//         }
//         static int add(long a){     // overload by changing data type
//             return 10;
//         }
//         static int add(int a, int b){
//             return a + b;
//         }
//         static int add(int a, int b, int c){    // overloading by changing no. of arguments
//             return a + b + c;
//         }
//         static int add(String a, int b){    // overloading by changing arguments type
//             return 10;
//         }
//         static int add(int b, String a){    // overloading by changing arguments order
//             return 20;
//         }
//         // static String add(int a, String b){  // can't overload by changing return type
//         //     return "10";
//         // }
//         // static int add(int a, String b){    // can't overload by changin arguments name
//         //     return 20;
//         // }
    
//         public static void main(String[] args) {
            
//             int a = 10;
//             System.out.println(add(a));
        
//             System.out.println(add(10));
    
//             System.out.println(add(10, 20));
            
//             System.out.println(add(10, 20, 30));
    
//             System.out.println(add("abc", 2));
//             System.out.println(add(2, "abc"));
//         }
//     }

//     package Lec_26_Feb_4_OOPs;

// public class varagrs {
//     static void print(int... a){
//         for(int i : a){
//             System.out.print(i + "  ");
//         }
//         System.out.println();
//     }
//     // static void print(int... a, int... b){}  // can't contain multiple varags 

//     static void print(String a, int... b){  // can overload by adding arguments type
//         System.out.println("Overloaded varargs function");
//     }
//     static void print(long a, int... b){}
//     // static void print(int a, int... b){}

//     // static void print(int... a, String b){}     // var args must be last parameter
//     public static void main(String[] args) {
        
//         print(1,2,3);
//         print(1,2,3,4,5,6,7);

//         int[] a = {1,2,3,4,5};
//         print(a);
//     }
// }


// package Lec_27_Feb_5_OOPs;

// public class final_keyword {
//     public static void main(String[] args) {
        
//         final int a = 10;
//         // a = 20;     // final variable can't be modfied

//         final int b;
//         b = 20;     // intialization
//         // b = 30;
//     }
// }


// public class Class27 {
//     public static void main(String[] args) {
//         //method overriding ->
//         //-> type of runtime polymorphism
//         //-> function signature is same
//         //return type must be same or
//         //can be subclass of the actual
//         //return type (co-variant)
//         //like shown above of getVehicle function

//         //constructors can be over-ridden
//         //static members can not be over-ridden
//         //private members can not be over-ridden
//         //final members can not be over-ridden

//         //@Override annotation can be used while overriding (optional)

// //        final keyword
//         //we cannot change the value of any variable defined as final
//         //->used to not allow modification on the variable
//         //->used to not allow overriding on methods

//         final int a = 10;
// //        a = 20; //err


// package Lec_27_Feb_5_OOPs;

// class motor_vehicle{
//     motor_vehicle(){
//         System.out.println("Motor Vehicle");
//     }
//     void start(){
//         System.out.println("switch on motor engine");
//     }
//     motor_vehicle get_Vehicle(){
//         return new motor_vehicle();
//     }

//     static void print(){
//         System.out.println("static method in parent class");
//     }
//     final void final_func(){
//         System.out.println("Final function");
//     }

//     private void func(){
//         System.out.println("private function");
//     }
// }

// class car extends motor_vehicle{

//     // motor_vehicle(){        // constructors can't be override
//     //     System.out.println("Car Vehicle");
//     // }
    
//     void func(){   // not a overridden method
//         System.out.println("function");
//     }
//     void start(){
//         System.out.println("Starts by key");
//     }
    
//     // @Override    // specifies function must override method
//     // void strt(){

//     // }
//     car get_Vehicle(){
//         return new car();
//     }

//     // void print(){   // can't be overridden
//     //     System.out.println("static method in parent class");
//     // }

//     static void print(){    // method hiding
//         System.out.println("Not a overridden function");
//     }

//     // void final_func(){   // can't be overridden
//     //     System.out.println("Final function");
//     // }
// }

// class bike extends motor_vehicle{

//     void start(){
//         System.out.println("Starts by kick");
//     }
// }

// public class overriding {
//     public static void main(String[] args) {
        
//         car c1 = new car();
//         c1.start();     // calls overridden method
//     }
// }




// package Lec_28_Feb_6_OOPs;

// final class parent{
//     String name;
// }

// // class child extends parent{     // can't inherit final class
// //     int age;
// // }

// class pair{
//     int a;
//     int b;
// }

// public class final_keyword {
//     public static void main(String[] args) {
        
//         final int a = 10;
//         // a = 20;     // final variable can't be modfied

//         final int b;
//         b = 20;     // intialization
//         // b = 30;

//         // creating obj of final class
//         parent p1 = new parent();
//         p1.name = "Jai";
//         p1.name = "JKY";

//         // creating final objects
//         final pair pair1 = new pair();
//         pair1.a = 1;
//         pair1.a = 2;
//         // pair1 = new pair(); // can't reassign final objects
//     }
// }


// package Lec_28_Feb_6_OOPs;

// class Mutable{
//     int x;
// }

// final class Immutable{
//     final private int a;
//     final private int b;
//     final private Mutable m;

//     Immutable(int a, int b, Mutable m){
//         this.a = a;
//         this.b = b;
//         // this.m = m;     // can be changed due to shallow copy

//         this.m = new Mutable();
//         this.m.x = m.x;
//     }

//     int get_a(){
//         return this.a;
//     }
//     int get_b(){
//         return this.b;
//     }
//     Mutable get_m(){
//         // return defensive copy of objects
//         Mutable temp = new Mutable();
//         temp.x = this.m.x; 
//         return temp;
//     }

//     void print(){
//         System.out.println("a : " + this.a);
//         System.out.println("b : " + this.b);
//         System.out.println("m : " + this.m.x);
//         System.out.println("-----------------");
//     }
// }

// public class immutable_class {
//     public static void main(String[] args) {
        
//         Mutable m1 = new Mutable();
//         m1.x = 10;

//         Immutable im = new Immutable(10, 20, m1);
//         im.print();

//         m1.x = 30;
//         im.print();

//         Mutable m2 = im.get_m();
//         m2.x = 20;
//         im.print();
//     }
// }


// public class Class29 {
//     public static void main(String[] args) {
// //        Scanner sc = new Scanner(System.in);
// //        meow124 obj = new meow124();
// //        obj.a = 12;
//         //abstraction->
//         //process of hiding complex implementation from user.
//         //showing functionality to user.
//         meow126 h = new meow126();
//         h.hey();
//     }
// }


// package Lec_29_Feb_10_OOPs;

// abstract class MotorVehicle{
//     String name;
//     abstract void start();
//     // abstract private void abstract_method();    // abstract method can't be private
//     // abstract static void static_method();    // abstract method can't be static
//     // abstract final void final_method();    // abstract method can't be final
//     void print(){
//         System.out.println("I'm Abstract Class");
//     }
//     // other functionality can be same
//     static void static_non_abstract_method(){

//     }
//     MotorVehicle(){
//         System.out.println("Motor Vehicle");
//         this.name = "Abc";
//     }
// }

// abstract class Car extends MotorVehicle{
//     // class must be ebstract because 
//     // it is not implementing abstract methods in parent class
// }

// class Bike extends MotorVehicle{
//     void start(){
//         System.out.println("Starts from Kick");
//     }
// }

// public class abstraction {
//     public static void main(String[] args) {
        
//         // cannot make objects of abtract class
//         // MotorVehicle mv = new MotorVehicle();
//     }
// }



// package Lec_30_Feb_11_OOPs;

// interface Animal{
//     int a = 10;
//     void makes_sound();
//     // constructor
//     // Animal(){
//     //     System.out.println("Interfaces can't have constructors");
//     // }

//     default void print(){
//         System.out.println("A default method in Interface");
//     }
// }

// interface Dog extends Animal{

// }

// class Cat implements Animal{
//     @Override
//     public void makes_sound(){      // scope in interface is public implicitly
//         System.out.println("Cat meows");
//     }
// }

// public class interfaces {
//     public static void main(String[] args) {
        
//         // creating objects of interfaces
//         // Animal ex = new Animal();     // can't make objects of interfaces
//     }
// }


// package Lec_31_Feb_12_OOPs;

// interface Animal{
//     int a = 10;     // constant by default
//     void makes_sound();

//     // protected void protected_fun(){
//     //     System.out.println("Can't create protected method in Interfaces");
//     // }
//     private void hello(){
//         System.out.println("Hello");
//     }
//     default void print(){
//         hello();
//         System.out.println("A default method in Interface");
//     }
// }

// public class interfaces {
//     public static void main(String[] args) {
        
//         // creating objects of interfaces
//         // Animal ex = new Animal();     // can't make objects of interfaces
//     }
// }


// package Lec_31_Feb_12_OOPs;

// // in case of Classes
// class A{
//     int a;
// }
// class B{
//     int b;
// }

// // class C extends A, B{   // Classes doesn't support multiple inheritance
// //     int c;
// // }

// // In Interfaces
// interface W{
//     void print();
//     default void func(){
//         System.out.println("Interface W");
//     }
// }
// interface X extends W{
//     void print();
//     // default void func(){
//     //     System.out.println("Interface X");
//     // }
// }
// interface Y extends W{
//     void print();
//     default void func(){
//         System.out.println("Interface Y");
//     }
// }
// interface Z extends X, Y{   // Multiple inheritance and Case of diamond problem
//     void print();
//     // default void func(){
//     //     System.out.println("Interface Z");
//     // }
// }
// class C implements X, Y{
//     public void print(){
//         System.out.println("Multiple inheritance");
//     }
//     void function(){
//         // X.super.func();  // If present in just above parent then call that function
//         Y.super.func();
//     }
// }

// public class multiple_inheritance {
//     public static void main(String[] args) {
        
//     }
// }

// package Lec_32_Feb_13_OOPs;

// interface A{
//     void print();
// }
// abstract class C{
//     abstract void print();
// }

// public class anonymous_class {
//     public static void main(String[] args) {
        
//         // anonymous class from interface
//         A obj = new A() {
//             public void print(){
//                 System.out.println("I'm anonymous class");
//             }
//         };
//         obj.print();

//         // anonymous class from abstract class
//         C obj1 = new C() {
//             void print(){
//                 System.out.println("Anonymous class");
//             }
//         };
//         obj1.print();
//     }
// }


// package Lec_32_Feb_13_OOPs;

// class outer{
//     int x;
//     static int y;

//     // private class
//     private class private_class{
//         void print(){
//             System.out.println("x : " + x);
//             System.out.println("y : " + y);
//         }
//     }

//     // nested class inside class
//     class inner{
//         int a;
//         void print(){
//             System.out.println("a : " + a);
//             System.out.println("x : " + x);
//             System.out.println("y : " + y);
//         }
//     }
//     static class static_inner{
//         int c;
//         void print(){
//             System.out.println("c : " + c);
//             // System.out.println("x : " + x);
//             System.out.println("y : " + y);
//         }
//     }
//     void func(){
//         System.out.println("function");
//     }
// }

// public class nested_class {
//     public static void main(String[] args) {
        
//         // outer.inner = new inner(); // Non-staic member can't be accessed directly
//         outer outer_obj = new outer();
//         outer.inner inner_obj = outer_obj.new inner();
//         inner_obj.a = 10;
//         inner_obj.print();

//         outer.static_inner inner_obj_static_class = new outer.static_inner();
//         inner_obj_static_class.c = 20;
//         inner_obj_static_class.print();

//         // nested class inside method
//         int a = 10;
//         class method_nested_class{
//             void print(){
//                 System.out.println("Local class variable");
//                 System.out.println("a : " + a);
//             }
//         }
//         method_nested_class obj2 = new method_nested_class();
//         obj2.print();

//         // static class inner_class{
//         //      nested class inside methods can't be static
//         // }
//     }
// }



// package Lec_33_Feb_17_OOPs;

// interface A{
//     // int a;   // interface have constant by default
//     int a = 10;

//     // A(){     // don't have constructors in interface
//     //     a = 10;
//     // }

//     void display();
// }

// // class B extends A{      // class implements interface , not extends
// class B implements A{    
//     // void display(){     // access modifier will be public as interface has public access modifier
//     public void display(){    
//         System.out.println("Hello");
//     }
// }

// public class question2 {
//     public static void main(String[] args) {
        
//     }
// }


// package Lec_33_Feb_17_OOPs;

// abstract class A{
//     int a;
//     A(int a){
//         this.a = a;
//     }
//     A(){
        
//     }
// }
// class B extends A{
//     int b;
//     // B(){
//     //     super(10);
//     // }
//     // B(int a){
//     //     super(a);
//     // }
//     // B(int a, int b)
//     // {   
//     //     super(a);
//     //     this.b = b;
//     // }
// }

// public class questions {
//     public static void main(String[] args) {
        
//     }
// }


// package Lec_35_Feb_19_OOPS;

// public class wrapper_class {
//     public static void main(String[] args) {
        
//         Integer a = new Integer(10);
//         Integer b = 10;
//         System.out.println(Integer.min(a, b));
//         System.out.println(Integer.max(a, 10));

//         String str = "12345";
//         int c = Integer.parseInt(str);  // converts string to integer
//         System.out.println(c);

//         str = "101010";
//         int decimal = Integer.parseInt(str, 2); // converts binary string to decimal
//         System.out.println("Decimal value of " + str + " is : " + decimal);

//         str = Integer.toBinaryString(10);   // converts decimal to binary string

//         str = Integer.toString(12345);  // converts decimal to string

//         char ch = 'a';
//         if(Character.isLetter(ch)){
//             System.out.println("ch is a letter");
//         }
//         else if(Character.isLowerCase(ch)){
//             System.out.println("ch is in range a - z");
//         }
//         else if(Character.isUpperCase(ch)){
//             System.out.println("ch is in range A - Z");
//         }
//     }
// }


// package Lec_36_Feb_20_OOPs;

// import java.util.ArrayList;
// import java.util.Collections;

// class G_24 implements Comparable<G_24>{
//     String name;
//     int marks;
//     G_24(String name, int marks){
//         this.name = name;
//         this.marks = marks;
//     }

//     @Override
//     public int compareTo(G_24 obj2){
//         return Integer.compare(this.marks, obj2.marks);
//     }
// }

// public class comparable {
//     public static void main(String[] args) {
        
//         ArrayList<G_24> arr = new ArrayList<>();
//         arr.add(new G_24("Jai",62));
//         arr.add(new G_24("Satyam",72));

//         Collections.sort(arr);
//     }
// }


// package Lec_36_Feb_20_OOPs;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;

// class Group_24{
//     String name;
//     int marks;
//     Group_24(String name, int marks){
//         this.name = name;
//         this.marks = marks;
//     }
// }

// class SortByMarks implements Comparator<Group_24>{
//     @Override
//     public int compare(Group_24 obj1, Group_24 obj2){
//         return Integer.compare(obj1.marks, obj2.marks);
//     }
// }

// class SortByName implements Comparator<Group_24>{
//     @Override
//     public int compare(Group_24 obj1, Group_24 obj2){
//         return obj1.name.compareTo(obj2.name);
//     }
// }

// public class comparator {
//     public static void main(String[] args) {
        
//         ArrayList<Group_24> arr = new ArrayList<>();
//         arr.add(new Group_24("Jai",62));
//         arr.add(new Group_24("Satyam",72));

//         Collections.sort(arr, new SortByMarks());
//     }
// }