public class Term {
    public double coef; //coefficient
    public int exp; //exponent
    public Term next; //reference to next Term object

    public Term(double coef, int exp, Term next){
        this.coef = coef;
        this.exp = exp;
        this.next = next;
    }

    public Term(double coef, int exp) {
        this(coef, exp, null);
    }

    public Term (Term t){
        this(t.coef, t.exp, null);
    }
}
