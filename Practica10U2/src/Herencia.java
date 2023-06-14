
public class Herencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo veh=new Vehiculo ();
		Automovil auto=new Automovil ();
		Motocicleta moto=new Motocicleta ();
		Tricimoto trici=new Tricimoto();
		/*Vehiculo vea=new Vehiculo ();
		Automovil aut=new Automovil ();
		Motocicleta mot=new Motocicleta ();*/
		
		veh.encendido();
		
		auto.encendido();

		moto.encendido();
		
		trici.apagado();
		
		/*vea.encendido();
		vea.apagado();
		
		aut.encendido();
		aut.apagado();

		mot.encendido();
		mot.apagado();*/
		
		
		System.out.println(veh.estado);
		System.out.println(auto.estado);
		System.out.println(moto.estado);
		System.out.println(trici.estado);
		
		
		
		

	}

}
