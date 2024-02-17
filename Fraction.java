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
}



