package MENUS;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import CLASSES.config;
import CLASSES.singleton;
import MODULE.ROOM.CLASSES.doble;
import MODULE.ROOM.CLASSES.single;
import MODULE.ROOM.CLASSES.suite;
import MODULE.ROOM.DUMMIES.functions_dummies;
import MODULE.USERS.CLASSES.user;
import MODULE.USERS.UTILS.create_user;
import MODULE.USERS.UTILS.dummies_users;
import MODULE.USERS.UTILS.function_login;
import MODULE.USERS.UTILS.functions_users;
import UTILS_APP.functions_menus;

public class APP_MENU {

	public static void main(String[] args) {
	
		String [] op_menu_princ = {"REGISTRARSE","INICIAR SESION","INVITADO","SALIR DE LA APP"};
		String [] op_dummies = {"Utilizar dummies","Quitar dummies"};
		String [] ajus_dummie = {"Quitar dummies"};
		int op_prin = 0;
		int dummie = 0;

          config configuration = new config();
	      singleton.room_doble = new ArrayList <doble> ();
	      singleton.room_suite = new ArrayList <suite> ();
	      singleton.room_single = new ArrayList <single> ();
	      singleton.users_app = new ArrayList <user>();
	      dummies_users.carregarUsers();
	     
	      dummie = functions_menus.menu_botones(op_dummies, "Quiere utilizar DUMMIES?", "DUMMIES");
	      if(dummie == 0) {
	    	  functions_dummies.carregar_dades();
	      }
	      
		do {
			
			op_prin = functions_menus.menu_botones(op_menu_princ, "BIENVENIDO A LA APP DE NUESTRO HOTEL", "HOTEL *****");
			
			
			
			switch(op_prin) {
			
					case 0:{
						create_user.create_usernormal();
						
					}
					break;
					case 1:{
						function_login.login_user();
					}
					break;
					case 2:{
						invitado_menu.main(null);
					}
					break;
			
							
				
			}
			
			
			
		}while(op_prin != 3 && op_prin != -1);
		
		JOptionPane.showMessageDialog(null, "Hasta la próxima,gracias por utilizar nuestra APP");
		
	}

}
