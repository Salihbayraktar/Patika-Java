package ListeSinifiYapmak;

public class MyList<T> {

    Object[] values;
    int capacity = 10;
    int currentIndex = 0;

    public MyList() {
        values = new Object[10];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        values = new Object[capacity];
    }

    public void add(T value) {

        if (currentIndex == capacity) {
            extendValuesArray();
        }

        values[currentIndex++] = value;

    }

    public void extendValuesArray() {
        Object[] spareValues = new Object[capacity * 2];
        System.arraycopy(values, 0, spareValues, 0, capacity);
        values = spareValues;
        capacity *= 2;
    }

    public T get(int index) {

        try {
            return (T) values[index];
        } catch (Exception e) {
            return null;
        }
    }

    public void remove(int index) {

        if (index >= capacity || index < 0) {
            System.out.println("ERROR Invalid Index");
            return;
        }

        currentIndex--;

        for (int i = index; i < capacity - 1; i++) {

            values[i] = values[i + 1];

            if (values[i + 1] == null) {

                return;
            }
        }

        values[capacity - 1] = null;

    }

    public void set(int index, T data) {
        if (index < 0 || index >= capacity) {
            System.out.println("Invalid Input");
            return;
        }
        values[index] = data;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append('[');
        for (int i = 0; i < capacity; i++) {
            if (values[i] != null) {
                str.append(values[i]).append(",");
            } else {
                break;
            }
        }

        if (str.length() > 1) {
            str.replace(str.length() - 1, str.length(), "");  // for erase last comma
        }

        str.append(']');
        return str.toString();
    }

    public int indexOf(T data) {

        for (int i = 0; i < capacity; i++) {
            if (values[i] == data) {
                return i;
            }
        }
        return -1;

    }

    public int lastIndexOf(T data) {
        for (int i = capacity - 1; i >= 0; i--) {
            if (values[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public T[] toArray() {
        return (T[]) values;
    }

    public boolean isEmpty() {
        return values[0] == null;
    }

    public int getCapacity() {
        return capacity;
    }

    public void clear() {
        currentIndex = 0;

        for (int i = 0; i < capacity; i++) {
            if (values[i] != null) {
                values[i] = null;
            } else {
                return;
            }
        }
    }

    public int size() {

        int validValueCounter = 0;

        for (Object t : values) {
            if (t != null) {
                validValueCounter++;
            }
        }

        return validValueCounter;
    }

    public MyList<T> subList(int start, int finish) {
        if (start >= finish || start < 0 || finish > capacity) {
            System.out.println("ERROR Invalid input");
            return null;
        }
        MyList<T> subList = new MyList<>(finish - start);
        for (int i = start; i < finish; i++) {
            subList.add((T) values[i]);
        }

        return subList;
    }

    public boolean contains(T data) {
        for (Object value : values) {
            if (data.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
