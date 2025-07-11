package xyz.opaleiros.payment.processor.dtos.response.payment.summary;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PaymentSummary(
        @JsonProperty("default")
        Default mydefault,
        Fallback fallback
) {
}
