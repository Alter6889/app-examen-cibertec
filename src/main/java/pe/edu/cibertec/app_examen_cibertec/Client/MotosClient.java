package pe.edu.cibertec.app_examen_cibertec.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.cibertec.app_examen_cibertec.model.Moto;

@FeignClient(name = "moto",url = "http://localhost:8080/motos")
public interface MotosClient {
    @GetMapping("/{id}")
    Moto obtenerMoto(@PathVariable("id") int id);

}
