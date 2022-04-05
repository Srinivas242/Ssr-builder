package Dell;

class abc{
	int i= 24;
	int j=55;
}
class xyz extends abc{
	int  k=34;
	int m=77;
}

public class Laptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
abc a=new abc();
System.out.println(a.i);
System.out.println(a.j);
xyz x= new xyz();
System.out.println(x.k);
System.out.println(x.m);

abc a1=new xyz();

System.out.println(a1.i);
System.out.println(a1.j);

	}

}
