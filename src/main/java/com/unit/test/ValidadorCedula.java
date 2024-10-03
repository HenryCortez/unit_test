package com.unit.test;

public class ValidadorCedula {
    public static boolean validar(String cedula) {
        boolean response  = false;
        if (!longitudCorrecta(cedula)) 
            return response;

        // Solo números
        if(!soloNumeros(cedula))
            return response;
        
        if(!rangoCedulasValidas(cedula))
            return response;

        if(!tercerDigito(cedula))
            return response;  
       
        if (!numVerificador(cedula))
            return response;
        // Digito verificador
        
        return  true;
    }


    public static boolean longitudCorrecta(String cedula) {
        return cedula.length() == 10;
    }

    public static boolean soloNumeros(String cedula) {
        try {
            Long.parseLong(cedula);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean rangoCedulasValidas(String cedula) {
        int valor = Integer.parseInt(cedula.substring(0, 2));
        if (valor < 1 || valor > 24) 
            return false;
        return true;
    }

    public static boolean tercerDigito(String cedula) {
        int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
        if (tercerDigito > 5) 
            return false;    
        return true;
    }

    public static boolean numVerificador(String cedula) {
        int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int suma = 0;
        int digitoVerificador = Integer.parseInt(cedula.substring(9, 10));
        for (int i = 0; i < 9; i++) {
            int valor_ = Integer.parseInt(cedula.substring(i, i + 1));
            int producto = valor_ * coeficientes[i];
            if (producto >= 10) {
                producto -= 9;
            }
            suma += producto;
        }
        int residuo = suma % 10 == 0 ? 0 : 10 - (suma % 10);
        if (residuo != digitoVerificador) {
            return false;
        }
        return true;
    }

    public void instanciaCorrecta(){
        System.out.println("Instancia correcta");
    }

}
