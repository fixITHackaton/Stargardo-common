package pl.fixit.stargardo.common.order.dto;

import lombok.Data;
import pl.fixit.stargardo.common.product.dto.ProductDto;

import java.util.List;

@Data
public class OrderDto {

    private Long id;
    private String name;
    private String surname;
    private String address;
    private Long restaurantId;
    private String deliveryTime;
    private List<ProductDto> products;
    private String note;
    private Long price;
    private Long paymentType;

}
