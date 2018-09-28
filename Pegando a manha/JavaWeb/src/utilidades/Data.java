package utilidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	private static Date data = new Date();
	
	public static String dataAtual() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");//dd dias, MM mes em M maiusculo se fosse minutos seria m e yyyy anos
		return formatador.format(data);
	}
	public static String horaAtual() {
		SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");//HH para ir de 00 a 23 se fosse minusculo iria de 0 a 12
		return formatador.format(data);
	}
	
}
