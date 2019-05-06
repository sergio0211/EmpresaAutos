
package empresaAutos;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        
        Camioneta camioneta = new Camioneta(10, 4, 17, "SGR 678", 123, "Ford", 2018, 5200000);
        
        Vagoneta vagoeta = new Vagoneta(6, "SPU 723", 124, "Audi", 2014, 4800000);
        
        empresa.registrarAuto(vagoeta);
        empresa.registrarAuto(camioneta);
        
        //listar
        
        HashMap<String,Auto> autos = empresa.listarAutos();
        for (Auto auto : autos.values()){
            System.out.println(auto.getNserie());
            System.out.println(auto.getPlaca());
            System.out.println(auto.getAnio());
            System.out.println(auto.getPrecio());
            System.out.println(auto.getMarca());
        }
        
    }
}
