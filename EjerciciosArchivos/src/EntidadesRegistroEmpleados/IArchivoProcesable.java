package EntidadesRegistroEmpleados;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Fabri
 */
public interface IArchivoProcesable {
    List<Empleado> leer(String path) throws FilaInvalidaException, IOException;
    
    void escribir(String path, List<Empleado>empleados, boolean seAppendea) throws IOException;
}
