
package com.juamber.sumservice.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addendOne" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="addendTwo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addendOne",
    "addendTwo"
})
@XmlRootElement(name = "GetSumRequest")
public class GetSumRequest {

    protected int addendOne;
    protected int addendTwo;

    /**
     * Obtiene el valor de la propiedad addendOne.
     * 
     */
    public int getAddendOne() {
        return addendOne;
    }

    /**
     * Define el valor de la propiedad addendOne.
     * 
     */
    public void setAddendOne(int value) {
        this.addendOne = value;
    }

    /**
     * Obtiene el valor de la propiedad addendTwo.
     * 
     */
    public int getAddendTwo() {
        return addendTwo;
    }

    /**
     * Define el valor de la propiedad addendTwo.
     * 
     */
    public void setAddendTwo(int value) {
        this.addendTwo = value;
    }

}
