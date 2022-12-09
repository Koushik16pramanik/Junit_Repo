package Com.Demo.Main;

public class Junit_Demo1 {
	public static int max(int[] koushik) {
		int max= 0; // or  // int max= koushik[0];
	//	 int max= Integer.MIN_VALUE;
		for(int i=1; i<koushik.length; i++) {
			if(max<=koushik[i]) {
				max= koushik[i];
			}
			System.out.println("Max : "+max);
		}
		return max;
	}
	 public Boolean validate(final Integer primeNumber) {
		    for (int i = 2; i < (primeNumber / 2); i++) {
		      if (primeNumber % i == 0) {
		        return false;
		      }
		    }
		    return true;
		  }
}
