package pl.fixit.stargardo.common.company.dto;

import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Data
public class CompanyDto {

    private Long id;
    private String name;
    private String telephone;
    private CompanyCategoryDto companyCategories;
    private List<CompanySubcategoryDto> companySubcategories;
    private byte[] image;
    private LocalTime openingHour;
    private LocalTime closingHour;

}
