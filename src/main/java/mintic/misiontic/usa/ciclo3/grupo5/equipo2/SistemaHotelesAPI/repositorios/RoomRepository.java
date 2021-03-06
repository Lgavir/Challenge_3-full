
package mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.repositorios;

import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.modelos.Room;
import mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI.repositorios.crud.InterfaceRoom;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class RoomRepository {
    @Autowired
    private InterfaceRoom crud;
    
    public List<Room> getAll(){
        return (List<Room>) crud.findAll();
    }
    public Optional <Room> getRoom(int id){
        return crud.findById(id);
    }
    
    public Room save(Room room){
        return crud.save(room);
    }
    
    public void delete (Room room){
        crud.delete(room);
    }
}
