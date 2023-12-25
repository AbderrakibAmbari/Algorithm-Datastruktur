package p2.withgeneratic;

public class DataStruktureTest {

	public static void testQueue() {
		System.out.println("Testing Queue");
		Queue<Integer> neueQueue = new Queue<>();
		int[] meinArray = { 8, 7, 6, 5, 4, 3, 2, 1 };
		for (int i = 0; i < meinArray.length; i++) {

			neueQueue.enqueue(meinArray[i]);
			System.out.println("Added:" + meinArray[i]);
			System.out.println("now Accessible: " + neueQueue.front());

			i++;

			neueQueue.enqueue(meinArray[i]);
			System.out.println("Added:" + meinArray[i]);
			System.out.println("now Accessible:" + neueQueue.front());

			System.out.println("To be removed: " + neueQueue.front());
			neueQueue.dequeue();

			System.out.println("now Accessible:" + neueQueue.front());
		}
		System.out.println("All Elemente:");
		while(!neueQueue.isEmpty()) {
			System.out.println(neueQueue.front());
			neueQueue.dequeue();
		}
	}

	public static void testStack() {
		System.out.println("Testing Stack");
		Stack<Integer> neueStack = new Stack<>();
		int[] meinArray = { 8, 7, 6, 5, 4, 3, 2, 1 };
		for (int i = 0; i < meinArray.length; i++) {

			neueStack.push(meinArray[i]);
			System.out.println("Added:" + meinArray[i]);
			System.out.println("now Accessible: " + neueStack.top());

			i++;

			neueStack.push(meinArray[i]);
			System.out.println("Added:" + meinArray[i]);
			System.out.println("now Accessible:" + neueStack.top());

			System.out.println("To be removed: " + neueStack.top());
			neueStack.pop();

			System.out.println("now Accessible:" + neueStack.top());
		}
		
		System.out.println("All Elemente:");
		while(!neueStack.isEmpty()) {
			System.out.println(neueStack.top());
			neueStack.pop();
		}
	}

	public static void main(String[] args) {
		 testQueue();
		//testStack();
	}

}
