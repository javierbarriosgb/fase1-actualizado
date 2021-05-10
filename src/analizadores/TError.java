
package analizadores;


public class TError {
    String lexema, tipo, descripcipon;
    int linea,columna;
    public TError(String le, int li, int co, String t, String de){
        this.lexema=le;
        this.linea= li;
        this.columna=co;
        this.tipo= t;
        this.descripcipon=de;
    }

    
}
