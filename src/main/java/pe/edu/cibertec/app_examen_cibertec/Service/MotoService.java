package pe.edu.cibertec.app_examen_cibertec.Service;

import lombok.RequiredArgsConstructor;
import pe.edu.cibertec.app_examen_cibertec.model.Moto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MotoService {
    private final List<Moto> motos = new ArrayList<>();

    public Moto agregarMoto(Moto moto) {
        motos.add(moto);
        return moto;
    }
    public List<Moto> listarMotos() {
        return motos;
    }
}
