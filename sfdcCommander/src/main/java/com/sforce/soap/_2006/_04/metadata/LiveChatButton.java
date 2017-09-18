/**
 * LiveChatButton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class LiveChatButton  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.LiveChatButtonPresentation animation;

    private java.lang.String autoGreeting;

    private java.lang.Integer chasitorIdleTimeout;

    private java.lang.Integer chasitorIdleTimeoutWarning;

    private java.lang.String chatPage;

    private java.lang.String customAgentName;

    private java.lang.String[] deployments;

    private java.lang.Boolean enableQueue;

    private com.sforce.soap._2006._04.metadata.LiveChatButtonInviteEndPosition inviteEndPosition;

    private java.lang.String inviteImage;

    private com.sforce.soap._2006._04.metadata.LiveChatButtonInviteStartPosition inviteStartPosition;

    private java.lang.Boolean isActive;

    private java.lang.String label;

    private java.lang.Integer numberOfReroutingAttempts;

    private java.lang.String offlineImage;

    private java.lang.String onlineImage;

    private java.lang.Boolean optionsCustomRoutingIsEnabled;

    private boolean optionsHasChasitorIdleTimeout;

    private java.lang.Boolean optionsHasInviteAfterAccept;

    private java.lang.Boolean optionsHasInviteAfterReject;

    private java.lang.Boolean optionsHasRerouteDeclinedRequest;

    private java.lang.Boolean optionsIsAutoAccept;

    private java.lang.Boolean optionsIsInviteAutoRemove;

    private java.lang.Integer overallQueueLength;

    private java.lang.Integer perAgentQueueLength;

    private java.lang.String postChatPage;

    private java.lang.String postChatUrl;

    private java.lang.String preChatFormPage;

    private java.lang.String preChatFormUrl;

    private java.lang.Integer pushTimeOut;

    private com.sforce.soap._2006._04.metadata.LiveChatButtonRoutingType routingType;

    private java.lang.String site;

    private java.lang.String[] skills;

    private java.lang.Integer timeToRemoveInvite;

    private com.sforce.soap._2006._04.metadata.LiveChatButtonType type;

    private com.sforce.soap._2006._04.metadata.Language windowLanguage;

    public LiveChatButton() {
    }

    public LiveChatButton(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.LiveChatButtonPresentation animation,
           java.lang.String autoGreeting,
           java.lang.Integer chasitorIdleTimeout,
           java.lang.Integer chasitorIdleTimeoutWarning,
           java.lang.String chatPage,
           java.lang.String customAgentName,
           java.lang.String[] deployments,
           java.lang.Boolean enableQueue,
           com.sforce.soap._2006._04.metadata.LiveChatButtonInviteEndPosition inviteEndPosition,
           java.lang.String inviteImage,
           com.sforce.soap._2006._04.metadata.LiveChatButtonInviteStartPosition inviteStartPosition,
           java.lang.Boolean isActive,
           java.lang.String label,
           java.lang.Integer numberOfReroutingAttempts,
           java.lang.String offlineImage,
           java.lang.String onlineImage,
           java.lang.Boolean optionsCustomRoutingIsEnabled,
           boolean optionsHasChasitorIdleTimeout,
           java.lang.Boolean optionsHasInviteAfterAccept,
           java.lang.Boolean optionsHasInviteAfterReject,
           java.lang.Boolean optionsHasRerouteDeclinedRequest,
           java.lang.Boolean optionsIsAutoAccept,
           java.lang.Boolean optionsIsInviteAutoRemove,
           java.lang.Integer overallQueueLength,
           java.lang.Integer perAgentQueueLength,
           java.lang.String postChatPage,
           java.lang.String postChatUrl,
           java.lang.String preChatFormPage,
           java.lang.String preChatFormUrl,
           java.lang.Integer pushTimeOut,
           com.sforce.soap._2006._04.metadata.LiveChatButtonRoutingType routingType,
           java.lang.String site,
           java.lang.String[] skills,
           java.lang.Integer timeToRemoveInvite,
           com.sforce.soap._2006._04.metadata.LiveChatButtonType type,
           com.sforce.soap._2006._04.metadata.Language windowLanguage) {
        super(
            fullName);
        this.animation = animation;
        this.autoGreeting = autoGreeting;
        this.chasitorIdleTimeout = chasitorIdleTimeout;
        this.chasitorIdleTimeoutWarning = chasitorIdleTimeoutWarning;
        this.chatPage = chatPage;
        this.customAgentName = customAgentName;
        this.deployments = deployments;
        this.enableQueue = enableQueue;
        this.inviteEndPosition = inviteEndPosition;
        this.inviteImage = inviteImage;
        this.inviteStartPosition = inviteStartPosition;
        this.isActive = isActive;
        this.label = label;
        this.numberOfReroutingAttempts = numberOfReroutingAttempts;
        this.offlineImage = offlineImage;
        this.onlineImage = onlineImage;
        this.optionsCustomRoutingIsEnabled = optionsCustomRoutingIsEnabled;
        this.optionsHasChasitorIdleTimeout = optionsHasChasitorIdleTimeout;
        this.optionsHasInviteAfterAccept = optionsHasInviteAfterAccept;
        this.optionsHasInviteAfterReject = optionsHasInviteAfterReject;
        this.optionsHasRerouteDeclinedRequest = optionsHasRerouteDeclinedRequest;
        this.optionsIsAutoAccept = optionsIsAutoAccept;
        this.optionsIsInviteAutoRemove = optionsIsInviteAutoRemove;
        this.overallQueueLength = overallQueueLength;
        this.perAgentQueueLength = perAgentQueueLength;
        this.postChatPage = postChatPage;
        this.postChatUrl = postChatUrl;
        this.preChatFormPage = preChatFormPage;
        this.preChatFormUrl = preChatFormUrl;
        this.pushTimeOut = pushTimeOut;
        this.routingType = routingType;
        this.site = site;
        this.skills = skills;
        this.timeToRemoveInvite = timeToRemoveInvite;
        this.type = type;
        this.windowLanguage = windowLanguage;
    }


    /**
     * Gets the animation value for this LiveChatButton.
     * 
     * @return animation
     */
    public com.sforce.soap._2006._04.metadata.LiveChatButtonPresentation getAnimation() {
        return animation;
    }


    /**
     * Sets the animation value for this LiveChatButton.
     * 
     * @param animation
     */
    public void setAnimation(com.sforce.soap._2006._04.metadata.LiveChatButtonPresentation animation) {
        this.animation = animation;
    }


    /**
     * Gets the autoGreeting value for this LiveChatButton.
     * 
     * @return autoGreeting
     */
    public java.lang.String getAutoGreeting() {
        return autoGreeting;
    }


    /**
     * Sets the autoGreeting value for this LiveChatButton.
     * 
     * @param autoGreeting
     */
    public void setAutoGreeting(java.lang.String autoGreeting) {
        this.autoGreeting = autoGreeting;
    }


    /**
     * Gets the chasitorIdleTimeout value for this LiveChatButton.
     * 
     * @return chasitorIdleTimeout
     */
    public java.lang.Integer getChasitorIdleTimeout() {
        return chasitorIdleTimeout;
    }


    /**
     * Sets the chasitorIdleTimeout value for this LiveChatButton.
     * 
     * @param chasitorIdleTimeout
     */
    public void setChasitorIdleTimeout(java.lang.Integer chasitorIdleTimeout) {
        this.chasitorIdleTimeout = chasitorIdleTimeout;
    }


    /**
     * Gets the chasitorIdleTimeoutWarning value for this LiveChatButton.
     * 
     * @return chasitorIdleTimeoutWarning
     */
    public java.lang.Integer getChasitorIdleTimeoutWarning() {
        return chasitorIdleTimeoutWarning;
    }


    /**
     * Sets the chasitorIdleTimeoutWarning value for this LiveChatButton.
     * 
     * @param chasitorIdleTimeoutWarning
     */
    public void setChasitorIdleTimeoutWarning(java.lang.Integer chasitorIdleTimeoutWarning) {
        this.chasitorIdleTimeoutWarning = chasitorIdleTimeoutWarning;
    }


    /**
     * Gets the chatPage value for this LiveChatButton.
     * 
     * @return chatPage
     */
    public java.lang.String getChatPage() {
        return chatPage;
    }


    /**
     * Sets the chatPage value for this LiveChatButton.
     * 
     * @param chatPage
     */
    public void setChatPage(java.lang.String chatPage) {
        this.chatPage = chatPage;
    }


    /**
     * Gets the customAgentName value for this LiveChatButton.
     * 
     * @return customAgentName
     */
    public java.lang.String getCustomAgentName() {
        return customAgentName;
    }


    /**
     * Sets the customAgentName value for this LiveChatButton.
     * 
     * @param customAgentName
     */
    public void setCustomAgentName(java.lang.String customAgentName) {
        this.customAgentName = customAgentName;
    }


    /**
     * Gets the deployments value for this LiveChatButton.
     * 
     * @return deployments
     */
    public java.lang.String[] getDeployments() {
        return deployments;
    }


    /**
     * Sets the deployments value for this LiveChatButton.
     * 
     * @param deployments
     */
    public void setDeployments(java.lang.String[] deployments) {
        this.deployments = deployments;
    }


    /**
     * Gets the enableQueue value for this LiveChatButton.
     * 
     * @return enableQueue
     */
    public java.lang.Boolean getEnableQueue() {
        return enableQueue;
    }


    /**
     * Sets the enableQueue value for this LiveChatButton.
     * 
     * @param enableQueue
     */
    public void setEnableQueue(java.lang.Boolean enableQueue) {
        this.enableQueue = enableQueue;
    }


    /**
     * Gets the inviteEndPosition value for this LiveChatButton.
     * 
     * @return inviteEndPosition
     */
    public com.sforce.soap._2006._04.metadata.LiveChatButtonInviteEndPosition getInviteEndPosition() {
        return inviteEndPosition;
    }


    /**
     * Sets the inviteEndPosition value for this LiveChatButton.
     * 
     * @param inviteEndPosition
     */
    public void setInviteEndPosition(com.sforce.soap._2006._04.metadata.LiveChatButtonInviteEndPosition inviteEndPosition) {
        this.inviteEndPosition = inviteEndPosition;
    }


    /**
     * Gets the inviteImage value for this LiveChatButton.
     * 
     * @return inviteImage
     */
    public java.lang.String getInviteImage() {
        return inviteImage;
    }


    /**
     * Sets the inviteImage value for this LiveChatButton.
     * 
     * @param inviteImage
     */
    public void setInviteImage(java.lang.String inviteImage) {
        this.inviteImage = inviteImage;
    }


    /**
     * Gets the inviteStartPosition value for this LiveChatButton.
     * 
     * @return inviteStartPosition
     */
    public com.sforce.soap._2006._04.metadata.LiveChatButtonInviteStartPosition getInviteStartPosition() {
        return inviteStartPosition;
    }


    /**
     * Sets the inviteStartPosition value for this LiveChatButton.
     * 
     * @param inviteStartPosition
     */
    public void setInviteStartPosition(com.sforce.soap._2006._04.metadata.LiveChatButtonInviteStartPosition inviteStartPosition) {
        this.inviteStartPosition = inviteStartPosition;
    }


    /**
     * Gets the isActive value for this LiveChatButton.
     * 
     * @return isActive
     */
    public java.lang.Boolean getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this LiveChatButton.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.Boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the label value for this LiveChatButton.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this LiveChatButton.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the numberOfReroutingAttempts value for this LiveChatButton.
     * 
     * @return numberOfReroutingAttempts
     */
    public java.lang.Integer getNumberOfReroutingAttempts() {
        return numberOfReroutingAttempts;
    }


    /**
     * Sets the numberOfReroutingAttempts value for this LiveChatButton.
     * 
     * @param numberOfReroutingAttempts
     */
    public void setNumberOfReroutingAttempts(java.lang.Integer numberOfReroutingAttempts) {
        this.numberOfReroutingAttempts = numberOfReroutingAttempts;
    }


    /**
     * Gets the offlineImage value for this LiveChatButton.
     * 
     * @return offlineImage
     */
    public java.lang.String getOfflineImage() {
        return offlineImage;
    }


    /**
     * Sets the offlineImage value for this LiveChatButton.
     * 
     * @param offlineImage
     */
    public void setOfflineImage(java.lang.String offlineImage) {
        this.offlineImage = offlineImage;
    }


    /**
     * Gets the onlineImage value for this LiveChatButton.
     * 
     * @return onlineImage
     */
    public java.lang.String getOnlineImage() {
        return onlineImage;
    }


    /**
     * Sets the onlineImage value for this LiveChatButton.
     * 
     * @param onlineImage
     */
    public void setOnlineImage(java.lang.String onlineImage) {
        this.onlineImage = onlineImage;
    }


    /**
     * Gets the optionsCustomRoutingIsEnabled value for this LiveChatButton.
     * 
     * @return optionsCustomRoutingIsEnabled
     */
    public java.lang.Boolean getOptionsCustomRoutingIsEnabled() {
        return optionsCustomRoutingIsEnabled;
    }


    /**
     * Sets the optionsCustomRoutingIsEnabled value for this LiveChatButton.
     * 
     * @param optionsCustomRoutingIsEnabled
     */
    public void setOptionsCustomRoutingIsEnabled(java.lang.Boolean optionsCustomRoutingIsEnabled) {
        this.optionsCustomRoutingIsEnabled = optionsCustomRoutingIsEnabled;
    }


    /**
     * Gets the optionsHasChasitorIdleTimeout value for this LiveChatButton.
     * 
     * @return optionsHasChasitorIdleTimeout
     */
    public boolean isOptionsHasChasitorIdleTimeout() {
        return optionsHasChasitorIdleTimeout;
    }


    /**
     * Sets the optionsHasChasitorIdleTimeout value for this LiveChatButton.
     * 
     * @param optionsHasChasitorIdleTimeout
     */
    public void setOptionsHasChasitorIdleTimeout(boolean optionsHasChasitorIdleTimeout) {
        this.optionsHasChasitorIdleTimeout = optionsHasChasitorIdleTimeout;
    }


    /**
     * Gets the optionsHasInviteAfterAccept value for this LiveChatButton.
     * 
     * @return optionsHasInviteAfterAccept
     */
    public java.lang.Boolean getOptionsHasInviteAfterAccept() {
        return optionsHasInviteAfterAccept;
    }


    /**
     * Sets the optionsHasInviteAfterAccept value for this LiveChatButton.
     * 
     * @param optionsHasInviteAfterAccept
     */
    public void setOptionsHasInviteAfterAccept(java.lang.Boolean optionsHasInviteAfterAccept) {
        this.optionsHasInviteAfterAccept = optionsHasInviteAfterAccept;
    }


    /**
     * Gets the optionsHasInviteAfterReject value for this LiveChatButton.
     * 
     * @return optionsHasInviteAfterReject
     */
    public java.lang.Boolean getOptionsHasInviteAfterReject() {
        return optionsHasInviteAfterReject;
    }


    /**
     * Sets the optionsHasInviteAfterReject value for this LiveChatButton.
     * 
     * @param optionsHasInviteAfterReject
     */
    public void setOptionsHasInviteAfterReject(java.lang.Boolean optionsHasInviteAfterReject) {
        this.optionsHasInviteAfterReject = optionsHasInviteAfterReject;
    }


    /**
     * Gets the optionsHasRerouteDeclinedRequest value for this LiveChatButton.
     * 
     * @return optionsHasRerouteDeclinedRequest
     */
    public java.lang.Boolean getOptionsHasRerouteDeclinedRequest() {
        return optionsHasRerouteDeclinedRequest;
    }


    /**
     * Sets the optionsHasRerouteDeclinedRequest value for this LiveChatButton.
     * 
     * @param optionsHasRerouteDeclinedRequest
     */
    public void setOptionsHasRerouteDeclinedRequest(java.lang.Boolean optionsHasRerouteDeclinedRequest) {
        this.optionsHasRerouteDeclinedRequest = optionsHasRerouteDeclinedRequest;
    }


    /**
     * Gets the optionsIsAutoAccept value for this LiveChatButton.
     * 
     * @return optionsIsAutoAccept
     */
    public java.lang.Boolean getOptionsIsAutoAccept() {
        return optionsIsAutoAccept;
    }


    /**
     * Sets the optionsIsAutoAccept value for this LiveChatButton.
     * 
     * @param optionsIsAutoAccept
     */
    public void setOptionsIsAutoAccept(java.lang.Boolean optionsIsAutoAccept) {
        this.optionsIsAutoAccept = optionsIsAutoAccept;
    }


    /**
     * Gets the optionsIsInviteAutoRemove value for this LiveChatButton.
     * 
     * @return optionsIsInviteAutoRemove
     */
    public java.lang.Boolean getOptionsIsInviteAutoRemove() {
        return optionsIsInviteAutoRemove;
    }


    /**
     * Sets the optionsIsInviteAutoRemove value for this LiveChatButton.
     * 
     * @param optionsIsInviteAutoRemove
     */
    public void setOptionsIsInviteAutoRemove(java.lang.Boolean optionsIsInviteAutoRemove) {
        this.optionsIsInviteAutoRemove = optionsIsInviteAutoRemove;
    }


    /**
     * Gets the overallQueueLength value for this LiveChatButton.
     * 
     * @return overallQueueLength
     */
    public java.lang.Integer getOverallQueueLength() {
        return overallQueueLength;
    }


    /**
     * Sets the overallQueueLength value for this LiveChatButton.
     * 
     * @param overallQueueLength
     */
    public void setOverallQueueLength(java.lang.Integer overallQueueLength) {
        this.overallQueueLength = overallQueueLength;
    }


    /**
     * Gets the perAgentQueueLength value for this LiveChatButton.
     * 
     * @return perAgentQueueLength
     */
    public java.lang.Integer getPerAgentQueueLength() {
        return perAgentQueueLength;
    }


    /**
     * Sets the perAgentQueueLength value for this LiveChatButton.
     * 
     * @param perAgentQueueLength
     */
    public void setPerAgentQueueLength(java.lang.Integer perAgentQueueLength) {
        this.perAgentQueueLength = perAgentQueueLength;
    }


    /**
     * Gets the postChatPage value for this LiveChatButton.
     * 
     * @return postChatPage
     */
    public java.lang.String getPostChatPage() {
        return postChatPage;
    }


    /**
     * Sets the postChatPage value for this LiveChatButton.
     * 
     * @param postChatPage
     */
    public void setPostChatPage(java.lang.String postChatPage) {
        this.postChatPage = postChatPage;
    }


    /**
     * Gets the postChatUrl value for this LiveChatButton.
     * 
     * @return postChatUrl
     */
    public java.lang.String getPostChatUrl() {
        return postChatUrl;
    }


    /**
     * Sets the postChatUrl value for this LiveChatButton.
     * 
     * @param postChatUrl
     */
    public void setPostChatUrl(java.lang.String postChatUrl) {
        this.postChatUrl = postChatUrl;
    }


    /**
     * Gets the preChatFormPage value for this LiveChatButton.
     * 
     * @return preChatFormPage
     */
    public java.lang.String getPreChatFormPage() {
        return preChatFormPage;
    }


    /**
     * Sets the preChatFormPage value for this LiveChatButton.
     * 
     * @param preChatFormPage
     */
    public void setPreChatFormPage(java.lang.String preChatFormPage) {
        this.preChatFormPage = preChatFormPage;
    }


    /**
     * Gets the preChatFormUrl value for this LiveChatButton.
     * 
     * @return preChatFormUrl
     */
    public java.lang.String getPreChatFormUrl() {
        return preChatFormUrl;
    }


    /**
     * Sets the preChatFormUrl value for this LiveChatButton.
     * 
     * @param preChatFormUrl
     */
    public void setPreChatFormUrl(java.lang.String preChatFormUrl) {
        this.preChatFormUrl = preChatFormUrl;
    }


    /**
     * Gets the pushTimeOut value for this LiveChatButton.
     * 
     * @return pushTimeOut
     */
    public java.lang.Integer getPushTimeOut() {
        return pushTimeOut;
    }


    /**
     * Sets the pushTimeOut value for this LiveChatButton.
     * 
     * @param pushTimeOut
     */
    public void setPushTimeOut(java.lang.Integer pushTimeOut) {
        this.pushTimeOut = pushTimeOut;
    }


    /**
     * Gets the routingType value for this LiveChatButton.
     * 
     * @return routingType
     */
    public com.sforce.soap._2006._04.metadata.LiveChatButtonRoutingType getRoutingType() {
        return routingType;
    }


    /**
     * Sets the routingType value for this LiveChatButton.
     * 
     * @param routingType
     */
    public void setRoutingType(com.sforce.soap._2006._04.metadata.LiveChatButtonRoutingType routingType) {
        this.routingType = routingType;
    }


    /**
     * Gets the site value for this LiveChatButton.
     * 
     * @return site
     */
    public java.lang.String getSite() {
        return site;
    }


    /**
     * Sets the site value for this LiveChatButton.
     * 
     * @param site
     */
    public void setSite(java.lang.String site) {
        this.site = site;
    }


    /**
     * Gets the skills value for this LiveChatButton.
     * 
     * @return skills
     */
    public java.lang.String[] getSkills() {
        return skills;
    }


    /**
     * Sets the skills value for this LiveChatButton.
     * 
     * @param skills
     */
    public void setSkills(java.lang.String[] skills) {
        this.skills = skills;
    }


    /**
     * Gets the timeToRemoveInvite value for this LiveChatButton.
     * 
     * @return timeToRemoveInvite
     */
    public java.lang.Integer getTimeToRemoveInvite() {
        return timeToRemoveInvite;
    }


    /**
     * Sets the timeToRemoveInvite value for this LiveChatButton.
     * 
     * @param timeToRemoveInvite
     */
    public void setTimeToRemoveInvite(java.lang.Integer timeToRemoveInvite) {
        this.timeToRemoveInvite = timeToRemoveInvite;
    }


    /**
     * Gets the type value for this LiveChatButton.
     * 
     * @return type
     */
    public com.sforce.soap._2006._04.metadata.LiveChatButtonType getType() {
        return type;
    }


    /**
     * Sets the type value for this LiveChatButton.
     * 
     * @param type
     */
    public void setType(com.sforce.soap._2006._04.metadata.LiveChatButtonType type) {
        this.type = type;
    }


    /**
     * Gets the windowLanguage value for this LiveChatButton.
     * 
     * @return windowLanguage
     */
    public com.sforce.soap._2006._04.metadata.Language getWindowLanguage() {
        return windowLanguage;
    }


    /**
     * Sets the windowLanguage value for this LiveChatButton.
     * 
     * @param windowLanguage
     */
    public void setWindowLanguage(com.sforce.soap._2006._04.metadata.Language windowLanguage) {
        this.windowLanguage = windowLanguage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LiveChatButton)) return false;
        LiveChatButton other = (LiveChatButton) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.animation==null && other.getAnimation()==null) || 
             (this.animation!=null &&
              this.animation.equals(other.getAnimation()))) &&
            ((this.autoGreeting==null && other.getAutoGreeting()==null) || 
             (this.autoGreeting!=null &&
              this.autoGreeting.equals(other.getAutoGreeting()))) &&
            ((this.chasitorIdleTimeout==null && other.getChasitorIdleTimeout()==null) || 
             (this.chasitorIdleTimeout!=null &&
              this.chasitorIdleTimeout.equals(other.getChasitorIdleTimeout()))) &&
            ((this.chasitorIdleTimeoutWarning==null && other.getChasitorIdleTimeoutWarning()==null) || 
             (this.chasitorIdleTimeoutWarning!=null &&
              this.chasitorIdleTimeoutWarning.equals(other.getChasitorIdleTimeoutWarning()))) &&
            ((this.chatPage==null && other.getChatPage()==null) || 
             (this.chatPage!=null &&
              this.chatPage.equals(other.getChatPage()))) &&
            ((this.customAgentName==null && other.getCustomAgentName()==null) || 
             (this.customAgentName!=null &&
              this.customAgentName.equals(other.getCustomAgentName()))) &&
            ((this.deployments==null && other.getDeployments()==null) || 
             (this.deployments!=null &&
              java.util.Arrays.equals(this.deployments, other.getDeployments()))) &&
            ((this.enableQueue==null && other.getEnableQueue()==null) || 
             (this.enableQueue!=null &&
              this.enableQueue.equals(other.getEnableQueue()))) &&
            ((this.inviteEndPosition==null && other.getInviteEndPosition()==null) || 
             (this.inviteEndPosition!=null &&
              this.inviteEndPosition.equals(other.getInviteEndPosition()))) &&
            ((this.inviteImage==null && other.getInviteImage()==null) || 
             (this.inviteImage!=null &&
              this.inviteImage.equals(other.getInviteImage()))) &&
            ((this.inviteStartPosition==null && other.getInviteStartPosition()==null) || 
             (this.inviteStartPosition!=null &&
              this.inviteStartPosition.equals(other.getInviteStartPosition()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.numberOfReroutingAttempts==null && other.getNumberOfReroutingAttempts()==null) || 
             (this.numberOfReroutingAttempts!=null &&
              this.numberOfReroutingAttempts.equals(other.getNumberOfReroutingAttempts()))) &&
            ((this.offlineImage==null && other.getOfflineImage()==null) || 
             (this.offlineImage!=null &&
              this.offlineImage.equals(other.getOfflineImage()))) &&
            ((this.onlineImage==null && other.getOnlineImage()==null) || 
             (this.onlineImage!=null &&
              this.onlineImage.equals(other.getOnlineImage()))) &&
            ((this.optionsCustomRoutingIsEnabled==null && other.getOptionsCustomRoutingIsEnabled()==null) || 
             (this.optionsCustomRoutingIsEnabled!=null &&
              this.optionsCustomRoutingIsEnabled.equals(other.getOptionsCustomRoutingIsEnabled()))) &&
            this.optionsHasChasitorIdleTimeout == other.isOptionsHasChasitorIdleTimeout() &&
            ((this.optionsHasInviteAfterAccept==null && other.getOptionsHasInviteAfterAccept()==null) || 
             (this.optionsHasInviteAfterAccept!=null &&
              this.optionsHasInviteAfterAccept.equals(other.getOptionsHasInviteAfterAccept()))) &&
            ((this.optionsHasInviteAfterReject==null && other.getOptionsHasInviteAfterReject()==null) || 
             (this.optionsHasInviteAfterReject!=null &&
              this.optionsHasInviteAfterReject.equals(other.getOptionsHasInviteAfterReject()))) &&
            ((this.optionsHasRerouteDeclinedRequest==null && other.getOptionsHasRerouteDeclinedRequest()==null) || 
             (this.optionsHasRerouteDeclinedRequest!=null &&
              this.optionsHasRerouteDeclinedRequest.equals(other.getOptionsHasRerouteDeclinedRequest()))) &&
            ((this.optionsIsAutoAccept==null && other.getOptionsIsAutoAccept()==null) || 
             (this.optionsIsAutoAccept!=null &&
              this.optionsIsAutoAccept.equals(other.getOptionsIsAutoAccept()))) &&
            ((this.optionsIsInviteAutoRemove==null && other.getOptionsIsInviteAutoRemove()==null) || 
             (this.optionsIsInviteAutoRemove!=null &&
              this.optionsIsInviteAutoRemove.equals(other.getOptionsIsInviteAutoRemove()))) &&
            ((this.overallQueueLength==null && other.getOverallQueueLength()==null) || 
             (this.overallQueueLength!=null &&
              this.overallQueueLength.equals(other.getOverallQueueLength()))) &&
            ((this.perAgentQueueLength==null && other.getPerAgentQueueLength()==null) || 
             (this.perAgentQueueLength!=null &&
              this.perAgentQueueLength.equals(other.getPerAgentQueueLength()))) &&
            ((this.postChatPage==null && other.getPostChatPage()==null) || 
             (this.postChatPage!=null &&
              this.postChatPage.equals(other.getPostChatPage()))) &&
            ((this.postChatUrl==null && other.getPostChatUrl()==null) || 
             (this.postChatUrl!=null &&
              this.postChatUrl.equals(other.getPostChatUrl()))) &&
            ((this.preChatFormPage==null && other.getPreChatFormPage()==null) || 
             (this.preChatFormPage!=null &&
              this.preChatFormPage.equals(other.getPreChatFormPage()))) &&
            ((this.preChatFormUrl==null && other.getPreChatFormUrl()==null) || 
             (this.preChatFormUrl!=null &&
              this.preChatFormUrl.equals(other.getPreChatFormUrl()))) &&
            ((this.pushTimeOut==null && other.getPushTimeOut()==null) || 
             (this.pushTimeOut!=null &&
              this.pushTimeOut.equals(other.getPushTimeOut()))) &&
            ((this.routingType==null && other.getRoutingType()==null) || 
             (this.routingType!=null &&
              this.routingType.equals(other.getRoutingType()))) &&
            ((this.site==null && other.getSite()==null) || 
             (this.site!=null &&
              this.site.equals(other.getSite()))) &&
            ((this.skills==null && other.getSkills()==null) || 
             (this.skills!=null &&
              java.util.Arrays.equals(this.skills, other.getSkills()))) &&
            ((this.timeToRemoveInvite==null && other.getTimeToRemoveInvite()==null) || 
             (this.timeToRemoveInvite!=null &&
              this.timeToRemoveInvite.equals(other.getTimeToRemoveInvite()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.windowLanguage==null && other.getWindowLanguage()==null) || 
             (this.windowLanguage!=null &&
              this.windowLanguage.equals(other.getWindowLanguage())));
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
        if (getAnimation() != null) {
            _hashCode += getAnimation().hashCode();
        }
        if (getAutoGreeting() != null) {
            _hashCode += getAutoGreeting().hashCode();
        }
        if (getChasitorIdleTimeout() != null) {
            _hashCode += getChasitorIdleTimeout().hashCode();
        }
        if (getChasitorIdleTimeoutWarning() != null) {
            _hashCode += getChasitorIdleTimeoutWarning().hashCode();
        }
        if (getChatPage() != null) {
            _hashCode += getChatPage().hashCode();
        }
        if (getCustomAgentName() != null) {
            _hashCode += getCustomAgentName().hashCode();
        }
        if (getDeployments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeployments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeployments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnableQueue() != null) {
            _hashCode += getEnableQueue().hashCode();
        }
        if (getInviteEndPosition() != null) {
            _hashCode += getInviteEndPosition().hashCode();
        }
        if (getInviteImage() != null) {
            _hashCode += getInviteImage().hashCode();
        }
        if (getInviteStartPosition() != null) {
            _hashCode += getInviteStartPosition().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getNumberOfReroutingAttempts() != null) {
            _hashCode += getNumberOfReroutingAttempts().hashCode();
        }
        if (getOfflineImage() != null) {
            _hashCode += getOfflineImage().hashCode();
        }
        if (getOnlineImage() != null) {
            _hashCode += getOnlineImage().hashCode();
        }
        if (getOptionsCustomRoutingIsEnabled() != null) {
            _hashCode += getOptionsCustomRoutingIsEnabled().hashCode();
        }
        _hashCode += (isOptionsHasChasitorIdleTimeout() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOptionsHasInviteAfterAccept() != null) {
            _hashCode += getOptionsHasInviteAfterAccept().hashCode();
        }
        if (getOptionsHasInviteAfterReject() != null) {
            _hashCode += getOptionsHasInviteAfterReject().hashCode();
        }
        if (getOptionsHasRerouteDeclinedRequest() != null) {
            _hashCode += getOptionsHasRerouteDeclinedRequest().hashCode();
        }
        if (getOptionsIsAutoAccept() != null) {
            _hashCode += getOptionsIsAutoAccept().hashCode();
        }
        if (getOptionsIsInviteAutoRemove() != null) {
            _hashCode += getOptionsIsInviteAutoRemove().hashCode();
        }
        if (getOverallQueueLength() != null) {
            _hashCode += getOverallQueueLength().hashCode();
        }
        if (getPerAgentQueueLength() != null) {
            _hashCode += getPerAgentQueueLength().hashCode();
        }
        if (getPostChatPage() != null) {
            _hashCode += getPostChatPage().hashCode();
        }
        if (getPostChatUrl() != null) {
            _hashCode += getPostChatUrl().hashCode();
        }
        if (getPreChatFormPage() != null) {
            _hashCode += getPreChatFormPage().hashCode();
        }
        if (getPreChatFormUrl() != null) {
            _hashCode += getPreChatFormUrl().hashCode();
        }
        if (getPushTimeOut() != null) {
            _hashCode += getPushTimeOut().hashCode();
        }
        if (getRoutingType() != null) {
            _hashCode += getRoutingType().hashCode();
        }
        if (getSite() != null) {
            _hashCode += getSite().hashCode();
        }
        if (getSkills() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSkills());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSkills(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimeToRemoveInvite() != null) {
            _hashCode += getTimeToRemoveInvite().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getWindowLanguage() != null) {
            _hashCode += getWindowLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LiveChatButton.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButton"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("animation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "animation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButtonPresentation"));
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
        elemField.setFieldName("chasitorIdleTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "chasitorIdleTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chasitorIdleTimeoutWarning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "chasitorIdleTimeoutWarning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chatPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "chatPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("deployments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "deployments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "deployment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableQueue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "enableQueue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inviteEndPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "inviteEndPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButtonInviteEndPosition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inviteImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "inviteImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inviteStartPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "inviteStartPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButtonInviteStartPosition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "isActive"));
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
        elemField.setFieldName("numberOfReroutingAttempts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "numberOfReroutingAttempts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlineImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "offlineImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "onlineImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsCustomRoutingIsEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "optionsCustomRoutingIsEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsHasChasitorIdleTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "optionsHasChasitorIdleTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsHasInviteAfterAccept");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "optionsHasInviteAfterAccept"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsHasInviteAfterReject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "optionsHasInviteAfterReject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsHasRerouteDeclinedRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "optionsHasRerouteDeclinedRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsIsAutoAccept");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "optionsIsAutoAccept"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsIsInviteAutoRemove");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "optionsIsInviteAutoRemove"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallQueueLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "overallQueueLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perAgentQueueLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "perAgentQueueLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postChatPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "postChatPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postChatUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "postChatUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preChatFormPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "preChatFormPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preChatFormUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "preChatFormUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushTimeOut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "pushTimeOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "routingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButtonRoutingType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("site");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "site"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skills");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "skills"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "skill"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeToRemoveInvite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "timeToRemoveInvite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "LiveChatButtonType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("windowLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "windowLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Language"));
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
