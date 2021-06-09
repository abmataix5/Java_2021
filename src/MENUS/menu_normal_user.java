package MENUS;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import CLASSES.config;
import CLASSES.singleton;
import CLASSES.IDIOMA.functions_config;
import CLASSES.IDIOMA.lenguage;
import MODULE.ROOM.CLASSES.doble;
import MODULE.ROOM.CLASSES.single;
import MODULE.ROOM.CLASSES.suite;
import MODULE.ROOM.ORDER.functions_order;
import MODULE.ROOM.UTILS.functions_read;
import MODULE.USERS.CLASSES.user;
import UTILS_APP.functions_menus;

public class menu_normal_user {

public static void main_normaluser(String[] args) {
	
		
		String [] op_menu_princ = {"SUITE","HABITACIÓN DOBLE"," HABITACIÓN INDIVIDUAL","AJUSTES","LOG OUT"};
		String [] op_menu_second = {"LEER","ORDENAR","MENÚ PRINCIPAL"};
		String [] op_ajustes = {"QUITAR DUMMIES","IDIOMA","FORMATO","MENÚ PRINCIPAL"};

		int op_main,op_crud = 0;
		int op_ajus = 0;		

		 config configuration = new config();


		
		do {
			
			op_main = functions_menus.botones(lenguage.menu("menu_normaluser", configuration, ""), lenguage.message("ppl_text", configuration, 0), lenguage.message("asktitle", configuration, 0));
			
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
									case 2:{
										
										configuration.setDate(functions_config.date(configuration));
									}
									break;
									
									}
									
							}while((op_ajus != 2) && (op_ajus != -1));	
								
							}
							break;
							
						
					
								
					
					
			     }//end..switch
			
			
			
		}while((op_main != 4) && (op_main != -1) );
		
	

	}
	
	
}
