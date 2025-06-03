package ProjetoIphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String musicaAtual;
    private String numeroAtual;
    private String urlAtual;

    // Implementação de ReprodutorMusical
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música: " + musicaAtual);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musicaAtual);
    }

    // Implementação de AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        this.numeroAtual = numero;
        System.out.println("Ligando para: " + numeroAtual);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de: " + numero);
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
        this.numeroAtual = null;
    }

    // Implementação de NavegadorInternet
    @Override
    public void abrirPaginaWeb(String url) {
        this.urlAtual = url;
        System.out.println("Abrindo página: " + urlAtual);
    }

    @Override
    public void atualizarPagina() {
        if (urlAtual != null) {
            System.out.println("Atualizando página: " + urlAtual);
        } else {
            System.out.println("Nenhuma página para atualizar.");
        }
    }

    @Override
    public void navegarPara(String url) {
        this.urlAtual = url;
        System.out.println("Navegando para: " + urlAtual);
    }
}

