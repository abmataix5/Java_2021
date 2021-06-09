package MODULE.ROOM.UTILS;

import javax.swing.JOptionPane;


import UTILS_APP.functions_regexpre;
import UTILS_APP.functions_valides;

public class functions_data {

	
	public static String pedir_numhab() {
		boolean comprovador = false;
		String num_hab = "";

		do {

			num_hab = functions_valides.valida_string("Introduce el numero de la habitacion(Ej: 12-A)", "NUMERO DE HABITACIÓN");
			comprovador = functions_regexpre.val_numhab(num_hab);

			if (comprovador == false) {
				JOptionPane.showMessageDialog(null, "No has introducido un formato válido");
			} else
				comprovador = true;

		} while (comprovador == false);
		return num_hab;

	}
	
	

	public static String pedir_fecha_spa() {
		boolean comprovador = false;
		String fecha = "";

		do {

			fecha = functions_valides.valida_string("FECHA DE FIN DE SPA.........(Ej. (dd/mm/aaaa))", "FECHA");
			comprovador = functions_regexpre.val_fecha(fecha);

			if (comprovador == false) {
				JOptionPane.showMessageDialog(null, "No has introducido un formato válido");
			} else
				comprovador = true;

		} while (comprovador == false);
		return fecha;

	}
	
	
	public static String pedir_fecha_E() {
		boolean comprovador = false;
		String fecha = "";

		do {

			fecha = functions_valides.valida_string("FECHA DE ENTRADA.........(Ej. (dd/mm/aaaa))", "FECHA");
			comprovador = functions_regexpre.val_fecha(fecha);

			if (comprovador == false) {
				JOptionPane.showMessageDialog(null, "No has introducido un formato válido");
			} else
				comprovador = true;

		} while (comprovador == false);
		return fecha;

	}
	
	public static String pedir_fecha_S() {
		boolean comprovador = false;
		String fecha = "";

		do {

			fecha = functions_valides.valida_string("FECHA DE SALIDA.......(Ej. (dd/mm/aaaa))", "FECHA");
			comprovador = functions_regexpre.val_fecha(fecha);

			if (comprovador == false) {
				JOptionPane.showMessageDialog(null, "No has introducido un formato válido");
			} else
				comprovador = true;

		} while (comprovador == false);
		return fecha;

	}
	
	public static String pedir_fecha_SHOW() {
		boolean comprovador = false;
		String fecha = "";

		do {

			fecha = functions_valides.valida_string("FECHA DE SHOW.........(Ej. (dd/mm/aaaa))", "FECHA");
			comprovador = functions_regexpre.val_fecha(fecha);

			if (comprovador == false) {
				JOptionPane.showMessageDialog(null, "No has introducido un formato válido");
			} else
				comprovador = true;

		} while (comprovador == false);
		return fecha;

	}
	
	public static String pedir_fecha_CENA() {
		boolean comprovador = false;
		String fecha = "";

		do {

			fecha = functions_valides.valida_string("FECHA DE CENA..........(Ej. (dd/mm/aaaa))", "FECHA");
			comprovador = functions_regexpre.val_fecha(fecha);

			if (comprovador == false) {
				JOptionPane.showMessageDialog(null, "No has introducido un formato válido");
			} else
				comprovador = true;

		} while (comprovador == false);
		return fecha;

	}
	
	
	public static String pedir_type() {
		boolean comprovador = false;
		String type = "";

		do {

			type = functions_valides.valida_string("Tipo de habitacion(Suite|Doble|Single)", "TIPO HABITACIÓN");
			comprovador = functions_regexpre.val_type(type);

			if (comprovador == false) {
				JOptionPane.showMessageDialog(null, "No has introducido un formato válido");
			} else
				comprovador = true;

		} while (comprovador == false);
		return type;

	}
	
	
	public static String pedir_desayuno() {
		boolean comprovador = false;
		String desayuno = "";

		do {

			desayuno = functions_valides.valida_string("Desayuno (INCLUIDO|NO INCLUIDO)", "DESAYUNO");
			comprovador = functions_regexpre.val_desayuno(desayuno);

			if (comprovador == false) {
				JOptionPane.showMessageDialog(null, "No has introducido un formato válido");
			} else
				comprovador = true;

		} while (comprovador == false);
		return desayuno;

	}
	
	public static String pedir_minibar() {
		boolean comprovador = false;
		String minibar = "";

		do {

			minibar = functions_valides.valida_string("Minibar (Con alcohol|Sin alcohol)", "MINIBAR");
			comprovador = functions_regexpre.val_minibar(minibar);

			if (comprovador == false) {
				JOptionPane.showMessageDialog(null, "No has introducido un formato válido");
			} else
				comprovador = true;

		} while (comprovador == false);
		return minibar;

	}
	
	public static String pedir_email() {
		boolean comprovador = false;
		String email = "";

		do {

			email = functions_valides.valida_string("EMAIL :", "EMAIL");
			comprovador = functions_regexpre.val_email(email);

			if (comprovador == false) {
				JOptionPane.showMessageDialog(null, "No has introducido un email valido");
			} else
				comprovador = true;

		} while (comprovador == false);
		return email;

	}
}
