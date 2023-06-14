
public class Tricimoto extends Vehiculo{
	
	boolean pedales;
    
	public void setNumeroRuedas(int rueda){
	    numRueda=rueda;
	}
	
	public void encendido(){
	    encendido=true;
	    estado="TRICIMOTO ENCENDIDA";
	}
	
	public void apagado(){
	    encendido=false;
	    estado="TRICIMOTO APAGADA";
	}
	
	
	

}
