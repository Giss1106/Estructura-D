
public class Automovil extends Vehiculo {

	  boolean parabrisas;

	  @Override
	  public void setNumeroRuedas(int rueda){
	      numRueda=rueda;
	  }

	  public void encendido(){
	      encendido=true;
	      estado="AUTO ENCENDIDO";
	  }

	  public void apagado(){
	      encendido=false;
	      estado="AUTO APAGADO";
	  }
	
	
}
