package Fundamentos;

public class NotacaoPontos {

	public static void main(String[] args) {
				
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s.toUpperCase();
		s = s.concat("!");
		
		System.out.println(s);
		
		System.out.println("Thiago".toUpperCase());
		
		String y = "Bom dia X".replace("X", "Gui");
		System.out.println(y);
	}
}
