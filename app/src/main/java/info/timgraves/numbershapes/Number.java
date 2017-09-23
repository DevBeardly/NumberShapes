package info.timgraves.numbershapes;

/**
 * Created by TimGr on 9/23/2017.
 */

public class Number {

    int number;

    public boolean isTriangular() {
        double sqrt = Math.sqrt(8 * number + 1);
        int x = (int) sqrt;
        return(Math.pow(sqrt,2) == Math.pow(x,2));
    }

    public boolean isSquare() {
        double sqrt = Math.sqrt(number);
        int x = (int) sqrt;
        return(Math.pow(sqrt,2) == Math.pow(x,2));
    }


}
