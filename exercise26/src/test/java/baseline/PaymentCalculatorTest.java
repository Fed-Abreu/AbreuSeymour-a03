package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    void paymentCalculatorIsWorking(){
        PaymentCalculator sol = new PaymentCalculator();
        double balance = 1000;
        double apr  = 12;
        double percentAPR = apr/100;
        double newAPR = percentAPR/365;
        double monthlyPayment = 100;

        double actual_months =  sol.calculateMonthsUntilPaidOff(balance,monthlyPayment,newAPR);
        double expected_months = 11;

        assertEquals(expected_months,actual_months);


    }

}