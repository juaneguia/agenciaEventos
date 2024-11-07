import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int precioInvitado = 1000;
		double Descuento10 = 0.10;
		double SinDescuento = 0.0;

		List<Eventos> eventos = new ArrayList<>();
        Eventos e1 = new Eventos("Cumpleaños", 100000, 100, precioInvitado, "26/10/2024", "Casual", 1000, 1000, true, true, false);
        Eventos e2 = new Eventos("Casamiento", 200000, 200, precioInvitado, "26/10/2024", "Formal", 5000, 10000, true, true, true);
        Eventos e3 = new Eventos("Cumpleaños", 80000, 100, precioInvitado, "26/10/2024", "Tematico", 1000, 1000, true, true, false);
        Eventos e4 = new Eventos("Fiesta Corporativa", 120000, 35, precioInvitado, "26/10/2024", "Formal", 5000, 5000, false, false, true);
        Eventos e5 = new Eventos("Cumpleaños", 50000, 50, precioInvitado, "26/10/2024", "Casual", 1000, 1000, true, true, false);
        
        eventos.add(e1);
        eventos.add(e2);
        eventos.add(e3);
        eventos.add(e4);
        eventos.add(e5);
        
        List<Clientes> clientes = new ArrayList<>();
        Clientes c1 = new Clientes("Eugenio", 01, "2494-000000");
        Clientes c2 = new Clientes("Valen", 02, "2494-000001");
        Clientes c3 = new Clientes("Cristian", 03, "2494-000002");
        Clientes c4 = new Clientes("Betina", 04, "2494-000003");
        Clientes c5 = new Clientes("Hernan", 05, "2494-000004");
        
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
        clientes.add(c5);

        System.out.println("El precio fimal es de $" + e1.calcularCostoEvento());
        
    	List<MetodosDePago> metodoDePago = new ArrayList<>();
        MetodosDePago p1 = new MetodosDePago( false, 1, Descuento10);
        MetodosDePago p2 = new MetodosDePago(true, 3, SinDescuento);
        MetodosDePago p3 = new MetodosDePago(true, 6, SinDescuento);
        
        metodoDePago.add(p1);
        metodoDePago.add(p2);
        metodoDePago.add(p3);
        
    	List<Ventas> ventas = new ArrayList<>();
        Ventas v1 = new Ventas(p2, e1, c1);
        Ventas v2 = new Ventas(p3, e2, c2);
        Ventas v3 = new Ventas(p1, e3, c3);
        Ventas v4 = new Ventas(p2, e4, c4);
        Ventas v5 = new Ventas(p1, e5, c5);
        
        ventas.add(v1);
        ventas.add(v2);
        ventas.add(v3);
        ventas.add(v4);
        ventas.add(v5);
        
        System.out.println("El precio final ahora es de $" + v1.calcularMontoAPagar());
        System.out.println("El precio final ahora es de $" + v2.calcularMontoAPagar());
        
        Scanner leer = new Scanner(System.in); 
        System.out.println("Dime el nombre del vendedor");
        String nombreVendedor = leer.next(); 
        
        boolean encontrado = false;
        int j=0;
        while(!encontrado && j<clientes.size()) {
    	   
    	   if (clientes.get(j).getNombre().equals(nombreVendedor)) {	
       		System.out.println(clientes.get(j).toString());
       		encontrado = true;
       }
    	  j++; 
       }
        
       // for (int i=0; i<clientes.size();i++) {
       // 	if (clientes.get(i).getNombre().equals(nombreVendedor)) {	
       // 		System.out.println(clientes.get(i).toString());
       // 		encontrado = true;
       // 	}
      //  }        		
        
        if (!encontrado) {
        	System.out.println("No se encontro vendedor"); //Esto es para mostrar en el caso que no encuentre vendedor en el for
        }
        
        // hacer busqueda de clientes con while 
        // calcular total de las ventas
        // cual es el evento mas carongjy
        
        double totalVentas=0;
        System.out.println("Total de ventas");
     
        for (int i=0; i<ventas.size();i++) {
        	totalVentas=totalVentas+ventas.get(i).calcularMontoAPagar();
        	
         }  
        System.out.println("El precio total es de $" + totalVentas);
        
        System.out.println("Evento mas caro");
        double eventoMasCaro=0;
        
        for (int i=0; i<ventas.size();i++) {
        	if(eventoMasCaro<ventas.get(i).calcularMontoAPagar()) {
        		eventoMasCaro=ventas.get(i).calcularMontoAPagar();
        		
        	}
        }
        System.out.println("El evento mas caro es " + eventoMasCaro);
        
	}

}
