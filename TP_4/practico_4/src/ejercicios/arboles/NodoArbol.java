package ejercicios.arboles;

public class NodoArbol {
    private int valor;
    private NodoArbol nodoIzquierdo;
    private NodoArbol nodoDerecho;

    public NodoArbol(int valor) {
        this.valor = valor;
        this.nodoIzquierdo = null;
        this.nodoDerecho = null;
    }

    public int getValor() { return valor; }
    public NodoArbol getNodoDerecho() { return nodoDerecho; }
    public NodoArbol getNodoIzquierdo() { return nodoIzquierdo; }

    public void setValor(int valor) { this.valor = valor; }
    public int ans;

    public int _obtenerDistancia(NodoArbol raiz, int n1, int n2) {
        if (raiz == null) return 0;
        int izquierda = _obtenerDistancia(raiz.nodoIzquierdo, n1, n2);
        int derecha = _obtenerDistancia(raiz.nodoDerecho, n1, n2);

        if (raiz.valor == n1 || raiz.valor == n2) {
            if (izquierda != 0 || derecha != 0) {
                ans = Math.max(derecha, izquierda);
                return 0;
            }
            else return 1;
        }
        else if (izquierda != 0 && derecha != 0) {
            ans = derecha + izquierda;
        }
        else if (derecha != 0 || izquierda != 0) return Math.max(derecha, izquierda) + 1;
        return 0;
    }

    public int obtenerDistancia(NodoArbol raiz, int d1, int d2) {
        ans = 0;
        _obtenerDistancia(raiz, d1, d2);
        return ans;
    }
}
