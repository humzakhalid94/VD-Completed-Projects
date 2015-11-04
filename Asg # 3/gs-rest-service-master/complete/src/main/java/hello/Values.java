package hello;

/**
 * Created by Saqib on 10/25/2015.
 */
public class Values {

    Integer a;
    Integer b;


    Integer result;



    Values(Integer a , Integer b){
        this.a = a;
        this.b = b;

    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }
    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "A = " + a +
                "\nB = " + b +
                "\n Result = "+ (a + b);


    }
}
