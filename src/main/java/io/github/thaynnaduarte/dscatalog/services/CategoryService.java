package io.github.thaynnaduarte.dscatalog.services;

import io.github.thaynnaduarte.dscatalog.entites.Category;
import io.github.thaynnaduarte.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

}
