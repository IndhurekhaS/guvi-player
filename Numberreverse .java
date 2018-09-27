public class Numberreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 int reverse=0;
		 while(a!=0)
		 {
			 int b=a%10;
			 reverse=reverse*10+b;
			 a=a/10;
		 }
		 System.out.println(reverse);
		 sc.close();

	}

}
