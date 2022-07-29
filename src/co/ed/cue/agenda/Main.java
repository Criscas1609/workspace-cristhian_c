package co.ed.cue.agenda;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int contador = 0;
        int menu;
        Agenda agenda = new Agenda();
        Contacto[] lista = new Contacto[10];
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese lo que quiere hacer: " + "\n" +
                    "1. Agregar Contacto" + "\n" +
                    "2. Mirar si un contacto existe" + "\n" +
                    "3. Listar los Contactos" + "\n" +
                    "4. Buscar un contacto" + "\n" +
                    "5. Verificar si la agenda esta llena" + "\n" +
                    "6. Añadir mas espacios a la agenda" + "\n" +
                    "7. Eliminar un contacto"+"\n"+
                    "8. Salir"
            ));
            switch (menu) {
                case 1:
                    if(contador < 10) {

                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de su contacto");
                        String numero = JOptionPane.showInputDialog("Ingrese el numero del contacto " + nombre);
                        Contacto nuevoContacto = new Contacto(nombre, numero);
                        agenda.añardirContacto(nuevoContacto, contador, lista);
                        contador=contador+1;


                    }else{
                        JOptionPane.showMessageDialog(null,"Agenda llena");
                    }
                    break;
                case 2:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto que desea buscar");
                    agenda.buscarContacto(lista,nombre);
                    break;
                case 3:
                    agenda.imprimir(lista);
                    break;//me genera un error
                case 4:
                    String nombreContacto = JOptionPane.showInputDialog("Ingrese el nombre del contacto que desea buscar");
                    agenda.buscar(lista,nombreContacto);
                    break;
                case 5:
                    if (contador<9){
                        JOptionPane.showMessageDialog(null,"La agenda todavia tiene espacio");
                    }else{
                        JOptionPane.showMessageDialog(null,"La agenda esta llena");
                    }
                case 6://No lo entiendo
                case 7://No lo entiendo
            }

        }while (menu != 8);
    }
}
