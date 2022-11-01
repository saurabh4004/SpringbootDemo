package com.neosoft.SpringBasic.libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
@Profile("remote")
public class RemoteWebDriverFactory {

    @Value("${grid.url}")
    public URL gridURL;

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    @Scope("browserscope")
    public WebDriver getRemoteWebDriverForChrome()  {
        return new RemoteWebDriver(gridURL, DesiredCapabilities.chrome());
    }

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    @Scope("browserscope")
    public WebDriver getRemoteDriverForFirefox(){
        return new RemoteWebDriver(gridURL,DesiredCapabilities.firefox());
    }
}
