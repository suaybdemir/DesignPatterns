package BehaviouralPatterns.strategy.sorting;

public class BubbleSorter implements Sorter {

	public void sort(double[] list)
	{
		System.out.println("Using BubbleSort!");
		double temp;
		int counter, index;
		int length = list.length;

		for (counter = 0; counter < length - 1; counter++) {
			for (index = 0; index < length - 1 - counter; index++) {
				if (list[index] > list[index + 1]) {
					temp = list[index];
					list[index] = list[index + 1];
					list[index + 1] = temp;
				}
			}
		}
	}
	
}
