
public class ArrayListUsingStack<T> {
    private DynamicArray<T> arr = new DynamicArray<>();
    private int currentIndex = -1;

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        if(currentIndex == -1) {
            return "";
        }
        for (int i = 0; i <= currentIndex; i++) {
            res.append(arr.get(i));
        }
        return new String(res) ;
    }

    @Override
    public int hashCode() {
        if(currentIndex == -1) return super.hashCode();
        final int prime = 31;
        int result = 1;
        for (int i = 0; i <= currentIndex; i++) {
            result = prime * result + ((arr.get(i) == null ) ? 0 : arr.get(i).hashCode());      
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if( ! (obj instanceof ArrayListUsingStack) ){
            return false;
        }
        ArrayListUsingStack o = (ArrayListUsingStack) obj;
        if(currentIndex != o.capasity()){
            return false;
        }
        if(currentIndex == -1) {
            return true;
        }
        for (int i = 0; i <= currentIndex; i++) {
            if( ! arr.get(i).equals(o.pop())){
                return false;
            }
        }
        return true;
    }

    public int capasity(){
        return currentIndex;
    }

    public void push(T ob){
        if(currentIndex == 10 ){
            System.out.println(" not faund");
            return;
        }
        arr.add(++currentIndex, ob);
    }

    public T pop() {
        if(currentIndex == -1 ){
            System.out.println(" not faund");
            throw new RuntimeException("Stack is empty");
        }
        return arr.get(currentIndex--);
    }




}
