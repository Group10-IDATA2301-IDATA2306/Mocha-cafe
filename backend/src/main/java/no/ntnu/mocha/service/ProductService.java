package no.ntnu.mocha.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.ntnu.mocha.DTO.ProductDto;
import no.ntnu.mocha.domain.entities.Image;
import no.ntnu.mocha.domain.entities.Product;
import no.ntnu.mocha.domain.repository.ImageRepository;
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
 */
@Service
public class ProductService {

    /** Gives access to the repository */
    @Autowired
    private ProductRepository productRepository;

    /** Gives access to the repository */
    @Autowired
    private ImageRepository imageRepository;

    /** Gives access to the repository */
    @Autowired
    private ProductCategoryRepository categoryRepository;




    public Iterable<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();
        productRepository.findAll().forEach(productList::add);

        return productList.stream().sorted(Comparator.comparingLong(Product::getId))
                .collect(Collectors.toList());
    }


    public Iterable<Product> getAllOrderedBy(String order) {
        switch(order.toUpperCase()) {
            case "price": return productRepository.getAllOrderedByPrice();
            case "popularity": return productRepository.getAllOrderedByPurchases();
            default: return getAllProducts();
        } 
    }




    public Product getProduct(long id) {
        Optional<Product> product = productRepository.findById(id);
        return (product.isPresent()) ? product.get() : null;
    }



    public Product getProductByName(String name) {
        return productRepository.findByName(name);
    }

    public Iterable<Product> getAllByCategory(String category) {
        long id = categoryRepository.findByName(category).getId();
        return productRepository.getAllByCategory(id);
    }


    public Product addProduct(ProductDto dto) {
        Optional<Image> image = imageRepository.findById(dto.getImageId());
        if (image.isPresent()) {
            Product product = new Product(
                dto.getName(),
                dto.getPrice(),
                dto.getAmount(),
                dto.getDescription(),
                dto.getDisplay(),
                image.get()
            );
            return productRepository.save(product);
        } else {
            return null;
        }
    }



    public void updateProduct(long id, ProductDto dto) {
        productRepository.updateProduct(
            dto.getImageId(), 
            dto.getDisplay(), 
            dto.getPrice(), 
            dto.getImageId(), 
            dto.getCategory(), 
            dto.getAmount(), 
            dto.getDescription(), 
            dto.getName(),
            dto.getTotalBought()
        );
    }


    public void increment(long id) {
        productRepository.increment(id);
    }


    public void updatePrice(long id, double price) {
        productRepository.updatePrice(id, price);
    }


    public boolean deleteProduct(long id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) productRepository.delete(product.get());
        return product.isPresent();
    }
}
