import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  public void add(int index, T element){
    try{
      if(element==null){
        throw new IllegalArgumentException("IS NULL!");
      }
      super.add(index,element);
    }catch(IllegalArgumentException e){
      throw new IllegalArgumentException("IS NULL!");
    }
  }

}
