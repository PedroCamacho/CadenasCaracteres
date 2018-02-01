
public class Ejercicio {

	private char convierteLetra(int letra) {
		int rango = 'Z' - 'A' + 1;
		int siguiente = (letra - 'A') + 1;
		int siguienteCircular = siguiente % rango;
		char res = (char) (siguienteCircular + 'A');
		return res;
	}
	
	private String conviertePalabra(String palabra){
		String res = "";
		for (int i = 0; i < palabra.length(); i++) 
			res += convierteLetra(palabra.charAt(i));
		return res;
	}
	public static void main(String[] args) {
		//Entrada e inicialiación
		String frase = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
		String fraseCodificada = "";
		Ejercicio programa = new Ejercicio();
		
		//Proceso
		String[] palabras = frase.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			fraseCodificada += programa.conviertePalabra (palabras[i]);
			if (i < palabras.length - 1) 
				fraseCodificada += " ";
		}
				
		//Salida
		System.out.println(fraseCodificada);
	}

}
