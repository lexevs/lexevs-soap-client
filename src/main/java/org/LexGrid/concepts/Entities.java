/**
 * Entities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.concepts;

public class Entities  extends org.mayo.edu.lgModel.LexGridBase  implements java.io.Serializable {
    private org.LexGrid.relations.AssociationEntity[] associationEntity;

    private java.lang.Object[] associationEntityAsReference;

    private int associationEntityCount;

    private org.LexGrid.concepts.Entity[] entity;

    private java.lang.Object[] entityAsReference;

    private int entityCount;

    private boolean valid;

    public Entities() {
    }

    public Entities(
           java.lang.Object parent,
           org.LexGrid.relations.AssociationEntity[] associationEntity,
           java.lang.Object[] associationEntityAsReference,
           int associationEntityCount,
           org.LexGrid.concepts.Entity[] entity,
           java.lang.Object[] entityAsReference,
           int entityCount,
           boolean valid) {
        super(
            parent);
        this.associationEntity = associationEntity;
        this.associationEntityAsReference = associationEntityAsReference;
        this.associationEntityCount = associationEntityCount;
        this.entity = entity;
        this.entityAsReference = entityAsReference;
        this.entityCount = entityCount;
        this.valid = valid;
    }


    /**
     * Gets the associationEntity value for this Entities.
     * 
     * @return associationEntity
     */
    public org.LexGrid.relations.AssociationEntity[] getAssociationEntity() {
        return associationEntity;
    }


    /**
     * Sets the associationEntity value for this Entities.
     * 
     * @param associationEntity
     */
    public void setAssociationEntity(org.LexGrid.relations.AssociationEntity[] associationEntity) {
        this.associationEntity = associationEntity;
    }

    public org.LexGrid.relations.AssociationEntity getAssociationEntity(int i) {
        return this.associationEntity[i];
    }

    public void setAssociationEntity(int i, org.LexGrid.relations.AssociationEntity _value) {
        this.associationEntity[i] = _value;
    }


    /**
     * Gets the associationEntityAsReference value for this Entities.
     * 
     * @return associationEntityAsReference
     */
    public java.lang.Object[] getAssociationEntityAsReference() {
        return associationEntityAsReference;
    }


    /**
     * Sets the associationEntityAsReference value for this Entities.
     * 
     * @param associationEntityAsReference
     */
    public void setAssociationEntityAsReference(java.lang.Object[] associationEntityAsReference) {
        this.associationEntityAsReference = associationEntityAsReference;
    }


    /**
     * Gets the associationEntityCount value for this Entities.
     * 
     * @return associationEntityCount
     */
    public int getAssociationEntityCount() {
        return associationEntityCount;
    }


    /**
     * Sets the associationEntityCount value for this Entities.
     * 
     * @param associationEntityCount
     */
    public void setAssociationEntityCount(int associationEntityCount) {
        this.associationEntityCount = associationEntityCount;
    }


    /**
     * Gets the entity value for this Entities.
     * 
     * @return entity
     */
    public org.LexGrid.concepts.Entity[] getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this Entities.
     * 
     * @param entity
     */
    public void setEntity(org.LexGrid.concepts.Entity[] entity) {
        this.entity = entity;
    }

    public org.LexGrid.concepts.Entity getEntity(int i) {
        return this.entity[i];
    }

    public void setEntity(int i, org.LexGrid.concepts.Entity _value) {
        this.entity[i] = _value;
    }


    /**
     * Gets the entityAsReference value for this Entities.
     * 
     * @return entityAsReference
     */
    public java.lang.Object[] getEntityAsReference() {
        return entityAsReference;
    }


    /**
     * Sets the entityAsReference value for this Entities.
     * 
     * @param entityAsReference
     */
    public void setEntityAsReference(java.lang.Object[] entityAsReference) {
        this.entityAsReference = entityAsReference;
    }


    /**
     * Gets the entityCount value for this Entities.
     * 
     * @return entityCount
     */
    public int getEntityCount() {
        return entityCount;
    }


    /**
     * Sets the entityCount value for this Entities.
     * 
     * @param entityCount
     */
    public void setEntityCount(int entityCount) {
        this.entityCount = entityCount;
    }


    /**
     * Gets the valid value for this Entities.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this Entities.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entities)) return false;
        Entities other = (Entities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.associationEntity==null && other.getAssociationEntity()==null) || 
             (this.associationEntity!=null &&
              java.util.Arrays.equals(this.associationEntity, other.getAssociationEntity()))) &&
            ((this.associationEntityAsReference==null && other.getAssociationEntityAsReference()==null) || 
             (this.associationEntityAsReference!=null &&
              java.util.Arrays.equals(this.associationEntityAsReference, other.getAssociationEntityAsReference()))) &&
            this.associationEntityCount == other.getAssociationEntityCount() &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              java.util.Arrays.equals(this.entity, other.getEntity()))) &&
            ((this.entityAsReference==null && other.getEntityAsReference()==null) || 
             (this.entityAsReference!=null &&
              java.util.Arrays.equals(this.entityAsReference, other.getEntityAsReference()))) &&
            this.entityCount == other.getEntityCount() &&
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
        if (getAssociationEntity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociationEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociationEntity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssociationEntityAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociationEntityAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociationEntityAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getAssociationEntityCount();
        if (getEntity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getEntityCount();
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:concepts.LexGrid.org", "Entities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:relations.LexGrid.org", "AssociationEntity"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationEntityAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationEntityAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associationEntityCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associationEntityCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:concepts.LexGrid.org", "Entity"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityCount"));
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
