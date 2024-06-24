package DataStructure;
//co 2 cach de implement mot stack
// cach 1 : array
//cach 2: linkedlist

interface IStack{
    void push(int value);
    void pop();
    int peek();
    int size();
    boolean isEmpty();
    int search(int value);
    void print();
}
public class Stack implements IStack {

    private int top;
   private int size;
  private   int[] store;
   public Stack(int _size){
        top = -1;
        size = 0;
        store = new int[_size];
    }


    @Override
    public void push(int value) {
        top++;
        store[top] = value;
    }

    @Override
    public void pop() {
       if(!isEmpty()){
           top--;

       }




    }

    @Override
    public int peek() {
       if(!isEmpty()){
           return store[top];
       }
        return 0;

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return top ==-1;
    }

    @Override
    public int search(int value) {
        return 0;
    }

    @Override
    public void print() {
        for(int i = 0; i <= top; i++) {
            System.out.print(store[i] + "-");
        }
    }
}
