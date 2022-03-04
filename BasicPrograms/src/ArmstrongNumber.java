import java.lang.*;
public class ArmstrongNumber {
  
	static boolean armstrong(int num) {
		int temp=0,count=0,last=0;
		double sum=0;
		temp=num;
	
		while(temp>0) {
			temp =temp/10;    //1534/10 = 153    // 153/10 = 15  // 15/10 = 1  //1/10 =0
			count++;          //1     // 2   //3  //4
			
		}
		temp = num;
		while(temp>0) {
			last =temp%10; //1534%10 = 4   //153%10 = 3 //15%10 =5 //1%10 = 1
			sum = sum+ Math.pow(last,count); // 0+ 4^4 = 0+256 = 256 //256+ 3^4 = 256+81 = 337 // 337 + 5^4 = 962 // 962 + 1^4 = 963
			temp=temp/10; //1534/10 =153 //153/10 =15 // 15/10 = 1 // 1/10 = 0
		}
		if(num==sum) {
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		int num =407;
		System.out.println("The number is "+ num);
		if(armstrong(num)) {
			System.out.println(num + " is Armstrong number");
		}
		else {
			System.out.println(num +" is not Armstrong number");
		}
		
		
	}

}
