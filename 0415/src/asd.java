import java.util.Scanner;

public class asd { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("[1: ���� 2:���� 3:��]");

		int user = sc.nextInt(); 
		int com = (int) (Math.random() * 3 + 1 - 1) + 1; 
		game(user, com); 
		} 
	
	public static void game(int user, int com) { 
		String users = null;
		switch (user) { 
		case 1:
			users = "����!"; 
		break; 
		case 2: 
			users = "����!"; 
			break; 
			case 3: 
				users = "���ڱ�!";
				break; 
				} 
		String coms = null; 
				switch (com) { 
				case 1: coms = "����!"; 
				break; 
				case 2: 
					coms = "����!"; 
					break; 
					case 3: coms = "���ڱ�!"; 
					break; 
					} 
				System.out.println("-------- ���� ���� �� !----------"); 
				System.out.printf("[��: %s] VS [��ǻ��: %s]\n", users, coms); 
				if ((com == 1 && user == 1) || (com == 2 && user == 2) || (com == 3 && user == 3)) { 
					
					System.out.println("���º�..."); 
					
					} else if ((com == 1 && user == 2) || (com == 2 && user == 3) || (com == 3 && user == 1)) { 
						
						System.out.println("�¸�!"); } else if ((com == 1 && user == 3) || (com == 2 && user == 1) || (com == 3 && user == 2)) { 
							
							System.out.println("�й�");
							} 
				} 
	
	}

