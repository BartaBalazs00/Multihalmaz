package hu.bartabalazs.MultiSet;

import java.util.List;

public class MultiSet<T>{
    private List<T> elements;

    public MultiSet() {
        this.elements = elements;
    }

    public void add(T element){
        this.elements.add(element);
    }

    public void remove(){

    }

    public int db(T element){
        int dbElement = 0;
        for (T elem :
                elements) {
            if(elem == element){
                dbElement++;
            }
        }
        return dbElement;
    }

}
