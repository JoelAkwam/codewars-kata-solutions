import java.util.stream.*;

public class OddOrEven{
  public static String oddOrEven (int[] array) {
    int sum = IntStream.of(array).sum();

    if(sum % 2 == 0){
      return "even";
    }
    return "odd";
  }
}
