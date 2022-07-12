
package Asociacion;

class Unidireccional
{
    public static void main (String[] args)
    {
        Banco bank = new Banco("BCP");
        Empleado emp = new Empleado("Jorge");
         
        System.out.println(emp.getEmpleadoNombre() +
         " trababaja en " + bank.getBancoNombre());
    }
}