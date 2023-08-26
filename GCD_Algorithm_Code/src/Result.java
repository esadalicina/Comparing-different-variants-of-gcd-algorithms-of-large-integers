
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Esada Licina
 */
public class Result {

    private BigInteger a, b, res;
    private double time;
    private String algorithm;

    public Result(BigInteger den, BigInteger num, BigInteger res, double time, String algorithm) {
        this.a = den;
        this.b = num;
        this.res = res;
        this.time = time;
        this.algorithm = algorithm;
    }

    public String toString() {
        return algorithm + ": " + time + " ns for the result  " + res + " with the BigIntegers " + a + " & " + b;
    }

    public String toCSV() {
        return algorithm + ";" + a + ";" + b + ";" + res + ";" + time;
    }
}
