package com.sensiblemetrics.api.sqoola.common.configuration.properties;

@Component
@ConfigurationProperties("app")
public class MyAppProperties {
  private int refreshRate;
  private TimeUnit refreshTimeUnit;
  private Currency tradeCurrency;
    .............
}