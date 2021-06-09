package MENUS;

import CLASSES.config;
import CLASSES.singleton;
import CLASSES.IDIOMA.functions_config;
import CLASSES.IDIOMA.lenguage;
import MODULE.ROOM.ORDER.functions_order;
import MODULE.ROOM.UTILS.functions_read;
import UTILS_APP.functions_menus;

public class invitado_menu {

	public static void main(String[] args) {
		
		
		
		String [] op_menu_princ = {"SUITE","HABITACIÓN DOBLE"," HABITACIÓN INDIVIDUAL","AJUSTES","SALIR"};
		String [] op_menu_second = {"READ","ORDER","MENÚ PRINCIPAL"};
		String [] op_ajustes = {"DUMMIES","IDIOMA","MENÚ PRINCIPAL"};

		int op_main,op_crud = 0;
		int op_ajus = 0;		


		 config configuration = new config();

		
		do {
			
			op_main = functions_menus.botones(lenguage.menu("menu_normalinvi", configuration, ""), lenguage.message("ppl_text", configuration, 0), lenguage.message("asktitle", configuration, 0));
			
			System.out.print(op_main);
			
			
					switch(op_main) {
					
					//.........SUITE.......//
					
							case 0: {
								
								do {
								
							op_crud = functions_menus.botones(lenguage.menu("menu_crud_normal", configuration, ""), lenguage.message("ppl_text", configuration, 0), lenguage.message("asktitle", configuration, 0));
							
									switch(op_crud) {
									
											case 0:{ // CREATE
												
											      functions_read.read_suite();
											}
											break;
											case 1:{//ORDER
										   functions_order.change_order();
											}
											break;
									
									
										
									
									}
								}while((op_crud != 2) && (op_crud != -1));		
									break;
							}// end case 0
							
					//........DOBLE 2......//
							
							case 1: {
								
								do {
									
								op_crud = functions_menus.botones(lenguage.menu("menu_crud_normal", configuration, ""), lenguage.message("ppl_text", configuration, 0), lenguage.message("asktitle", configuration, 0));
							
							
								switch(op_crud) {
								
										case 0:{ // READ
											
											functions_read.read_doble();
										}
										break;
										case 1:{//ORDER
											functions_order.change_order();
										}
										break;
									
								}
											
								}while((op_crud != 2) && (op_crud != -1));		
										
										
									break;
							}// end case 1
							
					//........INDIVIDUAL........//
					
							case 2: {
								
								do {
									
								op_crud = functions_menus.botones(lenguage.menu("menu_crud_normal", configuration, ""), lenguage.message("ppl_text", configuration, 0), lenguage.message("asktitle", configuration, 0));
							
								switch(op_crud) {
								
										case 0:{ // CREATE
											
											functions_read.read_single();
										}
										break;
										case 1:{//READ
											functions_order.change_order();
										}
										break;
								
									
								
								}
											
								}while((op_crud != 2) && (op_crud != -1));		
										
									break;
							}// end case 2
							
							
							case 3:{
								
								do {
									op_ajus =  functions_menus.botones(lenguage.menu("ajustes_normal", configuration, ""), lenguage.message("ppl_text", configuration, 0), lenguage.message("asktitle", configuration, 0));
									switch(op_ajus) {
									
									case 0:{
										singleton.room_suite.clear();
										singleton.room_doble.clear();
										singleton.room_single.clear();
									}
									
									case 1:{
										
										configuration.setIdioma(functions_config.language(configuration));
										
									}
									}
									
							}while((op_ajus != 2) && (op_ajus != -1));	
								
							}
							break;
							
			
					
								
					
					
			     }//end..switch
			
			
			
		}while((op_main != 4) && (op_main != -1) );

	}

}
