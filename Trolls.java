import java.lang.StringBuilder;

public class Troll {
    public static String disemvowel(String str) {
      StringBuilder sb = new StringBuilder();

      char[] chars = str.replaceAll("[AEIOUaeiou]", "").toCharArray();

      for(char c : chars){
        sb.append(c);
      }

      return sb.toString();
    }
}
