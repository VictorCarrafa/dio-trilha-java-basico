package ProjetoIphone;

public class main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Usando como reprodutor musical
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocarMusica();
        meuIPhone.pausarMusica();

        // Usando como telefone
        meuIPhone.fazerChamada("1234-5678");
        meuIPhone.encerrarChamada();

        // Usando como navegador
        meuIPhone.abrirPaginaWeb("https://www.apple.com");
        meuIPhone.atualizarPagina();
        meuIPhone.navegarPara("https://www.openai.com");
    }
}

