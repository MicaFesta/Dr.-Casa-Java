public class Persona {
	private int cantidadDeCelulas;
	private int temperatura;
	ArrayList<T> enfermedades = new ArrayList<T>();
	
	public Persona(unaCantidadDeCelulas,unaTemperatura){
		this.cantidadDeCelulas = unaCantidadDeCelulas;
		this.temperatura = unaTemperatura;
	}
	public static void pasarUnDia(){
		enfermedades.forEach({
			enfermedad => enfermedad.pasarUnDia(this)
		})
	}
	public static int cantidadDeCelulasAfectadas(){
		int celulas_amenazadas = 0
		for( T enfermedad : enfermedades ){
			if(enfermedad.agresiva(this)){
				celulas_amenazadas += enfermedad.celulasAmenazadas();
			}
		}

	}
	public static  enfermedadQueMasAfecta(){
		private int maximasCelulasAfectadas = enfermedades.map({ otraEnfermedad =>
											otraEnfermedad.celulasAmenazadas()			
											}).max()
		return enfermedades.filter({ enfermedad =>
			enfermedad.celulasAmenazadas() == maximasCelulasAfectadas
		}).head()
	}
	public static void elevarTemperatura(unaTemperaturaAAumentar){
		temperatura = 45.min(temperatura + unaTemperaturaAAumentar)
	}
	public static void destruirCelulasAmenazadas(cantidadDeCelulasAmenazadas){
		cantidadDeCelulas -= cantidadDeCelulasAmenazadas
	}
	public static void contraerUnaEnfermedad(enfermedad){
		enfermedades.add(enfermedad)
	}
	public static int celulasTotalesDelCuerpo(){
		return cantidadDeCelulas
	}
	public static enfermedades(){
		return enfermedades
	}
}

public class EnfermedadInfecciosa {
	private celulasAmenazadas

	public EnfermedadInfecciosa (cantidadDeCelulasAmenazadas){
		this.celulasAmenazadas = cantidadDeCelulasAmenazadas		
	}
	public static void subirTemperatura(persona){
		persona.elevarTemperatura(celulasAmenazadas * 0.0001)	
	}
	public static boolean agresiva(persona){
		return celulasAmenazadas > persona.celulasTotalesDelCuerpo() * 0.1 
	}
	public static void reproducirse(){
		celulasAmenazadas *= 2 	
	}	
	public static void pasarUnDia(persona){
		self.subirTemperatura(persona)
	}
	public static void celulasAmenazadas(){
		return celulasAmenazadas
	}
}

public class EnfermedadAutoInmune {
	private int celulasAmenazadas
	private int vecesQueTuvoLaEnfermedad=0
	
	public EnfermedadAutoInmune (cantidadDeCelulasAmenazadas){
		celulasAmenazadas = cantidadDeCelulasAmenazadas		
	}
	public static boolean agresiva(persona){
		return vecesQueTuvoLaEnfermedad > 30
	}
	public static void reproducirse(){
		celulasAmenazadas *= 2 	
	}
	
	public static void destruirCelulasAmenazadas (persona){
		persona.destruirCelulasAmenazadas(celulasAmenazadas)
	}	
	public static void pasarUnDia(persona){
		vecesQueTuvoLaEnfermedad += 1
		self.destruirCelulasAmenazadas(persona)
	}
	public static int celulasAmenazadas(){
		return celulasAmenazadas
	}
} 