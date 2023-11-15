package parcialCoty;


public class TanqueCombustible {

	private int capacidadTanque;
	private double cantidadCombustible= 0;
	
	public TanqueCombustible(int capacidadTanque, double cantidadCombustible) {
		this.capacidadTanque = capacidadTanque;
		this.cantidadCombustible = cantidadCombustible;
	}
	
		public void agregarCombustible(double cantidadCombustible)
		{
			if ( cantidadCombustible <= 0 )
			{
				System.out.println("la cantidad debe ser mayor a 0.");
				
			} else if (this.cantidadCombustible + cantidadCombustible > this.capacidadTanque)
			{
				System.out.println("No se puede agregar más combustible. El tanque está lleno.");
				
			} else {
				this.cantidadCombustible += cantidadCombustible;
			}
		}
	

	public double getCantidadCombustible() {
		return cantidadCombustible;
	}

	public void setCantidadCombustible(double cantidadCombustible) {
		this.cantidadCombustible = cantidadCombustible;
	}
	
}
