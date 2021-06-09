package CLASSES;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class fecha {
	
	private int dia;
	private int mes;
	private int anyo;
	private String fecha;
	
	public fecha (String date, config config) {
		String [] datearray = new String [3];
		switch (config.getDate()) {
			case "dd/mm/yyyy":
				datearray = date.split("/");
				this.dia=Integer.parseInt(datearray [0]);
				this.mes=Integer.parseInt(datearray [1]);
				this.anyo=Integer.parseInt(datearray [2]);
				this.fecha=dia+"/"+mes+"/"+anyo;
				break;
			
			case "dd-mm-yyyy":
				datearray = date.split("-");
				this.dia=Integer.parseInt(datearray [0]);
				this.mes=Integer.parseInt(datearray [1]);
				this.anyo=Integer.parseInt(datearray [2]);
				this.fecha=dia+"/"+mes+"/"+anyo;
				break;
			
			case "yyyy/mm/dd":
				datearray = date.split("/");
				this.dia=Integer.parseInt(datearray [2]);
				this.mes=Integer.parseInt(datearray [1]);
				this.anyo=Integer.parseInt(datearray [0]);
				this.fecha=dia+"/"+mes+"/"+anyo;
				break;
				
			case "yyyy-mm-dd":
				datearray = date.split("-");
				this.dia=Integer.parseInt(datearray [2]);
				this.mes=Integer.parseInt(datearray [1]);
				this.anyo=Integer.parseInt(datearray [0]);
				this.fecha=dia+"/"+mes+"/"+anyo;
				break;
		}	
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha,config config) {
	
		String [] datearray = new String [3];
		switch (config.getDate()) {
			case "dd/mm/yyyy":
				datearray = fecha.split("/");
				this.dia=Integer.parseInt(datearray [0]);
				this.mes=Integer.parseInt(datearray [1]);
				this.anyo=Integer.parseInt(datearray [2]);
				this.fecha=dia+"/"+mes+"/"+anyo;
				break;
			
			case "dd-mm-yyyy":
				datearray = fecha.split("-");
				this.dia=Integer.parseInt(datearray [0]);
				this.mes=Integer.parseInt(datearray [1]);
				this.anyo=Integer.parseInt(datearray [2]);
				this.fecha=dia+"/"+mes+"/"+anyo;
				break;
			
			case "yyyy/mm/dd":
				datearray = fecha.split("/");
				this.dia=Integer.parseInt(datearray [2]);
				this.mes=Integer.parseInt(datearray [1]);
				this.anyo=Integer.parseInt(datearray [0]);
				this.fecha=dia+"/"+mes+"/"+anyo;
				break;
			case "yyyy-mm-dd":
				datearray = fecha.split("-");
				this.dia=Integer.parseInt(datearray [2]);
				this.mes=Integer.parseInt(datearray [1]);
				this.anyo=Integer.parseInt(datearray [0]);
				this.fecha=dia+"/"+mes+"/"+anyo;
				break;
		}
	}
	
	
	public fecha(String introducir_fecha) {

		String[] SplitArray = null;
		SplitArray = introducir_fecha.split("/");

		this.dia = Integer.parseInt(SplitArray[0]);
		this.mes = Integer.parseInt(SplitArray[1]);
		this.anyo = Integer.parseInt(SplitArray[2]);

		this.fecha = introducir_fecha;

	}

	public Calendar String_to_Calendar(String fecha) {

		Date fecha_Date = new Date();
		Calendar fecha_Calendar = new GregorianCalendar();
		try {
			fecha_Date = formato.parse(fecha);
			fecha_Calendar.setTime(fecha_Date);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return fecha_Calendar;
	}

	public String Calendar_to_String() {

		Calendar calen = Calendar.getInstance();
		return (calen.getTime()).toString();
	}

	public int anyoactual() {

		Calendar fecha = new GregorianCalendar();
		int anyo = fecha.get(Calendar.YEAR);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		int mes = fecha.get(Calendar.MONTH);
		return anyo;

	}

	public int Restar_Fechas_Actual() {

		int diferencia, anyo1, anyosistema;
		Calendar calendar_1 = new GregorianCalendar();

		calendar_1 = (String_to_Calendar(fecha));

		anyo1 = calendar_1.get(Calendar.YEAR);
		anyosistema = this.anyoactual();
		diferencia = anyosistema - anyo1;

		return diferencia;

	}

	public int resta_2_fechas(fecha fecha_2) {

		int result = 0;
		int anyo1;
		int anyo2;
		int mes1;
		int mes2;
		int dia1;
		int dia2;
		Calendar fecha_in = this.String_to_Calendar(this.fecha);
		Calendar fecha_fi = fecha_2.String_to_Calendar(fecha_2.toString());

		anyo1 = fecha_in.get(Calendar.YEAR);
		anyo2 = fecha_fi.get(Calendar.YEAR);

		mes1 = fecha_in.get(Calendar.MONTH + 1);
		mes2 = fecha_fi.get(Calendar.MONTH + 1);

		dia1 = fecha_in.get(Calendar.DAY_OF_MONTH);
		dia2 = fecha_fi.get(Calendar.DAY_OF_MONTH);

		if (dia1 < dia2)
			result = dia2 - dia1;
		else
			result = dia1 - dia2;

		return (result);
		// restamos dias, nos da la diferencia, que es lo que nos interesa

	}

	public int comparar_fechas(fecha fecha_2) {

		Calendar calen1 = this.String_to_Calendar(this.fecha);
		Calendar calen2 = this.String_to_Calendar(fecha_2.toString());

		if (calen1.before(calen2))
			return -1;
		else if (calen1.after(calen2))
			return 1;
		else
			return 1;

	}
	
	public int comparar_tres_fechas(fecha fecha_1,fecha fecha_2) { // comprovem que una fecha, estiga entre dos feches

		Calendar calen1 = this.String_to_Calendar(this.fecha);
		
		Calendar calen2 = this.String_to_Calendar(fecha_1.toString()); //fecha entrada room

		Calendar calen4 = this.String_to_Calendar(fecha_2.toString()); // fecha salida room

		if ( (calen1.before(calen4)) &&  (calen1.after(calen2)) ) {
			return 1;
		}else {
			return -1;
		}
	}

	public boolean comparar_fechassistema(fecha fecha_2) {

		Calendar calen1 = this.String_to_Calendar(this.fecha);
		Calendar calen2 = Calendar.getInstance();

		if (calen1.before(calen2))
			return false;
		else if (calen1.after(calen2))
			return true;
		else
			return false;

	}

	public boolean validar_fecha() {

		boolean valida = false;
		String[] fechaArray = null;
		fechaArray = this.fecha.split("/");

		dia = Integer.parseInt(fechaArray[0]);
		mes = Integer.parseInt(fechaArray[1]);
		anyo = Integer.parseInt(fechaArray[2]);

		if ((anyo >= 2020) && (anyo < 2040)) {

			if ((mes >= 1) && (mes <= 12)) {

				switch (mes) {

				case 1: // Enero
					if ((dia > 0) && (dia <= 31))
						valida = true;
					break;
				case 2: // Febrero

					if ((((anyo % 100 == 0) && (anyo % 400 == 0)) || ((anyo % 100 != 0) && (anyo % 4 == 0)))
							&& (dia > 0) && (dia <= 29))
						valida = true; // Año Bisiesto
					else if ((dia > 0) && (dia <= 28))
						valida = true;
					break;
				case 3: // Marzo
					if ((dia > 0) && (dia <= 31))
						valida = true;
					break;
				case 4: // Abril
					if ((dia > 0) && (dia <= 30))
						valida = true;
					break;
				case 5: // Mayo
					if ((dia > 0) && (dia <= 31))
						valida = true;
					break;
				case 6: // Junio
					if ((dia > 0) && (dia <= 30))
						valida = true;
					break;
				case 7: // Julio
					if ((dia > 0) && (dia <= 31))
						valida = true;
					break;
				case 8: // Agosto
					if ((dia > 0) && (dia <= 31))
						valida = true;
					break;
				case 9: // Septiembre
					if ((dia > 0) && (dia <= 30))
						valida = true;
					break;
				case 10: // Octubre
					if ((dia > 0) && (dia <= 31))
						valida = true;
					break;
				case 11: // Noviembre
					if ((dia > 0) && (dia <= 30))
						valida = true;
					break;
				case 12: // Diciembre

					if ((dia > 0) && (dia <= 31))
						valida = true;
					break;

				default:
					valida = false;
				}
			} else
				valida = false;
		} else {
			valida = false;

		}
		return valida;
	}

// toString
	public String toString (config configuration) {
		String cad = "";
		switch (configuration.getDate()) {
			case "dd/mm/yyyy":
				cad = (this.getDia() + "/" + this.getMes() + "/" + this.getAnyo());
				break;
			case "dd-mm-yyyy":
				cad = (this.getDia() + "-" + this.getMes() + "-" + this.getAnyo());
				break;
			case "yyyy/mm/dd":
				cad = (this.getAnyo() + "/" + this.getMes() + "/" + this.getDia());
				break;
			case "yyyy-mm-dd":
				cad = (this.getAnyo() + "-" + this.getMes() + "-" + this.getDia());
				break;
		}
		return cad;
	}


}
