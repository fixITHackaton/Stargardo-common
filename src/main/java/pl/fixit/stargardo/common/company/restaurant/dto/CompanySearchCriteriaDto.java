package pl.fixit.stargardo.common.company.restaurant.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import pl.fixit.stargardo.common.company.enums.CompanyCategory;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanySearchCriteriaDto {

    private String text;
    private CompanyCategory companyCategory;
    private Long subcategoryId;

}
