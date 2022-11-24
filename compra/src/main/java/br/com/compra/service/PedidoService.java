package br.com.compra.service;

import br.com.compra.model.Pedido;
import br.com.compra.repository.PedidoRespository;
import br.com.compra.service.rabbitMq.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class PedidoService {


    private final PedidoRespository pedidoRespository;
    private final Producer producer;

    public Pedido salvar(Pedido pedido) {
        pedido = pedidoRespository.save(pedido);
        producer.enviarPedido(pedido);
        return pedido;
    }

}
