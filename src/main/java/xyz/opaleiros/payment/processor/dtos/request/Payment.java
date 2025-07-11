package xyz.opaleiros.payment.processor.dtos.request;

import java.sql.Date;

public record Payment(String correlationId,
                      double amount,
                      Date requestedAt) {
}
