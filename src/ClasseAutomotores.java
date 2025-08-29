
public class ClasseAutomotores {
	
	String corAt;
	String nomeAt;
	String marcaAt;
	String tipoAt;


	//construtor vazio
	public ClasseAutomotores() {
		
	}
	
	public ClasseAutomotores(String corPar, String nomePar, String marcaPar, String tipoPar) {
		
		this.corAt = corPar;
		this.nomeAt = nomePar;
		this.marcaAt = marcaPar;
		this.tipoAt = tipoPar;
		
	}
	
	//geters
	public String pegar_cor() {
		return corAt;}
		
	public String pegar_nome() {
		return nomeAt;}
	
	public String pegar_marca() {
		return marcaAt;}
	
	public String pegar_tipo() {
		return tipoAt;}
	
	//seters
	public void alterar_cor(String corPar) {
		this.corAt = corPar;}
	
	public void alterar_nome(String nomePar) {
		this.nomeAt = nomePar;}
	
	public void alterar_marca(String marcaPar) {
		this.marcaAt = marcaPar;}
	
	public void alterar_tipo(String tipoPar) {
		this.tipoAt = tipoPar;}
}