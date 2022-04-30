package src.lessonTen;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<T> implements List {

    private class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node<T> head = null;

    @Override
    public int size() {
        Node<T> p;
        int size = 0;
        for (p = head; p != null; p = p.next) {
            size++;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (isEmpty()) {
            return false;
        }
        Node<T> p;
        for (p = head; p != null; p = p.next) {
            if (p.value.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        if (isEmpty()) {
            return null;
        }
        int length = size(), i = 0;
        Object[] a = new Object[length];
        Node<T> p;
        for (p = head; p != null; p = p.next) {
            a[i] = p.value;
            i++;
        }
        return a;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        if (c == null || c.size() == 0) {
            return false;
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            T o = (T) it.next();
            add(o);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        if (c == null || c.size() == 0) {
            return false;
        }
        if (isEmpty()) {
            addAll(c);
            return true;
        }
        if (index < -1) {
            return true;
        } else if (index >= size()) {
            addAll(c);
        } else {
            int i = index;
            Iterator it = c.iterator();
            while (it.hasNext()) {
                T o = (T) it.next();
                add(i, o);
                i++;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int i = -1;
        if (isEmpty()) {
            return -1;
        }
        Node<T> p = head;
        while (p != null) {
            i++;
            if (p.value.equals(o)) {
                return i;
            }
            p = p.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (isEmpty()) {
            return -1;
        }
        Node<T> p = head;
        int i = -1, index = -1;
        while (p != null) {
            i++;
            if (p.value.equals(o)) {
                index = i;
            }
            p = p.next;
        }
        return index;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        if (c == null || c.size() == 0) {
            return false;
        }
        if (isEmpty()) {
            return false;
        }
        Node<T> p;
        Iterator it = c.iterator();
        while (it.hasNext()) {
            T o = (T) it.next();
            remove(o);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
