package composicion;

public class Resultado {

    public static void main(String args[]) {
// se crean dos instancias de la clase Vehiculo
        Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco", 100.0);
        Vehiculo vehiculo2 = new Vehiculo("2345 JVM", "SEAT", "León", "Negro", 80.0);
// se crea una instancia de la clase Cliente
        Cliente cliente1 = new Cliente("30435624X", "Juan", "Pérez");

        VehiculoAlquilado alquiler1 = new VehiculoAlquilado(cliente1, vehiculo1, 11, 11, 2011, 2);

        System.out.println("Vehículo alquilado");

        System.out.println("Cliente : " + " " + alquiler1.getCliente().getNombre() + " " + alquiler1.getCliente().getApellidos());

        System.out.println("Vehículo: " + alquiler1.getVehiculo().getMatricula());

    }

}
