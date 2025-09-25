/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import java.util.List;
import java.util.ArrayList;
import objetosNegocio.Paciente;

/**
 *
 * @author Aaron
 */
public class PersistenciaPacientes {
    private List<Paciente> pacientes;

    public PersistenciaPacientes() {
        pacientes = new ArrayList<>();
    }
    
    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }
    
    public Paciente obtenerPacientePorId(int id) {
        Paciente pacienteObtenido = pacientes.parallelStream()
                .filter(paciente -> paciente.equals(new Paciente(id)))
                .findAny()
                .orElse(null);
        return pacienteObtenido;
    }
    
    public void actualizarPaciente(Paciente paciente) {
        int indice = pacientes.indexOf(paciente);
        if (indice < 0) {
            //TODO Manejo de excepciones
        }
        else {
            pacientes.set(indice, paciente);
        }
    }
    
    public void eliminarPaciente(Paciente paciente) {
        int indice = pacientes.indexOf(paciente);
        if (indice < 0) {
            //TODO Manejo de excepciones
        }
        else {
            pacientes.remove(indice);
        }
    }
    
    public List<Paciente> listaPacientes() {
        return pacientes;
    }
}
