package com.aniket.ledger.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    @GetMapping
    public List<AccountResponse> listAccounts() {
        return List.of(
                new AccountResponse(UUID.randomUUID(), "Aniket", "INR", new BigDecimal("5000.00")),
                new AccountResponse(UUID.randomUUID(), "Riya", "INR", new BigDecimal("1250.50"))
        );
    }
}