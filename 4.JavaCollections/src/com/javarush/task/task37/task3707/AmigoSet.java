package com.javarush.task.task37.task3707;

import java.io.*;
import java.util.*;

public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {
    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    private void writeObject (ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(HashMapReflectionHelper.callHiddenMethod(this.map, "capacity"));
        stream.writeObject(HashMapReflectionHelper.callHiddenMethod(this.map, "loadFactor"));
        stream.writeObject(this.map.size());
        for (E e: this.map.keySet()) {
            stream.writeObject(e);
        }
    }
    private void readObject (ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        int capacity = (int) stream.readObject();
        float loadFactor = (float) stream.readObject();
        int size = (int) stream.readObject();
        map = new HashMap<>(capacity, loadFactor);
        for (int i =0; i<size; i++) {
            E e = (E) stream.readObject();
            map.put(e, PRESENT);
        }
    }

    @Override
    public Object clone() throws InternalError {
        AmigoSet amigoSet;
        try {
            amigoSet = (AmigoSet) super.clone();
            amigoSet.map = (HashMap) map.clone();
        } catch (Exception e) {
            throw new InternalError();
        }
        return amigoSet;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    public AmigoSet() {
        this.map = new HashMap<>();

    }

    public AmigoSet(Collection<? extends E> collection) {
        this.map = new HashMap<>(Math.max((int) (collection.size() / .75f) + 1, 16));
        addAll(collection);
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean add(E e) {
        return null == map.put(e, PRESENT);
    }
}
