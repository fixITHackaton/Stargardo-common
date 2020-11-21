package pl.fixit.stargardo.common.company.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.stream.Stream;

@AllArgsConstructor
public enum CompanyCategory {

    FOOD(0),
    RETAIL(1),
    SERVICES(2);

    private Integer id;

    Integer getId() {
        return id;
    }

    public static CompanyCategory parse(Integer i) {
        return Arrays.stream(CompanyCategory.values())
                .filter(cc -> cc.getId().equals(i))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Company category not recognized."));
    }

}
