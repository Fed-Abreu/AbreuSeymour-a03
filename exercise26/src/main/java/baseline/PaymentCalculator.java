package baseline;

public class PaymentCalculator {

    public double calculateMonthsUntilPaidOff(double balance, double monthlyPayment, double newAPR){

        //Calculate number of months using
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //return the number of months and round the number of months
        return Math.ceil((-1 / 30.0) * Math.log(1 + balance / monthlyPayment * (1 - Math.pow(1 + newAPR, 30))) / Math.log(1 + newAPR));
    }
}
