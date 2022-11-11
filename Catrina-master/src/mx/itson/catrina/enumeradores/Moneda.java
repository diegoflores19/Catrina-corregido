package mx.itson.catrina.enumeradores;

import com.google.gson.annotations.SerializedName;

/**
 * Contiene el valor de las respectivas monedas.
 *
 * @author Diego Isaac Flores Grajeda
 */
public enum Moneda {

    /**
     * Moneda en dólar.
     */
    @SerializedName("1")
    USD,

    /**
     * Moneda en peso mexicano.
     */
    @SerializedName("2")
    MXN,

    /**
     * Moneda en euro.
     */
    @SerializedName("3")
    EUR

}
