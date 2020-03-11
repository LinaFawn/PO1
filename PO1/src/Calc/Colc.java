package Calc;

public class Colc {
    private double res;

    public double getRes(){
        return res;
    }
    public void setRes(double value){
        res = value;
    }

    public double Mult(double v){
        return  res *= v;
    }
    public double Division(double v){
        if(res > 0 && v == 0)
            return Integer.MIN_VALUE;
        if(res < 0 && v == 0)
            return  Integer.MAX_VALUE;
        if(res == 0 && v == 0)
            return 0000;
        return res /= v;
    }
    public double Sum(double v){
        return res += v;
    }
    public double Diff(double v){
        return res -= v;
    }
}
