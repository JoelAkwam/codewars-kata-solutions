import java.text.DecimalFormat;

public class PizzaPayments {
  public static double michaelPays(double cost) {
    double michaelPay = 0;

    if(cost < 5) {
      michaelPay = cost;
    }else {
      double thirdOfCost = cost / 3;

      if(thirdOfCost > 10){
        michaelPay = cost - 10;
      } else {
        michaelPay = cost - thirdOfCost;
      }
    }

    DecimalFormat df = new DecimalFormat("###.##");
    return Double.parseDouble(df.format(michaelPay));
  }
}
