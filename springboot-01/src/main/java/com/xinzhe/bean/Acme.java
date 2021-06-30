package com.xinzhe.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.net.InetAddress;
import java.util.List;

@ConstructorBinding
@ConfigurationProperties("acme")
@Getter
//@Setter
public class Acme {

    private boolean enabled;

    private InetAddress remoteAddress;

    private Security security;

    public Acme(boolean enabled, InetAddress remoteAddress, Security security) {
        this.enabled = enabled;
        this.remoteAddress = remoteAddress;
        this.security = security;
    }
    @Getter
    @Setter
    public static class Security {

        private String username;

        private String password;

        private List<String> roles;

        public Security(String username, String password, @DefaultValue("USER") List<String> roles) {
            this.username = username;
            this.password = password;
            this.roles = roles;
        }
    }
}