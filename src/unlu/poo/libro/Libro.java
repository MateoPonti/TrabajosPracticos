package unlu.poo.libro;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int numPaginas;
    private int numEjemplares;
    private int numEjemplaresPrestados;
    static private int numEjemplaresPrestadosTotal;



    public Libro(String autor, String titulo,int numPaginas,int numEjemplares, int numEjemplaresPrestados ){
        setAutor(autor);
        setTitulo(titulo);
        setNumPaginas(numPaginas);
        setNumEjemplares(numEjemplares);
        setNumEjemplaresPrestados(numEjemplaresPrestados);
        this.isbn=null;
    }
    public Libro(String autor, String titulo,int numPaginas,int numEjemplares, int numEjemplaresPrestados,String isbn ){
        this(autor,titulo,numPaginas,numEjemplares,numEjemplaresPrestados);
        setIsbn(isbn);
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

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares=1;
        if (numEjemplares>0){
            this.numEjemplares = numEjemplares;
        }
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    private void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados=0;
        if (numEjemplaresPrestados>0){
        this.numEjemplaresPrestados = numEjemplaresPrestados;
        numEjemplaresPrestadosTotal+=numEjemplaresPrestados;
        }
    }

    public int getNumEjemplaresPrestadosTotal() {
        return numEjemplaresPrestadosTotal;
    }


    public void prestarLibro(){
        if (numEjemplares>1){
            numEjemplaresPrestados++;
            numEjemplaresPrestadosTotal++;
            numEjemplares--;
        }
    }

    public String toString() {
        return  "El Libro"+titulo+" creado por el autor "+autor+ " tiene "+numPaginas+" paginas, quedan "+numEjemplares+" disponibles y se prestaron "+numEjemplaresPrestados+".";


    }
}
