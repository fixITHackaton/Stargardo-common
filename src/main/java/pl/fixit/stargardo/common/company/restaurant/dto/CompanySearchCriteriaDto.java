package pl.fixit.stargardo.common.company.restaurant.dto;

import lombok.Data;
import pl.fixit.stargardo.common.company.enums.CompanyCategory;

@Data
public class CompanySearchCriteriaDto {

    private String text;
    private CompanyCategory companyCategory;
    private Long subcategoryId;

}
