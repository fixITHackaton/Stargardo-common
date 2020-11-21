package pl.fixit.stargardo.common.product.dto;

import lombok.Data;

@Data
public class ProductDto {

    private Long id;
    private String name;
    private Double price;
    private String description;
    private byte[] photo;
    private Long amount;

}
