package stack;

public class DynamicArray<T> {
    private int capasity = 10;
    private T[] arr =(T[]) new Object[capasity];

    private void resize(){
        capasity *= 2;
        T[] tmp = (T[]) new Object[capasity];
        System.arraycopy(arr, 0, tmp, 0, capasity);
        arr = tmp;
        tmp = null;
    }

    public void add(int index ,T value ){
        if(index > capasity){
            resize();
        }
        arr[index] = value;
    }

    public T get(int index){
        if(index < -1 || index > capasity){
            throw new IndexOutOfBoundsException("Not fund " + index);
        }
        return (T) arr[index];
    }
}
