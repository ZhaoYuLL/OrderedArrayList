import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public boolean add(T element){
    return true;
  }
  public void add(int index, T element){

  }
  public T set(int index, T element){
    return element;
  }
}
