package collections;
import java.util.*;
public class MyArraylist<E> {
	    private int size = 0;
	    private Object element[];
	    public MyArraylist() {
	        element = new Object[10];
	        for(int i=0;i<10;i++)
	        {
	        	element[size++] = i+1;
	        }
	    }
	    public void add(E e) {
	        if (size == element.length) {
	            Capacity();
	        }
	        element[size++] = e;
	    }
	    public E  fetch(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        return (E) element[i];
	    }
	    public E remove(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        Object item = element[i];
	        int numElts = element.length - ( i + 1 ) ;
	        System.arraycopy( element, i + 1, element, i, numElts ) ;
	        size--;
	        return (E) item;
	    }
	    
	    
	    
	    public int size() {
	        return size;
	    }
	    public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         for(int i = 0; i < size ;i++) {
	             sb.append(element[i].toString());
	             if(i<size-1){
	                 sb.append(" ");
	             }
	         }
	         return sb.toString();
	    }
	     
	    private void Capacity() {
	        int newSize = element.length * 2;
	        element = Arrays.copyOf(element, newSize);
	    }
	

}