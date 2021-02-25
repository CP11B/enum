package emun;

public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10 ; i++) {
			System.out.println(rps());
		}
	}
	


	public static EnumTypes rps() {
		int randomNumber = (int)(Math.random()*3);
		if (randomNumber == 0) {
			return EnumTypes.ROCK;
		} else if (randomNumber == 1) {
			return EnumTypes.PAPER;
		}	else {
			return EnumTypes.SCISSORS;
			}
		

	
	}	
}
