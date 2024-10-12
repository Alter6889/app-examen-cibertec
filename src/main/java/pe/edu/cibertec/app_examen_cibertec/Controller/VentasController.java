package pe.edu.cibertec.app_examen_cibertec.Controller;

import pe.edu.cibertec.app_examen_cibertec.Client.MotosClient;
import pe.edu.cibertec.app_examen_cibertec.Service.VentaService;
import pe.edu.cibertec.app_examen_cibertec.model.Ventas;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.app_examen_cibertec.model.Moto;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/ventasi")
@RequiredArgsConstructor
public class VentasController {
    private final VentaService ventaService;
    private final MotosClient motosClient;

    @PostMapping
    public Ventas crearVenta(@RequestBody Ventas ventas) {
        Moto moto = motosClient.obtenerMoto(ventas.getIdV());
        return ventaService.crearVentas(ventas);
    }
    @GetMapping
    public List<Ventas> obtenerVentas() {
        return ventaService.listarVentas();
    }
}
