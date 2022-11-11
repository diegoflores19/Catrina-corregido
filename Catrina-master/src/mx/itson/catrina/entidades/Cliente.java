package mx.itson.catrina.entidades;

/**
 * Métodos y atributos de la entidad de cliente
 *
 * @author Diego Isaac Flores Grajeda 
 */
public class Cliente {
    private int codigo;
    private String nombre;
    private String domicilio;
    private String ciudad;
    private String rfc;
    private int cp;

    /**
     * Obtiene el valor del codigo.
     *
     * @return El atributo codigo.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Asigna el valor del codigo.
     *
     * @param codigo El valor del atributo codigo.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el valor del nombre.
     *
     * @return El atributo nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el valor del nombre.
     *
     * @param nombre El valor del atributo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el valor del domicilio.
     *
     * @return El atributo domicilio.
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Asigna el valor del domicilio.
     *
     * @param domicilio El valor del atributo domicilio.
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Obtiene el valor de la ciudad.
     *
     * @return El atributo ciudad.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Asigna el valor de la ciudad.
     *
     * @param ciudad El valor del atributo ciudad.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtiene el valor del rfc.
     *
     * @return El atributo rfc.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Asigna el valor del rfc.
     *
     * @param rfc El valor del atributo rfc.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Obtiene el valor del cp.
     *
     * @return El atributo cp.
     */
    public int getCp() {
        return cp;
    }

    /**
     * Asigna el valor del cp.
     *
     * @param cp El valor del atributo cp.
     */
    public void setCp(int cp) {
        this.cp = cp;
    }
}
