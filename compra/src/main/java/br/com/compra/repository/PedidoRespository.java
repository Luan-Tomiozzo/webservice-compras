package br.com.compra.repository;

import br.com.compra.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRespository extends JpaRepository<Pedido, Long> {

}
