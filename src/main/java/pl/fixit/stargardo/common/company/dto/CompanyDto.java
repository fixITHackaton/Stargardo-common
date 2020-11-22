package pl.fixit.stargardo.common.company.dto;

import lombok.Data;
import pl.fixit.stargardo.common.company.enums.CompanyCategory;

import java.util.List;

@Data
public class CompanyDto {

    private Long id;
    private String name;
    private String address;
    private String description;
    private String telephone;
    private CompanyCategory companyCategory;
    private List<CompanySubcategoryDto> companySubcategories;
    private String image;
    private String openingHour;
    private String closingHour;
    private String nip;
    private String accountNumber;
    private String email;

}
