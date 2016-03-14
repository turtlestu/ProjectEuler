import java.util.ArrayList;


public class _10001stPrime {

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
		while(count<10002){
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
					System.out.println("C");
					primes.add(num);
					count++;
					System.out.println("add a prime "+num);
				}
			}//test each primes 
			
			//for(int i : primes)
				//System.out.println("primes:"+i+",");
			num++;
		}//while
		System.out.println("There are " + primes.size() + " primes.");
	}

}
