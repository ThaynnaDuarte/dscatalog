package io.github.thaynnaduarte.dscatalog.repositories;

import io.github.thaynnaduarte.dscatalog.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {


}
