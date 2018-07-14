public class BumpsTheRoad {
  public static String bumps(final String road) {
    int count = 0;

    char[] chars = road.toCharArray();

      for(int i = 0; i < chars.length; i++){
          if(chars[i] == 'n'){
            count++;
      }
  }
    if(count > 15){
      return "Car Dead";
    }
    return "Woohoo!";
  }
}
