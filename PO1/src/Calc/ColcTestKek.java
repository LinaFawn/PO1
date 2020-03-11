package Calc;

import org.junit.Test;

import java.util.Objects;

public class ColcTestKek {

    private Colc func = new Colc();
    private double excepted = 0;


    @Test
    public void mult() {
        func.setRes(2);
        double res = func.Mult(2);
        excepted = 4;
        Objects.equals(excepted, res);
    }

    @Test
    public void division() {
        func.setRes(2);
        double res = func.Division(2);
        excepted = 1;
        Objects.equals(excepted, res);
    }

    @Test
    public void sum() {
        func.setRes(2);
        double res = func.Sum(2);
        excepted = 4;
        Objects.equals(excepted, res);
    }

    @Test
    public void diff() {
        func.setRes(2);
        double res = func.Diff(2);
        excepted = 0;
        Objects.equals(excepted, res);
    }
}