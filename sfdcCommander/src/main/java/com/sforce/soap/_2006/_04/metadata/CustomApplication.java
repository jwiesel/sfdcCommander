/**
 * CustomApplication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class CustomApplication  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.CustomApplicationComponents customApplicationComponents;

    private java.lang.String defaultLandingTab;

    private java.lang.String description;

    private java.lang.String detailPageRefreshMethod;

    private java.lang.String[] domainWhitelist;

    private java.lang.Boolean enableCustomizeMyTabs;

    private java.lang.Boolean enableKeyboardShortcuts;

    private java.lang.Boolean enableMultiMonitorComponents;

    private java.lang.Boolean enablePinTabs;

    private java.lang.Boolean isServiceCloudConsole;

    private com.sforce.soap._2006._04.metadata.KeyboardShortcuts keyboardShortcuts;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.ListPlacement listPlacement;

    private java.lang.String listRefreshMethod;

    private com.sforce.soap._2006._04.metadata.LiveAgentConfig liveAgentConfig;

    private java.lang.String logo;

    private com.sforce.soap._2006._04.metadata.PushNotification[] pushNotifications;

    private java.lang.Boolean saveUserSessions;

    private java.lang.String[] tab;

    private com.sforce.soap._2006._04.metadata.WorkspaceMapping[] workspaceMappings;

    public CustomApplication() {
    }

    public CustomApplication(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.CustomApplicationComponents customApplicationComponents,
           java.lang.String defaultLandingTab,
           java.lang.String description,
           java.lang.String detailPageRefreshMethod,
           java.lang.String[] domainWhitelist,
           java.lang.Boolean enableCustomizeMyTabs,
           java.lang.Boolean enableKeyboardShortcuts,
           java.lang.Boolean enableMultiMonitorComponents,
           java.lang.Boolean enablePinTabs,
           java.lang.Boolean isServiceCloudConsole,
           com.sforce.soap._2006._04.metadata.KeyboardShortcuts keyboardShortcuts,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.ListPlacement listPlacement,
           java.lang.String listRefreshMethod,
           com.sforce.soap._2006._04.metadata.LiveAgentConfig liveAgentConfig,
           java.lang.String logo,
           com.sforce.soap._2006._04.metadata.PushNotification[] pushNotifications,
           java.lang.Boolean saveUserSessions,
           java.lang.String[] tab,
           com.sforce.soap._2006._04.metadata.WorkspaceMapping[] workspaceMappings) {
        super(
            fullName);
        this.customApplicationComponents = customApplicationComponents;
        this.defaultLandingTab = defaultLandingTab;
        this.description = description;
        this.detailPageRefreshMethod = detailPageRefreshMethod;
        this.domainWhitelist = domainWhitelist;
        this.enableCustomizeMyTabs = enableCustomizeMyTabs;
        this.enableKeyboardShortcuts = enableKeyboardShortcuts;
        this.enableMultiMonitorComponents = enableMultiMonitorComponents;
        this.enablePinTabs = enablePinTabs;
        this.isServiceCloudConsole = isServiceCloudConsole;
        this.keyboardShortcuts = keyboardShortcuts;
        this.label = label;
        this.listPlacement = listPlacement;
        this.listRefreshMethod = listRefreshMethod;
        this.liveAgentConfig = liveAgentConfig;
        this.logo = logo;
        this.pushNotifications = pushNotifications;
        this.saveUserSessions = saveUserSessions;
        this.tab = tab;
        this.workspaceMappings = workspaceMappings;
    }


    /**
     * Gets the customApplicationComponents value for this CustomApplication.
     * 
     * @return customApplicationComponents
     */
    public com.sforce.soap._2006._04.metadata.CustomApplicationComponents getCustomApplicationComponents() {
        return customApplicationComponents;
    }


    /**
     * Sets the customApplicationComponents value for this CustomApplication.
     * 
     * @param customApplicationComponents
     */
    public void setCustomApplicationComponents(com.sforce.soap._2006._04.metadata.CustomApplicationComponents customApplicationComponents) {
        this.customApplicationComponents = customApplicationComponents;
    }


    /**
     * Gets the defaultLandingTab value for this CustomApplication.
     * 
     * @return defaultLandingTab
     */
    public java.lang.String getDefaultLandingTab() {
        return defaultLandingTab;
    }


    /**
     * Sets the defaultLandingTab value for this CustomApplication.
     * 
     * @param defaultLandingTab
     */
    public void setDefaultLandingTab(java.lang.String defaultLandingTab) {
        this.defaultLandingTab = defaultLandingTab;
    }


    /**
     * Gets the description value for this CustomApplication.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomApplication.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the detailPageRefreshMethod value for this CustomApplication.
     * 
     * @return detailPageRefreshMethod
     */
    public java.lang.String getDetailPageRefreshMethod() {
        return detailPageRefreshMethod;
    }


    /**
     * Sets the detailPageRefreshMethod value for this CustomApplication.
     * 
     * @param detailPageRefreshMethod
     */
    public void setDetailPageRefreshMethod(java.lang.String detailPageRefreshMethod) {
        this.detailPageRefreshMethod = detailPageRefreshMethod;
    }


    /**
     * Gets the domainWhitelist value for this CustomApplication.
     * 
     * @return domainWhitelist
     */
    public java.lang.String[] getDomainWhitelist() {
        return domainWhitelist;
    }


    /**
     * Sets the domainWhitelist value for this CustomApplication.
     * 
     * @param domainWhitelist
     */
    public void setDomainWhitelist(java.lang.String[] domainWhitelist) {
        this.domainWhitelist = domainWhitelist;
    }


    /**
     * Gets the enableCustomizeMyTabs value for this CustomApplication.
     * 
     * @return enableCustomizeMyTabs
     */
    public java.lang.Boolean getEnableCustomizeMyTabs() {
        return enableCustomizeMyTabs;
    }


    /**
     * Sets the enableCustomizeMyTabs value for this CustomApplication.
     * 
     * @param enableCustomizeMyTabs
     */
    public void setEnableCustomizeMyTabs(java.lang.Boolean enableCustomizeMyTabs) {
        this.enableCustomizeMyTabs = enableCustomizeMyTabs;
    }


    /**
     * Gets the enableKeyboardShortcuts value for this CustomApplication.
     * 
     * @return enableKeyboardShortcuts
     */
    public java.lang.Boolean getEnableKeyboardShortcuts() {
        return enableKeyboardShortcuts;
    }


    /**
     * Sets the enableKeyboardShortcuts value for this CustomApplication.
     * 
     * @param enableKeyboardShortcuts
     */
    public void setEnableKeyboardShortcuts(java.lang.Boolean enableKeyboardShortcuts) {
        this.enableKeyboardShortcuts = enableKeyboardShortcuts;
    }


    /**
     * Gets the enableMultiMonitorComponents value for this CustomApplication.
     * 
     * @return enableMultiMonitorComponents
     */
    public java.lang.Boolean getEnableMultiMonitorComponents() {
        return enableMultiMonitorComponents;
    }


    /**
     * Sets the enableMultiMonitorComponents value for this CustomApplication.
     * 
     * @param enableMultiMonitorComponents
     */
    public void setEnableMultiMonitorComponents(java.lang.Boolean enableMultiMonitorComponents) {
        this.enableMultiMonitorComponents = enableMultiMonitorComponents;
    }


    /**
     * Gets the enablePinTabs value for this CustomApplication.
     * 
     * @return enablePinTabs
     */
    public java.lang.Boolean getEnablePinTabs() {
        return enablePinTabs;
    }


    /**
     * Sets the enablePinTabs value for this CustomApplication.
     * 
     * @param enablePinTabs
     */
    public void setEnablePinTabs(java.lang.Boolean enablePinTabs) {
        this.enablePinTabs = enablePinTabs;
    }


    /**
     * Gets the isServiceCloudConsole value for this CustomApplication.
     * 
     * @return isServiceCloudConsole
     */
    public java.lang.Boolean getIsServiceCloudConsole() {
        return isServiceCloudConsole;
    }


    /**
     * Sets the isServiceCloudConsole value for this CustomApplication.
     * 
     * @param isServiceCloudConsole
     */
    public void setIsServiceCloudConsole(java.lang.Boolean isServiceCloudConsole) {
        this.isServiceCloudConsole = isServiceCloudConsole;
    }


    /**
     * Gets the keyboardShortcuts value for this CustomApplication.
     * 
     * @return keyboardShortcuts
     */
    public com.sforce.soap._2006._04.metadata.KeyboardShortcuts getKeyboardShortcuts() {
        return keyboardShortcuts;
    }


    /**
     * Sets the keyboardShortcuts value for this CustomApplication.
     * 
     * @param keyboardShortcuts
     */
    public void setKeyboardShortcuts(com.sforce.soap._2006._04.metadata.KeyboardShortcuts keyboardShortcuts) {
        this.keyboardShortcuts = keyboardShortcuts;
    }


    /**
     * Gets the label value for this CustomApplication.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this CustomApplication.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the listPlacement value for this CustomApplication.
     * 
     * @return listPlacement
     */
    public com.sforce.soap._2006._04.metadata.ListPlacement getListPlacement() {
        return listPlacement;
    }


    /**
     * Sets the listPlacement value for this CustomApplication.
     * 
     * @param listPlacement
     */
    public void setListPlacement(com.sforce.soap._2006._04.metadata.ListPlacement listPlacement) {
        this.listPlacement = listPlacement;
    }


    /**
     * Gets the listRefreshMethod value for this CustomApplication.
     * 
     * @return listRefreshMethod
     */
    public java.lang.String getListRefreshMethod() {
        return listRefreshMethod;
    }


    /**
     * Sets the listRefreshMethod value for this CustomApplication.
     * 
     * @param listRefreshMethod
     */
    public void setListRefreshMethod(java.lang.String listRefreshMethod) {
        this.listRefreshMethod = listRefreshMethod;
    }


    /**
     * Gets the liveAgentConfig value for this CustomApplication.
     * 
     * @return liveAgentConfig
     */
    public com.sforce.soap._2006._04.metadata.LiveAgentConfig getLiveAgentConfig() {
        return liveAgentConfig;
    }


    /**
     * Sets the liveAgentConfig value for this CustomApplication.
     * 
     * @param liveAgentConfig
     */
    public void setLiveAgentConfig(com.sforce.soap._2006._04.metadata.LiveAgentConfig liveAgentConfig) {
        this.liveAgentConfig = liveAgentConfig;
    }


    /**
     * Gets the logo value for this CustomApplication.
     * 
     * @return logo
     */
    public java.lang.String getLogo() {
        return logo;
    }


    /**
     * Sets the logo value for this CustomApplication.
     * 
     * @param logo
     */
    public void setLogo(java.lang.String logo) {
        this.logo = logo;
    }


    /**
     * Gets the pushNotifications value for this CustomApplication.
     * 
     * @return pushNotifications
     */
    public com.sforce.soap._2006._04.metadata.PushNotification[] getPushNotifications() {
        return pushNotifications;
    }


    /**
     * Sets the pushNotifications value for this CustomApplication.
     * 
     * @param pushNotifications
     */
    public void setPushNotifications(com.sforce.soap._2006._04.metadata.PushNotification[] pushNotifications) {
        this.pushNotifications = pushNotifications;
    }


    /**
     * Gets the saveUserSessions value for this CustomApplication.
     * 
     * @return saveUserSessions
     */
    public java.lang.Boolean getSaveUserSessions() {
        return saveUserSessions;
    }


    /**
     * Sets the saveUserSessions value for this CustomApplication.
     * 
     * @param saveUserSessions
     */
    public void setSaveUserSessions(java.lang.Boolean saveUserSessions) {
        this.saveUserSessions = saveUserSessions;
    }


    /**
     * Gets the tab value for this CustomApplication.
     * 
     * @return tab
     */
    public java.lang.String[] getTab() {
        return tab;
    }


    /**
     * Sets the tab value for this CustomApplication.
     * 
     * @param tab
     */
    public void setTab(java.lang.String[] tab) {
        this.tab = tab;
    }

    public java.lang.String getTab(int i) {
        return this.tab[i];
    }

    public void setTab(int i, java.lang.String _value) {
        this.tab[i] = _value;
    }


    /**
     * Gets the workspaceMappings value for this CustomApplication.
     * 
     * @return workspaceMappings
     */
    public com.sforce.soap._2006._04.metadata.WorkspaceMapping[] getWorkspaceMappings() {
        return workspaceMappings;
    }


    /**
     * Sets the workspaceMappings value for this CustomApplication.
     * 
     * @param workspaceMappings
     */
    public void setWorkspaceMappings(com.sforce.soap._2006._04.metadata.WorkspaceMapping[] workspaceMappings) {
        this.workspaceMappings = workspaceMappings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomApplication)) return false;
        CustomApplication other = (CustomApplication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customApplicationComponents==null && other.getCustomApplicationComponents()==null) || 
             (this.customApplicationComponents!=null &&
              this.customApplicationComponents.equals(other.getCustomApplicationComponents()))) &&
            ((this.defaultLandingTab==null && other.getDefaultLandingTab()==null) || 
             (this.defaultLandingTab!=null &&
              this.defaultLandingTab.equals(other.getDefaultLandingTab()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.detailPageRefreshMethod==null && other.getDetailPageRefreshMethod()==null) || 
             (this.detailPageRefreshMethod!=null &&
              this.detailPageRefreshMethod.equals(other.getDetailPageRefreshMethod()))) &&
            ((this.domainWhitelist==null && other.getDomainWhitelist()==null) || 
             (this.domainWhitelist!=null &&
              java.util.Arrays.equals(this.domainWhitelist, other.getDomainWhitelist()))) &&
            ((this.enableCustomizeMyTabs==null && other.getEnableCustomizeMyTabs()==null) || 
             (this.enableCustomizeMyTabs!=null &&
              this.enableCustomizeMyTabs.equals(other.getEnableCustomizeMyTabs()))) &&
            ((this.enableKeyboardShortcuts==null && other.getEnableKeyboardShortcuts()==null) || 
             (this.enableKeyboardShortcuts!=null &&
              this.enableKeyboardShortcuts.equals(other.getEnableKeyboardShortcuts()))) &&
            ((this.enableMultiMonitorComponents==null && other.getEnableMultiMonitorComponents()==null) || 
             (this.enableMultiMonitorComponents!=null &&
              this.enableMultiMonitorComponents.equals(other.getEnableMultiMonitorComponents()))) &&
            ((this.enablePinTabs==null && other.getEnablePinTabs()==null) || 
             (this.enablePinTabs!=null &&
              this.enablePinTabs.equals(other.getEnablePinTabs()))) &&
            ((this.isServiceCloudConsole==null && other.getIsServiceCloudConsole()==null) || 
             (this.isServiceCloudConsole!=null &&
              this.isServiceCloudConsole.equals(other.getIsServiceCloudConsole()))) &&
            ((this.keyboardShortcuts==null && other.getKeyboardShortcuts()==null) || 
             (this.keyboardShortcuts!=null &&
              this.keyboardShortcuts.equals(other.getKeyboardShortcuts()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.listPlacement==null && other.getListPlacement()==null) || 
             (this.listPlacement!=null &&
              this.listPlacement.equals(other.getListPlacement()))) &&
            ((this.listRefreshMethod==null && other.getListRefreshMethod()==null) || 
             (this.listRefreshMethod!=null &&
              this.listRefreshMethod.equals(other.getListRefreshMethod()))) &&
            ((this.liveAgentConfig==null && other.getLiveAgentConfig()==null) || 
             (this.liveAgentConfig!=null &&
              this.liveAgentConfig.equals(other.getLiveAgentConfig()))) &&
            ((this.logo==null && other.getLogo()==null) || 
             (this.logo!=null &&
              this.logo.equals(other.getLogo()))) &&
            ((this.pushNotifications==null && other.getPushNotifications()==null) || 
             (this.pushNotifications!=null &&
              java.util.Arrays.equals(this.pushNotifications, other.getPushNotifications()))) &&
            ((this.saveUserSessions==null && other.getSaveUserSessions()==null) || 
             (this.saveUserSessions!=null &&
              this.saveUserSessions.equals(other.getSaveUserSessions()))) &&
            ((this.tab==null && other.getTab()==null) || 
             (this.tab!=null &&
              java.util.Arrays.equals(this.tab, other.getTab()))) &&
            ((this.workspaceMappings==null && other.getWorkspaceMappings()==null) || 
             (this.workspaceMappings!=null &&
              java.util.Arrays.equals(this.workspaceMappings, other.getWorkspaceMappings())));
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
        if (getCustomApplicationComponents() != null) {
            _hashCode += getCustomApplicationComponents().hashCode();
        }
        if (getDefaultLandingTab() != null) {
            _hashCode += getDefaultLandingTab().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDetailPageRefreshMethod() != null) {
            _hashCode += getDetailPageRefreshMethod().hashCode();
        }
        if (getDomainWhitelist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomainWhitelist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomainWhitelist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnableCustomizeMyTabs() != null) {
            _hashCode += getEnableCustomizeMyTabs().hashCode();
        }
        if (getEnableKeyboardShortcuts() != null) {
            _hashCode += getEnableKeyboardShortcuts().hashCode();
        }
        if (getEnableMultiMonitorComponents() != null) {
            _hashCode += getEnableMultiMonitorComponents().hashCode();
        }
        if (getEnablePinTabs() != null) {
            _hashCode += getEnablePinTabs().hashCode();
        }
        if (getIsServiceCloudConsole() != null) {
            _hashCode += getIsServiceCloudConsole().hashCode();
        }
        if (getKeyboardShortcuts() != null) {
            _hashCode += getKeyboardShortcuts().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getListPlacement() != null) {
            _hashCode += getListPlacement().hashCode();
        }
        if (getListRefreshMethod() != null) {
            _hashCode += getListRefreshMethod().hashCode();
        }
        if (getLiveAgentConfig() != null) {
            _hashCode += getLiveAgentConfig().hashCode();
        }
        if (getLogo() != null) {
            _hashCode += getLogo().hashCode();
        }
        if (getPushNotifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPushNotifications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPushNotifications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSaveUserSessions() != null) {
            _hashCode += getSaveUserSessions().hashCode();
        }
        if (getTab() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTab());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTab(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkspaceMappings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkspaceMappings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkspaceMappings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomApplication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomApplication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customApplicationComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customApplicationComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CustomApplicationComponents"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLandingTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "defaultLandingTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailPageRefreshMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "detailPageRefreshMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainWhitelist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "domainWhitelist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "domain"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableCustomizeMyTabs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableCustomizeMyTabs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableKeyboardShortcuts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableKeyboardShortcuts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableMultiMonitorComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableMultiMonitorComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enablePinTabs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enablePinTabs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isServiceCloudConsole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isServiceCloudConsole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyboardShortcuts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "keyboardShortcuts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "KeyboardShortcuts"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listPlacement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "listPlacement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ListPlacement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listRefreshMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "listRefreshMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liveAgentConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "liveAgentConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveAgentConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "logo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushNotifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pushNotifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "PushNotification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pushNotification"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saveUserSessions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "saveUserSessions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "tab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workspaceMappings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "workspaceMappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "WorkspaceMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "mapping"));
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
