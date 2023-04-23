package no.ntnu.mocha.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.ntnu.mocha.domain.entities.ProductCategory;
import no.ntnu.mocha.domain.repository.ProductCategoryRepository;

/**
 * <h1>Business Logic Service class for Category</h1>
 * 
 * <p> Representing an Service class for the Category and implements the
 * Cart Item Service interface with the additional methods. </p>
 * 
 * @version 21.04.2023
 * @since   21.04.2023
 * @see     ProductCategoryService
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    /** Gives access to the repository */
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    /**
     * Returns an iterable collection of all the
     * product categories.
     * 
     * @return {@code Iterable<ProductCategory>} of all the
     *          product categories.
     */
    @Override
    public Iterable<ProductCategory> getAllProductCategories() {
        return productCategoryRepository.findAll();
    }

    /**
     * Returns the product category with the given id.
     * 
     * @return {@code ProductCategort} with the given id,
     *          and if not {@code null} if nothing is found.
     */
    @Override
    public ProductCategory getProductCategory(long id) {
        Optional<ProductCategory> category = productCategoryRepository.findById(id);
        return category.orElse(null);
    }

    /**
     * Adds the given product category to the database.
     * 
     * @param category  {@code ProductCategory} to be added.
     */
    @Override
    public void addProductCategory(ProductCategory category) {
        if(!productCategoryRepository.existsById(category.getId())) {
            productCategoryRepository.save(category);
        }
    }

    /**
     * Deletes the product category by the given
     * id.
     * 
     * @param id    the id of the product category to be
     *              deleted.
     */
    @Override
    public void deleteProductCategory(long id) {
        if (productCategoryRepository.existsById(id)) {
            productCategoryRepository.deleteById(id);
        }
    }
    
}
