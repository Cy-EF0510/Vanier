// BEGIN REVEL SUBMISSION

import java.util.Collection;

interface MyList<E> extends java.util.Collection<E> {
    /** Add a new element at the specified index in this list */
    public void add(int index, E e);

    /** Return the element from this list at the specified index */
    public E get(int index);

    /** Return the index of the first matching element in this list.
     *  Return -1 if no match. */
    public int indexOf(Object e);

    /** Return the index of the last matching element in this list
     *  Return -1 if no match. */
    public int lastIndexOf(E e);

    /** Remove the element at the specified position in this list
     *  Shift any subsequent elements to the left.
     *  Return the element that was removed from the list. */
    public E remove(int index);

    /** Replace the element at the specified position in this list
     *  with the specified element and returns the new set. */
    public E set(int index, E e);
    
    @Override /** Add a new element at the end of this list */
    public default boolean add(E e) {
      add(size(), e);
      return true;
    }

    @Override /** Return true if this list contains no elements */
    public default boolean isEmpty() {
      return size() == 0;
    }

    @Override /** Remove the first occurrence of the element e 
     *  from this list. Shift any subsequent elements to the left.
     *  Return true if the element is removed. */
    public default boolean remove(Object e) {
     if (indexOf(e) >= 0) {
        remove(indexOf(e));
        return true;
      }
      else
        return false;
    }

    @Override
    public default boolean containsAll(Collection<?> c) {
      for (Object e: c)
        if (!this.contains(e))
          return false;
      
      return true;
    }
    
    /** Adds the elements in otherList to this list.
     * Returns true if this list changed as a result of the call */
    @Override
    public default boolean addAll(Collection<? extends E> c) {
      boolean modified = false;
      for(E e: c){
        if(add(e))
          modified = true;
      }
      return modified;
    }
  
    /** Removes all the elements in otherList from this list 
      * Returns true if this list changed as a result of the call */
    @Override
    public default boolean removeAll(Collection<?> c) {
      boolean modified = false;
      for(Object e: c){
        if(remove(e))
        modified = true;
      }
      return modified;
    }  
    
    /** Retains the elements in this list that are also in otherList 
      * Returns true if this list changed as a result of the call */
    @Override
    public default boolean retainAll(Collection<?> c) {
      boolean modified = false;
      for(int i = size() - 1; i >= 0; i--){
        if(!c.contains(get(i))){
          remove(i);
          modified = true;
        }
      }
      return modified;
    }

    @Override
    public default Object[] toArray() {
      int size = size();
      Object[] o = new Object[size];
      for(int i = 0; i < o.length; i++){
        o[i] = get(i);
      }
      return o;
    }

    @Override
    public default <T> T[] toArray(T[] a) {
      int size = size();
      if(a.length == size){
        for(int i = 0; i < size; i++){
          a[i] = (T) get(i);
        }
      }
      return a;
    }
  }
// END REVEL SUBMISSION