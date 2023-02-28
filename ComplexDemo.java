import java.util.*;
class Complex 
{
    int real;
    int imag;
    
    void assign(int a,int b)
    {
        real = a;
        imag = b;
    }
    
    void display()
    {
        System.out.println("Complex number:" + real + " +i" + imag);
    }
    
    Complex add(Complex n2)
    {
        Complex temp = new Complex();

        temp.real = this.real + n2.real;
        temp.imag = this.imag + n2.imag;
        return(temp);
    }
    
    Complex subtract(Complex n2)
    {
        Complex temp = new Complex();

        temp.real = Math.abs(this.real - n2.real);
        temp.imag = Math.abs(this.imag - n2.imag);
        return(temp);
    }
}
class ComplexDemo
{
    public static void main(String[] args) 
    {
    	Scanner sc =new Scanner(System.in); 
    	int r1,i1,r2,i2;
    	System.out.println("Enter the real part of first complex no.:");
    	r1= sc.nextInt();
    	System.out.println("Enter the imaginary part of first complex no.:");
    	i1= sc.nextInt();
    	System.out.println("Enter the real part of second complex no.:");
    	r2= sc.nextInt();
    	System.out.println("Enter the imaginary part of second complex no.:");
    	i2= sc.nextInt();

        Complex n1 = new Complex();
        n1.assign(r1,i1);
        n1.display();
        Complex n2 = new Complex();
        n2.assign(r2,i2);
        n2.display();
        Complex c3=n1.add(n2);
        Complex c4=n1.subtract(n2);
        System.out.println("Addition: " + c3.real + "+i" + c3.imag);
        System.out.println("Subtraction: " + c4.real + "+i" + c4.imag);
    }
}