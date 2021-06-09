package UTILS_APP;

import CLASSES.fecha;
import CLASSES.singleton;
import MODULE.ROOM.CLASSES.doble;
import MODULE.ROOM.CLASSES.room;
import MODULE.ROOM.CLASSES.single;
import MODULE.ROOM.CLASSES.suite;
import MODULE.ROOM.UTILS.functions_data;
import MODULE.ROOM.UTILS.functions_fecharoom;

public class functions_room {
	

	
//.........Pedimos primary key de suite........//	

	public static suite inster_primarykey_suite() {
		
		singleton.num_hab = functions_data.pedir_numhab();
		return new suite(singleton.num_hab);		
		
	}
	
//.....Pedimos primary key de doble....//	
	
	public static doble inster_primarykey_doble() {
			
			singleton.num_hab = functions_data.pedir_numhab();
			return new doble(singleton.num_hab);		
			
	}
	
//....Pedimos primay key de single...//	

	public static single inster_primarykey_single() {
		
		singleton.num_hab = functions_data.pedir_numhab();
		return new single(singleton.num_hab);		
		
	}
	
	
//........Función para pedir todos los datos de la habitacion tipo suite....//
	
	
	
	
	public static suite all_data_suite() {
		
		 String num_hab;
		 String type;
		 fecha fecha_entrada;
		 fecha fecha_salida;
		 String spa;
		 String welcome_gift;
		 String minibar;
		 String servicio_hab;
		 fecha fechafin_spa;
		
		num_hab = singleton.num_hab;
		type = functions_menus.menu_type_suite("Tipo de habitación", "TIPO");
		fecha_entrada = functions_fecharoom.pedir_fechaini();
		fecha_salida = functions_fecharoom.pedir_fechafin(fecha_entrada);
		spa = functions_menus.menu_combo("Inculye SPA?", "SPA");
		welcome_gift = functions_menus.menu_combo("Tiene regalo de bienvenida?", "WELCOME GIFT");
		servicio_hab = functions_menus.menu_combo("Servicio de habitaciones incluido?", "Servicio de habitaciones");
		minibar = functions_menus.menu_combo("MINIBAR?", "MINIBAR");
		fechafin_spa = functions_fecharoom.fecha_spa(fecha_entrada, fecha_salida);
	
		
		 return new suite(num_hab,type,fecha_entrada,fecha_salida,spa,welcome_gift,minibar,servicio_hab,fechafin_spa);	
	
	}
	
	public static doble all_data_doble() {
		
		
		 String num_hab;
		 String type;
		 fecha fecha_entrada;
		 fecha fecha_salida;
		 String cama_matrimonio;
		 String desayuno;
		 fecha fecha_show_pareja;
			 
		num_hab = singleton.num_hab;
		type = functions_menus.menu_type_doble("Tipo de habitación", "TIPO");
		fecha_entrada = functions_fecharoom.pedir_fechaini();
		fecha_salida = functions_fecharoom.pedir_fechafin(fecha_entrada);
		cama_matrimonio = functions_menus.menu_combo("Cama de matrimonio?", "SPA");
		fecha_show_pareja =  functions_fecharoom.fecha_show(fecha_entrada, fecha_salida);
		desayuno = functions_data.pedir_desayuno();
		
		return new doble(num_hab,type,fecha_entrada,fecha_salida,cama_matrimonio,fecha_show_pareja,desayuno);
		
	}
	
