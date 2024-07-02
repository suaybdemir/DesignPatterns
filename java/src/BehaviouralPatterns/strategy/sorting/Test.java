package BehaviouralPatterns.strategy.sorting;


public class Test {
	private static SortingContext context = new SortingContext();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array  = ArrayCreator.createArray(900000);
		context.sortDouble(array);
		
		array = ArrayCreator.createArray(99);
		context.sortDouble(array);
		
		array = ArrayCreator.createArray(10000000);
		context.sortDouble(array);
	}

}
