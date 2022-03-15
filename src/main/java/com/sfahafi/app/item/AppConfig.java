package com.sfahafi.app.item;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	@Bean("clienteRest")
	@LoadBalanced											// utiliza ribbon como balanceador de carga con restTemplate
	public RestTemplate registrarRestTemplate() {           // restTemplate por debajo va a buscar la mejor instancia "con balanceo de carga"
		return new RestTemplate();
	}
}
