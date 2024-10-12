package pe.edu.cibertec.app_examen_cibertec.Service;
import lombok.RequiredArgsConstructor;
import pe.edu.cibertec.app_examen_cibertec.model.Ventas;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VentaService {
    private final List<Ventas> ventasi = new ArrayList();

    public  Ventas crearVentas(Ventas ventas) {
        ventasi.add(ventas);
        return ventas;
    }
    public List<Ventas> listarVentas() {
        return ventasi;
    }
}
