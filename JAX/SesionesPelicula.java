import java.util.Vector;

public class SesionesPelicula {
Pelicula pelicula;
Vector sesionesStrPelicula;

    public SesionesPelicula(Pelicula pelicula, Vector sesionesStrPelicula) {
        this.pelicula = pelicula;
        this.sesionesStrPelicula = sesionesStrPelicula;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Vector getSesionesStrPelicula() {
        return sesionesStrPelicula;
    }

    public void setSesionesStrPelicula(Vector sesionesStrPelicula) {
        this.sesionesStrPelicula = sesionesStrPelicula;
    }
  
    
    
}
