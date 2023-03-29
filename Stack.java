
public class Stack{
        private int[] arr = new int[10];
        private int currentIndex = -1;

        public int capasity(){
            return currentIndex;
        }

        public void push(int ob){
            if(currentIndex == 10 ){
                System.out.println(" not faund");
                return;
            }
            arr[ ++currentIndex ] = ob;
        }

        public int pop() {
            if(currentIndex == -1 ){
                System.out.println(" not faund");
                throw new StackOverflowError();
                // return -1;
            }
            return arr[ currentIndex-- ];
        }
    
}