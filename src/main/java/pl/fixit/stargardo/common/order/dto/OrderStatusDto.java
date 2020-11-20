package pl.fixit.stargardo.common.order.dto;

import lombok.Data;

@Data
public class OrderStatusDto {

    private Long orderId;
    private boolean paid;

}
