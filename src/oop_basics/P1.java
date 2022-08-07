package oop_basics;

public class P1 {
static void sum()
{
    System.out.println("The result is ");
}
static void sum(int i)
{
    System.out.println(i);
}
static void sum(double a, double b)
{
    System.out.println(a-b);
}
static void sum(int a , int b)
{
    System.out.println(a+b);
}
    public static void main(String[] args) {
    sum();
    sum(6);
    sum(3,6);
    sum(12.22,36.12);
    }

}
//Polymorphism ---> 1. method overloading, 2. method overriding

//method overloading - not same count of parameter, not same count of parameter's datatype etc.
//Example---
/*
static void sum()
{ }
static void sum(int i)
{ }
static void sum(int a, double b)
{ }
static void sum(int c, int d)
{ }
 */

//method overriding