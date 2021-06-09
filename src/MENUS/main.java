package MENUS;





import javax.swing.JOptionPane;

import MODULE.ROOM.UTILS.functions_create;
import MODULE.ROOM.UTILS.functions_delete;
import MODULE.ROOM.UTILS.functions_read;
import MODULE.ROOM.UTILS.functions_update;
import MODULE.ROOM.CLASSES.single;
import MODULE.ROOM.CLASSES.doble;
import MODULE.ROOM.CLASSES.suite;
import MODULE.ROOM.DUMMIES.functions_dummies;
import MODULE.ROOM.ORDER.functions_order;
import UTILS_APP.functions_menus;
import CLASSES.config;
import CLASSES.singleton;
import CLASSES.IDIOMA.functions_config;
import CLASSES.IDIOMA.lenguage;
import MODULE.USERS.CLASSES.user;
import MODULE.USERS.UTILS.function_readperfil;
import MODULE.USERS.UTILS.functions_users;

import java.util.ArrayList;
public class main {

	public static void main_pp(String[] args) {
	
		
		String [] op_menu_princ = {"SUITE","HABITACIÓN DOBLE"," HABITACIÓN INDIVIDUAL","AJUSTES","USUARIOS APP","LOG OUT"};
		String [] op_menu_second = {"CREAR","LEER","ACTUALIZAR","BORRAR","ORDENAR","MENÚ PRINCIPAL"};
		String [] op_ajustes = {"DUMMIES","IDIOMA","MENÚ PRINCIPAL"};
		String [] op_dummies = {"Quitar dummies"};
	
		
		int op_main,op_crud = 0;
		int op_ajus = 0;	
		int dummie = 0;

		 config configuration = new config();

		do {
			
			op_main = functions_menus.botones(lenguage.menu("menu_admin", configuration, ""), lenguage.message("ppl_text", configuration, 0), lenguage.message("asktitle", configuration, 0));
			
			System.out.print(op_main);
			
			
					switch(op_main) {
					
					//.........SUITE.......//
					
							case 0: {
								
								do {
								
							op_crud = functions_menus.botones(lenguage.menu("menu_normal", configuration, ""), lenguage.message("ppl_text", configuration, 0), lenguage.message("asktitle", configuration, 0));
							
							
									switch(op_crud) {
									
											case 0:{ // CREATE
												
												functions_create.create_suite();
											}
											break;
											case 1:{//READ
										        functions_read.read_suite();
											}
											break;
											case 2:{//UPDATE
												functions_update.update_suite();
											}
											break;
											case 3:{//DELETE
												functions_delete.delete_suite();
											}
											break;
											case 4:{//ORDER
												functions_order.change_order();
											}
											break;
									
									}
								}while((op_crud != 5) && (op_crud != -1));		
									break;
							}// end case 0
							
					//........DOBLE 2......//
							
							case 1: {
								
								do {
									
								op_crud = functions_menus.botones(lenguage.menu("menu_normal", configuration, ""), lenguage.message("ppl_text", configuration, 0), lenguage.message("asktitle", configuration, 0));
								
							
							
								switch(op_crud) {
								
										case 0:{ // CREATE
											
											functions_create.create_doble();
										}
										break;
										case 1:{//READ
											functions_read.read_doble();
										}
										break;
										case 2:{//UPDATE
											functions_update.update_doble();
										}
										break;
										case 3:{//DELETE
											functions_delete.delete_doble();
										}
										break;
										case 4:{//ORDER
											functions_order.change_order();
										}
										break;
								
								
								}
											
								}while((op_crud != 5) && (op_crud != -1));		
										
										
									break;
							}// end case 1
							
					//........INDIVIDUAL........//
					
							case 2: {
								
								do {
									
								op_crud = functions_menus.botones(lenguage.menu("menu_normal", configuration, ""), lenguage.message("ppl_text", configuration, 0), lenguage.message("asktitle", configuration, 0));
								
							
								switch(op_crud) {
								
										case 0:{ // CREATE
											
											functions_create.create_single();
										}
										break;
										case 1:{//READ
											functions_read.read_single();
										}
										break;
										case 2:{//UPDATE
											functions_update.update_single();
										}
										break;
										case 3:{//DELETE
											functions_delete.delete_single();
										}
										break;
										case 4:{//ORDER
											functions_order.change_order();
										}
										break;
								
								
								}
											
								}while((op_crud != 5) && (op_crud != -1));		
										
									break;
							}// end case 2
							
							
							case 3:{
								
								do {
									op_ajus = functions_menus.botones(lenguage.menu("ajustes_normal", configuration, ""), lenguage.message("ppl_text", configuration, 0), lenguage.message("asktitle", configuration, 0));
									
									
									switch(op_ajus) {
									
									case 0:{
									
										
											singleton.room_suite.clear();
											singleton.room_doble.clear();
											singleton.room_single.clear();
										
									}
									
									break;
									case 1:{
										
										configuration.setIdioma(functions_config.language(configuration));
									}
									break;
									}
									
							}while((op_ajus != 2) && (op_ajus != -1));	
								
							}
							break;
					
								
							case 4:{
								
								do {
									
									
								function_readperfil.read_users();
									
								
							}while((op_ajus != 2) && (op_ajus != -1));	
								
							}
							break;
					
					
			     }//end..switch
			
			
			
		}while((op_main != 5) && (op_main != -1) && (op_crud != 2)&&(op_main != 5));
		
	

	}

}
