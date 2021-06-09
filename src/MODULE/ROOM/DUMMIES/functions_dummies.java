package MODULE.ROOM.DUMMIES;


import CLASSES.fecha;
import CLASSES.singleton;
import MODULE.ROOM.CLASSES.doble;
import MODULE.ROOM.CLASSES.room;
import MODULE.ROOM.CLASSES.single;
import MODULE.ROOM.CLASSES.suite;

public class functions_dummies {

	private static final int cant_dumies = 10;
	
	
	//...Dummies ruite..//
	private static String[] num_habS = { "01-A", "02-A", "03-A", "04-A", "05-A", "06-A", "07-A", "08-A", "09-A",
	"10-A" };
	private static String[] typeS = { "Suite", "Suite", "Suite", "Suite", "Suite", "Suite", "Suite", "Suite", "Suite",
	"Suite" };
	private static fecha[] fecha_entradaS = { new fecha("07/12/2020"), new fecha("02/01/2021"), new fecha("07/01/2021"),
			new fecha("07/05/2021"), new fecha("15/02/2021"), new fecha("12/12/2020"), new fecha("24/12/2020"), new fecha("24/12/2020"), new fecha("24/12/2020"), new fecha("24/12/2020")};
	private static fecha[] fecha_salidaS = { new fecha("17/12/2020"), new fecha("12/01/2021"), new fecha("17/01/2021"),
			new fecha("12/05/2021"), new fecha("20/02/2021"), new fecha("18/12/2020"), new fecha("29/12/2020") ,new fecha("29/12/2020"), new fecha("29/12/2020"), new fecha("29/12/2020")};
	private static String[] jacuzziS = { "Si", "Si", "Si", "Si", "Si", "Si", "Si", "Si", "Si",
	"Si" };
	private static String[] welcome_giftS = { "Si", "Si", "Si", "Si", "Si", "Si", "Si", "Si", "Si",
	"Si" };
	private static String[] minibarS = { "Si", "Si", "Si", "Si", "Si", "Si", "Si", "Si", "Si",
	"Si" };
	private static String[] servicio_habS = { "Si", "Si", "Si", "Si", "Si", "Si", "Si", "Si", "Si",
	"Si" };
	private static fecha[] fecha_fin_spaS = { new fecha("09/12/2020"), new fecha("04/01/2020"), new fecha("09/01/2021"),
			new fecha("09/05/2021"), new fecha("17/02/2021"), new fecha("14/12/2020"), new fecha("27/12/2020"),new fecha("26/12/2020"),new fecha("26/12/2020"),new fecha("26/12/2020")};
	
	//.....Dummies doble...//
	

	private static String[] num_habD = { "01-B", "02-B", "03-B", "04-B", "05-B", "06-B", "07-B", "08-B", "09-B",
	"10-B" };
	private static String[] typeD = { "Doble", "Doble", "Doble", "Doble", "Doble", "Doble", "Doble", "Doble", "Doble",
	"Doble" };
	private static fecha[] fecha_entradaD = { new fecha("10/12/2020"), new fecha("10/01/2021"), new fecha("07/01/2021"),
			new fecha("07/05/2021"), new fecha("15/02/2021"), new fecha("12/12/2020"), new fecha("24/12/2020"), new fecha("24/12/2020"), new fecha("24/12/2020"), new fecha("24/12/2020")};
	private static fecha[] fecha_salidaD = { new fecha("17/12/2020"), new fecha("12/01/2021"), new fecha("17/01/2021"),
			new fecha("17/05/2021"), new fecha("20/02/2021"), new fecha("18/12/2020"), new fecha("29/12/2020"), new fecha("29/12/2020"), new fecha("29/12/2020"), new fecha("29/12/2020")};
	
	private static String[] cama_matrimonioD = { "Si", "No", "Si", "Si", "No", "Si", "Si", "No", "Si",
	"Si" };
	private static fecha[] fecha_Show = { new fecha("12/12/2020"), new fecha("11/01/2020"), new fecha("16/01/2021"),
			new fecha("06/05/2021"), new fecha("18/02/2021"), new fecha("16/12/2020"), new fecha("26/12/2020"),new fecha("26/12/2020"),new fecha("26/12/2020"),new fecha("26/12/2020")};
	private static String[] desayuno = { "Si", "Si", "Si", "Si", "Si", "Si", "No", "Si", "Si",
	"Si" };
	
	//.....Dummies single...//
	

	private static String[] num_hab1 = { "01-C", "02-C", "03-C", "04-C", "05-C", "06-C", "07-C", "08-C", "09-C",
	"10-C" };
	private static String[] type1 = { "Single", "Single", "Single", "Single", "Single", "Single", "Single", "Single", "Single",
	"Single" };
	private static fecha[] fecha_entrada1 = { new fecha("10/12/2020"), new fecha("10/01/2021"), new fecha("07/01/2021"),
			new fecha("07/05/2021"), new fecha("15/02/2021"), new fecha("12/12/2020"), new fecha("24/12/2020"), new fecha("24/12/2020"), new fecha("24/12/2020"), new fecha("24/12/2020")};
	private static fecha[] fecha_salida1 = { new fecha("17/12/2020"), new fecha("12/01/2021"), new fecha("17/01/2021"),
			new fecha("17/05/2021"), new fecha("20/02/2021"), new fecha("18/12/2020"), new fecha("29/12/2020"), new fecha("29/12/2020"), new fecha("29/12/2020"), new fecha("29/12/2020")};
	
	private static String[] cama_grandeS = { "Si", "Si", "No", "Si", "No", "Si", "No", "Si", "Si",
	"No" };
	private static fecha[] fecha_cita = { new fecha("12/12/2020"), new fecha("11/01/2020"), new fecha("16/01/2021"),
			new fecha("06/05/2021"), new fecha("18/02/2021"), new fecha("16/12/2020"), new fecha("26/12/2020"),new fecha("26/12/2020"),new fecha("26/12/2020"),new fecha("26/12/2020")};
	
	
	
	public static void carregar_dades() {

		int longit = 10;

		carregar_dummies(longit);

	}

	public static void carregar_dummies(int longit) {
		room S = null, D = null, SIN = null;

		for (int i = 0; i < cant_dumies; i++) {
			System.out.print(i);
			S = new suite(num_habS[i],typeS[i], fecha_entradaS[i], fecha_salidaS[i], jacuzziS[i], welcome_giftS[i],
					minibarS[i], servicio_habS[i], fecha_fin_spaS[i]);
			System.out.print(S);
			singleton.room_suite.add((suite) S);
			
			D = new doble(num_habD[i],typeD[i], fecha_entradaD[i], fecha_salidaD[i], cama_matrimonioD[i], fecha_Show[i],
					desayuno[i]);
//			System.out.print(D);
			singleton.room_doble.add((doble) D);
			
			SIN = new single(num_hab1[i],type1[i], fecha_entrada1[i], fecha_salida1[i], cama_grandeS[i], fecha_cita[i]);
			singleton.room_single.add((single) SIN);

		
		}

	}
}
