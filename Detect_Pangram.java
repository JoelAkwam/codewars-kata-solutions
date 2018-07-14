public class Detect_Pangram{

  public boolean pangram(String str){
    char[] chars = str.toUpperCase().replaceAll("[^A-Z]", "").toCharArray();
    Set sb = new HashSet();

    for(char c : chars){
      sb.add(c);
    }

    if(sb.size() == 26){
      return true;
    }
    return false;
  }
}
