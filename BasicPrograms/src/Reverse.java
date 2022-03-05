
public class Reverse {

	
	public static void main(String[] args) {
		int num =87654, reverse =0;
		while(num!=0) { 
			int remainder = num%10; //87654%10 = 4  //8765%10 = 5 //876%10 = 6 //87%10 =7 //8%10 = 8 
			reverse = reverse*10 + remainder; //4 // 40 + 5 = 45 // 450+ 6 =456 //4560+7 =4567 //45670+8 = 45678
			num = num/10; //87654/10 = 8765 //8765/10 = 876 // 876/10 = 87 //87/10 =8 //8/10 = 0
		}

	}

}
