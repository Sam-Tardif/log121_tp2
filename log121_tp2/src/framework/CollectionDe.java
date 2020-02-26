package framework;

import java.util.Collection;
import java.util.Iterator;

public class CollectionDe implements Collection<De> {

    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private De[] des;

    public CollectionDe(int size){
        if(size == 0){
            this.size = DEFAULT_CAPACITY;
            des = new De[DEFAULT_CAPACITY];
        }

        this.size = size;
        des = new De[size];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {

        for (int i = 0; i < size; i++) {
            if(o.equals(des[i]))
                return true;
        }

        return false;
    }

    @Override
    public Iterator<De> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(De de) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends De> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
