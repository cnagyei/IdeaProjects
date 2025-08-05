/*
Complex numbers

Jake wants to write a program that works with complex numbers. He created a class Complex that represents
a complex number with its real and imaginary parts. Now he needs instance methods so that he can calculate the sum
and difference of two complex numbers.

Help Jake and create two instance methods for his class:
add(Complex num) that takes another complex number as an argument and adds its corresponding
fields to the current instance;

subtract(Complex num) that takes another complex number as an argument and subtracts its corresponding fields
from the current instance;

Both methods should return nothing. Do not make the fields and methods private.

A complex number consists of two parts: Real and Imaginary (denoted with i). In the add method, you should add the
real part of the first complex number with the real part of the second complex number. Then add the imaginary parts
of the complex numbers with each other. For subtract method, subtract the real and imaginary parts respectively.

Let's consider the example for the add method. If number = 10 + 4i and anotherNumber = 6 + 6i, applying the method
add to number with the argument anotherNumber changes number to number = 16 + 10i

Complex number = new Complex();
number.real = 10;
number.image = 4;
// math expression of number = 10.0 + 4.0i

Complex anotherNumber = new Complex();
anotherNumber.real = 6;
anotherNumber.image = 6;
// math expression of anotherNumber = 6.0 + 6.0i

number.add(anotherNumber); // number = 16.0 + 10.0i
 */
public class Complex {
    double real;
    double image;

    // Methods
    public void add(Complex num) {
        this.real += num.real;
        this.image += num.image;
    }
    
    public void subtract(Complex num) {
        this.real -= num.real;
        this.image -= num.image;
    }
}

class Main {
    public static void main(String[] args) {
        // Create an instance
        Complex complexNum1 = new Complex();
        complexNum1.real = 10;
        complexNum1.image = 4;

        // Create another instance
        Complex complexNum2 = new Complex();
        complexNum2.real = 6;
        complexNum2.image = 6;

        // Call instance methods
        complexNum1.add(complexNum2);
        System.out.println(complexNum1.real + " + " + complexNum1.image + "i");
        complexNum1.subtract(complexNum2);
        System.out.println(complexNum1.real + " + " + complexNum1.image + "i");


    }
}