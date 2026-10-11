import java.util.Stack;

public class Pila {
    private Stack< Integer > coleccion;

    publica pila(){
        coleccion = new Stack<>(){
            coleccion.push (dato);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coleccion.size()-1; i >= 0; -- i){
            sb.append(""+coleccion.pop());
        }
        return sb.toString();
    }

}
