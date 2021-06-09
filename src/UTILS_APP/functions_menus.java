package UTILS_APP;

import javax.swing.JOptionPane;



public class functions_menus {
	
//...........MENU DESEA CONTINUAR...........//
	
	public static int valida_s_n(String message, String title) {
		
		int confirmado;

		confirmado = JOptionPane.showConfirmDialog(null, message);
		System.out.println(confirmado);

		return confirmado;
	}
	
	//...........MENU DESEA CONTINUAR RETURN BOOLEAN...........//
	
		public static boolean valida_boolean(String message, String title) {
			
			int confirmado;
			boolean opcion;

			confirmado = JOptionPane.showConfirmDialog(null, message);
			System.out.println(confirmado);
			
			if(confirmado == 0) {
				opcion = false;
			}else {
				opcion = true;
			}

			return opcion;
		}
	
	
//............MENU BOTONES CON OPCIONES.........//	
	
	public static int menu_botones(String[] options, String message, String title){
		int op=0;
		
		op=JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
		
		return op;
	}
	
	public static int botones(String[] tipo, String mensboton, String titlboton) {
		int op=0;
		
		op=JOptionPane.showOptionDialog(null, mensboton, titlboton, 0, JOptionPane.QUESTION_MESSAGE,null,tipo,tipo[0]);
		
		return op;
	}

//..........MENU COMBO DESPLEGABLE.............//
	
	public static String menu_combo(String title, String message) {

		String si = " SI";
		String no = "NO";

		Object seleccion1 = null;
		String result = "";

		seleccion1 = JOptionPane.showInputDialog(null, title, message, JOptionPane.QUESTION_MESSAGE, null, // null para
																											// icono
																											// defecto
				new Object[] { "SI", "NO", }, si);
		System.out.println(seleccion1.toString());

		switch (seleccion1.toString()) {
		case "SI":
			result = si;
			break;
		case "NO":
			result = no;
			break;

		}// end_case

		return result;
	}
	
	
	
	
	public static String menu_type_suite(String title, String message) {

		String suite = "SUITE";
		

		Object seleccion1 = null;
		String result = "";

		seleccion1 = JOptionPane.showInputDialog(null, title, message, JOptionPane.QUESTION_MESSAGE, null, // null para
																											// icono
																											// defecto
				new Object[] { "SUITE" }, suite);
		System.out.println(seleccion1.toString());

		switch (seleccion1.toString()) {
		case "SUITE":
			result = suite;
			break;


		}// end_case

		return result;
	}
	
	public static String menu_type_doble(String title, String message) {

		String doble = "DOBLE";
		

		Object seleccion1 = null;
		String result = "";

		seleccion1 = JOptionPane.showInputDialog(null, title, message, JOptionPane.QUESTION_MESSAGE, null, // null para
																											// icono
																											// defecto
				new Object[] { "DOBLE" }, doble);
		System.out.println(seleccion1.toString());

		switch (seleccion1.toString()) {
		case "DOBLE":
			result = doble;
			break;


		}// end_case

		return result;
	}
	
	public static String menu_type_single(String title, String message) {

		String single = "SINGLE";
		

		Object seleccion1 = null;
		String result = "";

		seleccion1 = JOptionPane.showInputDialog(null, title, message, JOptionPane.QUESTION_MESSAGE, null, // null para
																											// icono
																											// defecto
				new Object[] { "SINGLE" }, single);
		System.out.println(seleccion1.toString());

		switch (seleccion1.toString()) {
		case "SINGLE":
			result = single;
			break;


		}// end_case

		return result;
	}
	

	public static int menu_read( String message, String title){
		int op=0;
		String [] options  = {"Read All","Read One"};
		op=JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
		
		return op;
	}


	public static int menu_delete( String message, String title){
		int op=0;
		String [] options  = {"Delete One","Delete All"};
		op=JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
		
		return op;
	}
	
	
	public static int menu_USERS( String message, String title){
		int op=0;
		String [] options  = {"Read All","Read One"};
		op=JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
		
		return op;
	}
	

	public static String menu_R(String title, String message) {


		String no = "Normal";

		Object seleccion1 = null;
		String result = "";

		seleccion1 = JOptionPane.showInputDialog(null, title, message, JOptionPane.QUESTION_MESSAGE, null, // null para
																											// icono
																											// defecto
				new Object[] { "Normal", }, no);
		System.out.println(seleccion1.toString());

		switch (seleccion1.toString()) {

		case "Normal":
			result = no;
			break;

		}// end_case

		return result;
	}

	
	public static int menu_DUMMIES(String[] options, String message, String title){
		int op=0;
		
		op=JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
		
		return op;
	}
}
