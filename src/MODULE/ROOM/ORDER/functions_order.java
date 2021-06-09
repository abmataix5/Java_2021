package MODULE.ROOM.ORDER;

import java.util.Collections;

import javax.swing.JOptionPane;


import CLASSES.singleton;


public class functions_order {

	public static void change_order() {

		int opcion = 0;
		String[] options = {"Número habitación", "Precio", "Fecha entrada", "Fecha Salida"};

		if (singleton.room_suite.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No existe ninguna habitación");
		} else {
			opcion = JOptionPane.showOptionDialog(null, "Como quiere ordenarlo?", "ORDER", 0,
					JOptionPane.QUESTION_MESSAGE, null, options, options);

			switch (opcion) {
			case 0:
				Collections.sort(singleton.room_suite);
				Collections.sort(singleton.room_single);
				Collections.sort(singleton.room_doble);
				break;
			case 1:
				Collections.sort(singleton.room_single, new order_precio());
				Collections.sort(singleton.room_doble, new order_precio());
				Collections.sort(singleton.room_suite, new order_precio());
				break;
			case 2:
				Collections.sort(singleton.room_single, new order_fechaentrada());
				Collections.sort(singleton.room_suite, new order_fechaentrada());
				Collections.sort(singleton.room_doble, new order_fechaentrada());
				break;
			case 3:
				Collections.sort(singleton.room_single, new order_fechasalida());
				Collections.sort(singleton.room_suite, new order_fechasalida());
				Collections.sort(singleton.room_doble, new order_fechasalida());
				break;

			}
		}

	}

}
