package CLASSES.IDIOMA;

public class español {
	
	public static String message (String valor) {
		String message = "";
		
		switch (valor) {
			case "asktitle":
				message = "BIENVENIDO, GRACIAS POR USAR LA WEB ED NUESTRO HOTEL";
				break;
								

		}
		
		return message;
	}
	
	

	
		public static String [] menu (String valor, String s) {
			String [] menu = null;
			
			switch (valor) {
				/* Main_user
				 * @return message
				 */
				case "menu_prin":
					String [] op_menu_princ = {"REGISSTRARSE","INICIAR SESION","INVITADO","CERRAR APP"};
					menu = op_menu_princ;
					break;
					
				case "menu_admin":
					String [] menu_admin = {"SUITE","HABITACION DOBLE","HABITACION INDIVIDUAL","AJUSTES","USUARIOS APP","CERRAR SESION"};
					menu = menu_admin;
					break;
					
				case "menu_normal":
					String [] menu_normal= {"CREAR","LEER","ACTUALIZAR","BORRAR","ORDENAR","MENU PRINCIPAL"};
					menu = menu_normal;
					break;
				case "menu_normaluser":
					String [] menu_normaluser= {"SUITE","HABITACION DOBLE","HABITACION INDIVIDUAL","AJUSTES","CERRAR SESION"};
					menu = menu_normaluser;
					break;
				case "menu_crud_normal":
					String [] menu_crud_normal = {"LEER","ORDENAR","MENU PRINCIPAL MENU"};
					menu = menu_crud_normal;
					break;
				case "menu_normalinvi":
					String [] menu_normalinvi= {"SUITE","HABITACION DOBLE","HABITACION INDIVIDUAL","HABITACION INDIVIDUAL", "MEU PRINCIPAL"};
					menu = menu_normalinvi;
					break;
		
					
				case "ajustes_normal":
					String [] ajustes_normal = {"BORRAR DUMMIES","SELECCIONAR IDIOMA","FORMATO FECHA","MENU PRINCIPAL"};
					menu = ajustes_normal;
					break;
					
			
			}
			
			return menu;
		}
}
