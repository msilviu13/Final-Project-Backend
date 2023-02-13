package pl.sda.magazinonline.finalprojectbackend.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import pl.sda.magazinonline.finalprojectbackend.entity.Product;

import java.util.List;

public interface ProductDao extends CrudRepository<Product, Integer> {
    public List<Product> findAll(Pageable pageable);

    public List<Product> findByProductCategory(String cat);

    public List<Product> findByProductNameContainingIgnoreCaseOrProductDescriptionContainingIgnoreCase(
            String key1, String key2, Pageable pageable);
}
