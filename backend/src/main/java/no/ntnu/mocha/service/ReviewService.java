package no.ntnu.mocha.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import no.ntnu.mocha.DTO.ReviewDto;
import no.ntnu.mocha.domain.entities.Product;
import no.ntnu.mocha.domain.entities.Review;
import no.ntnu.mocha.domain.entities.User;
import no.ntnu.mocha.domain.repository.ProductRepository;
import no.ntnu.mocha.domain.repository.ReviewRepository;
import no.ntnu.mocha.domain.repository.UserRepository;

@Service
public class ReviewService {
    
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;



    public Iterable<Review> getAll() {
        return reviewRepository.findAll();
    }


    public Review addReview(ReviewDto dto) {
        Optional<User> user = userRepository.findById(dto.getUserId());
        Optional<Product> product = productRepository.findById(dto.getProductId());

        if (!user.isPresent() || !product.isPresent()) return null;

        Review review = new Review(
            user.get(), 
            product.get(), 
            dto.getComment(), 
            dto.getStars()
        );

        return reviewRepository.save(review);
    }


    public void updateReview(long id, ReviewDto dto) {
        reviewRepository.updateReview(
            id, 
            dto.getUserId(), 
            dto.getProductId(), 
            dto.getComment(), 
            dto.getDate(), 
            dto.getStars()
        );
    }


    public void deleteReview(long id) {
        reviewRepository.deleteById(id);
    }
}
