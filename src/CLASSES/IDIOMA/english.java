package CLASSES.IDIOMA;

public class english {
	public static String message (String valor) {
		String message = "";
		
		switch (valor) {
			case "asktitle":
				message = "WELCOME, THANKS FOR USE OUR HOTEL WEB";
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
					String [] op_menu_princ = {"REGISTER","LOG IN","INVITED","CLOSE APP"};
					menu = op_menu_princ;
					break;
					
				case "menu_admin":
					String [] menu_admin = {"SUITE","DOBLE ROOM","SINGLE ROOM","SEETINGS","USERS APP","LOG OUT"};
					menu = menu_admin;
					break;
					
				case "menu_normal":
					String [] menu_normal= {"CREATE","READ","UPDATE","DELETE","ORDER","MAIN MENU"};
					menu = menu_normal;
					break;
					
				case "menu_normaluser":
					String [] menu_normaluser= {"SUITE","DOBLE ROOM","SINGLE ROOM","SEETINGS","LOG OUT"};
					menu = menu_normaluser;
					break;
					
				case "menu_normalinvi":
					String [] menu_normalinvi= {"SUITE","DOBLE ROOM","SINGLE ROOM","SEETINGS","MAIN MEU"};
					menu = menu_normalinvi;
					break;
					
				case "menu_crud_normal":
					String [] menu_crud_normal = {"READ","ORDER","MAIN MENU"};
					menu = menu_crud_normal;
					break;
					
				case "ajustes_normal":
					String [] ajustes_normal = {"DELETE DUMMIES","SELECT LENGUAGE","DATE FORMAT","MAIN MENU"};
					menu = ajustes_normal;
					break;
					
			
			}
			
			return menu;
		}
		
		
		
		
	
}
