interface P_Interface{	//�θ��������̽�
	public void test1();	
}
//�θ��������̽��� ��ӹ޴� �ڽ��������̽� ����
interface C_interface extends P_Interface{
	public void test2();
}
class Parent implements P_Interface{ //Ŭ���� ����(�������̽��� ����)
	public void test1(){
		System.out.println("�θ� �������̽� �޼ҵ�1");
	}
}
class Child implements P_Interface{ //Ŭ���� ����(�������̽��� ����)
	public void test1(){
		System.out.println("�θ� �������̽� �޼ҵ�2");
	}
	public void test2(){
		System.out.println("�ڽ� �������̽� �޼ҵ�1");
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