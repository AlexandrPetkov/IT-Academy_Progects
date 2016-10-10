package topic5.task1;

class ПростаяДробь {
    int numerator;
    int denominator;

    public ПростаяДробь(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (numerator < 0 && denominator < 0){
            this.numerator=-numerator;
            this.denominator=-denominator;
        }
    }
    void summ(ПростаяДробь fraction){
        if (fraction != null || notZero(fraction))
        {
            numerator+=fraction.numerator;
            denominator+=fraction.denominator;
        }
    }

    void mult(ПростаяДробь fraction){
        if (notZero(fraction) && notZero(this)){
            numerator*=fraction.numerator;
            denominator*=fraction.denominator;
        }
    }

    void minus(ПростаяДробь fraction){
        if (fraction != null || notZero(fraction))
        {
            numerator-=fraction.numerator;
            denominator-=fraction.denominator;
        }

    }

    void division(ПростаяДробь fraction){
        if (notZero(fraction) && notZero(this)){
            numerator*=fraction.denominator;
            denominator*=fraction.numerator;
        }

    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    private boolean notZero (ПростаяДробь fr){
        return fr.numerator!=0 || fr.denominator!=0;
    }

    @Override
    public String toString() {
        return numerator + "/"+denominator;
    }
}
