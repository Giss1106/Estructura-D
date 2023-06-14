
public class Vehiculo {

    String Placa;
    int numRueda;
    boolean encendido;
    String estado;
  
public void setNumeroRuedas(int rueda){
    numRueda=rueda;
}

public void encendido(){
    encendido=true;
    estado="VEHICULO ENCENDIDO";
}

public void apagado(){
    encendido=false;
    estado="VEHICULO APAGADO";
}
	
	
	
	
	
	
	
	
}
