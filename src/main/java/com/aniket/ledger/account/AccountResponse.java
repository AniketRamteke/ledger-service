package com.aniket.ledger.account;

import java.math.BigDecimal;
import java.util.UUID;

public record AccountResponse(
        UUID id,
        String ownerName,
        String currency,
        BigDecimal balance
) {
}