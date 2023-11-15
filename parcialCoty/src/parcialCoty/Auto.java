package parcialCoty;
//int capacidadTanque proviene como parametro desde la clase tanqueCombustible, 
//como hacer para agregarlo en el constructor?
public class Auto extends Terrestre {

	
	private Motor miMotor;
	private Odometro miOdometro;
	private TanqueCombustible miTanque;
	
	public Auto(Motor miMotor, Odometro miOdometro, TanqueCombustible miTanque, int capacidadTanque) {

		this.miMotor = miMotor;
		this.miOdometro = miOdometro;
		this.miTanque = miTanque;
		
		this.miTanque = new TanqueCombustible (capacidadTanque, 0); 
	}

	public void arrancarAuto() {};
	public void apagarAuto() {};
	public void avanzarAuto() {};
	
	
	
}
	
