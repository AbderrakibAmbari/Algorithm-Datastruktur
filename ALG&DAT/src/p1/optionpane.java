package p1;

import javax.swing.JOptionPane;

public class optionpane {
	public static void main (String args[]) {
		
		String input =JOptionPane.showInputDialog("Enter the number please :");
		int [] numbers = convertStringTointArray(input);
		JOptionPane.showMessageDialog(null, numbers);
		
	}

	private static int[] convertStringTointArray(String input) {
		String [] numberString = input.split("\\s+");
		int [] numbers = new int [numberString.length];
		
		for(int i=0;i<numberString.length;i++) {
			numbers[i]=Integer.parseInt(numberString[i]);
		}
		return numbers;
	}
}
