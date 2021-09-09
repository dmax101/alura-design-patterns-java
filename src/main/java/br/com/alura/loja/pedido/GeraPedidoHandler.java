package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedidos;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedidos> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedidos> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento();

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));

    }
}
