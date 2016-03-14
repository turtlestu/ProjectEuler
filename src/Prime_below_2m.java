import java.util.ArrayList;


public class Prime_below_2m {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		int num = 4; //start test from 3
		//whether it's prime
		//System.out.println("primes.get(1):"+primes.get(1));
		int count=2;
		long sum = 5l;
		while(num<62){
			for(int i = 0;i<primes.size();i++){
				if(num%(int)primes.get(i)==0){
					//System.out.println("A");	
					break;
				}else if(num%(int)primes.get(i)!=0 && i<primes.size()-1){
					//test next prime in primes
					//System.out.println("B");
					continue;
				}else{
					//it's a prime
					//System.out.println("C");
					sum = sum+num;
					primes.add(num);
					count++;
					System.out.println(num+",");
				}
			}//test each primes 
			
			//for(int i : primes)
				//System.out.println("primes:"+i+",");
			num++;
		}//while
		System.out.println();
		System.out.println("sum = " + sum);
		System.out.println("There are " + count + " primes.");
	}

}