	public static single all_data_single() {
		
		 String num_hab;
		 String type;
		 fecha fecha_entrada;
		 fecha fecha_salida;
		 String cama_grande;
		 fecha fecha_cita_sorpresa;
		
		num_hab = singleton.num_hab;
		type = functions_menus.menu_type_single("Tipo de habitación", "TIPO");
		fecha_entrada = functions_fecharoom.pedir_fechaini();
		fecha_salida = functions_fecharoom.pedir_fechafin(fecha_entrada);
		cama_grande = functions_menus.menu_combo("Inculye cama grande", "SPA");
		fecha_cita_sorpresa =  functions_fecharoom.fecha_cena(fecha_entrada, fecha_salida);
		
		 return new single(num_hab,type,fecha_entrada,fecha_salida,cama_grande,fecha_cita_sorpresa);
		
	}
	
	
	public static void update_room(room room1) {
		
		String [] suite_options = {"Numero habitación","Tipo","Fecha entrada","Fecha salida","SPA","Welcome Gift","Minibar","Servicio Habitaciones","Fecha fin spa"};
		String [] doble_options = {"Numero habitación","Tipo","Fecha entrada","Fecha salida","Cama matrimonio","Fecha show para parejas"," Desyuno"};
		String [] single_options = {"Numero habitación","Tipo","Fecha entrada","Fecha salida","Cama grande","Fecha cita sorpresa"};
		int suite_op,doble_op,single_op = 0;

	if(room1 instanceof suite) {
		
		suite_op = functions_menus.menu_botones(suite_options, "Que dato quiere cambiar?", "UPDATE");
		
		switch(suite_op) {
		
			case 0:{
				((suite)room1).setNum_hab(functions_data.pedir_numhab());
			}
			
			break;
			
			case 1:{
				((suite)room1).setType(functions_data.pedir_type());
			}
			
			break;
			

			
			case 2:{
				((suite)room1).setFecha_entrada(functions_fecharoom.update_fini(((suite)room1).getFecha_salida()));
			}
			
			break;
			
			case 3:{
				((suite)room1).setFecha_salida(functions_fecharoom.pedir_fechafin(((suite)room1).getFecha_entrada()));
			}
			
			break;
			
			case 4:{
				((suite)room1).setSpa(functions_menus.menu_combo("Inculye SPA?", "SPA"));
			}
			
			break;
			
			case 5:{
				((suite)room1).setWelcome_gift(functions_menus.menu_combo("Inculye REGALO ED BIENVENIDA?", "SPA"));
			}
			
			break;
			
			case 6:{
				((suite)room1).setMinibar(functions_data.pedir_minibar());
			}
			
			break;
			
			case 7:{
				((suite)room1).setServicio_hab(functions_menus.menu_combo("Inculye SERVICIO DE HABITACIONES?", "SPA"));
			}
			
			break;
			case 8:{
				((suite)room1).setFechafin_spa(functions_fecharoom.pedir_fechaini());
			}
			
			break;
		}
		
		
		
	}
	
	if(room1 instanceof doble) {
		
		doble_op = functions_menus.menu_botones(doble_options, "Que dato quiere actualizar?", "UPDATE");
			
		switch(doble_op) {
		
				case 0:{
					((doble)room1).setNum_hab(functions_data.pedir_numhab());
				}
				
				break;
				
				case 1:{
					((doble)room1).setType(functions_data.pedir_type());
				}
				
				break;
				
			
			
				
				case 2:{
					((doble)room1).setFecha_entrada(functions_fecharoom.pedir_fechaini());
				}
				
				break;
				
				case 3:{
					((doble)room1).setFecha_salida(functions_fecharoom.pedir_fechafin(((doble)room1).getFecha_entrada()));
				}
				
				break;
				
				case 4:{
					((doble)room1).setCama_matrimonio(functions_menus.menu_combo("Tiene cama de matrimonio?", "MATRIMONIO"));
				}
				
				break;
				
				case 5:{
					((doble)room1).setFecha_show_pareja(functions_fecharoom.fecha_show(((doble)room1).getFecha_entrada(), ((doble)room1).getFecha_salida()));
				}
				
				break;
				
				case 6:{
					((doble)room1).setDesayuno(functions_data.pedir_desayuno());
				}
				
				break;
	
	
	    }
			
		}
	
	if(room1 instanceof single) {
		
		single_op = functions_menus.menu_botones(single_options, "Que dato quiere actualizar?", "UPDATE");
		
		switch(single_op) {
		
				case 0:{
					((single)room1).setNum_hab(functions_data.pedir_numhab());
				}
				
				break;
				
				case 1:{
					((single)room1).setType(functions_data.pedir_type());
				}
				
				break;
				
		
				
				case 2:{
					((single)room1).setFecha_entrada(functions_fecharoom.pedir_fechaini());
				}
				
				break;
				
				case 3:{
					((single)room1).setFecha_salida(functions_fecharoom.pedir_fechafin(((single)room1).getFecha_entrada()));
				}
				
				break;
				
				case 4:{
					((single)room1).setCama_grande(functions_menus.menu_combo("Tiene cama grande?", "SPA"));
				}
				
				break;
				
				case 5:{
					((single)room1).setFecha_cita_sorpresa(functions_fecharoom.pedir_fechaini());
				}
				
				break;
					
	
	    }
		
	}
		
	}
}
