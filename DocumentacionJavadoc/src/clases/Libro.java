package clases;

/**
 * 
 * Class to save and collect information about books, such as their authors, loans, etc.
 * @author fjmiguel
 *
 */
public class Libro {
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	
	//constructor por defecto
	public Libro() {} 
	// constructor con par�metros
	/**
	 * This function creates the information about the books. Generating its title, author, copies and borrowed
	 * @param titulo. Shows the title of the book
	 * @param autor. Shows the autor of the book
	 * @param ejemplares. Shows the copies of the book
	 * @param prestados. Show borrowed books
	 */
	public Libro (String titulo,String autor,int ejemplares,int prestados) {
		this.titulo=titulo;
		this.autor=autor;
		this.ejemplares=ejemplares;
		this.prestados=prestados;
		
	}
	// constructor copia
	
	/**
	 * This function gets information about books. Returning its title, author, copies and borrowed
	 * @param lib. Gets the information of the previously created attributes
	 */
	public Libro( final Libro lib) {
		titulo=lib.titulo;
		autor=lib.autor;
		ejemplares=lib.ejemplares;
		prestados=lib.prestados;
		
	}
	
	//getters y setters
	public void setTitulo(String titulo) {
		this.titulo=titulo;
			}
	public String getTitulo() {
		return titulo;
	}
	public void setAutor( String autor) {
		this.autor=autor;
	}
	public String getAutor() {
		return autor;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares=ejemplares;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setPrestados(int prestados) {
		this.prestados=prestados;
	}
	public int getPrestados() {
		return prestados;
	}
		
	
	//m�todo toString
	public String toString() {
		String mensaje="T�tulo: "+titulo+"\nAutor: "+autor+"\nEjemplares: "+ejemplares+"\nPrestados: "+prestados+"\n----------------\n";
		return mensaje;
		
	}
	// M�todo pr�stamo que incremente el atributo correspondiente cada vez que se realice un pr�stamo del libro. 
	//No se podr�n prestar libros de los que no queden ejemplares disponibles para prestar. 
	//Devuelve true si se ha podido realizar la operaci�n y false en caso contrario.
	public boolean prestamoLibro() {
		boolean prestamo=true;
		if (prestados<ejemplares)
		{
			prestados++;
			
		}
		else
		{
			prestamo=false;
		}
		return prestamo;
	}
		
	//M�todo devoluci�n que decremente el atributo correspondiente cuando se produzca la devoluci�n de un libro
	//No se podr�n devolver libros que no se hayan prestado.
	//Devuelve true si se ha podido realizar la operaci�n y false en caso contrario.
		
	public boolean devolucionLibro() {
			boolean devuelto=true;
			if(prestados>0) {
				prestados--;
			}
			else
			{
				devuelto=false;
			}
			return devuelto;		
			
		}
	
}
