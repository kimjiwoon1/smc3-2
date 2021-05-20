class Pokemon {
	String PokeName;
	int legs;
	String skill;
	public void showInformation(){		//함수
		System.out.println("이름 : " + PokeName + " 다리 갯수 : " + legs + " 기술 : " + skill);
	}
	public Pokemon(){					//기본생성자
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
		Pokemon y = new Pokemon("파이리", 4, "불");
		x.PokeName = "피카츄";
		x.legs = 4;
		x.skill = "전기";
		
		System.out.println("이름 : " + x.PokeName + " 다리 갯수 : " + x.legs + " 기술 : " + x.skill);
		
		y.showInformation();
	}
}