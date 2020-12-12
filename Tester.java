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
    y.add(3);
    y.add(2);
    System.out.println("Before setting: " + y);
    // System.out.println("What did I remove: " + y.set(1,3));
    // System.out.println("After setting at index = 1: " + y);
    // System.out.println("What did I remove: " + y.set(2,2));
    // System.out.println("After setting at index = 2: " + y);
  }
}
