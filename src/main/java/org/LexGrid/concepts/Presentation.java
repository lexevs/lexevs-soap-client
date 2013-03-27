/**
 * Presentation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.concepts;

public class Presentation  extends org.LexGrid.commonTypes.Property  implements java.io.Serializable {
    private java.lang.String degreeOfFidelity;

    private java.lang.Boolean isPreferred;

    private java.lang.Boolean matchIfNoContext;

    private java.lang.String representationalForm;

    public Presentation() {
    }

    public Presentation(
           java.lang.Object parent,
           java.util.Calendar effectiveDate,
           org.LexGrid.versions.EntryState entryState,
           java.util.Calendar expirationDate,
           java.lang.Boolean isActive,
           java.lang.String owner,
           java.lang.String status,
           boolean valid,
           java.lang.String language,
           java.lang.String propertyId,
           java.lang.String propertyName,
           org.LexGrid.commonTypes.PropertyQualifier[] propertyQualifier,
           java.lang.Object[] propertyQualifierAsReference,
           int propertyQualifierCount,
           java.lang.String propertyType,
           org.LexGrid.commonTypes.Source[] source,
           java.lang.Object[] sourceAsReference,
           int sourceCount,
           java.lang.String[] usageContext,
           java.lang.Object[] usageContextAsReference,
           int usageContextCount,
           org.LexGrid.commonTypes.Text value,
           java.lang.String degreeOfFidelity,
           java.lang.Boolean isPreferred,
           java.lang.Boolean matchIfNoContext,
           java.lang.String representationalForm) {
        super(
            parent,
            effectiveDate,
            entryState,
            expirationDate,
            isActive,
            owner,
            status,
            valid,
            language,
            propertyId,
            propertyName,
            propertyQualifier,
            propertyQualifierAsReference,
            propertyQualifierCount,
            propertyType,
            source,
            sourceAsReference,
            sourceCount,
            usageContext,
            usageContextAsReference,
            usageContextCount,
            value);
        this.degreeOfFidelity = degreeOfFidelity;
        this.isPreferred = isPreferred;
        this.matchIfNoContext = matchIfNoContext;
        this.representationalForm = representationalForm;
    }


    /**
     * Gets the degreeOfFidelity value for this Presentation.
     * 
     * @return degreeOfFidelity
     */
    public java.lang.String getDegreeOfFidelity() {
        return degreeOfFidelity;
    }


    /**
     * Sets the degreeOfFidelity value for this Presentation.
     * 
     * @param degreeOfFidelity
     */
    public void setDegreeOfFidelity(java.lang.String degreeOfFidelity) {
        this.degreeOfFidelity = degreeOfFidelity;
    }


    /**
     * Gets the isPreferred value for this Presentation.
     * 
     * @return isPreferred
     */
    public java.lang.Boolean getIsPreferred() {
        return isPreferred;
    }


    /**
     * Sets the isPreferred value for this Presentation.
     * 
     * @param isPreferred
     */
    public void setIsPreferred(java.lang.Boolean isPreferred) {
        this.isPreferred = isPreferred;
    }


    /**
     * Gets the matchIfNoContext value for this Presentation.
     * 
     * @return matchIfNoContext
     */
    public java.lang.Boolean getMatchIfNoContext() {
        return matchIfNoContext;
    }


    /**
     * Sets the matchIfNoContext value for this Presentation.
     * 
     * @param matchIfNoContext
     */
    public void setMatchIfNoContext(java.lang.Boolean matchIfNoContext) {
        this.matchIfNoContext = matchIfNoContext;
    }


    /**
     * Gets the representationalForm value for this Presentation.
     * 
     * @return representationalForm
     */
    public java.lang.String getRepresentationalForm() {
        return representationalForm;
    }


    /**
     * Sets the representationalForm value for this Presentation.
     * 
     * @param representationalForm
     */
    public void setRepresentationalForm(java.lang.String representationalForm) {
        this.representationalForm = representationalForm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Presentation)) return false;
        Presentation other = (Presentation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.degreeOfFidelity==null && other.getDegreeOfFidelity()==null) || 
             (this.degreeOfFidelity!=null &&
              this.degreeOfFidelity.equals(other.getDegreeOfFidelity()))) &&
            ((this.isPreferred==null && other.getIsPreferred()==null) || 
             (this.isPreferred!=null &&
              this.isPreferred.equals(other.getIsPreferred()))) &&
            ((this.matchIfNoContext==null && other.getMatchIfNoContext()==null) || 
             (this.matchIfNoContext!=null &&
              this.matchIfNoContext.equals(other.getMatchIfNoContext()))) &&
            ((this.representationalForm==null && other.getRepresentationalForm()==null) || 
             (this.representationalForm!=null &&
              this.representationalForm.equals(other.getRepresentationalForm())));
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
        if (getDegreeOfFidelity() != null) {
            _hashCode += getDegreeOfFidelity().hashCode();
        }
        if (getIsPreferred() != null) {
            _hashCode += getIsPreferred().hashCode();
        }
        if (getMatchIfNoContext() != null) {
            _hashCode += getMatchIfNoContext().hashCode();
        }
        if (getRepresentationalForm() != null) {
            _hashCode += getRepresentationalForm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Presentation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:concepts.LexGrid.org", "Presentation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("degreeOfFidelity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "degreeOfFidelity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPreferred");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isPreferred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchIfNoContext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchIfNoContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("representationalForm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "representationalForm"));
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
