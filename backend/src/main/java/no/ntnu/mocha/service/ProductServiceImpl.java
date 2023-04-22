package no.ntnu.mocha.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import no.ntnu.mocha.DTO.ProductDto;
import no.ntnu.mocha.domain.entities.Product;
import no.ntnu.mocha.domain.repository.ProductCategoryRepository;
import no.ntnu.mocha.domain.repository.ProductRepository;

/**
 * <Business Logic Service for the Product</h1>
 * 
 * Representing an Service class for the Product and implements the
 * Product Service interface with the additional methods.
 * 
 * @version 21.04.2023
 * @since   21.04.2023
 * @see     ProductService
 */
@Service
public class ProductServiceImpl implements ProductService {
    
    /** Gives access to the repository */
    @Autowired
    private ProductRepository productRepository;

    /** Gives access to the repository */
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public Iterable<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);

        return products.stream().sorted(Comparator.comparingLong(Product::getId))
                .collect(Collectors.toList());
    }

    @Override
    public Product getProduct(long id) {
        Optional<Product> p = productRepository.findById(id);
        return p.orElse(null);
    }

    @Override
    public Product getProductByName(String name) {
        
    }

    @Override
    public Product addProductFromDto(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addProductFromDto'");
    }

    @Override
    public Product updateProduct(long id, ProductDto product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProduct'");
    }

    @Override
    public void deleteProduct(long id) {
        
    }

    private Product getProductFromDto(ProductDto object) {
        
    }
}
