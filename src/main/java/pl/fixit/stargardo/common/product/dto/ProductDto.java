package pl.fixit.stargardo.common.product.dto;

import lombok.Data;

@Data
public class ProductDto {

    private Long id;
    private Long companyId;
    private String name;
    private Double price;
    private String description;
    private String photo;
    private Long amount;

}
