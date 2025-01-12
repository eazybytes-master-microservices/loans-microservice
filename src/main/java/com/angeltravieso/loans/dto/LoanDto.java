package com.angeltravieso.loans.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class LoanDto {
//    @NotEmpty(message = "The mobileNumber is required")
//    @Max(message = "The mobileNumber should be length of 15", value = 15)
    private String mobileNumber;

//    @NotEmpty(message = "The loanType is required")
    private String loanType;

//    @NotEmpty(message = "The amountPaid is required")
//    @Positive(message = "The amountPaid should be greather than cero (0)")
    private String amountPaid;
}
