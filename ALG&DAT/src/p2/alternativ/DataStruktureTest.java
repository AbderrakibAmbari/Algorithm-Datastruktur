package p2.alternativ;

public class DataStruktureTest {
	public static void testQueue() {
		System.out.println("Testing Queue");
		Queue meinQueue = new Queue();
		int[] meinArray = { 8, 7, 6, 5, 4, 3, 2, 1 };

		for (int i = 0; i < meinArray.length; i+=2) {

			meinQueue.enqueue(meinArray[i]);
			System.out.println("Added: " + meinArray[i]);

			//i++;

			meinQueue.enqueue(meinArray[i+1]);
			System.out.println("Added: " + meinArray[i+1]);
			System.out.println("now accessible: " + meinQueue.front());

			System.out.println("To be removed: " + meinQueue.front());
			meinQueue.dequeue();
			System.out.println("now accessible: " + meinQueue.front());
			System.out.println();
		}

		System.out.println("Elements in data structure in final state of data:");
		while (!meinQueue.isEmpty()) {
			System.out.print(meinQueue.front()+" ");
			meinQueue.dequeue();
		}
	}

	public static void testStack() {
		Stack stack = new Stack();
		int[] array = { 8, 7, 6, 5, 4, 3, 2, 1 };
		for(int i=0;i<array.length;i++) {
			stack.push(array[i]);
			System.out.println("Added: "+array[i]);
			
			i++;
			stack.push(array[i]);
			System.out.println("Added: "+array[i]);
			
			System.out.println("Now accessible: "+ stack.top());
			System.out.println("To be removed: " + stack.top());
			stack.pop();
			System.out.println("now accessible: " + stack.top());
			System.out.println();
		}
		System.out.println("Elements in data structure in final state of data:");
		while(!stack.isEmpty()) {
			System.out.print(stack.top()+" ");
			stack.pop();
		}
	}

	public static void main(String args[]) {
		testQueue();
		//testStack();
	}
}
