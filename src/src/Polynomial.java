public class Polynomial {
    private Term myFirst;

    public Polynomial() {
        myFirst = null;
    }

    private void removeZeroCoefs() {
        //nothing to remove
        if (myFirst == null) return;

        //while myFirst coef is 0, then keep removing myFirst
        while (myFirst.coef == 0) {
            myFirst = myFirst.next;
        }

        //take care of 0 coefs for later terms
        Term current = myFirst;
        //Part 2: Write your code here (15 pts)

//        Term
    }
}
