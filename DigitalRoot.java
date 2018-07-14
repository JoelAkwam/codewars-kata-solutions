public class DigitalRoot {
  public static int digital_root(int n) {
    return n - 9 * ((n - 1) / 9);
  }
}
