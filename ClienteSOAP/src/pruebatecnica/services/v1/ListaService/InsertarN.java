/**
 * InsertarN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pruebatecnica.services.v1.ListaService;

public class InsertarN  implements java.io.Serializable {
    private int lista;

    private int posicion;

    private java.lang.Object obj;

    public InsertarN() {
    }

    public InsertarN(
           int lista,
           int posicion,
           java.lang.Object obj) {
           this.lista = lista;
           this.posicion = posicion;
           this.obj = obj;
    }


    /**
     * Gets the lista value for this InsertarN.
     * 
     * @return lista
     */
    public int getLista() {
        return lista;
    }


    /**
     * Sets the lista value for this InsertarN.
     * 
     * @param lista
     */
    public void setLista(int lista) {
        this.lista = lista;
    }


    /**
     * Gets the posicion value for this InsertarN.
     * 
     * @return posicion
     */
    public int getPosicion() {
        return posicion;
    }


    /**
     * Sets the posicion value for this InsertarN.
     * 
     * @param posicion
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }


    /**
     * Gets the obj value for this InsertarN.
     * 
     * @return obj
     */
    public java.lang.Object getObj() {
        return obj;
    }


    /**
     * Sets the obj value for this InsertarN.
     * 
     * @param obj
     */
    public void setObj(java.lang.Object obj) {
        this.obj = obj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertarN)) return false;
        InsertarN other = (InsertarN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.lista == other.getLista() &&
            this.posicion == other.getPosicion() &&
            ((this.obj==null && other.getObj()==null) || 
             (this.obj!=null &&
              this.obj.equals(other.getObj())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getLista();
        _hashCode += getPosicion();
        if (getObj() != null) {
            _hashCode += getObj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertarN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://pruebatecnica/services/v1/ListaService", "insertarN"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lista");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posicion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posicion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "obj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
