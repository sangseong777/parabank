package com.parasoft.parabank.util;

import org.springframework.context.annotation.Configuration;
import io.sentry.spring.jakarta.EnableSentry;

@Configuration
@EnableSentry(
    dsn = "https://e008b7f74c44cb08e67f3cf3cef681d4@o4512302400995328.ingest.us.sentry.io/4512421002412032",
    sendDefaultPii = true
)
public class SentryConfiguration {
}
