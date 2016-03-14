import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;


public class Large_Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Large_Sum.txt"));
			String[] s= new String[100];
		    String line = br.readLine();
			int i = 0;
			BigInteger digit = new BigInteger("0") ;//new BigInteger[100];
			//System.out.println(digit);
		    while (line != null) {
		    	try{
		    		digit=digit.add(new BigInteger(line));
		    		System.out.println("digit="+digit);
		    	}catch(NumberFormatException e){
		    		System.out.println(e.getMessage());
		    	}
		    	line = br.readLine();
		    	System.out.println("line ="+line);
		    }
		    
		    br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
