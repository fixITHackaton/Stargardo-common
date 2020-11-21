package pl.fixit.stargardo.common.company.restaurant.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CompanySearchCriteriaDto {

    private String text;
    private Long categoryId;
    private Long subcategoryId;

}
