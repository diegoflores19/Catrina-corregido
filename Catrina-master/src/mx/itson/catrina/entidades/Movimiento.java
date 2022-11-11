package mx.itson.catrina.entidades;

import mx.itson.catrina.enumeradores.Tipo;

import java.util.Date;

/**
 * Métodos y atributos de la entidad de movimiento
 *
 * @author Diego Isaac Flores Grajeda
 */
public class Movimiento {
    private Date fecha;
    private String descripcion;
    private double cantidad;
    private Tipo tipo;

    /**
     * Obtiene el valor de fecha.
     *
     * @return El atributo fecha.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Asigna el valor de fecha.
     *
     * @param fecha El valor del atributo fecha.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el valor de la descripcion.
     *
     * @return El atributo descripcion.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Asigna el valor de la descripcion.
     *
     * @param descripcion El valor del atributo descripcion.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el valor de la cantidad.
     *
     * @return El atributo cantidad.
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Asigna el valor de la cantidad.
     *
     * @param cantidad El valor del atributo cantidad.
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el valor de tipo.
     *
     * @return El atributo tipo.
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Asigna el valor de tipo.
     *
     * @param tipo El valor del atributo tipo.
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
