public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    String[] chars = str.toLowerCase().split("");
    String[] vowels = {"a", "e", "i", "o", "u"};

    for(String v : vowels){
      for(String c : chars){
        if(c.matches(v)){
          vowelsCount++;
        }
      }
    }
    return vowelsCount;
  }
}
