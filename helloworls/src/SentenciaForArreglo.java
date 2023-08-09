import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Alejandra","Angel","Santiago","Carmen","lizeth","Diana"};

        int cantidad = nombres.length;

        for(int i = 0; i < cantidad ;i++ ){
            if(nombres[i].equalsIgnoreCase("Angel")||
                    nombres[i].equalsIgnoreCase("Diana")){
                continue;
            }
            System.out.println((i+1) + ".-" + nombres[i]);

        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre: ");

        boolean encontrado = false;

        for (int i = 0 ; i < cantidad; i++ ){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }

        }

        if(encontrado){
            JOptionPane.showMessageDialog(null,buscar + " Fue encontrado");
        }else{
            JOptionPane.showMessageDialog(null,buscar + " No existe en el sistema");
        }


    }
}
