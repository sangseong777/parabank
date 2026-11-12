package com.parasoft.parabank.util;

import org.springframework.context.annotation.Configuration;
import io.sentry.spring7.EnableSentry;

@EnableSentry(
  dsn = "https://e008b7f74c44cb08e67f3cf3cef681d4@o4512302400995328.ingest.us.sentry.io/4512421002412032",
  // Add data like request headers and IP for users,
  // see https://docs.sentry.io/platforms/java/guides/spring/data-management/data-collected/ for more info
  sendDefaultPii = true
)
@Configuration
class SentryConfiguration {
}
