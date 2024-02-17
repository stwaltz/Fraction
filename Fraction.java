package FractionsP2;
public class Fraction {

    private int numerator;
    private int denominator;
    public Fraction(){ // no cons
     int numerator = 0;
     int denominator = 1;
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
  
  //Returns the product fraction of this fraction and a multiplier fraction.
    public Fraction multiplyBy(Fraction multiplier) {
        return new Fraction(
                this.numerator * multiplier.getNumerator(),
                this.denominator * multiplier.getNumerator()
        );
    }

    //Returns a string representation of this fraction
    //Format of string representation is "[numerator]/[denominator]"
    public String toString(){
        return String.format("%d/%d",this.numerator,this.denominator);
    }
}



