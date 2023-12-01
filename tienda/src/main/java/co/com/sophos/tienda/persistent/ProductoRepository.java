package co.com.sophos.tienda.persistent;

import co.com.sophos.tienda.persistent.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository implements co.com.sophos.tienda.domain.repository.ProductoRepository {
    @Override
    public List<Producto> getAll() {
        return null;
    }

    @Override
    public Optional<List<Producto>> getByCategory(int categoyId) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Producto>> getScarseProducts(int quantity) {
        return Optional.empty();
    }

    @Override
    public Producto save(Producto producto) {
        return null;
    }

    @Override
    public void delete(int productId) {

    }
}
