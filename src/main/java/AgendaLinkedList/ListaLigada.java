package AgendaLinkedList;
/**
 *
 * @author Morty
 */
public class ListaLigada {
    
    Node inicio;
    
    public ListaLigada(){
        this.inicio = null;
    }

    public boolean estaVacia(){
        return (inicio == null);
    }
    
    //INSERTAR AL INICIO
    //public void insertarInicio(String Nombre, int Edad, String Genero, String Correo, String Ciudad){
    //    Node nuevoNodo = new Node(Nombre, Edad, Genero, Correo, Ciudad);
    //INSERTAR AL INICIO
    
    //INSERTAR PERSONA
    public void insertarPersona(String Nombre, String Edad, String Genero, String Correo, String Ciudad){

        Node nuevoNodo = new Node(Nombre, Edad, Genero, Correo, Ciudad);
        Node aux = inicio;
        
        //COLOCAR AL INICIO SI NO HAY NADA
        if(inicio == null){
            inicio = nuevoNodo;
            return;
        }
        
        //COLOCA ANTES DEL INICIO (inicio.Nombre(b) & Nombre(a))
        if(inicio.Nombre.charAt(0) > Nombre.charAt(0)){
            nuevoNodo.sig = inicio;
            inicio = nuevoNodo;
            return;
        }
        //COLOCA DESPUES SI HAY SOLO UNO (inicio.Nombre(A) & Nombre(B))
        if(inicio.Nombre.charAt(0) < Nombre.charAt(0) && inicio.sig == null){
                inicio.sig = nuevoNodo;
                return;
        }
        Node auxRepetido = inicio;
        Node despuesRepetido = null;
        despuesRepetido = auxRepetido.sig;
        
        //EN CASO DE SER REPETIDO
        while(auxRepetido != null){
                if(despuesRepetido != null && auxRepetido.Nombre.charAt(0) == Nombre.charAt(0) && despuesRepetido.Nombre.charAt(0) != Nombre.charAt(0)){
                    nuevoNodo.sig = despuesRepetido;
                    auxRepetido.sig = nuevoNodo;
                    return;
                }
                if(despuesRepetido == null && auxRepetido.Nombre.charAt(0) == Nombre.charAt(0)){
                    auxRepetido.sig = nuevoNodo;
                    return;
                }
                auxRepetido = despuesRepetido;
                if(despuesRepetido != null){
                    despuesRepetido = despuesRepetido.sig;
                }
        }
        Node ant = null;
            while(aux != null){
                ant = aux;
                aux = aux.sig;
                if(aux != null && ant.Nombre.charAt(0) < Nombre.charAt(0) && Nombre.charAt(0) < aux.Nombre.charAt(0)){
                    nuevoNodo.sig = aux;
                    ant.sig = nuevoNodo;
                    return;
                }
                if(ant.Nombre.charAt(0) < Nombre.charAt(0) && aux == null){
                    ant.sig = nuevoNodo;
                    return;
                }
            }
            return;
    }
    
    //ELIMINAR AL INICIO
    public void eliminarInicio(){
        if(estaVacia()){
            System.out.println("La lista esta vacia");
            return;
        }
        Node siguienteNodo = inicio.sig;
        inicio = siguienteNodo;
        siguienteNodo = null;
    }    
    //ELIMINAR PERSONA ESPECIFICA    
    public void eliminarPersona(String NombreEliminar){
        if(estaVacia()){
            System.out.println("La lista esta vacia");
            return;
        }
        if(inicio.Nombre.equalsIgnoreCase(NombreEliminar)){
            eliminarInicio();
            return;
        }
        Node aux = inicio;
        Node ant = null;

        while(aux != null && aux.Nombre.equalsIgnoreCase(NombreEliminar) != true){
            ant = aux;
            aux = aux.sig;
        }
        if(aux == null){
            System.out.println("Elemento no existente");
            return;
        }
        ant.sig = aux.sig;
    }
    
    //MOSTRAR LISTA DESDE EL INICIO
    public void mostrarLista(){
        if(estaVacia()){
            System.out.println("Esta vacia la lista");
            return;
        }else{        
        Node auxiliarString = inicio;
        
        System.out.print(auxiliarString.toString());
        auxiliarString = auxiliarString.sig;
        return;
        }
    }
    
    //MOSTRAR LISTA POR INICIAL
    public void mostrarListaPorInicial(String Inicial){
        if(estaVacia()){
            System.out.println("Esta vacia la lista");
            return;
        }else{
        System.out.print(inicio.toStringInicial(Inicial));
            return;
        }
    }
}
