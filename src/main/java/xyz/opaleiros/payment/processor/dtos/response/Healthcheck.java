package xyz.opaleiros.payment.processor.dtos.response;

public record Healthcheck(
        boolean failing,
        int minResponseTime
) {
}
