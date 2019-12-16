package com.example.demo.conf;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class CommandLineAppStartupRunner  implements CommandLineRunner {

    private  PropertyServiceForJasyptStarter propertyServiceForJasyptStarter;

    public CommandLineAppStartupRunner(PropertyServiceForJasyptStarter propertyServiceForJasyptStarter) {
        this.propertyServiceForJasyptStarter = propertyServiceForJasyptStarter;
    }

    @Override
    public void run(String...args) throws Exception {
        System.out.println("***** " + propertyServiceForJasyptStarter.Evaluate());

    }

}
