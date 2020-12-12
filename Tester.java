import java.util.ArrayList;

public class Tester {
  public static void main (String[] args) {
    // ArrayList<String> x = new NoNullArrayList<String>();
    // x.add("hello");
    // x.add("hi");
    // x.add("heya");
    // //x.add(2, null);
    // System.out.println(x);
    // //x.add(null);
    // System.out.println(x);
    // x.set(1, "why");
    // //x.set(2, null);
    // System.out.println(x);

    ArrayList<Integer> y = new OrderedArrayList<Integer>();
    y.add(4);
    y.add(5);
    y.add(-5);
    y.add(5);
    System.out.println("Before: "+ y);
    y.add(1, 2);
    y.set(3, 100);
    System.out.println("After vod add() and set(): " +y);
  }
}
