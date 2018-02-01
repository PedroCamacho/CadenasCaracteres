public class ClaseStringBuilder2 {

	public static String separarMiles(String s) {
		// creamos un StringBuilder a partir del String s
		StringBuilder aux = new StringBuilder(s);
		// le damos la vuelta
		aux.reverse();
		// variable que indica donde insertar el siguiente punto
		int posicion = 3;
		// mientras no lleguemos al final del número
		while (posicion < aux.length()) {
			// insertamos un punto en la posición
			aux.insert(posicion, '.');
			// siguiente posición donde insertar
			posicion += 4;
		}
		// le damos de nuevo la vuelta
		aux.reverse();
		// el StringBuilder se pasa a String y se devuelve
		return aux.toString();
	}
	
	/*
	 * TODO: Crear un programa que ponga los puntos de los miles
	 */
    public static void main(String[] args) {
        String s = "1234567890";      
        s = separarMiles(s);
        System.out.println(s);
    }
}
