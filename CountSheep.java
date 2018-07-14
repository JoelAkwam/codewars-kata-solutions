import java.util.*;

class CountSheep{
  public static String countingSheep(int num) {
    StringBuilder sb = new StringBuilder();

    for(int x = 1; x <= num; x++){
      sb.append(x + " sheep...").toString();
    }
    return sb.toString();
  }
}
