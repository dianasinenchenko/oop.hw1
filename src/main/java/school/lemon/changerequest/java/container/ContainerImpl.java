package school.lemon.changerequest.java.container;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.util.Arrays;

public class ContainerImpl implements Container {
    private int arr[];
    private int size;

    public ContainerImpl(int arr[]) {
        this.arr = new int[Container.INITIAL_ARRAY_SIZE];
        this.size = 0;

    }

    private void CheckSize() {
        if (size == arr.length) {
            int[] newArr = new int[arr.length * 10];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
    }


    @Override
    public int size() {
        return size;// 
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return arr[index];
    }

    @Override
    public void add(int element) {
        CheckSize();
        arr[size++] = element;
    }

    @Override
    public boolean add(int element, int index) {
        if (index < 0 || index > size) return false;
        CheckSize();
        System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = element;
        ++size;
        return true;
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= size) return false;
        System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        --size;
        return true;
    }
}
