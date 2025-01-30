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


