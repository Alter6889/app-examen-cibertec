package pe.edu.cibertec.app_examen_cibertec.Controller;

import pe.edu.cibertec.app_examen_cibertec.Service.MotoService;
import pe.edu.cibertec.app_examen_cibertec.model.Moto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/motos")
@RequiredArgsConstructor
public class MotoController {
    private final MotoService motoService;

    @PostMapping
    public Moto agregarMoto(@RequestBody Moto moto) {
        return motoService.agregarMoto(moto);
    }
    @GetMapping
    public List<Moto> listarMotos() {
        return motoService.listarMotos();
    }
}
