package co.ed.cue.agenda;

import javax.swing.*;

public class Agenda {

    private Contacto contactos;
    private int contador;
    private Contacto agenda[];

    public Contacto getContactos() {
        return contactos;
    }

    public void setContactos(Contacto contactos) {
        this.contactos = contactos;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Contacto[] getAgenda() {
        return agenda;
    }

    public Contacto[] setAgenda(Contacto[] agenda) {
        this.agenda = agenda;
        return agenda;
    }

    public void Agenda() {

    }

    public void Agenda(Contacto contactos, int contador) {
        this.contactos = contactos;
        this.contador = contador;
    }

    public Contacto[] añardirContacto(Contacto contactos, int contador, Contacto[] agenda) {
        agenda[contador] = contactos;
        contador = contador + 1;
        return agenda;
    }

    public Contacto[] buscarContacto(Contacto[] agenda, String busqueda) {
        for (int i = 0; i <= agenda.length; i++) {
            if (agenda[i].getNombre().equalsIgnoreCase(busqueda)) {
                JOptionPane.showMessageDialog(null, "El contacto " + busqueda + " si existe");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "El contacto " + busqueda + " no existe");
            }
        }
        return agenda;
    }

    public Contacto[] imprimir(Contacto[] agenda) {
        int j = 0;
        for (int i = 0; i <= agenda.length; i++) {
            j = j + 1;
            String nombre = agenda[i].getNombre();
            String numero = agenda[i].getNumero();
            JOptionPane.showMessageDialog(null, "El contacto " + j + " es:" + "\n" +
                    nombre + "\n" +
                    "Su numero es: " + numero
            );
            //Tiene errores
        }
        return agenda;
    }

    public Contacto[] buscar(Contacto[] agenda, String busqueda) {
        for (int i = 0; i <= agenda.length; i++) {
            if (agenda[i].getNombre().equalsIgnoreCase(busqueda)) {
                JOptionPane.showMessageDialog(null, "Contacto: " + busqueda + " \n numero: " + agenda[i].getNumero());
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Contacto " + busqueda + " no fue encontrado");
            }
        }
        return agenda;
    }
}
