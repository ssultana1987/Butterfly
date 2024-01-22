package java1_practice;

public class conditions_if_and_ifElse {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 300;
		if (a>b) {// print code which one is true, if first condition is false then else if condition will print 
			System.out.println("good");	//if that one is true other then that else code will print
		}
		 else if(c<b) {
			System.out.println("Happy");
		}
		else {
			System.out.println("bad");
		}
	}

}
