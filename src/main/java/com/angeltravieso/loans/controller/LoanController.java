package com.angeltravieso.loans.controller;

import com.angeltravieso.loans.dto.LoanDto;
import com.angeltravieso.loans.service.ILoanService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
@Validated
public class LoanController {

    @Autowired
    private ILoanService loanService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@Valid @RequestBody LoanDto loanDto)  {
        loanService.create(loanDto);

        return ResponseEntity.ok("Test");
    }

}
