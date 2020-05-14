package br.com.boavista;

public class ModelCatorioBvs {
	
	
	
	private String ufedBvs = "";	
	private String municipioBvs = "";
	private String cartorioBvs = "";
	private String enderecoBvs = "";	
	private String numddBvs = "";
	private String telefoneBvs = "";
	public  String codCartoiroBvs = "";
	public  String getCodigoBusca;
//	private String ufedRobo = "";	
//	private String municipioRobo = "";
//	private String cartorioRobo = "";
//	private String enderecoRobo = "";	
//	private String telefoneRobo = "";
	
	public ModelCatorioBvs(String reg) {
		
		String[] linha = reg.split(";");
		
		
		ufedBvs = linha[0];
		numddBvs = linha[1];
		telefoneBvs = linha[2];
		cartorioBvs = linha[4];
		codCartoiroBvs = linha[5];
		enderecoBvs = linha[6];		
		municipioBvs = linha[7];
		
//		cartorioBvs = linha[0];
//		enderecoBvs = linha[1];		
//		municipioBvs = linha[2];
//		ufedBvs = linha[3];
//		numddBvs = linha[4];
//		telefoneBvs = linha[5];
//		codCartoiroBvs = linha[6];
		
//		cartorioRobo = linha[7];
//		enderecoRobo = linha[8];
//		municipioRobo= linha[9];		
//		telefoneRobo = linha[10];
//		ufedRobo = linha[11];
//		
//		getCodigoBusca = municipioRobo +cartorioRobo + enderecoRobo + ufedRobo + telefoneRobo;
		getCodigoBusca = numddBvs + telefoneBvs;
	}

}
