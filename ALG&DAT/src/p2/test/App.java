package p2.test;

public class App {
	public static void testQueue() {
		System.out.println("Test Queue");
		Queue queue = new Queue();
		int[] array = { 8, 7, 6, 5, 4, 3, 2, 1 };
		for(int i=0;i<array.length;i++) {
			
			queue.enqueue(array[i]);
			System.out.println("Added: "+array[i]);
			i++;
			queue.enqueue(array[i]);
			System.out.println("Added: "+array[i]);
			System.out.println("now Accessible :" +queue.front());
			System.out.println("To be removed: "+ queue.front());
			queue.dequeue();
			System.out.println("now Accessible :" +queue.front());
		}
		System.out.println("bleibende Element: ");
		while(!queue.isEmpty()) {
			System.out.print(queue.front()+" ");
			queue.dequeue();
		}
		}
		
		
		public static void testStack() {
			System.out.println("Test Stack");
			Stack stack = new Stack();
			int[] array = { 8, 7, 6, 5, 4, 3, 2, 1 };
			for(int i=0;i<array.length;i++) {
				
				stack.push(array[i]);
				System.out.println("Added: "+array[i]);
				i++;
				stack.push(array[i]);
				System.out.println("Added: "+array[i]);
				System.out.println("now Accessible :" +stack.top());
				System.out.println("To be removed: "+ stack.top());
				stack.pop();
				System.out.println("now Accessible :" +stack.top());
				System.out.println();
			}
			System.out.print("bleibende Element: ");
			while(!stack.isEmpty()) {
				System.out.print(stack.top()+" ");
				stack.pop();
	}}

	public static void main(String args[]) {
		testQueue();
		//testStack();
	}
}
