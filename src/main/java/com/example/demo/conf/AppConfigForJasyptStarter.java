package com.example.demo.conf;

import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;
import org.springframework.context.annotation.Configuration;

@Configuration
@EncryptablePropertySource(name = "EncryptedProperties", value = "classpath:application.properties")
public class AppConfigForJasyptStarter {
}
