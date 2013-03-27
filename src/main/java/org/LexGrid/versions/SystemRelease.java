/**
 * SystemRelease.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.versions;

public class SystemRelease  extends org.LexGrid.commonTypes.Describable  implements java.io.Serializable {
    private java.lang.String basedOnRelease;

    private org.LexGrid.codingSchemes.CodingSchemes codingSchemes;

    private org.LexGrid.versions.EditHistory editHistory;

    private org.LexGrid.valueSets.PickListDefinitions pickListDefinitions;

    private java.lang.String releaseAgency;

    private java.util.Calendar releaseDate;

    private java.lang.String releaseId;

    private java.lang.String releaseURI;

    private org.LexGrid.valueSets.ValueSetDefinitions valueSetDefinitions;

    public SystemRelease() {
    }

    public SystemRelease(
           java.lang.Object parent,
           org.LexGrid.commonTypes.EntityDescription entityDescription,
           boolean valid,
           java.lang.String basedOnRelease,
           org.LexGrid.codingSchemes.CodingSchemes codingSchemes,
           org.LexGrid.versions.EditHistory editHistory,
           org.LexGrid.valueSets.PickListDefinitions pickListDefinitions,
           java.lang.String releaseAgency,
           java.util.Calendar releaseDate,
           java.lang.String releaseId,
           java.lang.String releaseURI,
           org.LexGrid.valueSets.ValueSetDefinitions valueSetDefinitions) {
        super(
            parent,
            entityDescription,
            valid);
        this.basedOnRelease = basedOnRelease;
        this.codingSchemes = codingSchemes;
        this.editHistory = editHistory;
        this.pickListDefinitions = pickListDefinitions;
        this.releaseAgency = releaseAgency;
        this.releaseDate = releaseDate;
        this.releaseId = releaseId;
        this.releaseURI = releaseURI;
        this.valueSetDefinitions = valueSetDefinitions;
    }


    /**
     * Gets the basedOnRelease value for this SystemRelease.
     * 
     * @return basedOnRelease
     */
    public java.lang.String getBasedOnRelease() {
        return basedOnRelease;
    }


    /**
     * Sets the basedOnRelease value for this SystemRelease.
     * 
     * @param basedOnRelease
     */
    public void setBasedOnRelease(java.lang.String basedOnRelease) {
        this.basedOnRelease = basedOnRelease;
    }


    /**
     * Gets the codingSchemes value for this SystemRelease.
     * 
     * @return codingSchemes
     */
    public org.LexGrid.codingSchemes.CodingSchemes getCodingSchemes() {
        return codingSchemes;
    }


    /**
     * Sets the codingSchemes value for this SystemRelease.
     * 
     * @param codingSchemes
     */
    public void setCodingSchemes(org.LexGrid.codingSchemes.CodingSchemes codingSchemes) {
        this.codingSchemes = codingSchemes;
    }


    /**
     * Gets the editHistory value for this SystemRelease.
     * 
     * @return editHistory
     */
    public org.LexGrid.versions.EditHistory getEditHistory() {
        return editHistory;
    }


    /**
     * Sets the editHistory value for this SystemRelease.
     * 
     * @param editHistory
     */
    public void setEditHistory(org.LexGrid.versions.EditHistory editHistory) {
        this.editHistory = editHistory;
    }


    /**
     * Gets the pickListDefinitions value for this SystemRelease.
     * 
     * @return pickListDefinitions
     */
    public org.LexGrid.valueSets.PickListDefinitions getPickListDefinitions() {
        return pickListDefinitions;
    }


    /**
     * Sets the pickListDefinitions value for this SystemRelease.
     * 
     * @param pickListDefinitions
     */
    public void setPickListDefinitions(org.LexGrid.valueSets.PickListDefinitions pickListDefinitions) {
        this.pickListDefinitions = pickListDefinitions;
    }


    /**
     * Gets the releaseAgency value for this SystemRelease.
     * 
     * @return releaseAgency
     */
    public java.lang.String getReleaseAgency() {
        return releaseAgency;
    }


    /**
     * Sets the releaseAgency value for this SystemRelease.
     * 
     * @param releaseAgency
     */
    public void setReleaseAgency(java.lang.String releaseAgency) {
        this.releaseAgency = releaseAgency;
    }


    /**
     * Gets the releaseDate value for this SystemRelease.
     * 
     * @return releaseDate
     */
    public java.util.Calendar getReleaseDate() {
        return releaseDate;
    }


    /**
     * Sets the releaseDate value for this SystemRelease.
     * 
     * @param releaseDate
     */
    public void setReleaseDate(java.util.Calendar releaseDate) {
        this.releaseDate = releaseDate;
    }


    /**
     * Gets the releaseId value for this SystemRelease.
     * 
     * @return releaseId
     */
    public java.lang.String getReleaseId() {
        return releaseId;
    }


    /**
     * Sets the releaseId value for this SystemRelease.
     * 
     * @param releaseId
     */
    public void setReleaseId(java.lang.String releaseId) {
        this.releaseId = releaseId;
    }


    /**
     * Gets the releaseURI value for this SystemRelease.
     * 
     * @return releaseURI
     */
    public java.lang.String getReleaseURI() {
        return releaseURI;
    }


    /**
     * Sets the releaseURI value for this SystemRelease.
     * 
     * @param releaseURI
     */
    public void setReleaseURI(java.lang.String releaseURI) {
        this.releaseURI = releaseURI;
    }


    /**
     * Gets the valueSetDefinitions value for this SystemRelease.
     * 
     * @return valueSetDefinitions
     */
    public org.LexGrid.valueSets.ValueSetDefinitions getValueSetDefinitions() {
        return valueSetDefinitions;
    }


    /**
     * Sets the valueSetDefinitions value for this SystemRelease.
     * 
     * @param valueSetDefinitions
     */
    public void setValueSetDefinitions(org.LexGrid.valueSets.ValueSetDefinitions valueSetDefinitions) {
        this.valueSetDefinitions = valueSetDefinitions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemRelease)) return false;
        SystemRelease other = (SystemRelease) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basedOnRelease==null && other.getBasedOnRelease()==null) || 
             (this.basedOnRelease!=null &&
              this.basedOnRelease.equals(other.getBasedOnRelease()))) &&
            ((this.codingSchemes==null && other.getCodingSchemes()==null) || 
             (this.codingSchemes!=null &&
              this.codingSchemes.equals(other.getCodingSchemes()))) &&
            ((this.editHistory==null && other.getEditHistory()==null) || 
             (this.editHistory!=null &&
              this.editHistory.equals(other.getEditHistory()))) &&
            ((this.pickListDefinitions==null && other.getPickListDefinitions()==null) || 
             (this.pickListDefinitions!=null &&
              this.pickListDefinitions.equals(other.getPickListDefinitions()))) &&
            ((this.releaseAgency==null && other.getReleaseAgency()==null) || 
             (this.releaseAgency!=null &&
              this.releaseAgency.equals(other.getReleaseAgency()))) &&
            ((this.releaseDate==null && other.getReleaseDate()==null) || 
             (this.releaseDate!=null &&
              this.releaseDate.equals(other.getReleaseDate()))) &&
            ((this.releaseId==null && other.getReleaseId()==null) || 
             (this.releaseId!=null &&
              this.releaseId.equals(other.getReleaseId()))) &&
            ((this.releaseURI==null && other.getReleaseURI()==null) || 
             (this.releaseURI!=null &&
              this.releaseURI.equals(other.getReleaseURI()))) &&
            ((this.valueSetDefinitions==null && other.getValueSetDefinitions()==null) || 
             (this.valueSetDefinitions!=null &&
              this.valueSetDefinitions.equals(other.getValueSetDefinitions())));
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
        if (getBasedOnRelease() != null) {
            _hashCode += getBasedOnRelease().hashCode();
        }
        if (getCodingSchemes() != null) {
            _hashCode += getCodingSchemes().hashCode();
        }
        if (getEditHistory() != null) {
            _hashCode += getEditHistory().hashCode();
        }
        if (getPickListDefinitions() != null) {
            _hashCode += getPickListDefinitions().hashCode();
        }
        if (getReleaseAgency() != null) {
            _hashCode += getReleaseAgency().hashCode();
        }
        if (getReleaseDate() != null) {
            _hashCode += getReleaseDate().hashCode();
        }
        if (getReleaseId() != null) {
            _hashCode += getReleaseId().hashCode();
        }
        if (getReleaseURI() != null) {
            _hashCode += getReleaseURI().hashCode();
        }
        if (getValueSetDefinitions() != null) {
            _hashCode += getValueSetDefinitions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemRelease.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:versions.LexGrid.org", "SystemRelease"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basedOnRelease");
        elemField.setXmlName(new javax.xml.namespace.QName("", "basedOnRelease"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codingSchemes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codingSchemes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:codingSchemes.LexGrid.org", "CodingSchemes"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:versions.LexGrid.org", "EditHistory"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickListDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickListDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "PickListDefinitions"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseAgency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releaseAgency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseURI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releaseURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueSetDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueSetDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://valueSets.LexGrid.org", "ValueSetDefinitions"));
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
