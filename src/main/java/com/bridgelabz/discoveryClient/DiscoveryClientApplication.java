package com.bridgelabz.discoveryClient;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author bridgelabz
 * @since 7/8/2018 <br>
 *        <p>
 *        a entity providing DiscoveryClientApplication related information
 *        </p>
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="UserDiscoveryClient")
public class DiscoveryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryClientApplication.class, args);
	}
}
