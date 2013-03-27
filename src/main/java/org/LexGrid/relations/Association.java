/**
 * Association.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.relations;

public class Association  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private java.lang.String associationName;

    private org.LexGrid.relations.AssociationSource[] source;

    private java.lang.Object[] sourceAsReference;

    private int sourceCount;

    private boolean valid;

    public Association() {
    }

    public Association(
           java.lang.Object parent,
           java.lang.String associationName,
           org.LexGrid.relations.AssociationSource[] source,
           java.lang.Object[] sourceAsReference,
           int sourceCount,
           boolean valid) {
        super(
            parent);
        this.associationName = associationName;
        this.source = source;
        this.sourceAsReference = sourceAsReference;
        this.sourceCount = sourceCount;
        this.valid = valid;
    }


    /**
     * Gets the associationName value for this Association.
     * 
     * @return associationName
     */
    public java.lang.String getAssociationName() {
        return associationName;
    }


    /**
     * Sets the associationName value for this Association.
     * 
     * @param associationName
     */
    public void setAssociationName(java.lang.String associationName) {
        this.associationName = associationName;
    }


    /**
     * Gets the source value for this Association.
     * 
     * @return source
     */
    public org.LexGrid.relations.AssociationSource[] getSource() {
        return source;
    }


    /**
     * Sets the source value for this Association.
     * 
     * @param source
     */
    public void setSource(org.LexGrid.relations.AssociationSource[] source) {
        this.source = source;
    }

    public org.LexGrid.relations.AssociationSource getSource(int i) {
        return this.source[i];
    }

    public void setSource(int i, org.LexGrid.relations.AssociationSource _value) {
        this.source[i] = _value;
    }


    /**
     * Gets the sourceAsReference value for this Association.
     * 
     * @return sourceAsReference
     */
    public java.lang.Object[] getSourceAsReference() {
        return sourceAsReference;
    }


    /**
     * Sets the sourceAsReference value for this Association.
     * 
     * @param sourceAsReference
     */
    public void setSourceAsReference(java.lang.Object[] sourceAsReference) {
        this.sourceAsReference = sourceAsReference;
    }


    /**
     * Gets the sourceCount value for this Association.
     * 
     * @return sourceCount
     */
    public int getSourceCount() {
        return sourceCount;
    }


    /**
     * Sets the sourceCount value for this Association.
     * 
     * @param sourceCount
     */
    public void setSourceCount(int sourceCount) {
        this.sourceCount = sourceCount;
    }


    /**
     * Gets the valid value for this Association.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this Association.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Association)) return false;
        Association other = (Association) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.associationName==null && other.getAssociationName()==null) || 
             (this.associationName!=null &&
              this.associationName.equals(other.getAssociationName()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              java.util.Arrays.equals(this.source, other.getSource()))) &&
            ((this.sourceAsReference==null && other.getSourceAsReference()==null) || 
             (this.sourceAsReference!=null &&
              java.util.Arrays.equals(this.sourceAsReference, other.getSourceAsReference()))) &&
            this.sourceCount == other.getSourceCount() &&
            this.valid == other.isValid();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAssociationName() != null) {
            _hashCode += getAssociationName().hashCode();
        }
        if (getSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSourceAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSourceAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSourceAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getSourceCount();
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Association.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relations.LexGrid.org", "Association"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relations.LexGrid.org", "AssociationSource"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
