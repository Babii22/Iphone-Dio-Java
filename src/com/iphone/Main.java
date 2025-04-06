package com.iphone;

import com.iphone.modelo.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando Reprodutor Musical
        meuIphone.selecionarMusica("Perfectly Perfect - Simple Plan");
        meuIphone.tocar();
        meuIphone.pausar();

        //Testando Aparelho Telefônico
        meuIphone.ligar("(11) 976575810");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
