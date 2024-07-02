package BehaviouralPatterns.strategy.sorting;

import java.util.Arrays;

public class JavaSorter implements Sorter {
	
	@Override
	public void sort(double[] array)
	{
		System.out.println("Using JavaSorter!");
		Arrays.sort(array);
	}

}
