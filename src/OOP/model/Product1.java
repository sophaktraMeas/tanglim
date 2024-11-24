package OOP.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
public class Product1 {
    private Integer id;
    private String uuid;
    private String productName;
    private Double price;
    private String image;
    private String description;
    private LocalDateTime releasedDate;
    private LocalDateTime expiresDate;
}