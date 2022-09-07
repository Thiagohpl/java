package Fundamentos;

public class ConvTipoPimitNumerico {

	public static void main(String[] args) {
		
		double a = 1; // Inplícita
		System.out.println(a);
		
		float b = (float) 1.14424525555224; // explícito (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // explícito (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; // explícito (CAST)
		System.out.println(f);
	}
}
