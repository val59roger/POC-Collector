package com.poc.commande;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/** Corps de la requête POST /orders. */
public record OrderRequest(
        @NotNull Long productId,
        @Min(1) int quantity) {
}
