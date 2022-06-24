package Target;



public class Teste5 {
	public static void main(String[] args) {
		
		String inicio = "Hello Word";
		String invertida = reverso (inicio);
		System.out.println(invertida);
	
	}
	
	public static String reverso(String a) {
		String reverso= "";
		for(int  i = a.length() -1; 0<= i; i --) {
			reverso +=a.charAt(i);
		}
		return reverso;
	}

}
