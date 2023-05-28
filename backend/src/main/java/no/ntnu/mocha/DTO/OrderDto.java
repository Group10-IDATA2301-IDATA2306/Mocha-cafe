package no.ntnu.mocha.DTO;

import java.time.LocalDateTime;

public class OrderDto {
    
    private long userId;
    private LocalDateTime date;


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
