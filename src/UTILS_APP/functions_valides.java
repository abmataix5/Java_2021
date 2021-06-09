package UTILS_APP;

import javax.swing.JOptionPane;

public class functions_valides {

//...................FUNCIO VALIDA INT................//
	public static int valida_int(String message, String title) {
		int num = 0;
		String cadena;
		boolean correcto = true;
		do {
			try {
				cadena = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				if (cadena == null) {
					JOptionPane.showMessageDialog(null, "Closing the application", "Closing",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);// al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la
									// ejecución
				} else {
					num = Integer.parseInt(cadena);
					correcto = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You haven't entered a number", "Error", JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}
			// end-do
		} while (correcto == false);

		return num;

	}

//...............FUNCIO VALIDA FLOAT........//

	public static float valida_float(String message, String title) {

		float decimal = 0.0f;
		String s;
		boolean correcto = true;

		do {
			try {
				s = JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
				if (s == null) {
					JOptionPane.showMessageDialog(null, "Closing the application", "Closing",
							JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);// al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la
									// ejecución
				} else {
					decimal = Float.parseFloat(s);
					correcto = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "\r\n" + "You have not entered a number", "Error",
						JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}
		} while (correcto == false);

		return decimal;

	}
	
	
	//.............FUNCIÓ VALIDATE STRING........//
		
	public static String valida_string (String text, String desc) {
			boolean correct = true;
			String value = "";
			do{
				try{
					value=JOptionPane.showInputDialog(null,text,desc,JOptionPane.QUESTION_MESSAGE);
				
					if(value==null){
						JOptionPane.showMessageDialog(null, "out of the program","program out",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}
					if (value.equals("")) {
						System.out.println("value enter in the if");
						correct=false;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Write a charapter pls", "Error",JOptionPane.ERROR_MESSAGE);
					correct=false;
				}
			}while(correct==false);
			return value;
		}
	
	
	

}