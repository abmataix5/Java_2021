package MODULE.ROOM.CLASSES;

import CLASSES.fecha;

public class doble extends room {
	
	String cad = "";
	//.........Atributos......//
	
	private String cama_matrimonio;
	private fecha fecha_show_pareja;
	private String desayuno;
	
	//.............Constructor...........//
	
	public doble(String num_hab, String type, fecha fecha_entrada, fecha fecha_salida,
			String cama_matrimonio, fecha fecha_show_pareja, String desayuno) {
		super(num_hab, type, fecha_entrada, fecha_salida);
		super.setFecha_entrada(fecha_entrada);
		super.setFecha_salida(fecha_salida);
		this.cama_matrimonio = cama_matrimonio;
		this.fecha_show_pareja = fecha_show_pareja;
		this.desayuno = desayuno;
	}

	//....Construcor buit..//
	public doble() {
		
		
	}
	
	//Constructor soles amb la clau primaria...//
	
	public doble(String num_hab) {
		super(num_hab);
		
	}

	public String getCama_matrimonio() {
		return cama_matrimonio;
	}





	public void setCama_matrimonio(String cama_matrimonio) {
		this.cama_matrimonio = cama_matrimonio;
	}


	public fecha getFecha_show_pareja() {
		return fecha_show_pareja;
	}


	public void setFecha_show_pareja(fecha fecha_show_pareja) {
		this.fecha_show_pareja = fecha_show_pareja;
	}


	public String getDesayuno() {
		return desayuno;
	}


	public void setDesayuno(String desayuno) {
		this.desayuno = desayuno;
	}

	
	//........toString..........//

	@Override
	public String toString() {
		cad = ("Numero habitación : " + getNum_hab() + "\n" + "Tipo :" + getType() + "\n" + "Precio : " + getPreu() + "\n" + "Fecha entrada : "+ getFecha_entrada() + "\n" + "Fecha salida : " + getFecha_salida() + "\n" + "Cama matrimonio : " + getCama_matrimonio() + "\n" + "Fecha del show : " + getFecha_show_pareja() + "\n" + "Desayuno : " + getDesayuno());
		return cad;
	}

	@Override
	public int compareTo(room o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	

}
