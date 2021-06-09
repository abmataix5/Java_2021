package MODULE.ROOM.CLASSES;

import CLASSES.fecha;

public class single extends room {
	
	String cad = "";
	//......atributos............//

	private String cama_grande;
	private fecha fecha_cita_sorpresa; // 2 dias despues del ingreso edn el hotel
	
	
	//........constructor.....//

	public single(String num_hab, String type, fecha fecha_entrada, fecha fecha_salida,
			String cama_grande, fecha fecha_cita_sorpresa) {
		super(num_hab, type, fecha_entrada, fecha_salida);
		super.setFecha_entrada(fecha_entrada);
		super.setFecha_salida(fecha_salida);
		super.setNum_hab(num_hab);
		this.cama_grande = cama_grande;
		this.fecha_cita_sorpresa = fecha_cita_sorpresa;
	}
	
	//....Constructor buit...//
	
	public single() {
		
		
	}
	
	//....Constructor amb soles la clau primaria...//
	
	public single(String num_hab) {
		super(num_hab);
	}
	
	//.............getters and setters........./

	public String getCama_grande() {
		return cama_grande;
	}



	public void setCama_grande(String cama_grande) {
		this.cama_grande = cama_grande;
	}
	
	public fecha getFecha_cita_sorpresa() {
		return fecha_cita_sorpresa;
	}


	public void setFecha_cita_sorpresa(fecha fecha_cita_sorpresa) {
		this.fecha_cita_sorpresa = fecha_cita_sorpresa;
	}
	
	
	//..........toString........//

	@Override
	public String toString() {
		cad = ("Numero habitación : " + getNum_hab() + "\n" + "Tipo :" + getType() + "\n" + "Precio : " + getPreu() + "\n" + "Fecha entrada : "+ getFecha_entrada() + "\n" + "Fecha salida : " + getFecha_salida() + "\n" + "Cama grande : " + getCama_grande() + "\n" + "Fecha cita sorpresa :" + getFecha_cita_sorpresa());
		return cad;
	}

	@Override
	public int compareTo(room o) {
		// TODO Auto-generated method stub
		return 0;
	}



	
	
	
}
