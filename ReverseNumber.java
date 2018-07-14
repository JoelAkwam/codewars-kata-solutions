public class ReverseNumber{
    public static int reverse(int number) {
      int rev = 0;

  while(number != 0){
     int rem = number % 10;
     rev = rev *10 + rem;
     number /=10;
    }
     return rev;
   }
}
