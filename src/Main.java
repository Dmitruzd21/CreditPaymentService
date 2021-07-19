public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double MonthlyPayment = service.calculate(1_000_000,3,9.99);
        System.out.printf("%.0f",MonthlyPayment);
    }

}
