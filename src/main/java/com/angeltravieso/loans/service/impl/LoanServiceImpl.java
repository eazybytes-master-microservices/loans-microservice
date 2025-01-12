package com.angeltravieso.loans.service.impl;

import com.angeltravieso.loans.dto.LoanDto;
import com.angeltravieso.loans.service.ILoanService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoanServiceImpl implements ILoanService {



    @Override
    public void create(LoanDto loanDto) {
        System.out.println("loan created");
    }
}
