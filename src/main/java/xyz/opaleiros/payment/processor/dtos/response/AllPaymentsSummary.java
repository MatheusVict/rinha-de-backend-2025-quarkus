package xyz.opaleiros.payment.processor.dtos.response;

public record AllPaymentsSummary(
        int totalAmount,
        int totalRequests,
        double totalFee,
        double feePerTransaction
) {
}
