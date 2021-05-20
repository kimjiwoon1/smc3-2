interface Sound{
	public void SoundUp(int level);
	public void SoundDown(int level);
}
class TV implements Sound{
	private int SndLevel;	//변수
	public TV() {			//생성자
		SndLevel = 0;
	}
	public void SoundUp(int level){
		SndLevel += level;
	}
	public void SoundDown(int level){
		SndLevel -= level;
		if(SndLevel <0) SndLevel=0;
	}
}
class Radio implements Sound{
	private int SndLevel;	//변수
	public Radio() {			//생성자
		SndLevel = 0;
	}
	public void SoundUp(int level){
		SndLevel += level;
	}
	public void SoundDown(int level){
		SndLevel -= level;
		if(SndLevel <0) SndLevel=0;
	}
}

	
class SoundExam {	
	public static void main(String[] args){
		Sound radio = new Radio();
		TV t = new TV();
		radio.SoundUp(5);
		t.SoundUp(5);
		
	}
}
