
public class compare_products {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long products[]=new long[20];
		products[0]=5120962560l;
		products[1]=470292480l;
		products[2]=2400451200l;
		products[3]=7315660800l;
		products[4]=18144000l;
		products[5]=4459069440l;
		products[6]=5377010688l;
		products[7]=42336000l;
		products[8]=22404211200l;
		products[9]=2560481280l;
		products[10]=2477260800l;
		products[11]=5016453120l;
		products[12]=33443020800l;
		products[13]=18435465216l;
		products[14]=4166497440l;
		products[15]=1612431360l;
		//products[16]=;
		//products[17]=;
		//products[18]=;
		//products[19]=;
		long max = 0l;
		for(long temp : products){
			if(temp>max){
				max=temp;
			}
		}
		System.out.println("max:"+max);	
	}

}
