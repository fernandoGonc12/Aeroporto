package application;

import java.util.Calendar;

public abstract class Horario {
	public static Calendar novo_DataHora(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, dia);
		calendario.set(Calendar.MONTH, mes-1);
		calendario.set(Calendar.YEAR, ano);
		
		calendario.set(Calendar.HOUR_OF_DAY, hora);
		calendario.set(Calendar.MINUTE, minuto);
		calendario.set(Calendar.SECOND, segundo);
		return calendario;
	}
}
