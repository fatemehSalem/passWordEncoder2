package com.example.demo.conf;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class PropertyServiceForJasyptStarter {
    @Value("${myPass.enc}")
    private String property;
    @Value("${username}")
    private String username;

    public Boolean Evaluate() {
        System.out.println("username: " + username);
        System.out.println("plainPass: " + property);

        if("abc12345@".equals(property))
            return  true;
        else
            return false;

    }
}
