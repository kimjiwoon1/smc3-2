interface P_Interface{	//부모인터페이스
	public void test1();	
}
//부모인터페이스를 상속받는 자식인터페이스 생성
interface C_interface extends P_Interface{
	public void test2();
}
class Parent implements P_Interface{ //클래스 생성(인터페이스를 적용)
	public void test1(){
		System.out.println("부모 인터페이스 메소드1");
	}
}
class Child implements P_Interface{ //클래스 생성(인터페이스를 적용)
	public void test1(){
		System.out.println("부모 인터페이스 메소드2");
	}
	public void test2(){
		System.out.println("자식 인터페이스 메소드1");
	}
}
public class interFaceExam {
	public static void main(String args[]){
		Parent p = new Parent();
		p.test1();
		Child c = new Child();
		c.test1();
		c.test2();
	}
}