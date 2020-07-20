public class DebugDemo2 {

  final static int z = 1;

  public static void main(String[] args) {
      System.out.println(modernMachine(5, 2));
     
  }

  public static int modernMachine(int n, int m) {
      int ix;
      
      m = z;
      ix = n / m;
      return ix;
  }


}

//5