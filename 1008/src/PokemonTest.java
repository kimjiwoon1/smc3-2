class Pokemon {
	String PokeName;
	int legs;
	String skill;
	public void showInformation(){		//�Լ�
		System.out.println("�̸� : " + PokeName + " �ٸ� ���� : " + legs + " ��� : " + skill);
	}
	public Pokemon(){					//�⺻������
	}
	public Pokemon(String PokeName, int legs, String skill){
		this.PokeName = PokeName;
		this.legs = legs;
		this.skill = skill;
	}
}
public class PokemonTest{
	public static void main(String args[]){
		Pokemon x = new Pokemon();
		Pokemon y = new Pokemon("���̸�", 4, "��");
		x.PokeName = "��ī��";
		x.legs = 4;
		x.skill = "����";
		
		System.out.println("�̸� : " + x.PokeName + " �ٸ� ���� : " + x.legs + " ��� : " + x.skill);
		
		y.showInformation();
	}
}