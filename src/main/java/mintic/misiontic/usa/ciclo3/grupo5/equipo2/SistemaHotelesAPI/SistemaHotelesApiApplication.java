package mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"SistemaHotelesAPI.modelos"})  //Entidades de inicio del api, ruta de ejecución inicial.
public class SistemaHotelesApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SistemaHotelesApiApplication.class, args);
    }

}
