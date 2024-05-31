public class Aparelho {

	public static void main(String[] args) {
		
		ReprodutorMusical rpm = new ReprodutorMusical();
		rpm.tocarMusica();
		rpm.pausarMusica();
		rpm.selecionarMusica();
		
		AparelhoTelefonico apa = new AparelhoTelefonico();
		apa.ligarAparelho();
		apa.atenderLigacao();
		apa.iniciarCorreioVoz();
		
		NavegadorInternet nvi = new NavegadorInternet();
		nvi.exibirPagina();
		nvi.adicionarNovaAba();
		nvi.atualizarPagina();

	}

}
