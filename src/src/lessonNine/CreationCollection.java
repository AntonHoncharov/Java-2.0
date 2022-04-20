package src.lessonNine;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class CreationCollection implements List {

    public static void main(String[] args) {

        Collection<String> firstCollections = firstCollections();
        Collection<String> secondCollections = secondCollections();


        System.out.println("__________ " + firstCollections.size());

        for (Iterator it = firstCollections.iterator(); it.hasNext(); ) {
            String string = (String) it.next();
            System.out.println(string);
        }
        System.out.println("__________ " + firstCollections.size());

        if (firstCollections.containsAll(secondCollections)) {
        }
        firstCollections.addAll(secondCollections);
        firstCollections.forEach(s -> System.out.println(s));
        System.out.println("__________ " + firstCollections.size());

        firstCollections.removeAll(secondCollections);
        firstCollections.forEach(s -> System.out.println(s));
        System.out.println("__________ " + firstCollections.size());

        firstCollections = firstCollections();
        secondCollections = secondCollections();
        firstCollections.retainAll(secondCollections);
        firstCollections.forEach(s -> System.out.println(s));
        System.out.println("__________ " + firstCollections.size());

        firstCollections.clear();
        firstCollections.forEach(s -> System.out.println(s));
        System.out.println("__________ " + firstCollections.size());

        firstCollections = firstCollections();
        firstCollections.remove("A");

        firstCollections.forEach(s -> System.out.println(s));
        System.out.println("__________ " + firstCollections.size());

        firstCollections.stream().sorted();
        firstCollections.forEach(s -> System.out.println(s));
        System.out.println("__________ " + firstCollections.size());

    }

    private static Collection<String> firstCollections() {

        Collection<String> collectionOne = new ArrayList<String>();
        collectionOne.add("B");
        collectionOne.add("A");
        collectionOne.add("D");
        collectionOne.add("C");
        collectionOne.add("F");
        collectionOne.add("E");
        collectionOne.add("G");
        return collectionOne;
    }

    private static Collection<String> secondCollections() {

        Collection<String> collectionTwo = new ArrayList<String>();
        collectionTwo.add("P");
        collectionTwo.add("Q");
        collectionTwo.add("N");
        return collectionTwo;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        List.super.forEach(action);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(IntFunction generator) {
        return List.super.toArray(generator);
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
        return false;
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return List.super.removeIf(filter);
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator operator) {
        List.super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator c) {
        List.super.sort(c);
    }

    @Override
    public void clear() {

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
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
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
    public Spliterator spliterator() {
        return List.super.spliterator();
    }

    @Override
    public Stream stream() {
        return List.super.stream();
    }

    @Override
    public Stream parallelStream() {
        return List.super.parallelStream();
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
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