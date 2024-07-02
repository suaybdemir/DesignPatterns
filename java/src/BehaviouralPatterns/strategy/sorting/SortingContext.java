package BehaviouralPatterns.strategy.sorting;

public class SortingContext {

	private Sorter bubbleSorter = new BubbleSorter();
	private Sorter quickSorter = new QuickSorter();
	private Sorter javaSorter = new JavaSorter();
	
	public void sortDouble(double[] list)
	{
		int size = list.length;
		
		if(size < 100)
		{
			bubbleSorter.sort(list);
		}
		else if(size < 100000000)
		{
			quickSorter.sort(list);
		}
		else
		{
			javaSorter.sort(list);
		}
	}
}
