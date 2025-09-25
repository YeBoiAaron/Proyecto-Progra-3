/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import objetosNegocio.Paciente;

/**
 *
 * @author Aaron
 */
public interface IPersistenciaFachada {
    public void agregarPaciente(Paciente paciente);
    public Paciente obtenerPacientePorId(int id);
    public void actualizarPaciente(Paciente paciente);
    public void eliminarPaciente(Paciente paciente);
    public List<Paciente> listaPacientes();
}
