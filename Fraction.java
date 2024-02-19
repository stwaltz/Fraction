package FractionsP2;
public class Fraction {

    private int numerator;
    private int denominator;
    public Fraction(){ // no cons
        this.numerator = 0;
        this.denominator = 1;
    }
    public Fraction(int numerator, int denominator){
        setNumerator(numerator);
        setDenominator(denominator);
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
    // add other

        //Return sum of fraction of this fraction and additive fraction
    public Fraction addition(Fraction additive){
        return new Fraction(
                this.numerator * additive.getDenominator() + this.denominator * additive.getNumerator(),
                this.denominator * additive.getDenominator()
        );
    }

    //Returns the product fraction of this fraction and a multiplier fraction.
    public Fraction multiplyBy(Fraction multiplier) {
        return new Fraction(
                this.numerator * multiplier.getNumerator(),
                this.denominator * multiplier.getDenominator()
        );
    }
    public Fraction divideBy(Fraction divisor){
        return new Fraction(
                this.numerator * divisor.getDenominator(),
                this.denominator * divisor.getNumerator()
        );
    }

    //Returns a string representation of this fraction
    //Format of string representation is "[numerator]/[denominator]"
    public String toString(){
        return String.format("%d/%d",this.numerator,this.denominator);
    }

    //non-simplified 
    public Fraction subtract(Fraction other) {
        // Checks if denominators are the same
        if (this.denominator == other.denominator) {
            // Simply subtract numerators
            int newNumerator = this.numerator - other.numerator;
            return new Fraction(newNumerator, this.denominator);

        }
        else {
            //standard cross multiplication
            int newNumerator1 = this.numerator * other.denominator;
            int newNumerator2 = other.numerator * this.denominator;
            int commonDenominator = this.denominator * other.denominator;
            int newNum = newNum1 - newNum2;

            
            return new Fraction(newNumerator, commonDenominator);
        }
    }

    /*
    - Calculate the GCD/GCF of two numbers
    */
    public int computeGCD(int FirstNumber, int SecondNumber){
        int remainder;
        try{
            do{
                remainder = FirstNumber % SecondNumber;
                FirstNumber = SecondNumber;
                SecondNumber = remainder;
            }while(remainder != 0);
        }catch (Exception e){
            System.out.println("Unable to calculate GCD, denominator must not be zero!");
        }
        return FirstNumber;
    }

    /*
    - Reduces fraction to the lowest term
    - *NOTE* Remove parameters if the fraction being reduced is itself.
     */
    public Fraction reduce(int numerator, int denominator){
        int GCD = computeGCD(numerator, denominator);
        try{
            if(numerator % denominator == 0){ //For proper fractions
                return new Fraction(numerator/GCD, denominator/GCD);
            }else{ //For improper fractions
                return new Fraction(numerator/GCD, denominator/GCD);
            }
        }catch(Exception e){
            return new Fraction(0, 1);
        }
    }

}

    public double toDouble(){
        return (double) this.numerator / this.denominator;
    }
}




