package mx.itson.catrina.enumeradores;

import com.google.gson.annotations.SerializedName;

/**
 * Contiene los valores de Tipo.
 *
 * @author Diego Isaac Flores Grajeda
 */
public enum Tipo {

    /**
     * Tipo de movimiento de ingreso.
     */
    @SerializedName("1")
    DEPOSITO,

    /**
     * Tipo de movimiento de egreso.
     */
    @SerializedName("2")
    RETIRO

}
