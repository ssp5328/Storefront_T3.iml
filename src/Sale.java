public class Sale{

    public static double getTax(double saleTotal, StateCode state) {
        double total = 0.0;
        if (state == StateCode.PA)
            total = 0.06 * saleTotal;
        return total;
    }
}
