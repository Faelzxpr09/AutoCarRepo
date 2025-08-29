
public class ClasseCaminhoes extends ClasseAutomotores{

	float cargasuportadaAt;
	
	public ClasseCaminhoes( String corPar, String nomePar, String marcaPar, String tipoPar, float cargasuportadaPar) {
		
		super(corPar, nomePar, marcaPar, tipoPar);
		this.cargasuportadaAt = cargasuportadaPar;
	}
	
}
