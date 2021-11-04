package mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.controladores;

import java.util.List;
import java.util.Optional;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.modelos.Message;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.servicios.ServicioMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ControladorMessage {

    @Autowired
    private ServicioMessage servicios;

    @GetMapping("/all")
    public List<Message> getCategoria() {
        return servicios.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Message> getCategoria(@PathVariable("id") int id) {
        return servicios.getCategoria(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Message categoria) {
        servicios.save(categoria);
    }
}
