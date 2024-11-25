class Complex {

    int  real, imaginary;

    Complex(int  r, int  i) {

        this.real = r;

        this.imaginary = i;

    }

    public static Complex add(Complex c1, Complex c2) {

        Complex temp = new Complex(0, 0);

        temp.real = c1.real + c2.real;

        temp.imaginary = c1.imaginary + c2.imaginary;

        return temp;
    }
}