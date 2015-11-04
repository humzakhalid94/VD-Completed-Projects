package hello;

import javax.jnlp.IntegrationService;

/**
 * Created by Saqib on 10/25/2015.
 */
public class Result {

    Integer aditionresult;
    Integer subtractresult;
    Integer multiplyresult;
    Integer divideresult;




    public Result(Integer a , Integer b){

        aditionresult = a + b;
        subtractresult = a - b;
        multiplyresult = a * b;
        if(b == 0 )
            b = 1;
        divideresult = a / b;
    }


    public Integer getaditionresult() {
        return aditionresult;
    }

    public void setaditionresult(Integer result) {
        this.aditionresult = result;
    }
    public Integer getSubtractresult() {
        return subtractresult;
    }

    public void setSubtractresult(Integer subtractresult) {
        this.subtractresult = subtractresult;
    }
    public Integer getMultiplyresult() {
        return multiplyresult;
    }

    public void setMultiplyresult(Integer multiplyresult) {
        this.multiplyresult = multiplyresult;
    }

    public Integer getDivideresult() {
        return divideresult;
    }

    public void setDivideresult(Integer divideresult) {
        this.divideresult = divideresult;
    }
   // public Integer

}
