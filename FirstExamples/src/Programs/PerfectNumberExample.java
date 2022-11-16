package Programs;

public class PerfectNumberExample {
	
	
	
	public void pertfectNumber(int number)
	{
		int factors=0;
		
		if(number>0) {
		
			for (int i=1;i<number;i++)
			{
				if(number%i ==0)
				{
					factors = factors+i;
					//System.out.println(i);
				}
				
			}
			
		
		if(number==factors)
			System.out.println("Number is postive");
		else
			System.out.println("Number is not postive");
			
		}else
		
		System.out.println("Enter non zero number");
	}

	public static void main(String[] args) {
		
		PerfectNumberExample pnObject = new PerfectNumberExample();
		pnObject.pertfectNumber(30);
	}
}
