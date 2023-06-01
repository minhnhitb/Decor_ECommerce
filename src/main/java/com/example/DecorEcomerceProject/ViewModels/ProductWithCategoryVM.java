package com.example.DecorEcomerceProject.ViewModels;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ProductWithCategoryVM {
    private String name;
    private String description;
    private int inventory;
    private BigDecimal price;
    private String imageUrl;
}
