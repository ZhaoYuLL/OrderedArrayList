import java.util.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {


  public int helper(T value){
    int index = 0;
    for(int i = 0; i < this.size(); i ++){
      if(value.compareTo(this.get(i)) < 0){
        index = i;
      }
    }
    return index;
  }

  public boolean add(T element){
    int ind = helper(element);
    if(ind == 0){
      super.add(element);
    }else{
      super.add(ind,element);
    }
    return true;
  }

  public void add(int index, T element){
    int ind = helper(element);
    if(ind == 0){
      super.add(element);
    }else{
      super.add(ind,element);
    }
  }

  public T set(int index, T element){
    return element;
  }

}
