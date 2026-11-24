public class MainClass {

    public static void main(String[] args) {

        caso1();
        System.out.println();

        caso2();
        System.out.println();

        caso3();
    }


    //Caso 1: Conexiones entre ciudades
    // No dirigido, sin etiquetas -> LISTA DE ADYACENCIA

    public static void caso1() {

        System.out.println("Caso 1: Conexiones entre ciudades");


        Nodo<String> cali     = new Nodo<>(0, "Cali");
        Nodo<String> medellin = new Nodo<>(1, "Medellín");
        Nodo<String> ibague   = new Nodo<>(2, "Ibagué");
        Nodo<String> bogota   = new Nodo<>(3, "Bogotá");
        Nodo<String> popayan  = new Nodo<>(4, "Popayán");
        Nodo<String> pereira  = new Nodo<>(5, "Pereira");

        // false = NO dirigido
        Grafo_LA<String> grafo = new Grafo_LA<>(false);

        grafo.agregarNodo(cali);
        grafo.agregarNodo(medellin);
        grafo.agregarNodo(ibague);
        grafo.agregarNodo(bogota);
        grafo.agregarNodo(popayan);
        grafo.agregarNodo(pereira);


        grafo.agregarArista(cali, medellin);
        grafo.agregarArista(cali, pereira);
        grafo.agregarArista(cali, ibague);
        grafo.agregarArista(cali, bogota);
        grafo.agregarArista(cali, popayan);
        grafo.agregarArista(medellin, bogota);

        grafo.mostrarGrafo();
    }

    //Caso 2: Red social (Instagram)
    // Dirigido, sin etiquetas -> LISTA DE ADYACENCIA

    public static void caso2() {

        System.out.println("Caso 2: Red social (Instagram)");


        Nodo<String> sebas  = new Nodo<>(0, "Sebas");
        Nodo<String> sofia  = new Nodo<>(1, "Sofia");
        Nodo<String> andres = new Nodo<>(2, "Andres");
        Nodo<String> jhon   = new Nodo<>(3, "Jhon");
        Nodo<String> trueno = new Nodo<>(4, "Trueno");
        Nodo<String> milo   = new Nodo<>(5, "Milo J");

        // true = dirigido
        Grafo_LA<String> grafo = new Grafo_LA<>(true);

        grafo.agregarNodo(sebas);
        grafo.agregarNodo(sofia);
        grafo.agregarNodo(andres);
        grafo.agregarNodo(jhon);
        grafo.agregarNodo(trueno);
        grafo.agregarNodo(milo);

        // Solo en un sentido
        grafo.agregarArista(sebas, trueno);
        grafo.agregarArista(sebas, milo);

        // En ambos sentidos = DOS aristas dirigidas
        grafo.agregarArista(sebas, sofia);
        grafo.agregarArista(sofia, sebas);

        grafo.agregarArista(sebas, andres);
        grafo.agregarArista(andres, sebas);

        grafo.agregarArista(sebas, jhon);
        grafo.agregarArista(jhon, sebas);

        grafo.agregarArista(andres, jhon);
        grafo.agregarArista(jhon, andres);

        grafo.agregarArista(trueno, milo);
        grafo.agregarArista(milo, trueno);

        grafo.mostrarGrafo();
    }


    //Caso 3: Rutas de envío y precios
    // Dirigido, con etiquetas -> MATRIZ DE ADYACENCIA

    public static void caso3() {

        System.out.println("Caso 3: Rutas de envío y precios");


        Nodo<String> medellin = new Nodo<>(1, "Medellín"); 
        Nodo<String> ibague   = new Nodo<>(2, "Ibagué");   
        Nodo<String> pereira  = new Nodo<>(3, "Pereira");  
        Nodo<String> cali     = new Nodo<>(4, "Cali");     
        Nodo<String> popayan  = new Nodo<>(5, "Popayán");  
        Nodo<String> bogota   = new Nodo<>(6, "Bogotá");   

        // true = dirigido
        Grafo_MA<String> grafo = new Grafo_MA<>(true);

        grafo.agregarNodo(medellin);
        grafo.agregarNodo(ibague);
        grafo.agregarNodo(pereira);
        grafo.agregarNodo(cali);
        grafo.agregarNodo(popayan);
        grafo.agregarNodo(bogota);

        grafo.agregarArista(cali, medellin, 7000);
        grafo.agregarArista(cali, ibague, 12000);
        grafo.agregarArista(cali, pereira, 8000);
        grafo.agregarArista(cali, popayan, 8000);
        grafo.agregarArista(bogota, cali, 5000);
        grafo.agregarArista(bogota, medellin, 7000);
        grafo.agregarArista(ibague, pereira, 8000);

        grafo.mostrarGrafo();
    }
}
