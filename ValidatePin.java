public class validatePin{

  public static boolean validatePin(String pin) {
    int length = pin.length();

      if(pin.matches("^[0-9]+$")){
         if(length == 4 || length == 6){
            return true;
      }
    }
     return false;
  }
}
