package prog2.prelimgroup;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() { // no cons
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int wholeNumVal){
        this.numerator = wholeNumVal;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int num) {
        numerator = num;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int den) {
        denominator = den;
    }

    public int getDenominator() {
        return denominator;
    }

    //Return sum of fraction of this fraction and additive fraction
    public Fraction addition(Fraction additive) {
        return new Fraction(
                this.numerator * additive.getDenominator() + this.denominator * additive.getNumerator(),
                this.denominator * additive.getDenominator()
        );
    }

    //Subtract a fraction to another and return the difference.
     public Fraction subtraction(Fraction subtractive) {
         return new Fraction(
                 this.numerator * subtractive.getDenominator() - this.denominator * subtractive.getNumerator(),
                 this.denominator * subtractive.getDenominator()
         );
     }


    //Returns the product fraction of this fraction and a multiplier fraction.
    public Fraction multiplyBy(Fraction multiplier) {
        return new Fraction(
                this.numerator * multiplier.getNumerator(),
                this.denominator * multiplier.getDenominator()
        );
    }

    //Returns the quotient fraction between two fractions
    public Fraction divideBy(Fraction divisor) {
        return new Fraction(
                this.numerator * divisor.getDenominator(),
                this.denominator * divisor.getNumerator()
        );
    }

    //Returns a string representation of this fraction
    //Format of string representation is "[numerator]/[denominator]"
    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }

    /*
    - Calculate the GCD/GCF of two numbers
    */
    public int computeGCD(int FirstNumber, int SecondNumber) {
        int remainder;
        try {
            do {
                remainder = FirstNumber % SecondNumber;
                FirstNumber = SecondNumber;
                SecondNumber = remainder;
            } while (remainder != 0);
        } catch (Exception e) {
            System.out.println("Unable to calculate GCD, denominator must not be zero!");
        }
        return FirstNumber;
    }

    /*
    - Reduces fraction to the lowest term
    - *NOTE* Remove parameters if the fraction being reduced is itself.
    */
    public Fraction reduce() {
        int GCD = computeGCD(this.numerator, this.denominator);
        try {
            return new Fraction(this.numerator / GCD, this.denominator / GCD);
        } catch (Exception e) {
            return new Fraction(0, 1);
        }
    }

    //Returns a double representation of this fraction
    //Divides the numerator by the denominator
    public double toDouble() {
        return (double) this.numerator / this.denominator;
    }
}



