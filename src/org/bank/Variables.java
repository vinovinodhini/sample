package org.bank;

public class Variables {
	public static int a=10;	//static variable
	public int b=20;	//instance variable
			public void diff() {
		System.out.println("static varioable :" +a);
		a++;
		System.out.println("instance variable:"+b);
		b++;
			}
}
	/*//static variables
	public static int a;
	public void stavar() {
		a=100;

	}
	public static void main(String[] args) {
		Variables vobj=new Variables();
		System.out.println("before:"+a);
vobj.stavar();
System.out.println("after:"+a);
	}
}*/
/*	//instance variable
	public int a;
	public void loccalvar() {
		 a=100;
	}
	public static void main(String[] args) {
		Variables abc=new Variables();
		System.out.println("before initialization:"+abc.a);
		abc.loccalvar();
		System.out.println("after initialization:"+abc.a);
		
		Variables abcd=new Variables();
		System.out.println("before initialization:"+abcd.a);
		abcd.loccalvar();
		System.out.println("after initialization:"+abcd.a);
	}*/

/*	//local variables
	public void locvariable() {
		int a=10;
		String s = "vino";
		System.out.println(a);
		System.out.println(s);
	}
public static void main(String[] args) {
	Variables obj=new Variables();
	obj.locvariable();
	*/

