package com.example.ecommerce.config;




import com.mercadopago.MercadoPagoConfig;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;




@Component
public class MercadoPagoConfiguration
{
    @Value("${mercadopago.access.token}") // Obtenemos el valor de esta propiedad desde el application.properties y la almacenamos
    private String accessToken;

    @PostConstruct // Esta función se llamará luego de que cargue la aplicación Spring
    public void init() {
        MercadoPagoConfig.setAccessToken(accessToken);
    }
}
