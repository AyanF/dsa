import java.util.Scanner;

class Factorial{

//func(5)
//if 0 return 1
//ans=5*func(5-1) => ans = 4*func(4-1) return 24 ==> ans = 3*func(3-1) return 6 ==> ans = 2*fucn(2-1) return 2 ==> ans = 1*func(1-1) return 1 ==> func(0) return 1; 
//1*2*3*4*5

static int factorialcalc(int num){

if(num==0){return 1; }
else{
int ans = num*(factorialcalc(num-1));
return (ans);

}

}

public static void main(String... args){

  System.out.println("Enter number to find factorial");

 Scanner scanner = new Scanner(System.in);  
	int num = scanner.nextInt();
	int res = factorialcalc(num);

  System.out.println("Answer is "+res);

}


}
