package unlu.poo.libro;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int numPaginas;
    private int numEjemplares;
    private int numEjemplaresPrestados;



    public Libro(String autor, String titulo,int numPaginas,int numEjemplares, int numEjemplaresPrestados ){
        this(autor,titulo,numPaginas,numEjemplares,numEjemplaresPrestados,"");
    }
    public Libro(String autor, String titulo,int numPaginas,int numEjemplares, int numEjemplaresPrestados,String isbn ){
        setAutor(autor);
        setTitulo(titulo);
        setNumPaginas(numPaginas);
        setNumEjemplares(numEjemplares);
        setNumEjemplaresPrestados(numEjemplaresPrestados);
        this.isbn="";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public int getNumEjemplaresDisponibles(){
        return this.numEjemplares-this.numEjemplaresPrestados;
    }
    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares=1;
        if (numEjemplares>0){
            this.numEjemplares = numEjemplares;
        }
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    private boolean setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados=0;
        if ((numEjemplaresPrestados>0) && (getNumEjemplaresDisponibles()>0)){
        this.numEjemplaresPrestados = numEjemplaresPrestados;
        return  true;
        }
        return  false;
    }



    public boolean prestar(int cant){
        if (getNumEjemplaresDisponibles()-cant>1){
            numEjemplaresPrestados+=cant;
            return  true;
        }
        return  false;
    }

    public String toString() {
        return  "El Libro "+titulo+" creado por el autor "+autor+ " tiene "+numPaginas+" paginas, quedan "+getNumEjemplaresDisponibles()+" disponible/s y se prestaron "+numEjemplaresPrestados+".";


    }

    public boolean devolver(int cant){
        if ((cant+getNumEjemplaresDisponibles())<=numEjemplares){
            numEjemplaresPrestados-=cant;
            reurn true;
        }
        return false;
    }

    public boolean tieneMasPaginas(Libro libro2){
        return this.numPaginas > libro2.getNumPaginas();
    }

    public boolean esAutor(String autor) {
        return Objects.equals(this.autor, autor);
    }
}
