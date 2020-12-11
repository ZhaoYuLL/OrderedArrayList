import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  public void add(int index, T element){
    try{
      if(element==null){
        throw new IllegalArgumentException("Your element is null");
      }
      super.add(index,element);
    }catch(IllegalArgumentException e){
      throw new IllegalArgumentException("Your element is null");
    }
  }

  public boolean add(T element){
    if (element == null) {
      throw new IllegalArgumentException("Your element is null");
    }
    super.add(element);
    return true;
  }
  public T set (int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Your element is null :(");
    }
    super.set(index, element);
    return element;
}

}
