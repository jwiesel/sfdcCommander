/**
 * LiveChatAgentConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LiveChatAgentConfig  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.AgentConfigAssignments assignments;

    private java.lang.String autoGreeting;

    private java.lang.Integer capacity;

    private java.lang.Integer criticalWaitTime;

    private java.lang.String customAgentName;

    private java.lang.Boolean enableAgentFileTransfer;

    private java.lang.Boolean enableAgentSneakPeek;

    private java.lang.Boolean enableAutoAwayOnDecline;

    private java.lang.Boolean enableAutoAwayOnPushTimeout;

    private java.lang.Boolean enableChatConferencing;

    private java.lang.Boolean enableChatMonitoring;

    private java.lang.Boolean enableChatTransfer;

    private java.lang.Boolean enableLogoutSound;

    private java.lang.Boolean enableNotifications;

    private java.lang.Boolean enableRequestSound;

    private java.lang.Boolean enableSneakPeek;

    private java.lang.Boolean enableVisitorBlocking;

    private java.lang.Boolean enableWhisperMessage;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.SupervisorAgentStatusFilter supervisorDefaultAgentStatusFilter;

    private java.lang.String supervisorDefaultButtonFilter;

    private java.lang.String supervisorDefaultSkillFilter;

    private java.lang.String[] supervisorSkills;

    private java.lang.String[] transferableButtons;

    private java.lang.String[] transferableSkills;

    public LiveChatAgentConfig() {
    }

    public LiveChatAgentConfig(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.AgentConfigAssignments assignments,
           java.lang.String autoGreeting,
           java.lang.Integer capacity,
           java.lang.Integer criticalWaitTime,
           java.lang.String customAgentName,
           java.lang.Boolean enableAgentFileTransfer,
           java.lang.Boolean enableAgentSneakPeek,
           java.lang.Boolean enableAutoAwayOnDecline,
           java.lang.Boolean enableAutoAwayOnPushTimeout,
           java.lang.Boolean enableChatConferencing,
           java.lang.Boolean enableChatMonitoring,
           java.lang.Boolean enableChatTransfer,
           java.lang.Boolean enableLogoutSound,
           java.lang.Boolean enableNotifications,
           java.lang.Boolean enableRequestSound,
           java.lang.Boolean enableSneakPeek,
           java.lang.Boolean enableVisitorBlocking,
           java.lang.Boolean enableWhisperMessage,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.SupervisorAgentStatusFilter supervisorDefaultAgentStatusFilter,
           java.lang.String supervisorDefaultButtonFilter,
           java.lang.String supervisorDefaultSkillFilter,
           java.lang.String[] supervisorSkills,
           java.lang.String[] transferableButtons,
           java.lang.String[] transferableSkills) {
        super(
            fullName);
        this.assignments = assignments;
        this.autoGreeting = autoGreeting;
        this.capacity = capacity;
        this.criticalWaitTime = criticalWaitTime;
        this.customAgentName = customAgentName;
        this.enableAgentFileTransfer = enableAgentFileTransfer;
        this.enableAgentSneakPeek = enableAgentSneakPeek;
        this.enableAutoAwayOnDecline = enableAutoAwayOnDecline;
        this.enableAutoAwayOnPushTimeout = enableAutoAwayOnPushTimeout;
        this.enableChatConferencing = enableChatConferencing;
        this.enableChatMonitoring = enableChatMonitoring;
        this.enableChatTransfer = enableChatTransfer;
        this.enableLogoutSound = enableLogoutSound;
        this.enableNotifications = enableNotifications;
        this.enableRequestSound = enableRequestSound;
        this.enableSneakPeek = enableSneakPeek;
        this.enableVisitorBlocking = enableVisitorBlocking;
        this.enableWhisperMessage = enableWhisperMessage;
        this.label = label;
        this.supervisorDefaultAgentStatusFilter = supervisorDefaultAgentStatusFilter;
        this.supervisorDefaultButtonFilter = supervisorDefaultButtonFilter;
        this.supervisorDefaultSkillFilter = supervisorDefaultSkillFilter;
        this.supervisorSkills = supervisorSkills;
        this.transferableButtons = transferableButtons;
        this.transferableSkills = transferableSkills;
    }


    /**
     * Gets the assignments value for this LiveChatAgentConfig.
     * 
     * @return assignments
     */
    public com.sforce.soap._2006._04.metadata.AgentConfigAssignments getAssignments() {
        return assignments;
    }


    /**
     * Sets the assignments value for this LiveChatAgentConfig.
     * 
     * @param assignments
     */
    public void setAssignments(com.sforce.soap._2006._04.metadata.AgentConfigAssignments assignments) {
        this.assignments = assignments;
    }


    /**
     * Gets the autoGreeting value for this LiveChatAgentConfig.
     * 
     * @return autoGreeting
     */
    public java.lang.String getAutoGreeting() {
        return autoGreeting;
    }


    /**
     * Sets the autoGreeting value for this LiveChatAgentConfig.
     * 
     * @param autoGreeting
     */
    public void setAutoGreeting(java.lang.String autoGreeting) {
        this.autoGreeting = autoGreeting;
    }


    /**
     * Gets the capacity value for this LiveChatAgentConfig.
     * 
     * @return capacity
     */
    public java.lang.Integer getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this LiveChatAgentConfig.
     * 
     * @param capacity
     */
    public void setCapacity(java.lang.Integer capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the criticalWaitTime value for this LiveChatAgentConfig.
     * 
     * @return criticalWaitTime
     */
    public java.lang.Integer getCriticalWaitTime() {
        return criticalWaitTime;
    }


    /**
     * Sets the criticalWaitTime value for this LiveChatAgentConfig.
     * 
     * @param criticalWaitTime
     */
    public void setCriticalWaitTime(java.lang.Integer criticalWaitTime) {
        this.criticalWaitTime = criticalWaitTime;
    }


    /**
     * Gets the customAgentName value for this LiveChatAgentConfig.
     * 
     * @return customAgentName
     */
    public java.lang.String getCustomAgentName() {
        return customAgentName;
    }


    /**
     * Sets the customAgentName value for this LiveChatAgentConfig.
     * 
     * @param customAgentName
     */
    public void setCustomAgentName(java.lang.String customAgentName) {
        this.customAgentName = customAgentName;
    }


    /**
     * Gets the enableAgentFileTransfer value for this LiveChatAgentConfig.
     * 
     * @return enableAgentFileTransfer
     */
    public java.lang.Boolean getEnableAgentFileTransfer() {
        return enableAgentFileTransfer;
    }


    /**
     * Sets the enableAgentFileTransfer value for this LiveChatAgentConfig.
     * 
     * @param enableAgentFileTransfer
     */
    public void setEnableAgentFileTransfer(java.lang.Boolean enableAgentFileTransfer) {
        this.enableAgentFileTransfer = enableAgentFileTransfer;
    }


    /**
     * Gets the enableAgentSneakPeek value for this LiveChatAgentConfig.
     * 
     * @return enableAgentSneakPeek
     */
    public java.lang.Boolean getEnableAgentSneakPeek() {
        return enableAgentSneakPeek;
    }


    /**
     * Sets the enableAgentSneakPeek value for this LiveChatAgentConfig.
     * 
     * @param enableAgentSneakPeek
     */
    public void setEnableAgentSneakPeek(java.lang.Boolean enableAgentSneakPeek) {
        this.enableAgentSneakPeek = enableAgentSneakPeek;
    }


    /**
     * Gets the enableAutoAwayOnDecline value for this LiveChatAgentConfig.
     * 
     * @return enableAutoAwayOnDecline
     */
    public java.lang.Boolean getEnableAutoAwayOnDecline() {
        return enableAutoAwayOnDecline;
    }


    /**
     * Sets the enableAutoAwayOnDecline value for this LiveChatAgentConfig.
     * 
     * @param enableAutoAwayOnDecline
     */
    public void setEnableAutoAwayOnDecline(java.lang.Boolean enableAutoAwayOnDecline) {
        this.enableAutoAwayOnDecline = enableAutoAwayOnDecline;
    }


    /**
     * Gets the enableAutoAwayOnPushTimeout value for this LiveChatAgentConfig.
     * 
     * @return enableAutoAwayOnPushTimeout
     */
    public java.lang.Boolean getEnableAutoAwayOnPushTimeout() {
        return enableAutoAwayOnPushTimeout;
    }


    /**
     * Sets the enableAutoAwayOnPushTimeout value for this LiveChatAgentConfig.
     * 
     * @param enableAutoAwayOnPushTimeout
     */
    public void setEnableAutoAwayOnPushTimeout(java.lang.Boolean enableAutoAwayOnPushTimeout) {
        this.enableAutoAwayOnPushTimeout = enableAutoAwayOnPushTimeout;
    }


    /**
     * Gets the enableChatConferencing value for this LiveChatAgentConfig.
     * 
     * @return enableChatConferencing
     */
    public java.lang.Boolean getEnableChatConferencing() {
        return enableChatConferencing;
    }


    /**
     * Sets the enableChatConferencing value for this LiveChatAgentConfig.
     * 
     * @param enableChatConferencing
     */
    public void setEnableChatConferencing(java.lang.Boolean enableChatConferencing) {
        this.enableChatConferencing = enableChatConferencing;
    }


    /**
     * Gets the enableChatMonitoring value for this LiveChatAgentConfig.
     * 
     * @return enableChatMonitoring
     */
    public java.lang.Boolean getEnableChatMonitoring() {
        return enableChatMonitoring;
    }


    /**
     * Sets the enableChatMonitoring value for this LiveChatAgentConfig.
     * 
     * @param enableChatMonitoring
     */
    public void setEnableChatMonitoring(java.lang.Boolean enableChatMonitoring) {
        this.enableChatMonitoring = enableChatMonitoring;
    }


    /**
     * Gets the enableChatTransfer value for this LiveChatAgentConfig.
     * 
     * @return enableChatTransfer
     */
    public java.lang.Boolean getEnableChatTransfer() {
        return enableChatTransfer;
    }


    /**
     * Sets the enableChatTransfer value for this LiveChatAgentConfig.
     * 
     * @param enableChatTransfer
     */
    public void setEnableChatTransfer(java.lang.Boolean enableChatTransfer) {
        this.enableChatTransfer = enableChatTransfer;
    }


    /**
     * Gets the enableLogoutSound value for this LiveChatAgentConfig.
     * 
     * @return enableLogoutSound
     */
    public java.lang.Boolean getEnableLogoutSound() {
        return enableLogoutSound;
    }


    /**
     * Sets the enableLogoutSound value for this LiveChatAgentConfig.
     * 
     * @param enableLogoutSound
     */
    public void setEnableLogoutSound(java.lang.Boolean enableLogoutSound) {
        this.enableLogoutSound = enableLogoutSound;
    }


    /**
     * Gets the enableNotifications value for this LiveChatAgentConfig.
     * 
     * @return enableNotifications
     */
    public java.lang.Boolean getEnableNotifications() {
        return enableNotifications;
    }


    /**
     * Sets the enableNotifications value for this LiveChatAgentConfig.
     * 
     * @param enableNotifications
     */
    public void setEnableNotifications(java.lang.Boolean enableNotifications) {
        this.enableNotifications = enableNotifications;
    }


    /**
     * Gets the enableRequestSound value for this LiveChatAgentConfig.
     * 
     * @return enableRequestSound
     */
    public java.lang.Boolean getEnableRequestSound() {
        return enableRequestSound;
    }


    /**
     * Sets the enableRequestSound value for this LiveChatAgentConfig.
     * 
     * @param enableRequestSound
     */
    public void setEnableRequestSound(java.lang.Boolean enableRequestSound) {
        this.enableRequestSound = enableRequestSound;
    }


    /**
     * Gets the enableSneakPeek value for this LiveChatAgentConfig.
     * 
     * @return enableSneakPeek
     */
    public java.lang.Boolean getEnableSneakPeek() {
        return enableSneakPeek;
    }


    /**
     * Sets the enableSneakPeek value for this LiveChatAgentConfig.
     * 
     * @param enableSneakPeek
     */
    public void setEnableSneakPeek(java.lang.Boolean enableSneakPeek) {
        this.enableSneakPeek = enableSneakPeek;
    }


    /**
     * Gets the enableVisitorBlocking value for this LiveChatAgentConfig.
     * 
     * @return enableVisitorBlocking
     */
    public java.lang.Boolean getEnableVisitorBlocking() {
        return enableVisitorBlocking;
    }


    /**
     * Sets the enableVisitorBlocking value for this LiveChatAgentConfig.
     * 
     * @param enableVisitorBlocking
     */
    public void setEnableVisitorBlocking(java.lang.Boolean enableVisitorBlocking) {
        this.enableVisitorBlocking = enableVisitorBlocking;
    }


    /**
     * Gets the enableWhisperMessage value for this LiveChatAgentConfig.
     * 
     * @return enableWhisperMessage
     */
    public java.lang.Boolean getEnableWhisperMessage() {
        return enableWhisperMessage;
    }


    /**
     * Sets the enableWhisperMessage value for this LiveChatAgentConfig.
     * 
     * @param enableWhisperMessage
     */
    public void setEnableWhisperMessage(java.lang.Boolean enableWhisperMessage) {
        this.enableWhisperMessage = enableWhisperMessage;
    }


    /**
     * Gets the label value for this LiveChatAgentConfig.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this LiveChatAgentConfig.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the supervisorDefaultAgentStatusFilter value for this LiveChatAgentConfig.
     * 
     * @return supervisorDefaultAgentStatusFilter
     */
    public com.sforce.soap._2006._04.metadata.SupervisorAgentStatusFilter getSupervisorDefaultAgentStatusFilter() {
        return supervisorDefaultAgentStatusFilter;
    }


    /**
     * Sets the supervisorDefaultAgentStatusFilter value for this LiveChatAgentConfig.
     * 
     * @param supervisorDefaultAgentStatusFilter
     */
    public void setSupervisorDefaultAgentStatusFilter(com.sforce.soap._2006._04.metadata.SupervisorAgentStatusFilter supervisorDefaultAgentStatusFilter) {
        this.supervisorDefaultAgentStatusFilter = supervisorDefaultAgentStatusFilter;
    }


    /**
     * Gets the supervisorDefaultButtonFilter value for this LiveChatAgentConfig.
     * 
     * @return supervisorDefaultButtonFilter
     */
    public java.lang.String getSupervisorDefaultButtonFilter() {
        return supervisorDefaultButtonFilter;
    }


    /**
     * Sets the supervisorDefaultButtonFilter value for this LiveChatAgentConfig.
     * 
     * @param supervisorDefaultButtonFilter
     */
    public void setSupervisorDefaultButtonFilter(java.lang.String supervisorDefaultButtonFilter) {
        this.supervisorDefaultButtonFilter = supervisorDefaultButtonFilter;
    }


    /**
     * Gets the supervisorDefaultSkillFilter value for this LiveChatAgentConfig.
     * 
     * @return supervisorDefaultSkillFilter
     */
    public java.lang.String getSupervisorDefaultSkillFilter() {
        return supervisorDefaultSkillFilter;
    }


    /**
     * Sets the supervisorDefaultSkillFilter value for this LiveChatAgentConfig.
     * 
     * @param supervisorDefaultSkillFilter
     */
    public void setSupervisorDefaultSkillFilter(java.lang.String supervisorDefaultSkillFilter) {
        this.supervisorDefaultSkillFilter = supervisorDefaultSkillFilter;
    }


    /**
     * Gets the supervisorSkills value for this LiveChatAgentConfig.
     * 
     * @return supervisorSkills
     */
    public java.lang.String[] getSupervisorSkills() {
        return supervisorSkills;
    }


    /**
     * Sets the supervisorSkills value for this LiveChatAgentConfig.
     * 
     * @param supervisorSkills
     */
    public void setSupervisorSkills(java.lang.String[] supervisorSkills) {
        this.supervisorSkills = supervisorSkills;
    }


    /**
     * Gets the transferableButtons value for this LiveChatAgentConfig.
     * 
     * @return transferableButtons
     */
    public java.lang.String[] getTransferableButtons() {
        return transferableButtons;
    }


    /**
     * Sets the transferableButtons value for this LiveChatAgentConfig.
     * 
     * @param transferableButtons
     */
    public void setTransferableButtons(java.lang.String[] transferableButtons) {
        this.transferableButtons = transferableButtons;
    }


    /**
     * Gets the transferableSkills value for this LiveChatAgentConfig.
     * 
     * @return transferableSkills
     */
    public java.lang.String[] getTransferableSkills() {
        return transferableSkills;
    }


    /**
     * Sets the transferableSkills value for this LiveChatAgentConfig.
     * 
     * @param transferableSkills
     */
    public void setTransferableSkills(java.lang.String[] transferableSkills) {
        this.transferableSkills = transferableSkills;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LiveChatAgentConfig)) return false;
        LiveChatAgentConfig other = (LiveChatAgentConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assignments==null && other.getAssignments()==null) || 
             (this.assignments!=null &&
              this.assignments.equals(other.getAssignments()))) &&
            ((this.autoGreeting==null && other.getAutoGreeting()==null) || 
             (this.autoGreeting!=null &&
              this.autoGreeting.equals(other.getAutoGreeting()))) &&
            ((this.capacity==null && other.getCapacity()==null) || 
             (this.capacity!=null &&
              this.capacity.equals(other.getCapacity()))) &&
            ((this.criticalWaitTime==null && other.getCriticalWaitTime()==null) || 
             (this.criticalWaitTime!=null &&
              this.criticalWaitTime.equals(other.getCriticalWaitTime()))) &&
            ((this.customAgentName==null && other.getCustomAgentName()==null) || 
             (this.customAgentName!=null &&
              this.customAgentName.equals(other.getCustomAgentName()))) &&
            ((this.enableAgentFileTransfer==null && other.getEnableAgentFileTransfer()==null) || 
             (this.enableAgentFileTransfer!=null &&
              this.enableAgentFileTransfer.equals(other.getEnableAgentFileTransfer()))) &&
            ((this.enableAgentSneakPeek==null && other.getEnableAgentSneakPeek()==null) || 
             (this.enableAgentSneakPeek!=null &&
              this.enableAgentSneakPeek.equals(other.getEnableAgentSneakPeek()))) &&
            ((this.enableAutoAwayOnDecline==null && other.getEnableAutoAwayOnDecline()==null) || 
             (this.enableAutoAwayOnDecline!=null &&
              this.enableAutoAwayOnDecline.equals(other.getEnableAutoAwayOnDecline()))) &&
            ((this.enableAutoAwayOnPushTimeout==null && other.getEnableAutoAwayOnPushTimeout()==null) || 
             (this.enableAutoAwayOnPushTimeout!=null &&
              this.enableAutoAwayOnPushTimeout.equals(other.getEnableAutoAwayOnPushTimeout()))) &&
            ((this.enableChatConferencing==null && other.getEnableChatConferencing()==null) || 
             (this.enableChatConferencing!=null &&
              this.enableChatConferencing.equals(other.getEnableChatConferencing()))) &&
            ((this.enableChatMonitoring==null && other.getEnableChatMonitoring()==null) || 
             (this.enableChatMonitoring!=null &&
              this.enableChatMonitoring.equals(other.getEnableChatMonitoring()))) &&
            ((this.enableChatTransfer==null && other.getEnableChatTransfer()==null) || 
             (this.enableChatTransfer!=null &&
              this.enableChatTransfer.equals(other.getEnableChatTransfer()))) &&
            ((this.enableLogoutSound==null && other.getEnableLogoutSound()==null) || 
             (this.enableLogoutSound!=null &&
              this.enableLogoutSound.equals(other.getEnableLogoutSound()))) &&
            ((this.enableNotifications==null && other.getEnableNotifications()==null) || 
             (this.enableNotifications!=null &&
              this.enableNotifications.equals(other.getEnableNotifications()))) &&
            ((this.enableRequestSound==null && other.getEnableRequestSound()==null) || 
             (this.enableRequestSound!=null &&
              this.enableRequestSound.equals(other.getEnableRequestSound()))) &&
            ((this.enableSneakPeek==null && other.getEnableSneakPeek()==null) || 
             (this.enableSneakPeek!=null &&
              this.enableSneakPeek.equals(other.getEnableSneakPeek()))) &&
            ((this.enableVisitorBlocking==null && other.getEnableVisitorBlocking()==null) || 
             (this.enableVisitorBlocking!=null &&
              this.enableVisitorBlocking.equals(other.getEnableVisitorBlocking()))) &&
            ((this.enableWhisperMessage==null && other.getEnableWhisperMessage()==null) || 
             (this.enableWhisperMessage!=null &&
              this.enableWhisperMessage.equals(other.getEnableWhisperMessage()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.supervisorDefaultAgentStatusFilter==null && other.getSupervisorDefaultAgentStatusFilter()==null) || 
             (this.supervisorDefaultAgentStatusFilter!=null &&
              this.supervisorDefaultAgentStatusFilter.equals(other.getSupervisorDefaultAgentStatusFilter()))) &&
            ((this.supervisorDefaultButtonFilter==null && other.getSupervisorDefaultButtonFilter()==null) || 
             (this.supervisorDefaultButtonFilter!=null &&
              this.supervisorDefaultButtonFilter.equals(other.getSupervisorDefaultButtonFilter()))) &&
            ((this.supervisorDefaultSkillFilter==null && other.getSupervisorDefaultSkillFilter()==null) || 
             (this.supervisorDefaultSkillFilter!=null &&
              this.supervisorDefaultSkillFilter.equals(other.getSupervisorDefaultSkillFilter()))) &&
            ((this.supervisorSkills==null && other.getSupervisorSkills()==null) || 
             (this.supervisorSkills!=null &&
              java.util.Arrays.equals(this.supervisorSkills, other.getSupervisorSkills()))) &&
            ((this.transferableButtons==null && other.getTransferableButtons()==null) || 
             (this.transferableButtons!=null &&
              java.util.Arrays.equals(this.transferableButtons, other.getTransferableButtons()))) &&
            ((this.transferableSkills==null && other.getTransferableSkills()==null) || 
             (this.transferableSkills!=null &&
              java.util.Arrays.equals(this.transferableSkills, other.getTransferableSkills())));
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
        if (getAssignments() != null) {
            _hashCode += getAssignments().hashCode();
        }
        if (getAutoGreeting() != null) {
            _hashCode += getAutoGreeting().hashCode();
        }
        if (getCapacity() != null) {
            _hashCode += getCapacity().hashCode();
        }
        if (getCriticalWaitTime() != null) {
            _hashCode += getCriticalWaitTime().hashCode();
        }
        if (getCustomAgentName() != null) {
            _hashCode += getCustomAgentName().hashCode();
        }
        if (getEnableAgentFileTransfer() != null) {
            _hashCode += getEnableAgentFileTransfer().hashCode();
        }
        if (getEnableAgentSneakPeek() != null) {
            _hashCode += getEnableAgentSneakPeek().hashCode();
        }
        if (getEnableAutoAwayOnDecline() != null) {
            _hashCode += getEnableAutoAwayOnDecline().hashCode();
        }
        if (getEnableAutoAwayOnPushTimeout() != null) {
            _hashCode += getEnableAutoAwayOnPushTimeout().hashCode();
        }
        if (getEnableChatConferencing() != null) {
            _hashCode += getEnableChatConferencing().hashCode();
        }
        if (getEnableChatMonitoring() != null) {
            _hashCode += getEnableChatMonitoring().hashCode();
        }
        if (getEnableChatTransfer() != null) {
            _hashCode += getEnableChatTransfer().hashCode();
        }
        if (getEnableLogoutSound() != null) {
            _hashCode += getEnableLogoutSound().hashCode();
        }
        if (getEnableNotifications() != null) {
            _hashCode += getEnableNotifications().hashCode();
        }
        if (getEnableRequestSound() != null) {
            _hashCode += getEnableRequestSound().hashCode();
        }
        if (getEnableSneakPeek() != null) {
            _hashCode += getEnableSneakPeek().hashCode();
        }
        if (getEnableVisitorBlocking() != null) {
            _hashCode += getEnableVisitorBlocking().hashCode();
        }
        if (getEnableWhisperMessage() != null) {
            _hashCode += getEnableWhisperMessage().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getSupervisorDefaultAgentStatusFilter() != null) {
            _hashCode += getSupervisorDefaultAgentStatusFilter().hashCode();
        }
        if (getSupervisorDefaultButtonFilter() != null) {
            _hashCode += getSupervisorDefaultButtonFilter().hashCode();
        }
        if (getSupervisorDefaultSkillFilter() != null) {
            _hashCode += getSupervisorDefaultSkillFilter().hashCode();
        }
        if (getSupervisorSkills() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupervisorSkills());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupervisorSkills(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferableButtons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferableButtons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferableButtons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferableSkills() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferableSkills());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferableSkills(), i);
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
        new org.apache.axis.description.TypeDesc(LiveChatAgentConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatAgentConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "AgentConfigAssignments"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoGreeting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "autoGreeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criticalWaitTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "criticalWaitTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAgentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "customAgentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableAgentFileTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableAgentFileTransfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableAgentSneakPeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableAgentSneakPeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableAutoAwayOnDecline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableAutoAwayOnDecline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableAutoAwayOnPushTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableAutoAwayOnPushTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableChatConferencing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableChatConferencing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableChatMonitoring");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableChatMonitoring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableChatTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableChatTransfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableLogoutSound");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableLogoutSound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableNotifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableNotifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableRequestSound");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableRequestSound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableSneakPeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableSneakPeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableVisitorBlocking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableVisitorBlocking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableWhisperMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableWhisperMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisorDefaultAgentStatusFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "supervisorDefaultAgentStatusFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SupervisorAgentStatusFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisorDefaultButtonFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "supervisorDefaultButtonFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisorDefaultSkillFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "supervisorDefaultSkillFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisorSkills");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "supervisorSkills"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "skill"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferableButtons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "transferableButtons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "button"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferableSkills");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "transferableSkills"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "skill"));
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
