public class Main {
    public static void main(String[] args) {
        int l = 9;
        int x = 0;
        String Modificaciones = "";
        int CantidadNombres;

    //Aquí se harán algunas modificaciones
        int i = 0;
        String cambios = "Nuevos Cambios";
        String nombres[][] = {
                {"Jose", "Maria", "Raul"},
                {"Jean", "Vicente","Lucía"},
                {"Junior", "Saul", "Laura"},
        System.out.println(cambios);
    }
       // Saul
        //System.out.println(nombres[2][1]);*/
    //  for(int j = 0; j<nombres[2].length; j++)
       //     System.out.println(nombres[1][j]);*/
        for(int i = 0; i < nombres.length; i++){
            for(int j = 0; j<nombres[i].length; j++){
                System.out.println(nombres[i][j]);
            }
        }
        System.out.println("Modificaciones hechas desde la PC");
}}
