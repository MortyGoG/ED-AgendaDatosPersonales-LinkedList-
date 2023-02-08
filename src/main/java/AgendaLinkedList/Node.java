package AgendaLinkedList;

/**
 *
 * @author Morty
 */
public class Node {
    //ATRIBUTTES
    String Nombre, Genero, Correo, Ciudad, Edad;
    Node sig;    

    //BUILDER
    public Node (String Nombre, String Edad, String Genero, String Correo, String Ciudad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Genero = Genero;
        this.Correo = Correo;
        this.Ciudad = Ciudad;
        this.sig = null;
    }

    //GETTERS AND SETTERS

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    
    //Siguiente Nodo
    public Node getSig(){
        return this.sig;
    }
    public void setSig(Node sig){
        this.sig = sig;
    }

    @Override
    //IMPRIMIMOS TODO
    public String toString() {
        StringBuilder nombreSB = new StringBuilder();
        StringBuilder edadSB = new StringBuilder();
        StringBuilder generoSB = new StringBuilder();
        StringBuilder correoSB = new StringBuilder();
        StringBuilder ciduadSB = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        
        Node current = this;
        int contador = 1;
        while (current != null) {
            nombreSB.append(contador).append(".- ");
            nombreSB.append(current.Nombre).append("\n");
            edadSB.append(current.Edad).append(" años").append("   ");
            generoSB.append(current.Genero).append("   ");
            ciduadSB.append(current.Ciudad).append("\n");
            correoSB.append("Correo: ").append(current.Correo).append("\n");
            
            sb.append(nombreSB).append(edadSB).append(generoSB).append(ciduadSB).append(correoSB);
            
            current = current.sig;
            contador++;
            System.out.println(sb);
            nombreSB = new StringBuilder();
            edadSB = new StringBuilder();
            generoSB = new StringBuilder();
            correoSB = new StringBuilder();
            ciduadSB = new StringBuilder();
            sb = new StringBuilder();
        }
        //return sb.toString();
        //sb.append("null");
        return("");
    }
    
    //IMPRIMIMOS SOLO LA INICIAL
    public String toStringInicial(String Inicial) {
        StringBuilder nombreSB = new StringBuilder();
        StringBuilder edadSB = new StringBuilder();
        StringBuilder generoSB = new StringBuilder();
        StringBuilder correoSB = new StringBuilder();
        StringBuilder ciduadSB = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        char compararInicial;
        char buscandoInicial;
        
        Node current = this;
        int contador = 1;
        buscandoInicial = Inicial.charAt(0);
        
        while (current != null) {
            //if(current.Nombre.charAt(0) == Inicial.charAt(0)){
            compararInicial = current.Nombre.charAt(0);
            
            if(Character.toLowerCase(compararInicial) == Character.toLowerCase(buscandoInicial)){
                nombreSB.append(contador).append(".- ");
                nombreSB.append(current.Nombre).append("\n");
                edadSB.append(current.Edad).append(" años").append("   ");
                generoSB.append(current.Genero).append("   ");
                ciduadSB.append(current.Ciudad).append("\n");
                correoSB.append("Correo: ").append(current.Correo).append("\n");
            
                sb.append(nombreSB).append(edadSB).append(generoSB).append(ciduadSB).append(correoSB);
            
                contador++;
                System.out.println(sb);
                nombreSB = new StringBuilder();
                edadSB = new StringBuilder();
                generoSB = new StringBuilder();
                correoSB = new StringBuilder();
                ciduadSB = new StringBuilder();
                sb = new StringBuilder();                
            }
            current = current.sig;
        }
        //return sb.toString();
        //sb.append("null");
        if(contador == 1){
            return("AGENDA SIN PERSONAS CON ESA INICIAL");
        }else{
            return "";
        }
    }

}
