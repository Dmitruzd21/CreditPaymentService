public class CreditPaymentService {
    public double calculate(int CreditAmount, int CreditTermYears,double BankInterestRate) {
        int CreditTermMonths = CreditTermYears * 12;
        double MonthlyPayment = (((BankInterestRate / 1200 * (Math.pow((1 + BankInterestRate / 1200), CreditTermMonths))) / (Math.pow((1 + BankInterestRate / 1200), CreditTermMonths) - 1)) * CreditAmount);
        return MonthlyPayment;
    }
}

