package Stack;

public class BasicStack<X> {
	private X[] data;
	private int stackPointer;

	public BasicStack() {
		data = (X[]) new Object[1000];
		stackPointer = 0;
	}

	public void push(X newItem) {
		data[stackPointer++] = newItem;
	}

	public X pop() {
		if (stackPointer == 0)
			throw new IllegalStateException("No more values to pop");
		return data[--stackPointer];
	}

	public boolean contains(X searchItem) {
		// TODO while over for loop
		int searchPointer = stackPointer;
		while (searchPointer > 0) {
			if (data[searchPointer] == searchItem) {
				return true;
			}
		}
		return false;
	}

	public X access(X accessItem) {
		while(stackPointer>0){
			X tempItem = pop();
			if(tempItem.equals(accessItem)){
				return tempItem;
			}
		}
		throw new IllegalArgumentException("Colud not find the item");
	}
	public int size(){
		return stackPointer;
	}
}
