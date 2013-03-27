/**
 * AssociationEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.relations;

public class AssociationEntity  extends org.LexGrid.concepts.Entity  implements java.io.Serializable {
    private java.lang.String forwardName;

    private java.lang.Boolean isNavigable;

    private java.lang.Boolean isTransitive;

    private java.lang.String reverseName;

    public AssociationEntity() {
    }

    public AssociationEntity(
           java.lang.Object parent,
           java.util.Calendar effectiveDate,
           org.LexGrid.versions.EntryState entryState,
           java.util.Calendar expirationDate,
           java.lang.Boolean isActive,
           java.lang.String owner,
           java.lang.String status,
           boolean valid,
           org.LexGrid.commonTypes.EntityDescription entityDescription,
           org.LexGrid.commonTypes.Property[] allProperties,
           org.LexGrid.concepts.Comment[] comment,
           java.lang.Object[] commentAsReference,
           int commentCount,
           org.LexGrid.concepts.Definition[] definition,
           java.lang.Object[] definitionAsReference,
           int definitionCount,
           java.lang.String entityCode,
           java.lang.String entityCodeNamespace,
           java.lang.String[] entityType,
           java.lang.Object[] entityTypeAsReference,
           int entityTypeCount,
           java.lang.Boolean isAnonymous,
           java.lang.Boolean isDefined,
           org.LexGrid.concepts.Presentation[] presentation,
           java.lang.Object[] presentationAsReference,
           int presentationCount,
           org.LexGrid.commonTypes.Property[] property,
           java.lang.Object[] propertyAsReference,
           int propertyCount,
           org.LexGrid.concepts.PropertyLink[] propertyLink,
           java.lang.Object[] propertyLinkAsReference,
           int propertyLinkCount,
           java.lang.String forwardName,
           java.lang.Boolean isNavigable,
           java.lang.Boolean isTransitive,
           java.lang.String reverseName) {
        super(
            parent,
            effectiveDate,
            entryState,
            expirationDate,
            isActive,
            owner,
            status,
            valid,
            entityDescription,
            allProperties,
            comment,
            commentAsReference,
            commentCount,
            definition,
            definitionAsReference,
            definitionCount,
            entityCode,
            entityCodeNamespace,
            entityType,
            entityTypeAsReference,
            entityTypeCount,
            isAnonymous,
            isDefined,
            presentation,
            presentationAsReference,
            presentationCount,
            property,
            propertyAsReference,
            propertyCount,
            propertyLink,
            propertyLinkAsReference,
            propertyLinkCount);
        this.forwardName = forwardName;
        this.isNavigable = isNavigable;
        this.isTransitive = isTransitive;
        this.reverseName = reverseName;
    }


    /**
     * Gets the forwardName value for this AssociationEntity.
     * 
     * @return forwardName
     */
    public java.lang.String getForwardName() {
        return forwardName;
    }


    /**
     * Sets the forwardName value for this AssociationEntity.
     * 
     * @param forwardName
     */
    public void setForwardName(java.lang.String forwardName) {
        this.forwardName = forwardName;
    }


    /**
     * Gets the isNavigable value for this AssociationEntity.
     * 
     * @return isNavigable
     */
    public java.lang.Boolean getIsNavigable() {
        return isNavigable;
    }


    /**
     * Sets the isNavigable value for this AssociationEntity.
     * 
     * @param isNavigable
     */
    public void setIsNavigable(java.lang.Boolean isNavigable) {
        this.isNavigable = isNavigable;
    }


    /**
     * Gets the isTransitive value for this AssociationEntity.
     * 
     * @return isTransitive
     */
    public java.lang.Boolean getIsTransitive() {
        return isTransitive;
    }


    /**
     * Sets the isTransitive value for this AssociationEntity.
     * 
     * @param isTransitive
     */
    public void setIsTransitive(java.lang.Boolean isTransitive) {
        this.isTransitive = isTransitive;
    }


    /**
     * Gets the reverseName value for this AssociationEntity.
     * 
     * @return reverseName
     */
    public java.lang.String getReverseName() {
        return reverseName;
    }


    /**
     * Sets the reverseName value for this AssociationEntity.
     * 
     * @param reverseName
     */
    public void setReverseName(java.lang.String reverseName) {
        this.reverseName = reverseName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssociationEntity)) return false;
        AssociationEntity other = (AssociationEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.forwardName==null && other.getForwardName()==null) || 
             (this.forwardName!=null &&
              this.forwardName.equals(other.getForwardName()))) &&
            ((this.isNavigable==null && other.getIsNavigable()==null) || 
             (this.isNavigable!=null &&
              this.isNavigable.equals(other.getIsNavigable()))) &&
            ((this.isTransitive==null && other.getIsTransitive()==null) || 
             (this.isTransitive!=null &&
              this.isTransitive.equals(other.getIsTransitive()))) &&
            ((this.reverseName==null && other.getReverseName()==null) || 
             (this.reverseName!=null &&
              this.reverseName.equals(other.getReverseName())));
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
        if (getForwardName() != null) {
            _hashCode += getForwardName().hashCode();
        }
        if (getIsNavigable() != null) {
            _hashCode += getIsNavigable().hashCode();
        }
        if (getIsTransitive() != null) {
            _hashCode += getIsTransitive().hashCode();
        }
        if (getReverseName() != null) {
            _hashCode += getReverseName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssociationEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:relations.LexGrid.org", "AssociationEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forwardName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNavigable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isNavigable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTransitive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isTransitive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reverseName"));
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
