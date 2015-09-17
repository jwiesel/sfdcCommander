/**
 * LiveAgentConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LiveAgentConfig  implements java.io.Serializable {
    private java.lang.Boolean enableLiveChat;

    private java.lang.Boolean openNewAccountSubtab;

    private java.lang.Boolean openNewCaseSubtab;

    private java.lang.Boolean openNewContactSubtab;

    private java.lang.Boolean openNewLeadSubtab;

    private java.lang.Boolean openNewVFPageSubtab;

    private java.lang.String[] pagesToOpen;

    private java.lang.Boolean showKnowledgeArticles;

    public LiveAgentConfig() {
    }

    public LiveAgentConfig(
           java.lang.Boolean enableLiveChat,
           java.lang.Boolean openNewAccountSubtab,
           java.lang.Boolean openNewCaseSubtab,
           java.lang.Boolean openNewContactSubtab,
           java.lang.Boolean openNewLeadSubtab,
           java.lang.Boolean openNewVFPageSubtab,
           java.lang.String[] pagesToOpen,
           java.lang.Boolean showKnowledgeArticles) {
           this.enableLiveChat = enableLiveChat;
           this.openNewAccountSubtab = openNewAccountSubtab;
           this.openNewCaseSubtab = openNewCaseSubtab;
           this.openNewContactSubtab = openNewContactSubtab;
           this.openNewLeadSubtab = openNewLeadSubtab;
           this.openNewVFPageSubtab = openNewVFPageSubtab;
           this.pagesToOpen = pagesToOpen;
           this.showKnowledgeArticles = showKnowledgeArticles;
    }


    /**
     * Gets the enableLiveChat value for this LiveAgentConfig.
     * 
     * @return enableLiveChat
     */
    public java.lang.Boolean getEnableLiveChat() {
        return enableLiveChat;
    }


    /**
     * Sets the enableLiveChat value for this LiveAgentConfig.
     * 
     * @param enableLiveChat
     */
    public void setEnableLiveChat(java.lang.Boolean enableLiveChat) {
        this.enableLiveChat = enableLiveChat;
    }


    /**
     * Gets the openNewAccountSubtab value for this LiveAgentConfig.
     * 
     * @return openNewAccountSubtab
     */
    public java.lang.Boolean getOpenNewAccountSubtab() {
        return openNewAccountSubtab;
    }


    /**
     * Sets the openNewAccountSubtab value for this LiveAgentConfig.
     * 
     * @param openNewAccountSubtab
     */
    public void setOpenNewAccountSubtab(java.lang.Boolean openNewAccountSubtab) {
        this.openNewAccountSubtab = openNewAccountSubtab;
    }


    /**
     * Gets the openNewCaseSubtab value for this LiveAgentConfig.
     * 
     * @return openNewCaseSubtab
     */
    public java.lang.Boolean getOpenNewCaseSubtab() {
        return openNewCaseSubtab;
    }


    /**
     * Sets the openNewCaseSubtab value for this LiveAgentConfig.
     * 
     * @param openNewCaseSubtab
     */
    public void setOpenNewCaseSubtab(java.lang.Boolean openNewCaseSubtab) {
        this.openNewCaseSubtab = openNewCaseSubtab;
    }


    /**
     * Gets the openNewContactSubtab value for this LiveAgentConfig.
     * 
     * @return openNewContactSubtab
     */
    public java.lang.Boolean getOpenNewContactSubtab() {
        return openNewContactSubtab;
    }


    /**
     * Sets the openNewContactSubtab value for this LiveAgentConfig.
     * 
     * @param openNewContactSubtab
     */
    public void setOpenNewContactSubtab(java.lang.Boolean openNewContactSubtab) {
        this.openNewContactSubtab = openNewContactSubtab;
    }


    /**
     * Gets the openNewLeadSubtab value for this LiveAgentConfig.
     * 
     * @return openNewLeadSubtab
     */
    public java.lang.Boolean getOpenNewLeadSubtab() {
        return openNewLeadSubtab;
    }


    /**
     * Sets the openNewLeadSubtab value for this LiveAgentConfig.
     * 
     * @param openNewLeadSubtab
     */
    public void setOpenNewLeadSubtab(java.lang.Boolean openNewLeadSubtab) {
        this.openNewLeadSubtab = openNewLeadSubtab;
    }


    /**
     * Gets the openNewVFPageSubtab value for this LiveAgentConfig.
     * 
     * @return openNewVFPageSubtab
     */
    public java.lang.Boolean getOpenNewVFPageSubtab() {
        return openNewVFPageSubtab;
    }


    /**
     * Sets the openNewVFPageSubtab value for this LiveAgentConfig.
     * 
     * @param openNewVFPageSubtab
     */
    public void setOpenNewVFPageSubtab(java.lang.Boolean openNewVFPageSubtab) {
        this.openNewVFPageSubtab = openNewVFPageSubtab;
    }


    /**
     * Gets the pagesToOpen value for this LiveAgentConfig.
     * 
     * @return pagesToOpen
     */
    public java.lang.String[] getPagesToOpen() {
        return pagesToOpen;
    }


    /**
     * Sets the pagesToOpen value for this LiveAgentConfig.
     * 
     * @param pagesToOpen
     */
    public void setPagesToOpen(java.lang.String[] pagesToOpen) {
        this.pagesToOpen = pagesToOpen;
    }


    /**
     * Gets the showKnowledgeArticles value for this LiveAgentConfig.
     * 
     * @return showKnowledgeArticles
     */
    public java.lang.Boolean getShowKnowledgeArticles() {
        return showKnowledgeArticles;
    }


    /**
     * Sets the showKnowledgeArticles value for this LiveAgentConfig.
     * 
     * @param showKnowledgeArticles
     */
    public void setShowKnowledgeArticles(java.lang.Boolean showKnowledgeArticles) {
        this.showKnowledgeArticles = showKnowledgeArticles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LiveAgentConfig)) return false;
        LiveAgentConfig other = (LiveAgentConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enableLiveChat==null && other.getEnableLiveChat()==null) || 
             (this.enableLiveChat!=null &&
              this.enableLiveChat.equals(other.getEnableLiveChat()))) &&
            ((this.openNewAccountSubtab==null && other.getOpenNewAccountSubtab()==null) || 
             (this.openNewAccountSubtab!=null &&
              this.openNewAccountSubtab.equals(other.getOpenNewAccountSubtab()))) &&
            ((this.openNewCaseSubtab==null && other.getOpenNewCaseSubtab()==null) || 
             (this.openNewCaseSubtab!=null &&
              this.openNewCaseSubtab.equals(other.getOpenNewCaseSubtab()))) &&
            ((this.openNewContactSubtab==null && other.getOpenNewContactSubtab()==null) || 
             (this.openNewContactSubtab!=null &&
              this.openNewContactSubtab.equals(other.getOpenNewContactSubtab()))) &&
            ((this.openNewLeadSubtab==null && other.getOpenNewLeadSubtab()==null) || 
             (this.openNewLeadSubtab!=null &&
              this.openNewLeadSubtab.equals(other.getOpenNewLeadSubtab()))) &&
            ((this.openNewVFPageSubtab==null && other.getOpenNewVFPageSubtab()==null) || 
             (this.openNewVFPageSubtab!=null &&
              this.openNewVFPageSubtab.equals(other.getOpenNewVFPageSubtab()))) &&
            ((this.pagesToOpen==null && other.getPagesToOpen()==null) || 
             (this.pagesToOpen!=null &&
              java.util.Arrays.equals(this.pagesToOpen, other.getPagesToOpen()))) &&
            ((this.showKnowledgeArticles==null && other.getShowKnowledgeArticles()==null) || 
             (this.showKnowledgeArticles!=null &&
              this.showKnowledgeArticles.equals(other.getShowKnowledgeArticles())));
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
        if (getEnableLiveChat() != null) {
            _hashCode += getEnableLiveChat().hashCode();
        }
        if (getOpenNewAccountSubtab() != null) {
            _hashCode += getOpenNewAccountSubtab().hashCode();
        }
        if (getOpenNewCaseSubtab() != null) {
            _hashCode += getOpenNewCaseSubtab().hashCode();
        }
        if (getOpenNewContactSubtab() != null) {
            _hashCode += getOpenNewContactSubtab().hashCode();
        }
        if (getOpenNewLeadSubtab() != null) {
            _hashCode += getOpenNewLeadSubtab().hashCode();
        }
        if (getOpenNewVFPageSubtab() != null) {
            _hashCode += getOpenNewVFPageSubtab().hashCode();
        }
        if (getPagesToOpen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPagesToOpen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPagesToOpen(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShowKnowledgeArticles() != null) {
            _hashCode += getShowKnowledgeArticles().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LiveAgentConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveAgentConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableLiveChat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableLiveChat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openNewAccountSubtab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "openNewAccountSubtab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openNewCaseSubtab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "openNewCaseSubtab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openNewContactSubtab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "openNewContactSubtab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openNewLeadSubtab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "openNewLeadSubtab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openNewVFPageSubtab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "openNewVFPageSubtab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pagesToOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pagesToOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pageToOpen"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showKnowledgeArticles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showKnowledgeArticles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
