package MODULE.USERS.UTILS;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import MENUS.main;
import MENUS.menu_normal_user;



public class function_login {

	
	public static void login_user() {

		String username;
		String password;
		JPasswordField input_contra = new JPasswordField();
		Object[] botones = { "Siguiente" };
		Object[] inputs = { "Contraseña", input_contra };
		
		
		//..........Validem si el usuari existeix.....//

		do {
			username = UTILS_APP.functions_valides.valida_string("Nombre de usuario", "LOG IN");

			if (find_user.find_user_name(username) == -1)
				JOptionPane.showMessageDialog(null, "El usuario no existe");

		} while (find_user.find_user_name(username) == -1);
		
		
		//.....Validem si la contraseña es la correcta........//

		do {

			JOptionPane.showOptionDialog(null, inputs, "CONTRASEÑA", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, botones, botones);
			password = new String(input_contra.getPassword());

					if (find_user.find_user_password(find_user.find_user_name(username),
							password) == false) {
						JOptionPane.showMessageDialog(null, "La contraseña no es correcta");
					}
			
		} while (find_user.find_user_password(find_user.find_user_name(username),
				password) == false);
		
		//.......Depen de quin tipus de usuari siga, lenviem a un menú o a altre.....//
		
//		System.out.print(find_user.find_user_tipo(find_user.find_user_name(username)));
		
		if (find_user.find_user_tipo(find_user.find_user_name(username)) == 0) {

			
           main.main_pp(null);

		} else {
			menu_normal_user.main_normaluser(null);

		}
	}
	
	
}
