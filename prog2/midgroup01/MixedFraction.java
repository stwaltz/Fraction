package prog2.midgroup01;

import prog2.prelimgroup.Fraction;

public class MixedFraction extends Fraction {
    private int whole;

    public MixedFraction() {
        super();
        this.whole = 0;
    }

    public MixedFraction(int whole, Fraction fraction) {
        super(fraction.getNumerator(), fraction.getDenominator());
        this.whole = whole;
    }

    public MixedFraction(int whole, int numerator, int denominator) {
        super(numerator,denominator);
        this.whole = whole;
    }

    public MixedFraction(Fraction fraction) {
        super(fraction.getNumerator() % fraction.getDenominator(),fraction.getDenominator() );
        this.whole = fraction.getNumerator()/fraction.getDenominator();
    }

    public void setWholePart(int whole) {
        this.whole = whole;
    }

    public void setFractionPart(Fraction fraction) {
        this.setNumerator(fraction.getNumerator());
        this.setDenominator(fraction.getDenominator());
    }

    public int getWholePart() {
        return this.whole;
    }

    public Fraction getFractionPart() {
        return new Fraction(this.getNumerator(), getDenominator());
    }

    public Fraction toFraction() {
        int newNumerator = this.getDenominator() * this.whole + this.getNumerator(); //Calculates the improper fraction -- numerator
        return new Fraction(newNumerator, this.getDenominator());
    }

    public MixedFraction addition(MixedFraction other) {
        Fraction temp = this.toFraction();
        return new MixedFraction(temp.addition(other.toFraction()));
    }

    public MixedFraction subtraction(MixedFraction other) {
        Fraction temp = this.toFraction();
        return new MixedFraction(temp.subtraction(other.toFraction()));
    }
    public MixedFraction multiplyBy(MixedFraction other) {
        Fraction temp = this.toFraction();
        return new MixedFraction(temp.multiplyBy(other.toFraction()));
    }
    public MixedFraction divideBy(MixedFraction other) {
        Fraction temp = this.toFraction();
        return new MixedFraction(temp.divideBy(other.toFraction()));
    }

    /**
     * Simplifies the mixed fraction.
     *
     * @return  reducedFrac  The reduced mixed fraction.
     */
    public MixedFraction reduce(){
       return new MixedFraction(this.toFraction().reduce());
    }

}
