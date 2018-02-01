import java.util.StringTokenizer;

public class DividirStrings {

	public void conTokenizer (String cadena) {
		StringTokenizer str;
		str = new StringTokenizer(cadena);
		System.out.println("la cadena str tiene " + str.countTokens() + " elementos");
		while (str.hasMoreTokens())
			System.out.print(str.nextToken() + " ");
		System.out.println("");
	}
	
	public void conSplit (String cadena) {
		String [] str = cadena.split(" ");
		System.out.println("la cadena str tiene " + str.length + " elementos");
		for (int i = 0; i < str.length; i++) 
			System.out.print(str[i] + " ");
		System.out.println("");
	}
	
	public static void main(String[] args) {
		//Inicialización
		String miEjemplo = "Uno dos tres perico de los_palotes";
		DividirStrings programa = new DividirStrings();
		
		//Método 1: Con String Tokenizer
		programa.conTokenizer(miEjemplo);
		System.out.println();
		
		//Método 2: Con Split
		programa.conSplit(miEjemplo);
	}
}
