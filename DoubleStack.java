import java.util.*;

class DoubleStack 
{
	static int []a = new int [6];
	static int top1=-1 ;
	static int top2= a.length;
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Java Stack!");
		while(true){
			System.out.println("1) Push1. 2) push2. 3)Display. 4) Pop1. 5) Pop2. ");
			int  i = sc.nextInt();
			switch(i){
			case 1 : push1();break;
			case 2 : push2();break;
			case 3 : display();break;
			case 4 : pop1();break;
			case 5 : pop2();break;
			default : System.exit(5);break;
			}//switch
		
		}//while(true)


	}//main
	public static void push1(){
		if(top1 == top2-1){
		System.out.println("Stack1 is full");
		}//if(top1 ==top2-1)
		else{
			System.out.println("Enter the element for stack 1 of push 1");
			int b  = sc.nextInt();
			a[++top1] = b;
		}
	}//push1()


	public static void push2(){
	if(top2 == top1+1){
		System.out.println("Stack 2 is full");
	}//if(top2 == top1+1)
	else{
		System.out.println("Enter the element for stack 2 of push 2");
		int j = sc.nextInt();
		a[--top2] = j;
	
		}//else
	}//push2

	public static void display(){
		int i =0;
		if(top1 == -1 ){
			System.out.println("stack 1 is empty");
		}//if(top1 == -1 )
		else{
		i=top1;
			while(i>=0){//3 2 1-->assume your top1 is at 3position for that itrative 
				System.out.print(a[i--]+" ");//----> 3 2 1 0
			}//while(i<=0)
		}//else

		if(top2 == a.length){
			System.out.println("stack 2 is empty");
		}//if(top2 == a.length)
		else{
				
			i = top2;//---> assumed that after the inserting your top2 at the 4 positon for that incretment the value of the top
			while(i < a.length){
				System.out.print(a[i++]+" ");

			}//while(i>a.lenght)

		}//else

	
	}//display

	public static  void pop1(){
		if(top1 == -1 ){
		System.out.println("Stack 1 is empty for pop1");
		}//if(top1 ==-1 )
		
		else{
		System.out.println(a[top1++]);
		}//else
		
		
	}//pop1

	public static  void pop2(){
		if(top2 == a.length){
			System.out.println("stack 2 is empty for pop2");		
		}//if(top == a.length)
		else{
			System.out.println(a[top2--]);
		}//else
		
	}//pop2


}//class 
/*

top1-->-1 0 1 2 3 4 5 6-->top2 
++top1 --> -1+1 = 0 
top1 = 0.....
what if top full for that top2 will be the next than top will be full
10 20 30 40 50 60

*/