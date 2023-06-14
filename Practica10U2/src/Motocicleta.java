
public class Motocicleta extends Vehiculo {

	 boolean patada;
	    
	public void setNumeroRuedas(int rueda){
	    numRueda=rueda;
	}
	
	public void encendido(){
	    encendido=true;
	    estado="MOTO ENCENDIDA";
	}
	
	public void apagado(){
	    encendido=false;
	    estado="MOTO APAGADA";
	}
	
	
	
}
