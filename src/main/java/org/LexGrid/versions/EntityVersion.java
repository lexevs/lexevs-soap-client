/**
 * EntityVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.versions;

public class EntityVersion  extends org.LexGrid.commonTypes.Describable  implements java.io.Serializable {
    private org.LexGrid.commonTypes.Text changeDocumentation;

    private org.LexGrid.commonTypes.Text changeInstructions;

    private java.util.Calendar effectiveDate;

    private java.lang.Boolean isComplete;

    private java.lang.String releaseURN;

    private java.lang.String version;

    private java.util.Calendar versionDate;

    private java.lang.Long versionOrder;

    public EntityVersion() {
    }

    public EntityVersion(
           java.lang.Object parent,
           org.LexGrid.commonTypes.EntityDescription entityDescription,
           boolean valid,
           org.LexGrid.commonTypes.Text changeDocumentation,
           org.LexGrid.commonTypes.Text changeInstructions,
           java.util.Calendar effectiveDate,
           java.lang.Boolean isComplete,
           java.lang.String releaseURN,
           java.lang.String version,
           java.util.Calendar versionDate,
           java.lang.Long versionOrder) {
        super(
            parent,
            entityDescription,
            valid);
        this.changeDocumentation = changeDocumentation;
        this.changeInstructions = changeInstructions;
        this.effectiveDate = effectiveDate;
        this.isComplete = isComplete;
        this.releaseURN = releaseURN;
        this.version = version;
        this.versionDate = versionDate;
        this.versionOrder = versionOrder;
    }


    /**
     * Gets the changeDocumentation value for this EntityVersion.
     * 
     * @return changeDocumentation
     */
    public org.LexGrid.commonTypes.Text getChangeDocumentation() {
        return changeDocumentation;
    }


    /**
     * Sets the changeDocumentation value for this EntityVersion.
     * 
     * @param changeDocumentation
     */
    public void setChangeDocumentation(org.LexGrid.commonTypes.Text changeDocumentation) {
        this.changeDocumentation = changeDocumentation;
    }


    /**
     * Gets the changeInstructions value for this EntityVersion.
     * 
     * @return changeInstructions
     */
    public org.LexGrid.commonTypes.Text getChangeInstructions() {
        return changeInstructions;
    }


    /**
     * Sets the changeInstructions value for this EntityVersion.
     * 
     * @param changeInstructions
     */
    public void setChangeInstructions(org.LexGrid.commonTypes.Text changeInstructions) {
        this.changeInstructions = changeInstructions;
    }


    /**
     * Gets the effectiveDate value for this EntityVersion.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this EntityVersion.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the isComplete value for this EntityVersion.
     * 
     * @return isComplete
     */
    public java.lang.Boolean getIsComplete() {
        return isComplete;
    }


    /**
     * Sets the isComplete value for this EntityVersion.
     * 
     * @param isComplete
     */
    public void setIsComplete(java.lang.Boolean isComplete) {
        this.isComplete = isComplete;
    }


    /**
     * Gets the releaseURN value for this EntityVersion.
     * 
     * @return releaseURN
     */
    public java.lang.String getReleaseURN() {
        return releaseURN;
    }


    /**
     * Sets the releaseURN value for this EntityVersion.
     * 
     * @param releaseURN
     */
    public void setReleaseURN(java.lang.String releaseURN) {
        this.releaseURN = releaseURN;
    }


    /**
     * Gets the version value for this EntityVersion.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this EntityVersion.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the versionDate value for this EntityVersion.
     * 
     * @return versionDate
     */
    public java.util.Calendar getVersionDate() {
        return versionDate;
    }


    /**
     * Sets the versionDate value for this EntityVersion.
     * 
     * @param versionDate
     */
    public void setVersionDate(java.util.Calendar versionDate) {
        this.versionDate = versionDate;
    }


    /**
     * Gets the versionOrder value for this EntityVersion.
     * 
     * @return versionOrder
     */
    public java.lang.Long getVersionOrder() {
        return versionOrder;
    }


    /**
     * Sets the versionOrder value for this EntityVersion.
     * 
     * @param versionOrder
     */
    public void setVersionOrder(java.lang.Long versionOrder) {
        this.versionOrder = versionOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntityVersion)) return false;
        EntityVersion other = (EntityVersion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.changeDocumentation==null && other.getChangeDocumentation()==null) || 
             (this.changeDocumentation!=null &&
              this.changeDocumentation.equals(other.getChangeDocumentation()))) &&
            ((this.changeInstructions==null && other.getChangeInstructions()==null) || 
             (this.changeInstructions!=null &&
              this.changeInstructions.equals(other.getChangeInstructions()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.isComplete==null && other.getIsComplete()==null) || 
             (this.isComplete!=null &&
              this.isComplete.equals(other.getIsComplete()))) &&
            ((this.releaseURN==null && other.getReleaseURN()==null) || 
             (this.releaseURN!=null &&
              this.releaseURN.equals(other.getReleaseURN()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.versionDate==null && other.getVersionDate()==null) || 
             (this.versionDate!=null &&
              this.versionDate.equals(other.getVersionDate()))) &&
            ((this.versionOrder==null && other.getVersionOrder()==null) || 
             (this.versionOrder!=null &&
              this.versionOrder.equals(other.getVersionOrder())));
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
        if (getChangeDocumentation() != null) {
            _hashCode += getChangeDocumentation().hashCode();
        }
        if (getChangeInstructions() != null) {
            _hashCode += getChangeInstructions().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getIsComplete() != null) {
            _hashCode += getIsComplete().hashCode();
        }
        if (getReleaseURN() != null) {
            _hashCode += getReleaseURN().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getVersionDate() != null) {
            _hashCode += getVersionDate().hashCode();
        }
        if (getVersionOrder() != null) {
            _hashCode += getVersionOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntityVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:versions.LexGrid.org", "EntityVersion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeDocumentation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeDocumentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Text"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Text"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseURN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releaseURN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
