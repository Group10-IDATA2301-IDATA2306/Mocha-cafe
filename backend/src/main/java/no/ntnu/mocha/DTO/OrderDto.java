package no.ntnu.mocha.DTO;

import java.time.LocalDate;

public class OrderDto {
    
    private long userId;
    private String date;

    public long getUserId() { return userId; }
    public LocalDate getDate() { return LocalDate.parse(date); }
}
