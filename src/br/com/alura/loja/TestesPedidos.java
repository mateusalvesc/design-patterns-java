package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int qunatidadeItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, qunatidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(/*dependências*/);
        handler.execute(gerador);
    }
}
