package io.github.thaynnaduarte.dscatalog.repositories;

import io.github.thaynnaduarte.dscatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
