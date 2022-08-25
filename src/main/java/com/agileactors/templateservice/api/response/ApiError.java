package com.agileactors.templateservice.api.response;

import java.time.LocalDateTime;

public record ApiError(
    LocalDateTime timestamp,
    String message
) {
}