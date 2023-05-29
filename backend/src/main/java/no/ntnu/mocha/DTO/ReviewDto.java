package no.ntnu.mocha.DTO;

import java.time.LocalDateTime;

public class ReviewDto {
    
    private long userId;
    private long productId;
    private int stars;
    private String comment;
    private LocalDateTime date;

    public long getUserId() { return userId; }
    public long getProductId() { return productId; }
    public String getComment() { return comment; }
    public int getStars() { return stars; }
    public LocalDateTime getDate() { return date; }
}
