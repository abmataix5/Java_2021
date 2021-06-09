package MODULE.ROOM.CLASSES;

import CLASSES.fecha;


public abstract class  room implements Comparable <room>{
	
	private String num_hab;
	private String type;
	private int preu;
	private fecha fecha_entrada;
	private fecha fecha_salida;
	
	private int dias_hab;
	
	
	
	//...Construcor..........//
	
	public room(String num_hab, String type, fecha fecha_entrada, fecha fecha_salida) {
		super();
		this.num_hab = num_hab;
		this.type = type;
		this.preu = preu;
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.calculapreu();
	}
	
	// Creem constructor buit
	
	public room() {}

	//..Constructor clave primaria que usaremos para buscar las habitaciones...//
	
	public room(String num_hab) {
		
		this.num_hab = num_hab;
	}
	
	//..............Getters and setters.............//

	public String getNum_hab() {
		return num_hab;
	}

	public void setNum_hab(String num_hab) {
		this.num_hab = num_hab;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}




	public fecha getFecha_entrada() {
		return fecha_entrada;
	}

	public void setFecha_entrada(fecha fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
		this.calculapreu();
	}

	public fecha getFecha_salida() {
		return fecha_salida;
		
	}

	public void setFecha_salida(fecha fecha_salida) {
		this.fecha_salida = fecha_salida;
		this.calculadies();
		this.calculapreu();
	}
	
	public void calculadies() {
		dias_hab = fecha_salida.resta_2_fechas(fecha_entrada);
System.out.println(dias_hab + "numero dies");
	}


	public void calculapreu() {

		this.preu = (this.dias_hab * 100) ;
System.out.print(preu + "preu");
	}
	
	public int getPreu() {
		return preu;
	}
	
	public boolean equals(Object param) {
		return getNum_hab().equals(((room) param).getNum_hab());
	}
	
	public int compareTo(room param) {// para ordenar los empleados por nombre
		if (this.getNum_hab().compareTo(param.getNum_hab()) > 0)
			return 1;
		if (this.getNum_hab().compareTo(param.getNum_hab()) < 0)
			return -1;
		return 0;
	}
	
	//...........toString......//
	
	public abstract String toString();

	}



	
	
	
	
	
	
	
	
	


