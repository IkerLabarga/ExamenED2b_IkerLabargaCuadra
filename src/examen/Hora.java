package examen;

/**
 *
 * @author dam107
 * @version 1.0
 * 
 */

public class Hora {
	/**
	 * @param horaValida Booleano para validar la fecha
	 */
	public static boolean horaValida;
	
	/**
	 * Metodo que devuelve si una hora del dia es válida o no (Boolean)
	 * @param segundos Segundos de el minuto (int)
	 * @param minutos Minutos de la hora (int)
	 * @param horas Hora del día (int)
	 * @return Devuelve el parametro horaValida que dice si la hora es válida(True)
	 *         o no válida(False).
	 */
	
	public static boolean validarHora(int segundos, int minutos, int horas) {
		horaValida = true;
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (segundos > 59) {
				horaValida = false;
			}
		} else {
			horaValida = false;
		}
		return horaValida;
	}

}
