public class ComparisonOperators {
	public static void main(String[] args){
		int weightProducts = 1000;
		int limitLoadWeight = 1000;
		
		boolean exceedLoad = weightProducts > limitLoadWeight;
		System.out.printf("Load exceeded: %b%n", exceedLoad);
		
		//boolean releasedLoad = weightProducts <= limitLoadWeight;
		boolean releasedLoad = limitLoadWeight >=  weightProducts;
		System.out.printf("load released: %b%n",releasedLoad);
		
		
		
		
		
	
	}
}
