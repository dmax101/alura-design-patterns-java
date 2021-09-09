package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedidos {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviar email com dados do novo Pedido!");
    }
}
