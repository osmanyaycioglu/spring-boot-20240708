package org.training.turkcell.springboot.rest.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class ErrorObj {
    private List<ErrorObj> subErrors;
    private String         desc;
    private Integer        errorCode;


    public ErrorObj() {
    }

    @Builder(setterPrefix = "with")
    public ErrorObj(final List<ErrorObj> subErrors,
                    final String desc,
                    final Integer errorCode) {
        this.subErrors = subErrors;
        this.desc      = desc;
        this.errorCode = errorCode;
    }
}
