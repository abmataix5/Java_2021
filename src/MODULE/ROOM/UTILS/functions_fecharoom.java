package MODULE.ROOM.UTILS;

import javax.swing.JOptionPane;

import CLASSES.fecha;


public class functions_fecharoom {
	
	//..............Funció per a demanar fecha inicial..........//

	public static fecha pedir_fechaini() {

		String fecha_i = "";
		boolean comprovar = false;
		fecha fecha_ini = null;

		do {

			fecha_i = functions_data.pedir_fecha_E(); // Demanem una fecha i comprovem el format, ens torna la fecha ja amb la validació del format(dd/mm/aaaa)
		
				fecha_ini = new fecha(fecha_i);
				System.out.println(fecha_ini);
				comprovar = fecha_ini.validar_fecha();

				if (comprovar == false) {

					comprovar = false;
					JOptionPane.showMessageDialog(null, "No has introducido una fecha valida");
				} else {

					comprovar = fecha_ini.comparar_fechassistema(fecha_ini);

					if (comprovar == false) {
						JOptionPane.showMessageDialog(null, "No has introducido una fecha valida");

					} else
						comprovar = true;
				}

		

		} while (comprovar == false);
		return fecha_ini;

	}
	
	//...............Funció per a demanar fecha final de habitació....//
	
	
	public static fecha pedir_fechafin(fecha fini) {

		String fecha_f = "";
		boolean comprovar = false;
		fecha fecha_fin = null;
		int compara = 0;
		int num_dies = 0;

		do {

			fecha_f = functions_data.pedir_fecha_S(); // Demanem una fecha i comprovem el format, ens torna la fecha ja amb la validació del format(dd/mm/aaaa)
			

				fecha_fin = new fecha(fecha_f);
				comprovar = fecha_fin.validar_fecha();

				if (comprovar == false) {

					JOptionPane.showMessageDialog(null, "No has introducido una fecha valida");
				} else {

					compara = fecha_fin.comparar_fechas(fini);
					if (compara == -1) {
						comprovar = false;

						JOptionPane.showMessageDialog(null, "La fecha no es valida");

					} else {

						num_dies = fecha_fin.resta_2_fechas(fini);

					}
				} // end-else

				if (num_dies > 2)
					comprovar = true;

			

		} while (comprovar == false);
		return fecha_fin;
	}
	
	
	//...Funció per a actualitzar fecha inicial, la comparem amb la fecha final guardada previament, te que ser posterior a la fecha final.
	
	public static fecha update_fini(fecha ffin) {

		String fecha_i = "";
		boolean comprovar = false;
		fecha fecha_ini = null;
		int compara = 0;
		

		do {

			fecha_i = functions_data.pedir_fecha_S(); // Demanem una fecha i comprovem el format, ens torna la fecha ja amb la validació del format(dd/mm/aaaa)
			

			fecha_ini = new fecha(fecha_i);
				comprovar = fecha_ini.validar_fecha();

				if (comprovar == false) {

					JOptionPane.showMessageDialog(null, "No has introducido una fecha valida");
				} else {

					compara = fecha_ini.comparar_fechas(ffin);
					if (compara == 1) {
						comprovar = false;

						JOptionPane.showMessageDialog(null, "La nueva fecha es antes que la fecha de salida previamente seleccionada");

					} else {

						comprovar = true;

					}
				} // end-else

				

			

		} while (comprovar == false);
		return fecha_ini;
	}
	
	
//.............. Fecha show de parella, tindra que estar entre la fecha inicial i la fecha final de room..//	
	
	public static fecha fecha_show(fecha fini,fecha ffin) {

		String fecha_show = "";
		boolean comprovar = false;
		fecha fecha_s = null;
		int compara = 0;
		

		do {

			fecha_show = functions_data.pedir_fecha_SHOW(); // Demanem una fecha i comprovem el format, ens torna la fecha ja amb la validació del format(dd/mm/aaaa)
			

			fecha_s = new fecha(fecha_show);
				comprovar = fecha_s.validar_fecha();

				if (comprovar == false) {

					JOptionPane.showMessageDialog(null, "No has introducido una fecha valida");
				} else {

					compara = fecha_s.comparar_tres_fechas(fini, ffin);
					if (compara == -1) {
						comprovar = false;

						JOptionPane.showMessageDialog(null, "La fecha del show seleccionada, no esta entre el periodo de reserva de la habitación");

					} else {

						comprovar = true;

					}
				} // end-else

				

			

		} while (comprovar == false);
		return fecha_s;
	}
	
	
	public static fecha fecha_spa(fecha fini,fecha ffin) {

		String fecha_spa = "";
		boolean comprovar = false;
		fecha fecha_s = null;
		int compara = 0;
		

		do {

			fecha_spa = functions_data.pedir_fecha_spa(); // Demanem una fecha i comprovem el format, ens torna la fecha ja amb la validació del format(dd/mm/aaaa)
			

			fecha_s = new fecha(fecha_spa);
				comprovar = fecha_s.validar_fecha();

				if (comprovar == false) {

					JOptionPane.showMessageDialog(null, "No has introducido una fecha valida");
				} else {

					compara = fecha_s.comparar_tres_fechas(fini, ffin);
					if (compara == -1) {
						comprovar = false;

						JOptionPane.showMessageDialog(null, "La fecha de fin del SPA seleccionada, no esta entre el periodo de reserva de la habitación");

					} else {

						comprovar = true;

					}
				} // end-else

				

			

		} while (comprovar == false);
		return fecha_s;
	}
	
	
	public static fecha fecha_cena(fecha fini,fecha ffin) {

		String fecha_cena = "";
		boolean comprovar = false;
		fecha fecha_s = null;
		int compara = 0;
		

		do {

			fecha_cena = functions_data.pedir_fecha_CENA(); // Demanem una fecha i comprovem el format, ens torna la fecha ja amb la validació del format(dd/mm/aaaa)
			

			fecha_s = new fecha(fecha_cena);
				comprovar = fecha_s.validar_fecha();

				if (comprovar == false) {

					JOptionPane.showMessageDialog(null, "No has introducido una fecha valida");
				} else {

					compara = fecha_s.comparar_tres_fechas(fini, ffin);
					if (compara == -1) {
						comprovar = false;

						JOptionPane.showMessageDialog(null, "La fecha de la cita sorpresa seleccionada, no esta entre el periodo de reserva de la habitación");

					} else {

						comprovar = true;

					}
				} // end-else

				

			

		} while (comprovar == false);
		return fecha_s;
	}
	
	
}
