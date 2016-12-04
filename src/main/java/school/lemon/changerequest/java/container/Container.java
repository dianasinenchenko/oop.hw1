package school.lemon.changerequest.java.container;

public interface Container {

    int INITIAL_ARRAY_SIZE = 10;

    /**
     * Get current size of container
     * @return current size of container
     */
    int size();

    /**
     * Clear container
     */
    void clear();

    /**
     * Get element by {@code index}
     * @param index of the element
     * @return element at specified {@code index} or {@code null} in case {@code index < 0 || index >= size}
     */
    Integer get(int index);

    /**
     * Add element at the end of container
     * @param element to add
     */
    void add(int element);

    /**
     * Add element at specified {@code index} of container
     * In case {@code index < 0 || index > size} - do not add element.
     * @param element to add
     * @param index of the element
     * @return true if element was successfully added, otherwise - false.
     */
    boolean add(int element, int index);

    /**
     * Removes element in specified index
     * @param index of the element
     * @return true if element was successfully deleted, otherwise - false.
     */
    boolean remove(int index);

}
