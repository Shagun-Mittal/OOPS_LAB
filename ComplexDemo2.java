import java.util.*;
class Complex 
{
    double real;
    double imag;
    
    public Complex()
    {
        real = 0; 
        imag = 0;
    }
    
    public Complex(double real, double imag) 
    {
        this.real = real;
        this.imag = imag;
    }

    
    public  void display(Complex temp)
    {
        System.out.println("Result =" +temp.real+ "+i"+temp.imag);
    }
    
    public Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;
        System.out.println("ADD:" );
        display(temp);

        return(temp);
    }
    
    public Complex subtract(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = Math.abs(n1.real - n2.real);
        temp.imag = Math.abs(n1.imag - n2.imag);
        System.out.println("SUBTRACT:" );
        display(temp);
        return(temp);
    }
}
class ComplexDemo2
{
    public static void main(String[] args) 
    {   
        Scanner sc =new Scanner(System.in); 
        double r1,i1,r2,i2;
        System.out.println("Enter the real part of first complex no.:");
        r1= sc.nextInt();
        System.out.println("Enter the imaginary part of first complex no.:");
        i1= sc.nextInt();
        System.out.println("Enter the real part of second complex no.:");
        r2= sc.nextInt();
        System.out.println("Enter the imaginary part of second complex no.:");
        i2= sc.nextInt();
        Complex n1 = new Complex(r1,i1);
        Complex n2 = new Complex(r2,i2);
        Complex temp = new Complex(0,0);

        temp.add(n1, n2);
        temp.subtract(n1,n2);
    }
}