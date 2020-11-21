package pl.fixit.stargardo.common.company.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
public enum CompanyCategory {

    FOOD(0),
    RETAIL(1),
    SERVICES(2);

    @Getter
    private Integer id;

    public static CompanyCategory parse(Integer i) {
        return Arrays.stream(CompanyCategory.values())
                .filter(cc -> cc.getId().equals(i))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Company category not recognized."));
    }

}
