package iphone.multifuncional;

import iphone.multifuncional.aparelhotelefonico.AparelhoTelefonico;
import iphone.multifuncional.navegadorinternet.NavegadorInternet;
import iphone.multifuncional.reprodutormusical.ReprodutorMusical;

public class Multifuncional implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void ligar() {
        System.out.println("Ligar");
    }

    public void atender() {
        System.out.println("Atender");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciar Correio de Voz");
    }

    public void exibirPagina() {
        System.out.println("Exibir Página");
    }

    public void atualizarPagina() {
        System.out.println("Atualizar Página");
    }

    public void abrirNovaAba() {
        System.out.println("Abrir Nova Aba");
    }

    public void tocar() {
        System.out.println("Tocar Música");
    }

    public void pausar() {
        System.out.println("Pausar Música");
    }

    public void selecionarMusica() {
        System.out.println("Selecionar Música");
    }
    
}
