/**
 * Entity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.LexGrid.concepts;

public class Entity  extends org.LexGrid.commonTypes.VersionableAndDescribable  implements java.io.Serializable {
    private org.LexGrid.commonTypes.Property[] allProperties;

    private org.LexGrid.concepts.Comment[] comment;

    private java.lang.Object[] commentAsReference;

    private int commentCount;

    private org.LexGrid.concepts.Definition[] definition;

    private java.lang.Object[] definitionAsReference;

    private int definitionCount;

    private java.lang.String entityCode;

    private java.lang.String entityCodeNamespace;

    private java.lang.String[] entityType;

    private java.lang.Object[] entityTypeAsReference;

    private int entityTypeCount;

    private java.lang.Boolean isAnonymous;

    private java.lang.Boolean isDefined;

    private org.LexGrid.concepts.Presentation[] presentation;

    private java.lang.Object[] presentationAsReference;

    private int presentationCount;

    private org.LexGrid.commonTypes.Property[] property;

    private java.lang.Object[] propertyAsReference;

    private int propertyCount;

    private org.LexGrid.concepts.PropertyLink[] propertyLink;

    private java.lang.Object[] propertyLinkAsReference;

    private int propertyLinkCount;

    public Entity() {
    }

    public Entity(
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
           int propertyLinkCount) {
        super(
            parent,
            effectiveDate,
            entryState,
            expirationDate,
            isActive,
            owner,
            status,
            valid,
            entityDescription);
        this.allProperties = allProperties;
        this.comment = comment;
        this.commentAsReference = commentAsReference;
        this.commentCount = commentCount;
        this.definition = definition;
        this.definitionAsReference = definitionAsReference;
        this.definitionCount = definitionCount;
        this.entityCode = entityCode;
        this.entityCodeNamespace = entityCodeNamespace;
        this.entityType = entityType;
        this.entityTypeAsReference = entityTypeAsReference;
        this.entityTypeCount = entityTypeCount;
        this.isAnonymous = isAnonymous;
        this.isDefined = isDefined;
        this.presentation = presentation;
        this.presentationAsReference = presentationAsReference;
        this.presentationCount = presentationCount;
        this.property = property;
        this.propertyAsReference = propertyAsReference;
        this.propertyCount = propertyCount;
        this.propertyLink = propertyLink;
        this.propertyLinkAsReference = propertyLinkAsReference;
        this.propertyLinkCount = propertyLinkCount;
    }


    /**
     * Gets the allProperties value for this Entity.
     * 
     * @return allProperties
     */
    public org.LexGrid.commonTypes.Property[] getAllProperties() {
        return allProperties;
    }


    /**
     * Sets the allProperties value for this Entity.
     * 
     * @param allProperties
     */
    public void setAllProperties(org.LexGrid.commonTypes.Property[] allProperties) {
        this.allProperties = allProperties;
    }


    /**
     * Gets the comment value for this Entity.
     * 
     * @return comment
     */
    public org.LexGrid.concepts.Comment[] getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Entity.
     * 
     * @param comment
     */
    public void setComment(org.LexGrid.concepts.Comment[] comment) {
        this.comment = comment;
    }

    public org.LexGrid.concepts.Comment getComment(int i) {
        return this.comment[i];
    }

    public void setComment(int i, org.LexGrid.concepts.Comment _value) {
        this.comment[i] = _value;
    }


    /**
     * Gets the commentAsReference value for this Entity.
     * 
     * @return commentAsReference
     */
    public java.lang.Object[] getCommentAsReference() {
        return commentAsReference;
    }


    /**
     * Sets the commentAsReference value for this Entity.
     * 
     * @param commentAsReference
     */
    public void setCommentAsReference(java.lang.Object[] commentAsReference) {
        this.commentAsReference = commentAsReference;
    }


    /**
     * Gets the commentCount value for this Entity.
     * 
     * @return commentCount
     */
    public int getCommentCount() {
        return commentCount;
    }


    /**
     * Sets the commentCount value for this Entity.
     * 
     * @param commentCount
     */
    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }


    /**
     * Gets the definition value for this Entity.
     * 
     * @return definition
     */
    public org.LexGrid.concepts.Definition[] getDefinition() {
        return definition;
    }


    /**
     * Sets the definition value for this Entity.
     * 
     * @param definition
     */
    public void setDefinition(org.LexGrid.concepts.Definition[] definition) {
        this.definition = definition;
    }

    public org.LexGrid.concepts.Definition getDefinition(int i) {
        return this.definition[i];
    }

    public void setDefinition(int i, org.LexGrid.concepts.Definition _value) {
        this.definition[i] = _value;
    }


    /**
     * Gets the definitionAsReference value for this Entity.
     * 
     * @return definitionAsReference
     */
    public java.lang.Object[] getDefinitionAsReference() {
        return definitionAsReference;
    }


    /**
     * Sets the definitionAsReference value for this Entity.
     * 
     * @param definitionAsReference
     */
    public void setDefinitionAsReference(java.lang.Object[] definitionAsReference) {
        this.definitionAsReference = definitionAsReference;
    }


    /**
     * Gets the definitionCount value for this Entity.
     * 
     * @return definitionCount
     */
    public int getDefinitionCount() {
        return definitionCount;
    }


    /**
     * Sets the definitionCount value for this Entity.
     * 
     * @param definitionCount
     */
    public void setDefinitionCount(int definitionCount) {
        this.definitionCount = definitionCount;
    }


    /**
     * Gets the entityCode value for this Entity.
     * 
     * @return entityCode
     */
    public java.lang.String getEntityCode() {
        return entityCode;
    }


    /**
     * Sets the entityCode value for this Entity.
     * 
     * @param entityCode
     */
    public void setEntityCode(java.lang.String entityCode) {
        this.entityCode = entityCode;
    }


    /**
     * Gets the entityCodeNamespace value for this Entity.
     * 
     * @return entityCodeNamespace
     */
    public java.lang.String getEntityCodeNamespace() {
        return entityCodeNamespace;
    }


    /**
     * Sets the entityCodeNamespace value for this Entity.
     * 
     * @param entityCodeNamespace
     */
    public void setEntityCodeNamespace(java.lang.String entityCodeNamespace) {
        this.entityCodeNamespace = entityCodeNamespace;
    }


    /**
     * Gets the entityType value for this Entity.
     * 
     * @return entityType
     */
    public java.lang.String[] getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this Entity.
     * 
     * @param entityType
     */
    public void setEntityType(java.lang.String[] entityType) {
        this.entityType = entityType;
    }

    public java.lang.String getEntityType(int i) {
        return this.entityType[i];
    }

    public void setEntityType(int i, java.lang.String _value) {
        this.entityType[i] = _value;
    }


    /**
     * Gets the entityTypeAsReference value for this Entity.
     * 
     * @return entityTypeAsReference
     */
    public java.lang.Object[] getEntityTypeAsReference() {
        return entityTypeAsReference;
    }


    /**
     * Sets the entityTypeAsReference value for this Entity.
     * 
     * @param entityTypeAsReference
     */
    public void setEntityTypeAsReference(java.lang.Object[] entityTypeAsReference) {
        this.entityTypeAsReference = entityTypeAsReference;
    }


    /**
     * Gets the entityTypeCount value for this Entity.
     * 
     * @return entityTypeCount
     */
    public int getEntityTypeCount() {
        return entityTypeCount;
    }


    /**
     * Sets the entityTypeCount value for this Entity.
     * 
     * @param entityTypeCount
     */
    public void setEntityTypeCount(int entityTypeCount) {
        this.entityTypeCount = entityTypeCount;
    }


    /**
     * Gets the isAnonymous value for this Entity.
     * 
     * @return isAnonymous
     */
    public java.lang.Boolean getIsAnonymous() {
        return isAnonymous;
    }


    /**
     * Sets the isAnonymous value for this Entity.
     * 
     * @param isAnonymous
     */
    public void setIsAnonymous(java.lang.Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }


    /**
     * Gets the isDefined value for this Entity.
     * 
     * @return isDefined
     */
    public java.lang.Boolean getIsDefined() {
        return isDefined;
    }


    /**
     * Sets the isDefined value for this Entity.
     * 
     * @param isDefined
     */
    public void setIsDefined(java.lang.Boolean isDefined) {
        this.isDefined = isDefined;
    }


    /**
     * Gets the presentation value for this Entity.
     * 
     * @return presentation
     */
    public org.LexGrid.concepts.Presentation[] getPresentation() {
        return presentation;
    }


    /**
     * Sets the presentation value for this Entity.
     * 
     * @param presentation
     */
    public void setPresentation(org.LexGrid.concepts.Presentation[] presentation) {
        this.presentation = presentation;
    }

    public org.LexGrid.concepts.Presentation getPresentation(int i) {
        return this.presentation[i];
    }

    public void setPresentation(int i, org.LexGrid.concepts.Presentation _value) {
        this.presentation[i] = _value;
    }


    /**
     * Gets the presentationAsReference value for this Entity.
     * 
     * @return presentationAsReference
     */
    public java.lang.Object[] getPresentationAsReference() {
        return presentationAsReference;
    }


    /**
     * Sets the presentationAsReference value for this Entity.
     * 
     * @param presentationAsReference
     */
    public void setPresentationAsReference(java.lang.Object[] presentationAsReference) {
        this.presentationAsReference = presentationAsReference;
    }


    /**
     * Gets the presentationCount value for this Entity.
     * 
     * @return presentationCount
     */
    public int getPresentationCount() {
        return presentationCount;
    }


    /**
     * Sets the presentationCount value for this Entity.
     * 
     * @param presentationCount
     */
    public void setPresentationCount(int presentationCount) {
        this.presentationCount = presentationCount;
    }


    /**
     * Gets the property value for this Entity.
     * 
     * @return property
     */
    public org.LexGrid.commonTypes.Property[] getProperty() {
        return property;
    }


    /**
     * Sets the property value for this Entity.
     * 
     * @param property
     */
    public void setProperty(org.LexGrid.commonTypes.Property[] property) {
        this.property = property;
    }

    public org.LexGrid.commonTypes.Property getProperty(int i) {
        return this.property[i];
    }

    public void setProperty(int i, org.LexGrid.commonTypes.Property _value) {
        this.property[i] = _value;
    }


    /**
     * Gets the propertyAsReference value for this Entity.
     * 
     * @return propertyAsReference
     */
    public java.lang.Object[] getPropertyAsReference() {
        return propertyAsReference;
    }


    /**
     * Sets the propertyAsReference value for this Entity.
     * 
     * @param propertyAsReference
     */
    public void setPropertyAsReference(java.lang.Object[] propertyAsReference) {
        this.propertyAsReference = propertyAsReference;
    }


    /**
     * Gets the propertyCount value for this Entity.
     * 
     * @return propertyCount
     */
    public int getPropertyCount() {
        return propertyCount;
    }


    /**
     * Sets the propertyCount value for this Entity.
     * 
     * @param propertyCount
     */
    public void setPropertyCount(int propertyCount) {
        this.propertyCount = propertyCount;
    }


    /**
     * Gets the propertyLink value for this Entity.
     * 
     * @return propertyLink
     */
    public org.LexGrid.concepts.PropertyLink[] getPropertyLink() {
        return propertyLink;
    }


    /**
     * Sets the propertyLink value for this Entity.
     * 
     * @param propertyLink
     */
    public void setPropertyLink(org.LexGrid.concepts.PropertyLink[] propertyLink) {
        this.propertyLink = propertyLink;
    }

    public org.LexGrid.concepts.PropertyLink getPropertyLink(int i) {
        return this.propertyLink[i];
    }

    public void setPropertyLink(int i, org.LexGrid.concepts.PropertyLink _value) {
        this.propertyLink[i] = _value;
    }


    /**
     * Gets the propertyLinkAsReference value for this Entity.
     * 
     * @return propertyLinkAsReference
     */
    public java.lang.Object[] getPropertyLinkAsReference() {
        return propertyLinkAsReference;
    }


    /**
     * Sets the propertyLinkAsReference value for this Entity.
     * 
     * @param propertyLinkAsReference
     */
    public void setPropertyLinkAsReference(java.lang.Object[] propertyLinkAsReference) {
        this.propertyLinkAsReference = propertyLinkAsReference;
    }


    /**
     * Gets the propertyLinkCount value for this Entity.
     * 
     * @return propertyLinkCount
     */
    public int getPropertyLinkCount() {
        return propertyLinkCount;
    }


    /**
     * Sets the propertyLinkCount value for this Entity.
     * 
     * @param propertyLinkCount
     */
    public void setPropertyLinkCount(int propertyLinkCount) {
        this.propertyLinkCount = propertyLinkCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entity)) return false;
        Entity other = (Entity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allProperties==null && other.getAllProperties()==null) || 
             (this.allProperties!=null &&
              java.util.Arrays.equals(this.allProperties, other.getAllProperties()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              java.util.Arrays.equals(this.comment, other.getComment()))) &&
            ((this.commentAsReference==null && other.getCommentAsReference()==null) || 
             (this.commentAsReference!=null &&
              java.util.Arrays.equals(this.commentAsReference, other.getCommentAsReference()))) &&
            this.commentCount == other.getCommentCount() &&
            ((this.definition==null && other.getDefinition()==null) || 
             (this.definition!=null &&
              java.util.Arrays.equals(this.definition, other.getDefinition()))) &&
            ((this.definitionAsReference==null && other.getDefinitionAsReference()==null) || 
             (this.definitionAsReference!=null &&
              java.util.Arrays.equals(this.definitionAsReference, other.getDefinitionAsReference()))) &&
            this.definitionCount == other.getDefinitionCount() &&
            ((this.entityCode==null && other.getEntityCode()==null) || 
             (this.entityCode!=null &&
              this.entityCode.equals(other.getEntityCode()))) &&
            ((this.entityCodeNamespace==null && other.getEntityCodeNamespace()==null) || 
             (this.entityCodeNamespace!=null &&
              this.entityCodeNamespace.equals(other.getEntityCodeNamespace()))) &&
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              java.util.Arrays.equals(this.entityType, other.getEntityType()))) &&
            ((this.entityTypeAsReference==null && other.getEntityTypeAsReference()==null) || 
             (this.entityTypeAsReference!=null &&
              java.util.Arrays.equals(this.entityTypeAsReference, other.getEntityTypeAsReference()))) &&
            this.entityTypeCount == other.getEntityTypeCount() &&
            ((this.isAnonymous==null && other.getIsAnonymous()==null) || 
             (this.isAnonymous!=null &&
              this.isAnonymous.equals(other.getIsAnonymous()))) &&
            ((this.isDefined==null && other.getIsDefined()==null) || 
             (this.isDefined!=null &&
              this.isDefined.equals(other.getIsDefined()))) &&
            ((this.presentation==null && other.getPresentation()==null) || 
             (this.presentation!=null &&
              java.util.Arrays.equals(this.presentation, other.getPresentation()))) &&
            ((this.presentationAsReference==null && other.getPresentationAsReference()==null) || 
             (this.presentationAsReference!=null &&
              java.util.Arrays.equals(this.presentationAsReference, other.getPresentationAsReference()))) &&
            this.presentationCount == other.getPresentationCount() &&
            ((this.property==null && other.getProperty()==null) || 
             (this.property!=null &&
              java.util.Arrays.equals(this.property, other.getProperty()))) &&
            ((this.propertyAsReference==null && other.getPropertyAsReference()==null) || 
             (this.propertyAsReference!=null &&
              java.util.Arrays.equals(this.propertyAsReference, other.getPropertyAsReference()))) &&
            this.propertyCount == other.getPropertyCount() &&
            ((this.propertyLink==null && other.getPropertyLink()==null) || 
             (this.propertyLink!=null &&
              java.util.Arrays.equals(this.propertyLink, other.getPropertyLink()))) &&
            ((this.propertyLinkAsReference==null && other.getPropertyLinkAsReference()==null) || 
             (this.propertyLinkAsReference!=null &&
              java.util.Arrays.equals(this.propertyLinkAsReference, other.getPropertyLinkAsReference()))) &&
            this.propertyLinkCount == other.getPropertyLinkCount();
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
        if (getAllProperties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllProperties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllProperties(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommentAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommentAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommentAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getCommentCount();
        if (getDefinition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefinition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefinition(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefinitionAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefinitionAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefinitionAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getDefinitionCount();
        if (getEntityCode() != null) {
            _hashCode += getEntityCode().hashCode();
        }
        if (getEntityCodeNamespace() != null) {
            _hashCode += getEntityCodeNamespace().hashCode();
        }
        if (getEntityType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityTypeAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityTypeAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityTypeAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getEntityTypeCount();
        if (getIsAnonymous() != null) {
            _hashCode += getIsAnonymous().hashCode();
        }
        if (getIsDefined() != null) {
            _hashCode += getIsDefined().hashCode();
        }
        if (getPresentation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPresentation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPresentation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPresentationAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPresentationAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPresentationAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPresentationCount();
        if (getProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProperty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPropertyAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertyAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertyAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPropertyCount();
        if (getPropertyLink() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertyLink());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertyLink(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPropertyLinkAsReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertyLinkAsReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertyLinkAsReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPropertyLinkCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:concepts.LexGrid.org", "Entity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Property"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:concepts.LexGrid.org", "Comment"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commentAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commentCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "definition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:concepts.LexGrid.org", "Definition"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definitionAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "definitionAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definitionCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "definitionCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityCodeNamespace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityCodeNamespace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityTypeAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityTypeAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityTypeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityTypeCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAnonymous");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isAnonymous"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefined");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isDefined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "presentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:concepts.LexGrid.org", "Presentation"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "presentationAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "presentationCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property");
        elemField.setXmlName(new javax.xml.namespace.QName("", "property"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:commonTypes.LexGrid.org", "Property"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyLink");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:concepts.LexGrid.org", "PropertyLink"));
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyLinkAsReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyLinkAsReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyLinkCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyLinkCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
