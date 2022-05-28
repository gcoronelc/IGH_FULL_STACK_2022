/*Participantes:
	 Maria del Rosario Huaroto Cardenas
	 Ronaldo Zanabria Roman
	 Brayam Hurtado Yalico
	 Jeanfranco Navarro Vargas
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Jeanfranco
 */
public class Proyecto5 {

	public static void main(String[] args) {
		//Variables
		Scanner scaner = new Scanner(System.in);
		int horas;
		float pago, importe = 0, importeFinal = 0, descuento = 0;

		//Lecturas
		System.out.println("Horas: ");
		horas = scaner.nextInt();
		System.out.println("Pago: ");
		pago = scaner.nextFloat();

		//Procesos
		importe = (horas > 40) ? ((40 * pago) + ((horas - 40) * (pago + (pago / 2)))) : (horas * pago);
		importeFinal = (float) ((importe > 2000) ? importe - (importe * 0.08) : importe);
		descuento = (importeFinal - importe);

		//Salida
		System.out.println("importe:  " + importe);
		System.out.println("Descuento: " + descuento);
		System.out.println("importe Final: " + importeFinal);

	}
	/* private static double Importe(int horas, double pago,int HE,double pagoExtra,double PI,double importe, double importeF,double descuento){
        if(horas>40){//48--200
            PI=40*pago; //40*200=8000
            HE = horas-40;//48-40=8 horas extras
            pagoExtra= HE * (pago+(pago*0.5));//8*(200+(200*0.5))=8*(200+100)=8*300=2400
            importe=PI+pagoExtra;//8000+2400=10400
        }else{
            importe=horas*pago;
        }
        if(importe>2000){
            descuento=(importe*0.08);//10400*0.08=832
            importeF=importe-descuento;//10400-10400*0.08=10400-832=9568
        }else descuento=0;importeF=importe-descuento;
        System.out.println("Usted trabajó "+HE+" horas extras");
        System.out.println("Su pago inicial fue de: "+PI);
        System.out.println("Su importe extra fue de: "+pagoExtra);
        System.out.println("Su importe es de: "+importe);
        System.out.println("Su descuento fue de: "+descuento);
        return importeF;
    }*/
 /*//Variables
        Scanner datos = new Scanner(System.in); 
        int horas,horasExtra=0;
        double pago,importeFinal=0,pagoExtra=0,PagoInicial=0,calculoPago=0,descuento=0;
        //Lectura
        System.out.println("Ingrese las horas trabajadas: ");
             horas= datos.nextInt();     
        System.out.println("Ingrese el pago x hora : ");
            pago = datos.nextDouble();
            
        //Procesos
        importeFinal=Importe(horas,pago,horasExtra,pagoExtra,PagoInicial,calculoPago,importeFinal,descuento);

        //Salida
        System.out.println("Su importe final sería: "+importeFinal);*/

}
