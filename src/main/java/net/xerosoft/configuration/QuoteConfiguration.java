package net.xerosoft.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan(basePackages = "net.xerosoft")
public class QuoteConfiguration {
}

