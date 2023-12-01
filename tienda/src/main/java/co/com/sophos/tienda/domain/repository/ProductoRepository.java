package co.com.sophos.tienda.domain.repository;

import co.com.sophos.tienda.persistent.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository {
   List<Producto>getAll();
   Optional<List<Producto>>getByCategory(int categoyId);
   Optional<List<Producto>>getScarseProducts(int quantity);
   Producto save(Producto producto);
   void delete(int productId);
}
