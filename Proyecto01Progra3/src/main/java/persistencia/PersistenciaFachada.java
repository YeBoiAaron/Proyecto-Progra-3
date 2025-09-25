/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List;
import interfaces.IPersistenciaFachada;
import objetosNegocio.Paciente;
import daos.PersistenciaPacientes;

/**
 *
 * @author Aaron
 */
public class PersistenciaFachada implements IPersistenciaFachada {
    private PersistenciaPacientes persistenciaPacientes;

    public PersistenciaFachada() {
        persistenciaPacientes = new PersistenciaPacientes();
    }

    @Override
    public void agregarPaciente(Paciente paciente) {
        //TODO Agregar lógica de persistencia
        persistenciaPacientes.agregarPaciente(paciente);
        
    }

    @Override
    public Paciente obtenerPacientePorId(int id) {
        //TODO Agregar lógica de persistencia
        return persistenciaPacientes.obtenerPacientePorId(id);
    }
    
    @Override
    public void actualizarPaciente(Paciente paciente) {
        //TODO Agregar lógica de persistencia
        persistenciaPacientes.actualizarPaciente(paciente);
    }

    @Override
    public void eliminarPaciente(Paciente paciente) {
        //TODO Agregar lógica de persistencia
        persistenciaPacientes.eliminarPaciente(paciente);
    }

    @Override
    public List<Paciente> listaPacientes() {
        return persistenciaPacientes.listaPacientes();
    }
    
}
