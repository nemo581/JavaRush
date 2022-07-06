package com.javarush.task.task20.task2028;

import com.sun.org.apache.xpath.internal.axes.PredicatedNodeTest;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* 
Построй дерево(1)
*/

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    Entry<String> root;
    ArrayList<Entry<String>> elementsList = new ArrayList<>();

    public CustomTree() {
        this.root = new Entry<>("0");
        elementsList.add(root);
    }

    @Override
    public boolean add(String s) {
        Entry<String> entry = new Entry<>(s);
        for (Entry<String> currentElement : elementsList) {
            if (currentElement.isAvailableToAddChildren()) {
                if (currentElement.availableToAddLeftChildren) {
                    elementsList.add(entry);
                    currentElement.leftChild = entry;
                    entry.parent = currentElement;
                    currentElement.availableToAddLeftChildren = false;
                    return true;
                } else
                if (currentElement.availableToAddRightChildren) {
                    elementsList.add(entry);
                    currentElement.rightChild = entry;
                    entry.parent = currentElement;
                    currentElement.availableToAddRightChildren = false;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int size() {
        return elementsList.size() - 1;
    }

    @Override
    public boolean remove(Object o) {
        if (o instanceof String) {
            for (Entry<String> currentElem : elementsList) {
                if (currentElem.elementName.equals(o)) {
                    removeRecursive(currentElem);
                    return true;
                }
            }
            return false;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private void removeRecursive(Entry<String> currentElem) {
        if (currentElem.leftChild != null || currentElem.rightChild != null) {
            if (currentElem.leftChild != null) {
                removeRecursive(currentElem.leftChild);
                currentElem.leftChild = null;
            }
            if (currentElem.rightChild != null) {
                removeRecursive(currentElem.rightChild);
                currentElem.rightChild = null;
            }
        }
        elementsList.remove(currentElem);
        if (currentElem == currentElem.parent.leftChild) {
            currentElem.parent.leftChild = null;

        }
        if (currentElem == currentElem.parent.rightChild) {
            currentElem.parent.rightChild = null;
        }

        currentElem.parent.isAvailableToBeParent(currentElem.parent);
    }

    public String getParent(String s) {
        for (Entry<String> list : elementsList) {
            if (list.elementName.equals(s)) {
                return list.parent.elementName;
            }
        }
        return null;
    }

    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren;
        boolean availableToAddRightChildren;
        Entry<T> parent;
        Entry<T> leftChild;
        Entry<T> rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren | availableToAddRightChildren;
        }
        public void isAvailableToBeParent(Entry<T> element) {
            element.availableToAddLeftChildren = true;
            element.availableToAddRightChildren = true;
        }
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }
}
