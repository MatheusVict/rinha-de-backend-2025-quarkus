package xyz.opaleiros.payment.processor.dtos.response.payment.summary;

public record Fallback(int totalRequests,
                       double totalAmount) {
}
