/**
 * SupportedHierarchy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.naming;

public class SupportedHierarchy  extends org.LexGrid.naming.URIMap  implements java.io.Serializable {
    private java.lang.String[] associationNames;

    private java.lang.Object[] associationNamesAsReference;

    private int associationNamesCount;

    private java.lang.Boolean isForwardNavigable;

    private java.lang.String rootCode;

    public SupportedHierarchy() {
    }

    public SupportedHierarchy(
           java.lang.Object parent,
           java.lang.String content,
           java.lang.String localId,
           java.lang.String uri,
           boolean valid,
           java.lang.String[] associationNames,
           java.lang.Object[] associationNamesAsReference,
           int associationNamesCount,
           java.lang.Boolean isForwardNavigable,
           java.lang.String rootCode) {
        super(
            parent,
            content,
            localId,
            uri,
            valid);
        this.associationNames = associationNames;
        this.associationNamesAsReference = associationNamesAsReference;
        this.associationNamesCount = associationNamesCount;
        this.isForwardNavigable = isForwardNavigable;
        this.rootCode = rootCode;
    }


    /**
     * Gets the associationNames value for this SupportedHierarchy.
     * 
     * @return associationNames
     */
    public java.lang.String[] getAssociationNames() {
        return associationNames;
    }


    /**
     * Sets the associationNames value for this SupportedHierarchy.
     * 
     * @param associationNames
     */
    public void setAssociationNames(java.lang.String[] associationNames) {
        this.associationNames = associationNames;
    }

    public java.lang.String getAssociationNames(int i) {
        return this.associationNames[i];
    }

    public void setAssociationNames(int i, java.lang.String _value) {
        this.associationNames[i] = _value;
    }


    /**
     * Gets the associationNamesAsReference value for this SupportedHierarchy.
     * 
     * @return associationNamesAsReference
     */
    public java.lang.Object[] getAssociationNamesAsReference() {
        return associationNamesAsReference;
    }


    /**
     * Sets the associationNamesAsReference value for this SupportedHierarchy.
     * 
     * @param associationNamesAsReference
     */
    public void setAssociationNamesAsReference(java.lang.Object[] associationNamesAsReference) {
        this.associationNamesAsReference = associationNamesAsReference;
    }


    /**
     * Gets the associationNamesCount value for this SupportedHierarchy.
     * 
     * @return associationNamesCount
     */
    public int getAssociationNamesCount() {
        return associationNamesCount;
    }


    /**
     * Sets the associationNamesCount value for this SupportedHierarchy.
     * 
     * @param associationNamesCount
     */
    public void setAssociationNamesCount(int associationNamesCount) {
        this.associationNamesCount = associationNamesCount;
    }


    /**
     * Gets the isForwardNavigable value for this SupportedHierarchy.
     * 
     * @return isForwardNavigable
     */
    public java.lang.Boolean getIsForwardNavigable() {
        return isForwardNavigable;
    }


    /**
     * Sets the isForwardNavigable value for this SupportedHierarchy.
     * 
     * @param isForwardNavigable
     */
    public void setIsForwardNavigable(java.lang.Boolean isForwardNavigable) {
        this.isForwardNavigable = isForwardNavigable;
    }


    /**
     * Gets the rootCode value for this SupportedHierarchy.
     * 
     * @return rootCode
     */
    public java.lang.String getRootCode() {
        return rootCode;
    }


    /**
     * Sets the rootCode value for this SupportedHierarchy.
     * 
     * @param rootCode
     */
    public void setRootCode(java.lang.String rootCode) {
        this.rootCode = rootCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportedHierarchy)) return false;
        SupportedHierarchy other = (SupportedHierarchy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.associationNames==null && other.getAssociationNames()==null) || 
             (this.associationNames!=null &&
              java.util.Arrays.equals(this.associationNames, other.getAssociationNames()))) &&
            ((this.associationNamesAsReference==null && other.getAssociationNamesAsReference()==null) || 
             (this.associationNamesAsReference!=null &&
              java.util.Arrays.equals(this.associationNamesAsReference, other.getAssociationNamesAsReference()))) &&
            this.associationNamesCount == other.getAssociationNamesCount() &&
            ((this.isForwardNavigable==null && other.getIsForwardNavigable()==null) || 
             (this.isForwardNavigable!=null &&
              this.isForwardNavigable.equals(other.getIsForwardNavigable()))) &&
            ((this.rootCode==null && other.getRootCode()==null) || 
             (this.rootCode!=null &&
              this.rootCode.equals(other.getRootCode())));
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
        if (getAssociationNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociationNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociationNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssociationNamesAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociationNamesAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociationNamesAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getAssociationNamesCount();
        if (getIsForwardNavigable() != null) {
            _hashCode += getIsForwardNavigable().hashCode();
        }
        if (getRootCode() != null) {
            _hashCode += getRootCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupportedHierarchy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:naming.LexGrid.org", "SupportedHierarchy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationNamesAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationNamesAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationNamesCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationNamesCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isForwardNavigable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isForwardNavigable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rootCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
