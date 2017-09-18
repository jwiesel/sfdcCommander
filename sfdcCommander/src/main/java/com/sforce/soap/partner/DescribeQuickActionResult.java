/**
 * DescribeQuickActionResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.partner;

public class DescribeQuickActionResult  implements java.io.Serializable {
    private com.sforce.soap.partner.ShareAccessLevel accessLevelRequired;

    private java.lang.String actionEnumOrId;

    private java.lang.String canvasApplicationId;

    private java.lang.String canvasApplicationName;

    private com.sforce.soap.partner.DescribeColor[] colors;

    private java.lang.String contextSobjectType;

    private com.sforce.soap.partner.DescribeQuickActionDefaultValue[] defaultValues;

    private java.lang.Integer height;

    private java.lang.String iconName;

    private java.lang.String iconUrl;

    private com.sforce.soap.partner.DescribeIcon[] icons;

    private java.lang.String label;

    private com.sforce.soap.partner.DescribeLayoutSection layout;

    private java.lang.String lightningComponentBundleId;

    private java.lang.String lightningComponentBundleName;

    private java.lang.String lightningComponentQualifiedName;

    private java.lang.String miniIconUrl;

    private java.lang.String name;

    private boolean showQuickActionLcHeader;

    private boolean showQuickActionVfHeader;

    private java.lang.String targetParentField;

    private java.lang.String targetRecordTypeId;

    private java.lang.String targetSobjectType;

    private java.lang.String type;

    private java.lang.String visualforcePageName;

    private java.lang.String visualforcePageUrl;

    private java.lang.Integer width;

    public DescribeQuickActionResult() {
    }

    public DescribeQuickActionResult(
           com.sforce.soap.partner.ShareAccessLevel accessLevelRequired,
           java.lang.String actionEnumOrId,
           java.lang.String canvasApplicationId,
           java.lang.String canvasApplicationName,
           com.sforce.soap.partner.DescribeColor[] colors,
           java.lang.String contextSobjectType,
           com.sforce.soap.partner.DescribeQuickActionDefaultValue[] defaultValues,
           java.lang.Integer height,
           java.lang.String iconName,
           java.lang.String iconUrl,
           com.sforce.soap.partner.DescribeIcon[] icons,
           java.lang.String label,
           com.sforce.soap.partner.DescribeLayoutSection layout,
           java.lang.String lightningComponentBundleId,
           java.lang.String lightningComponentBundleName,
           java.lang.String lightningComponentQualifiedName,
           java.lang.String miniIconUrl,
           java.lang.String name,
           boolean showQuickActionLcHeader,
           boolean showQuickActionVfHeader,
           java.lang.String targetParentField,
           java.lang.String targetRecordTypeId,
           java.lang.String targetSobjectType,
           java.lang.String type,
           java.lang.String visualforcePageName,
           java.lang.String visualforcePageUrl,
           java.lang.Integer width) {
           this.accessLevelRequired = accessLevelRequired;
           this.actionEnumOrId = actionEnumOrId;
           this.canvasApplicationId = canvasApplicationId;
           this.canvasApplicationName = canvasApplicationName;
           this.colors = colors;
           this.contextSobjectType = contextSobjectType;
           this.defaultValues = defaultValues;
           this.height = height;
           this.iconName = iconName;
           this.iconUrl = iconUrl;
           this.icons = icons;
           this.label = label;
           this.layout = layout;
           this.lightningComponentBundleId = lightningComponentBundleId;
           this.lightningComponentBundleName = lightningComponentBundleName;
           this.lightningComponentQualifiedName = lightningComponentQualifiedName;
           this.miniIconUrl = miniIconUrl;
           this.name = name;
           this.showQuickActionLcHeader = showQuickActionLcHeader;
           this.showQuickActionVfHeader = showQuickActionVfHeader;
           this.targetParentField = targetParentField;
           this.targetRecordTypeId = targetRecordTypeId;
           this.targetSobjectType = targetSobjectType;
           this.type = type;
           this.visualforcePageName = visualforcePageName;
           this.visualforcePageUrl = visualforcePageUrl;
           this.width = width;
    }


    /**
     * Gets the accessLevelRequired value for this DescribeQuickActionResult.
     * 
     * @return accessLevelRequired
     */
    public com.sforce.soap.partner.ShareAccessLevel getAccessLevelRequired() {
        return accessLevelRequired;
    }


    /**
     * Sets the accessLevelRequired value for this DescribeQuickActionResult.
     * 
     * @param accessLevelRequired
     */
    public void setAccessLevelRequired(com.sforce.soap.partner.ShareAccessLevel accessLevelRequired) {
        this.accessLevelRequired = accessLevelRequired;
    }


    /**
     * Gets the actionEnumOrId value for this DescribeQuickActionResult.
     * 
     * @return actionEnumOrId
     */
    public java.lang.String getActionEnumOrId() {
        return actionEnumOrId;
    }


    /**
     * Sets the actionEnumOrId value for this DescribeQuickActionResult.
     * 
     * @param actionEnumOrId
     */
    public void setActionEnumOrId(java.lang.String actionEnumOrId) {
        this.actionEnumOrId = actionEnumOrId;
    }


    /**
     * Gets the canvasApplicationId value for this DescribeQuickActionResult.
     * 
     * @return canvasApplicationId
     */
    public java.lang.String getCanvasApplicationId() {
        return canvasApplicationId;
    }


    /**
     * Sets the canvasApplicationId value for this DescribeQuickActionResult.
     * 
     * @param canvasApplicationId
     */
    public void setCanvasApplicationId(java.lang.String canvasApplicationId) {
        this.canvasApplicationId = canvasApplicationId;
    }


    /**
     * Gets the canvasApplicationName value for this DescribeQuickActionResult.
     * 
     * @return canvasApplicationName
     */
    public java.lang.String getCanvasApplicationName() {
        return canvasApplicationName;
    }


    /**
     * Sets the canvasApplicationName value for this DescribeQuickActionResult.
     * 
     * @param canvasApplicationName
     */
    public void setCanvasApplicationName(java.lang.String canvasApplicationName) {
        this.canvasApplicationName = canvasApplicationName;
    }


    /**
     * Gets the colors value for this DescribeQuickActionResult.
     * 
     * @return colors
     */
    public com.sforce.soap.partner.DescribeColor[] getColors() {
        return colors;
    }


    /**
     * Sets the colors value for this DescribeQuickActionResult.
     * 
     * @param colors
     */
    public void setColors(com.sforce.soap.partner.DescribeColor[] colors) {
        this.colors = colors;
    }

    public com.sforce.soap.partner.DescribeColor getColors(int i) {
        return this.colors[i];
    }

    public void setColors(int i, com.sforce.soap.partner.DescribeColor _value) {
        this.colors[i] = _value;
    }


    /**
     * Gets the contextSobjectType value for this DescribeQuickActionResult.
     * 
     * @return contextSobjectType
     */
    public java.lang.String getContextSobjectType() {
        return contextSobjectType;
    }


    /**
     * Sets the contextSobjectType value for this DescribeQuickActionResult.
     * 
     * @param contextSobjectType
     */
    public void setContextSobjectType(java.lang.String contextSobjectType) {
        this.contextSobjectType = contextSobjectType;
    }


    /**
     * Gets the defaultValues value for this DescribeQuickActionResult.
     * 
     * @return defaultValues
     */
    public com.sforce.soap.partner.DescribeQuickActionDefaultValue[] getDefaultValues() {
        return defaultValues;
    }


    /**
     * Sets the defaultValues value for this DescribeQuickActionResult.
     * 
     * @param defaultValues
     */
    public void setDefaultValues(com.sforce.soap.partner.DescribeQuickActionDefaultValue[] defaultValues) {
        this.defaultValues = defaultValues;
    }

    public com.sforce.soap.partner.DescribeQuickActionDefaultValue getDefaultValues(int i) {
        return this.defaultValues[i];
    }

    public void setDefaultValues(int i, com.sforce.soap.partner.DescribeQuickActionDefaultValue _value) {
        this.defaultValues[i] = _value;
    }


    /**
     * Gets the height value for this DescribeQuickActionResult.
     * 
     * @return height
     */
    public java.lang.Integer getHeight() {
        return height;
    }


    /**
     * Sets the height value for this DescribeQuickActionResult.
     * 
     * @param height
     */
    public void setHeight(java.lang.Integer height) {
        this.height = height;
    }


    /**
     * Gets the iconName value for this DescribeQuickActionResult.
     * 
     * @return iconName
     */
    public java.lang.String getIconName() {
        return iconName;
    }


    /**
     * Sets the iconName value for this DescribeQuickActionResult.
     * 
     * @param iconName
     */
    public void setIconName(java.lang.String iconName) {
        this.iconName = iconName;
    }


    /**
     * Gets the iconUrl value for this DescribeQuickActionResult.
     * 
     * @return iconUrl
     */
    public java.lang.String getIconUrl() {
        return iconUrl;
    }


    /**
     * Sets the iconUrl value for this DescribeQuickActionResult.
     * 
     * @param iconUrl
     */
    public void setIconUrl(java.lang.String iconUrl) {
        this.iconUrl = iconUrl;
    }


    /**
     * Gets the icons value for this DescribeQuickActionResult.
     * 
     * @return icons
     */
    public com.sforce.soap.partner.DescribeIcon[] getIcons() {
        return icons;
    }


    /**
     * Sets the icons value for this DescribeQuickActionResult.
     * 
     * @param icons
     */
    public void setIcons(com.sforce.soap.partner.DescribeIcon[] icons) {
        this.icons = icons;
    }

    public com.sforce.soap.partner.DescribeIcon getIcons(int i) {
        return this.icons[i];
    }

    public void setIcons(int i, com.sforce.soap.partner.DescribeIcon _value) {
        this.icons[i] = _value;
    }


    /**
     * Gets the label value for this DescribeQuickActionResult.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this DescribeQuickActionResult.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the layout value for this DescribeQuickActionResult.
     * 
     * @return layout
     */
    public com.sforce.soap.partner.DescribeLayoutSection getLayout() {
        return layout;
    }


    /**
     * Sets the layout value for this DescribeQuickActionResult.
     * 
     * @param layout
     */
    public void setLayout(com.sforce.soap.partner.DescribeLayoutSection layout) {
        this.layout = layout;
    }


    /**
     * Gets the lightningComponentBundleId value for this DescribeQuickActionResult.
     * 
     * @return lightningComponentBundleId
     */
    public java.lang.String getLightningComponentBundleId() {
        return lightningComponentBundleId;
    }


    /**
     * Sets the lightningComponentBundleId value for this DescribeQuickActionResult.
     * 
     * @param lightningComponentBundleId
     */
    public void setLightningComponentBundleId(java.lang.String lightningComponentBundleId) {
        this.lightningComponentBundleId = lightningComponentBundleId;
    }


    /**
     * Gets the lightningComponentBundleName value for this DescribeQuickActionResult.
     * 
     * @return lightningComponentBundleName
     */
    public java.lang.String getLightningComponentBundleName() {
        return lightningComponentBundleName;
    }


    /**
     * Sets the lightningComponentBundleName value for this DescribeQuickActionResult.
     * 
     * @param lightningComponentBundleName
     */
    public void setLightningComponentBundleName(java.lang.String lightningComponentBundleName) {
        this.lightningComponentBundleName = lightningComponentBundleName;
    }


    /**
     * Gets the lightningComponentQualifiedName value for this DescribeQuickActionResult.
     * 
     * @return lightningComponentQualifiedName
     */
    public java.lang.String getLightningComponentQualifiedName() {
        return lightningComponentQualifiedName;
    }


    /**
     * Sets the lightningComponentQualifiedName value for this DescribeQuickActionResult.
     * 
     * @param lightningComponentQualifiedName
     */
    public void setLightningComponentQualifiedName(java.lang.String lightningComponentQualifiedName) {
        this.lightningComponentQualifiedName = lightningComponentQualifiedName;
    }


    /**
     * Gets the miniIconUrl value for this DescribeQuickActionResult.
     * 
     * @return miniIconUrl
     */
    public java.lang.String getMiniIconUrl() {
        return miniIconUrl;
    }


    /**
     * Sets the miniIconUrl value for this DescribeQuickActionResult.
     * 
     * @param miniIconUrl
     */
    public void setMiniIconUrl(java.lang.String miniIconUrl) {
        this.miniIconUrl = miniIconUrl;
    }


    /**
     * Gets the name value for this DescribeQuickActionResult.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DescribeQuickActionResult.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the showQuickActionLcHeader value for this DescribeQuickActionResult.
     * 
     * @return showQuickActionLcHeader
     */
    public boolean isShowQuickActionLcHeader() {
        return showQuickActionLcHeader;
    }


    /**
     * Sets the showQuickActionLcHeader value for this DescribeQuickActionResult.
     * 
     * @param showQuickActionLcHeader
     */
    public void setShowQuickActionLcHeader(boolean showQuickActionLcHeader) {
        this.showQuickActionLcHeader = showQuickActionLcHeader;
    }


    /**
     * Gets the showQuickActionVfHeader value for this DescribeQuickActionResult.
     * 
     * @return showQuickActionVfHeader
     */
    public boolean isShowQuickActionVfHeader() {
        return showQuickActionVfHeader;
    }


    /**
     * Sets the showQuickActionVfHeader value for this DescribeQuickActionResult.
     * 
     * @param showQuickActionVfHeader
     */
    public void setShowQuickActionVfHeader(boolean showQuickActionVfHeader) {
        this.showQuickActionVfHeader = showQuickActionVfHeader;
    }


    /**
     * Gets the targetParentField value for this DescribeQuickActionResult.
     * 
     * @return targetParentField
     */
    public java.lang.String getTargetParentField() {
        return targetParentField;
    }


    /**
     * Sets the targetParentField value for this DescribeQuickActionResult.
     * 
     * @param targetParentField
     */
    public void setTargetParentField(java.lang.String targetParentField) {
        this.targetParentField = targetParentField;
    }


    /**
     * Gets the targetRecordTypeId value for this DescribeQuickActionResult.
     * 
     * @return targetRecordTypeId
     */
    public java.lang.String getTargetRecordTypeId() {
        return targetRecordTypeId;
    }


    /**
     * Sets the targetRecordTypeId value for this DescribeQuickActionResult.
     * 
     * @param targetRecordTypeId
     */
    public void setTargetRecordTypeId(java.lang.String targetRecordTypeId) {
        this.targetRecordTypeId = targetRecordTypeId;
    }


    /**
     * Gets the targetSobjectType value for this DescribeQuickActionResult.
     * 
     * @return targetSobjectType
     */
    public java.lang.String getTargetSobjectType() {
        return targetSobjectType;
    }


    /**
     * Sets the targetSobjectType value for this DescribeQuickActionResult.
     * 
     * @param targetSobjectType
     */
    public void setTargetSobjectType(java.lang.String targetSobjectType) {
        this.targetSobjectType = targetSobjectType;
    }


    /**
     * Gets the type value for this DescribeQuickActionResult.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DescribeQuickActionResult.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the visualforcePageName value for this DescribeQuickActionResult.
     * 
     * @return visualforcePageName
     */
    public java.lang.String getVisualforcePageName() {
        return visualforcePageName;
    }


    /**
     * Sets the visualforcePageName value for this DescribeQuickActionResult.
     * 
     * @param visualforcePageName
     */
    public void setVisualforcePageName(java.lang.String visualforcePageName) {
        this.visualforcePageName = visualforcePageName;
    }


    /**
     * Gets the visualforcePageUrl value for this DescribeQuickActionResult.
     * 
     * @return visualforcePageUrl
     */
    public java.lang.String getVisualforcePageUrl() {
        return visualforcePageUrl;
    }


    /**
     * Sets the visualforcePageUrl value for this DescribeQuickActionResult.
     * 
     * @param visualforcePageUrl
     */
    public void setVisualforcePageUrl(java.lang.String visualforcePageUrl) {
        this.visualforcePageUrl = visualforcePageUrl;
    }


    /**
     * Gets the width value for this DescribeQuickActionResult.
     * 
     * @return width
     */
    public java.lang.Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this DescribeQuickActionResult.
     * 
     * @param width
     */
    public void setWidth(java.lang.Integer width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DescribeQuickActionResult)) return false;
        DescribeQuickActionResult other = (DescribeQuickActionResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessLevelRequired==null && other.getAccessLevelRequired()==null) || 
             (this.accessLevelRequired!=null &&
              this.accessLevelRequired.equals(other.getAccessLevelRequired()))) &&
            ((this.actionEnumOrId==null && other.getActionEnumOrId()==null) || 
             (this.actionEnumOrId!=null &&
              this.actionEnumOrId.equals(other.getActionEnumOrId()))) &&
            ((this.canvasApplicationId==null && other.getCanvasApplicationId()==null) || 
             (this.canvasApplicationId!=null &&
              this.canvasApplicationId.equals(other.getCanvasApplicationId()))) &&
            ((this.canvasApplicationName==null && other.getCanvasApplicationName()==null) || 
             (this.canvasApplicationName!=null &&
              this.canvasApplicationName.equals(other.getCanvasApplicationName()))) &&
            ((this.colors==null && other.getColors()==null) || 
             (this.colors!=null &&
              java.util.Arrays.equals(this.colors, other.getColors()))) &&
            ((this.contextSobjectType==null && other.getContextSobjectType()==null) || 
             (this.contextSobjectType!=null &&
              this.contextSobjectType.equals(other.getContextSobjectType()))) &&
            ((this.defaultValues==null && other.getDefaultValues()==null) || 
             (this.defaultValues!=null &&
              java.util.Arrays.equals(this.defaultValues, other.getDefaultValues()))) &&
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.iconName==null && other.getIconName()==null) || 
             (this.iconName!=null &&
              this.iconName.equals(other.getIconName()))) &&
            ((this.iconUrl==null && other.getIconUrl()==null) || 
             (this.iconUrl!=null &&
              this.iconUrl.equals(other.getIconUrl()))) &&
            ((this.icons==null && other.getIcons()==null) || 
             (this.icons!=null &&
              java.util.Arrays.equals(this.icons, other.getIcons()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.layout==null && other.getLayout()==null) || 
             (this.layout!=null &&
              this.layout.equals(other.getLayout()))) &&
            ((this.lightningComponentBundleId==null && other.getLightningComponentBundleId()==null) || 
             (this.lightningComponentBundleId!=null &&
              this.lightningComponentBundleId.equals(other.getLightningComponentBundleId()))) &&
            ((this.lightningComponentBundleName==null && other.getLightningComponentBundleName()==null) || 
             (this.lightningComponentBundleName!=null &&
              this.lightningComponentBundleName.equals(other.getLightningComponentBundleName()))) &&
            ((this.lightningComponentQualifiedName==null && other.getLightningComponentQualifiedName()==null) || 
             (this.lightningComponentQualifiedName!=null &&
              this.lightningComponentQualifiedName.equals(other.getLightningComponentQualifiedName()))) &&
            ((this.miniIconUrl==null && other.getMiniIconUrl()==null) || 
             (this.miniIconUrl!=null &&
              this.miniIconUrl.equals(other.getMiniIconUrl()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.showQuickActionLcHeader == other.isShowQuickActionLcHeader() &&
            this.showQuickActionVfHeader == other.isShowQuickActionVfHeader() &&
            ((this.targetParentField==null && other.getTargetParentField()==null) || 
             (this.targetParentField!=null &&
              this.targetParentField.equals(other.getTargetParentField()))) &&
            ((this.targetRecordTypeId==null && other.getTargetRecordTypeId()==null) || 
             (this.targetRecordTypeId!=null &&
              this.targetRecordTypeId.equals(other.getTargetRecordTypeId()))) &&
            ((this.targetSobjectType==null && other.getTargetSobjectType()==null) || 
             (this.targetSobjectType!=null &&
              this.targetSobjectType.equals(other.getTargetSobjectType()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.visualforcePageName==null && other.getVisualforcePageName()==null) || 
             (this.visualforcePageName!=null &&
              this.visualforcePageName.equals(other.getVisualforcePageName()))) &&
            ((this.visualforcePageUrl==null && other.getVisualforcePageUrl()==null) || 
             (this.visualforcePageUrl!=null &&
              this.visualforcePageUrl.equals(other.getVisualforcePageUrl()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth())));
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
        if (getAccessLevelRequired() != null) {
            _hashCode += getAccessLevelRequired().hashCode();
        }
        if (getActionEnumOrId() != null) {
            _hashCode += getActionEnumOrId().hashCode();
        }
        if (getCanvasApplicationId() != null) {
            _hashCode += getCanvasApplicationId().hashCode();
        }
        if (getCanvasApplicationName() != null) {
            _hashCode += getCanvasApplicationName().hashCode();
        }
        if (getColors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContextSobjectType() != null) {
            _hashCode += getContextSobjectType().hashCode();
        }
        if (getDefaultValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getIconName() != null) {
            _hashCode += getIconName().hashCode();
        }
        if (getIconUrl() != null) {
            _hashCode += getIconUrl().hashCode();
        }
        if (getIcons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIcons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIcons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLayout() != null) {
            _hashCode += getLayout().hashCode();
        }
        if (getLightningComponentBundleId() != null) {
            _hashCode += getLightningComponentBundleId().hashCode();
        }
        if (getLightningComponentBundleName() != null) {
            _hashCode += getLightningComponentBundleName().hashCode();
        }
        if (getLightningComponentQualifiedName() != null) {
            _hashCode += getLightningComponentQualifiedName().hashCode();
        }
        if (getMiniIconUrl() != null) {
            _hashCode += getMiniIconUrl().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isShowQuickActionLcHeader() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShowQuickActionVfHeader() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTargetParentField() != null) {
            _hashCode += getTargetParentField().hashCode();
        }
        if (getTargetRecordTypeId() != null) {
            _hashCode += getTargetRecordTypeId().hashCode();
        }
        if (getTargetSobjectType() != null) {
            _hashCode += getTargetSobjectType().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getVisualforcePageName() != null) {
            _hashCode += getVisualforcePageName().hashCode();
        }
        if (getVisualforcePageUrl() != null) {
            _hashCode += getVisualforcePageUrl().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DescribeQuickActionResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeQuickActionResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevelRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "accessLevelRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "ShareAccessLevel"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionEnumOrId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "actionEnumOrId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canvasApplicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "canvasApplicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canvasApplicationName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "canvasApplicationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "colors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeColor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextSobjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "contextSobjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "defaultValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeQuickActionDefaultValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "iconName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "iconUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icons");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "icons"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeIcon"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "layout"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "DescribeLayoutSection"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lightningComponentBundleId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "lightningComponentBundleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lightningComponentBundleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "lightningComponentBundleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lightningComponentQualifiedName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "lightningComponentQualifiedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miniIconUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "miniIconUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showQuickActionLcHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "showQuickActionLcHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showQuickActionVfHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "showQuickActionVfHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetParentField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "targetParentField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetRecordTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "targetRecordTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetSobjectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "targetSobjectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visualforcePageName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "visualforcePageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visualforcePageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "visualforcePageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:partner.soap.sforce.com", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
