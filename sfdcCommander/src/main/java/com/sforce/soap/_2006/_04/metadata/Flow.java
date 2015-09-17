/**
 * Flow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Flow  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.FlowActionCall[] actionCalls;

    private com.sforce.soap._2006._04.metadata.FlowApexPluginCall[] apexPluginCalls;

    private com.sforce.soap._2006._04.metadata.FlowAssignment[] assignments;

    private com.sforce.soap._2006._04.metadata.FlowChoice[] choices;

    private com.sforce.soap._2006._04.metadata.FlowConstant[] constants;

    private com.sforce.soap._2006._04.metadata.FlowDecision[] decisions;

    private java.lang.String description;

    private com.sforce.soap._2006._04.metadata.FlowDynamicChoiceSet[] dynamicChoiceSets;

    private com.sforce.soap._2006._04.metadata.FlowFormula[] formulas;

    private java.lang.String interviewLabel;

    private java.lang.String label;

    private com.sforce.soap._2006._04.metadata.FlowLoop[] loops;

    private com.sforce.soap._2006._04.metadata.FlowMetadataValue[] processMetadataValues;

    private com.sforce.soap._2006._04.metadata.FlowProcessType processType;

    private com.sforce.soap._2006._04.metadata.FlowRecordCreate[] recordCreates;

    private com.sforce.soap._2006._04.metadata.FlowRecordDelete[] recordDeletes;

    private com.sforce.soap._2006._04.metadata.FlowRecordLookup[] recordLookups;

    private com.sforce.soap._2006._04.metadata.FlowRecordUpdate[] recordUpdates;

    private com.sforce.soap._2006._04.metadata.FlowScreen[] screens;

    private java.lang.String startElementReference;

    private com.sforce.soap._2006._04.metadata.FlowStep[] steps;

    private com.sforce.soap._2006._04.metadata.FlowSubflow[] subflows;

    private com.sforce.soap._2006._04.metadata.FlowTextTemplate[] textTemplates;

    private com.sforce.soap._2006._04.metadata.FlowVariable[] variables;

    private com.sforce.soap._2006._04.metadata.FlowWait[] waits;

    public Flow() {
    }

    public Flow(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.FlowActionCall[] actionCalls,
           com.sforce.soap._2006._04.metadata.FlowApexPluginCall[] apexPluginCalls,
           com.sforce.soap._2006._04.metadata.FlowAssignment[] assignments,
           com.sforce.soap._2006._04.metadata.FlowChoice[] choices,
           com.sforce.soap._2006._04.metadata.FlowConstant[] constants,
           com.sforce.soap._2006._04.metadata.FlowDecision[] decisions,
           java.lang.String description,
           com.sforce.soap._2006._04.metadata.FlowDynamicChoiceSet[] dynamicChoiceSets,
           com.sforce.soap._2006._04.metadata.FlowFormula[] formulas,
           java.lang.String interviewLabel,
           java.lang.String label,
           com.sforce.soap._2006._04.metadata.FlowLoop[] loops,
           com.sforce.soap._2006._04.metadata.FlowMetadataValue[] processMetadataValues,
           com.sforce.soap._2006._04.metadata.FlowProcessType processType,
           com.sforce.soap._2006._04.metadata.FlowRecordCreate[] recordCreates,
           com.sforce.soap._2006._04.metadata.FlowRecordDelete[] recordDeletes,
           com.sforce.soap._2006._04.metadata.FlowRecordLookup[] recordLookups,
           com.sforce.soap._2006._04.metadata.FlowRecordUpdate[] recordUpdates,
           com.sforce.soap._2006._04.metadata.FlowScreen[] screens,
           java.lang.String startElementReference,
           com.sforce.soap._2006._04.metadata.FlowStep[] steps,
           com.sforce.soap._2006._04.metadata.FlowSubflow[] subflows,
           com.sforce.soap._2006._04.metadata.FlowTextTemplate[] textTemplates,
           com.sforce.soap._2006._04.metadata.FlowVariable[] variables,
           com.sforce.soap._2006._04.metadata.FlowWait[] waits) {
        super(
            fullName);
        this.actionCalls = actionCalls;
        this.apexPluginCalls = apexPluginCalls;
        this.assignments = assignments;
        this.choices = choices;
        this.constants = constants;
        this.decisions = decisions;
        this.description = description;
        this.dynamicChoiceSets = dynamicChoiceSets;
        this.formulas = formulas;
        this.interviewLabel = interviewLabel;
        this.label = label;
        this.loops = loops;
        this.processMetadataValues = processMetadataValues;
        this.processType = processType;
        this.recordCreates = recordCreates;
        this.recordDeletes = recordDeletes;
        this.recordLookups = recordLookups;
        this.recordUpdates = recordUpdates;
        this.screens = screens;
        this.startElementReference = startElementReference;
        this.steps = steps;
        this.subflows = subflows;
        this.textTemplates = textTemplates;
        this.variables = variables;
        this.waits = waits;
    }


    /**
     * Gets the actionCalls value for this Flow.
     * 
     * @return actionCalls
     */
    public com.sforce.soap._2006._04.metadata.FlowActionCall[] getActionCalls() {
        return actionCalls;
    }


    /**
     * Sets the actionCalls value for this Flow.
     * 
     * @param actionCalls
     */
    public void setActionCalls(com.sforce.soap._2006._04.metadata.FlowActionCall[] actionCalls) {
        this.actionCalls = actionCalls;
    }

    public com.sforce.soap._2006._04.metadata.FlowActionCall getActionCalls(int i) {
        return this.actionCalls[i];
    }

    public void setActionCalls(int i, com.sforce.soap._2006._04.metadata.FlowActionCall _value) {
        this.actionCalls[i] = _value;
    }


    /**
     * Gets the apexPluginCalls value for this Flow.
     * 
     * @return apexPluginCalls
     */
    public com.sforce.soap._2006._04.metadata.FlowApexPluginCall[] getApexPluginCalls() {
        return apexPluginCalls;
    }


    /**
     * Sets the apexPluginCalls value for this Flow.
     * 
     * @param apexPluginCalls
     */
    public void setApexPluginCalls(com.sforce.soap._2006._04.metadata.FlowApexPluginCall[] apexPluginCalls) {
        this.apexPluginCalls = apexPluginCalls;
    }

    public com.sforce.soap._2006._04.metadata.FlowApexPluginCall getApexPluginCalls(int i) {
        return this.apexPluginCalls[i];
    }

    public void setApexPluginCalls(int i, com.sforce.soap._2006._04.metadata.FlowApexPluginCall _value) {
        this.apexPluginCalls[i] = _value;
    }


    /**
     * Gets the assignments value for this Flow.
     * 
     * @return assignments
     */
    public com.sforce.soap._2006._04.metadata.FlowAssignment[] getAssignments() {
        return assignments;
    }


    /**
     * Sets the assignments value for this Flow.
     * 
     * @param assignments
     */
    public void setAssignments(com.sforce.soap._2006._04.metadata.FlowAssignment[] assignments) {
        this.assignments = assignments;
    }

    public com.sforce.soap._2006._04.metadata.FlowAssignment getAssignments(int i) {
        return this.assignments[i];
    }

    public void setAssignments(int i, com.sforce.soap._2006._04.metadata.FlowAssignment _value) {
        this.assignments[i] = _value;
    }


    /**
     * Gets the choices value for this Flow.
     * 
     * @return choices
     */
    public com.sforce.soap._2006._04.metadata.FlowChoice[] getChoices() {
        return choices;
    }


    /**
     * Sets the choices value for this Flow.
     * 
     * @param choices
     */
    public void setChoices(com.sforce.soap._2006._04.metadata.FlowChoice[] choices) {
        this.choices = choices;
    }

    public com.sforce.soap._2006._04.metadata.FlowChoice getChoices(int i) {
        return this.choices[i];
    }

    public void setChoices(int i, com.sforce.soap._2006._04.metadata.FlowChoice _value) {
        this.choices[i] = _value;
    }


    /**
     * Gets the constants value for this Flow.
     * 
     * @return constants
     */
    public com.sforce.soap._2006._04.metadata.FlowConstant[] getConstants() {
        return constants;
    }


    /**
     * Sets the constants value for this Flow.
     * 
     * @param constants
     */
    public void setConstants(com.sforce.soap._2006._04.metadata.FlowConstant[] constants) {
        this.constants = constants;
    }

    public com.sforce.soap._2006._04.metadata.FlowConstant getConstants(int i) {
        return this.constants[i];
    }

    public void setConstants(int i, com.sforce.soap._2006._04.metadata.FlowConstant _value) {
        this.constants[i] = _value;
    }


    /**
     * Gets the decisions value for this Flow.
     * 
     * @return decisions
     */
    public com.sforce.soap._2006._04.metadata.FlowDecision[] getDecisions() {
        return decisions;
    }


    /**
     * Sets the decisions value for this Flow.
     * 
     * @param decisions
     */
    public void setDecisions(com.sforce.soap._2006._04.metadata.FlowDecision[] decisions) {
        this.decisions = decisions;
    }

    public com.sforce.soap._2006._04.metadata.FlowDecision getDecisions(int i) {
        return this.decisions[i];
    }

    public void setDecisions(int i, com.sforce.soap._2006._04.metadata.FlowDecision _value) {
        this.decisions[i] = _value;
    }


    /**
     * Gets the description value for this Flow.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Flow.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dynamicChoiceSets value for this Flow.
     * 
     * @return dynamicChoiceSets
     */
    public com.sforce.soap._2006._04.metadata.FlowDynamicChoiceSet[] getDynamicChoiceSets() {
        return dynamicChoiceSets;
    }


    /**
     * Sets the dynamicChoiceSets value for this Flow.
     * 
     * @param dynamicChoiceSets
     */
    public void setDynamicChoiceSets(com.sforce.soap._2006._04.metadata.FlowDynamicChoiceSet[] dynamicChoiceSets) {
        this.dynamicChoiceSets = dynamicChoiceSets;
    }

    public com.sforce.soap._2006._04.metadata.FlowDynamicChoiceSet getDynamicChoiceSets(int i) {
        return this.dynamicChoiceSets[i];
    }

    public void setDynamicChoiceSets(int i, com.sforce.soap._2006._04.metadata.FlowDynamicChoiceSet _value) {
        this.dynamicChoiceSets[i] = _value;
    }


    /**
     * Gets the formulas value for this Flow.
     * 
     * @return formulas
     */
    public com.sforce.soap._2006._04.metadata.FlowFormula[] getFormulas() {
        return formulas;
    }


    /**
     * Sets the formulas value for this Flow.
     * 
     * @param formulas
     */
    public void setFormulas(com.sforce.soap._2006._04.metadata.FlowFormula[] formulas) {
        this.formulas = formulas;
    }

    public com.sforce.soap._2006._04.metadata.FlowFormula getFormulas(int i) {
        return this.formulas[i];
    }

    public void setFormulas(int i, com.sforce.soap._2006._04.metadata.FlowFormula _value) {
        this.formulas[i] = _value;
    }


    /**
     * Gets the interviewLabel value for this Flow.
     * 
     * @return interviewLabel
     */
    public java.lang.String getInterviewLabel() {
        return interviewLabel;
    }


    /**
     * Sets the interviewLabel value for this Flow.
     * 
     * @param interviewLabel
     */
    public void setInterviewLabel(java.lang.String interviewLabel) {
        this.interviewLabel = interviewLabel;
    }


    /**
     * Gets the label value for this Flow.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this Flow.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the loops value for this Flow.
     * 
     * @return loops
     */
    public com.sforce.soap._2006._04.metadata.FlowLoop[] getLoops() {
        return loops;
    }


    /**
     * Sets the loops value for this Flow.
     * 
     * @param loops
     */
    public void setLoops(com.sforce.soap._2006._04.metadata.FlowLoop[] loops) {
        this.loops = loops;
    }

    public com.sforce.soap._2006._04.metadata.FlowLoop getLoops(int i) {
        return this.loops[i];
    }

    public void setLoops(int i, com.sforce.soap._2006._04.metadata.FlowLoop _value) {
        this.loops[i] = _value;
    }


    /**
     * Gets the processMetadataValues value for this Flow.
     * 
     * @return processMetadataValues
     */
    public com.sforce.soap._2006._04.metadata.FlowMetadataValue[] getProcessMetadataValues() {
        return processMetadataValues;
    }


    /**
     * Sets the processMetadataValues value for this Flow.
     * 
     * @param processMetadataValues
     */
    public void setProcessMetadataValues(com.sforce.soap._2006._04.metadata.FlowMetadataValue[] processMetadataValues) {
        this.processMetadataValues = processMetadataValues;
    }

    public com.sforce.soap._2006._04.metadata.FlowMetadataValue getProcessMetadataValues(int i) {
        return this.processMetadataValues[i];
    }

    public void setProcessMetadataValues(int i, com.sforce.soap._2006._04.metadata.FlowMetadataValue _value) {
        this.processMetadataValues[i] = _value;
    }


    /**
     * Gets the processType value for this Flow.
     * 
     * @return processType
     */
    public com.sforce.soap._2006._04.metadata.FlowProcessType getProcessType() {
        return processType;
    }


    /**
     * Sets the processType value for this Flow.
     * 
     * @param processType
     */
    public void setProcessType(com.sforce.soap._2006._04.metadata.FlowProcessType processType) {
        this.processType = processType;
    }


    /**
     * Gets the recordCreates value for this Flow.
     * 
     * @return recordCreates
     */
    public com.sforce.soap._2006._04.metadata.FlowRecordCreate[] getRecordCreates() {
        return recordCreates;
    }


    /**
     * Sets the recordCreates value for this Flow.
     * 
     * @param recordCreates
     */
    public void setRecordCreates(com.sforce.soap._2006._04.metadata.FlowRecordCreate[] recordCreates) {
        this.recordCreates = recordCreates;
    }

    public com.sforce.soap._2006._04.metadata.FlowRecordCreate getRecordCreates(int i) {
        return this.recordCreates[i];
    }

    public void setRecordCreates(int i, com.sforce.soap._2006._04.metadata.FlowRecordCreate _value) {
        this.recordCreates[i] = _value;
    }


    /**
     * Gets the recordDeletes value for this Flow.
     * 
     * @return recordDeletes
     */
    public com.sforce.soap._2006._04.metadata.FlowRecordDelete[] getRecordDeletes() {
        return recordDeletes;
    }


    /**
     * Sets the recordDeletes value for this Flow.
     * 
     * @param recordDeletes
     */
    public void setRecordDeletes(com.sforce.soap._2006._04.metadata.FlowRecordDelete[] recordDeletes) {
        this.recordDeletes = recordDeletes;
    }

    public com.sforce.soap._2006._04.metadata.FlowRecordDelete getRecordDeletes(int i) {
        return this.recordDeletes[i];
    }

    public void setRecordDeletes(int i, com.sforce.soap._2006._04.metadata.FlowRecordDelete _value) {
        this.recordDeletes[i] = _value;
    }


    /**
     * Gets the recordLookups value for this Flow.
     * 
     * @return recordLookups
     */
    public com.sforce.soap._2006._04.metadata.FlowRecordLookup[] getRecordLookups() {
        return recordLookups;
    }


    /**
     * Sets the recordLookups value for this Flow.
     * 
     * @param recordLookups
     */
    public void setRecordLookups(com.sforce.soap._2006._04.metadata.FlowRecordLookup[] recordLookups) {
        this.recordLookups = recordLookups;
    }

    public com.sforce.soap._2006._04.metadata.FlowRecordLookup getRecordLookups(int i) {
        return this.recordLookups[i];
    }

    public void setRecordLookups(int i, com.sforce.soap._2006._04.metadata.FlowRecordLookup _value) {
        this.recordLookups[i] = _value;
    }


    /**
     * Gets the recordUpdates value for this Flow.
     * 
     * @return recordUpdates
     */
    public com.sforce.soap._2006._04.metadata.FlowRecordUpdate[] getRecordUpdates() {
        return recordUpdates;
    }


    /**
     * Sets the recordUpdates value for this Flow.
     * 
     * @param recordUpdates
     */
    public void setRecordUpdates(com.sforce.soap._2006._04.metadata.FlowRecordUpdate[] recordUpdates) {
        this.recordUpdates = recordUpdates;
    }

    public com.sforce.soap._2006._04.metadata.FlowRecordUpdate getRecordUpdates(int i) {
        return this.recordUpdates[i];
    }

    public void setRecordUpdates(int i, com.sforce.soap._2006._04.metadata.FlowRecordUpdate _value) {
        this.recordUpdates[i] = _value;
    }


    /**
     * Gets the screens value for this Flow.
     * 
     * @return screens
     */
    public com.sforce.soap._2006._04.metadata.FlowScreen[] getScreens() {
        return screens;
    }


    /**
     * Sets the screens value for this Flow.
     * 
     * @param screens
     */
    public void setScreens(com.sforce.soap._2006._04.metadata.FlowScreen[] screens) {
        this.screens = screens;
    }

    public com.sforce.soap._2006._04.metadata.FlowScreen getScreens(int i) {
        return this.screens[i];
    }

    public void setScreens(int i, com.sforce.soap._2006._04.metadata.FlowScreen _value) {
        this.screens[i] = _value;
    }


    /**
     * Gets the startElementReference value for this Flow.
     * 
     * @return startElementReference
     */
    public java.lang.String getStartElementReference() {
        return startElementReference;
    }


    /**
     * Sets the startElementReference value for this Flow.
     * 
     * @param startElementReference
     */
    public void setStartElementReference(java.lang.String startElementReference) {
        this.startElementReference = startElementReference;
    }


    /**
     * Gets the steps value for this Flow.
     * 
     * @return steps
     */
    public com.sforce.soap._2006._04.metadata.FlowStep[] getSteps() {
        return steps;
    }


    /**
     * Sets the steps value for this Flow.
     * 
     * @param steps
     */
    public void setSteps(com.sforce.soap._2006._04.metadata.FlowStep[] steps) {
        this.steps = steps;
    }

    public com.sforce.soap._2006._04.metadata.FlowStep getSteps(int i) {
        return this.steps[i];
    }

    public void setSteps(int i, com.sforce.soap._2006._04.metadata.FlowStep _value) {
        this.steps[i] = _value;
    }


    /**
     * Gets the subflows value for this Flow.
     * 
     * @return subflows
     */
    public com.sforce.soap._2006._04.metadata.FlowSubflow[] getSubflows() {
        return subflows;
    }


    /**
     * Sets the subflows value for this Flow.
     * 
     * @param subflows
     */
    public void setSubflows(com.sforce.soap._2006._04.metadata.FlowSubflow[] subflows) {
        this.subflows = subflows;
    }

    public com.sforce.soap._2006._04.metadata.FlowSubflow getSubflows(int i) {
        return this.subflows[i];
    }

    public void setSubflows(int i, com.sforce.soap._2006._04.metadata.FlowSubflow _value) {
        this.subflows[i] = _value;
    }


    /**
     * Gets the textTemplates value for this Flow.
     * 
     * @return textTemplates
     */
    public com.sforce.soap._2006._04.metadata.FlowTextTemplate[] getTextTemplates() {
        return textTemplates;
    }


    /**
     * Sets the textTemplates value for this Flow.
     * 
     * @param textTemplates
     */
    public void setTextTemplates(com.sforce.soap._2006._04.metadata.FlowTextTemplate[] textTemplates) {
        this.textTemplates = textTemplates;
    }

    public com.sforce.soap._2006._04.metadata.FlowTextTemplate getTextTemplates(int i) {
        return this.textTemplates[i];
    }

    public void setTextTemplates(int i, com.sforce.soap._2006._04.metadata.FlowTextTemplate _value) {
        this.textTemplates[i] = _value;
    }


    /**
     * Gets the variables value for this Flow.
     * 
     * @return variables
     */
    public com.sforce.soap._2006._04.metadata.FlowVariable[] getVariables() {
        return variables;
    }


    /**
     * Sets the variables value for this Flow.
     * 
     * @param variables
     */
    public void setVariables(com.sforce.soap._2006._04.metadata.FlowVariable[] variables) {
        this.variables = variables;
    }

    public com.sforce.soap._2006._04.metadata.FlowVariable getVariables(int i) {
        return this.variables[i];
    }

    public void setVariables(int i, com.sforce.soap._2006._04.metadata.FlowVariable _value) {
        this.variables[i] = _value;
    }


    /**
     * Gets the waits value for this Flow.
     * 
     * @return waits
     */
    public com.sforce.soap._2006._04.metadata.FlowWait[] getWaits() {
        return waits;
    }


    /**
     * Sets the waits value for this Flow.
     * 
     * @param waits
     */
    public void setWaits(com.sforce.soap._2006._04.metadata.FlowWait[] waits) {
        this.waits = waits;
    }

    public com.sforce.soap._2006._04.metadata.FlowWait getWaits(int i) {
        return this.waits[i];
    }

    public void setWaits(int i, com.sforce.soap._2006._04.metadata.FlowWait _value) {
        this.waits[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Flow)) return false;
        Flow other = (Flow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actionCalls==null && other.getActionCalls()==null) || 
             (this.actionCalls!=null &&
              java.util.Arrays.equals(this.actionCalls, other.getActionCalls()))) &&
            ((this.apexPluginCalls==null && other.getApexPluginCalls()==null) || 
             (this.apexPluginCalls!=null &&
              java.util.Arrays.equals(this.apexPluginCalls, other.getApexPluginCalls()))) &&
            ((this.assignments==null && other.getAssignments()==null) || 
             (this.assignments!=null &&
              java.util.Arrays.equals(this.assignments, other.getAssignments()))) &&
            ((this.choices==null && other.getChoices()==null) || 
             (this.choices!=null &&
              java.util.Arrays.equals(this.choices, other.getChoices()))) &&
            ((this.constants==null && other.getConstants()==null) || 
             (this.constants!=null &&
              java.util.Arrays.equals(this.constants, other.getConstants()))) &&
            ((this.decisions==null && other.getDecisions()==null) || 
             (this.decisions!=null &&
              java.util.Arrays.equals(this.decisions, other.getDecisions()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dynamicChoiceSets==null && other.getDynamicChoiceSets()==null) || 
             (this.dynamicChoiceSets!=null &&
              java.util.Arrays.equals(this.dynamicChoiceSets, other.getDynamicChoiceSets()))) &&
            ((this.formulas==null && other.getFormulas()==null) || 
             (this.formulas!=null &&
              java.util.Arrays.equals(this.formulas, other.getFormulas()))) &&
            ((this.interviewLabel==null && other.getInterviewLabel()==null) || 
             (this.interviewLabel!=null &&
              this.interviewLabel.equals(other.getInterviewLabel()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.loops==null && other.getLoops()==null) || 
             (this.loops!=null &&
              java.util.Arrays.equals(this.loops, other.getLoops()))) &&
            ((this.processMetadataValues==null && other.getProcessMetadataValues()==null) || 
             (this.processMetadataValues!=null &&
              java.util.Arrays.equals(this.processMetadataValues, other.getProcessMetadataValues()))) &&
            ((this.processType==null && other.getProcessType()==null) || 
             (this.processType!=null &&
              this.processType.equals(other.getProcessType()))) &&
            ((this.recordCreates==null && other.getRecordCreates()==null) || 
             (this.recordCreates!=null &&
              java.util.Arrays.equals(this.recordCreates, other.getRecordCreates()))) &&
            ((this.recordDeletes==null && other.getRecordDeletes()==null) || 
             (this.recordDeletes!=null &&
              java.util.Arrays.equals(this.recordDeletes, other.getRecordDeletes()))) &&
            ((this.recordLookups==null && other.getRecordLookups()==null) || 
             (this.recordLookups!=null &&
              java.util.Arrays.equals(this.recordLookups, other.getRecordLookups()))) &&
            ((this.recordUpdates==null && other.getRecordUpdates()==null) || 
             (this.recordUpdates!=null &&
              java.util.Arrays.equals(this.recordUpdates, other.getRecordUpdates()))) &&
            ((this.screens==null && other.getScreens()==null) || 
             (this.screens!=null &&
              java.util.Arrays.equals(this.screens, other.getScreens()))) &&
            ((this.startElementReference==null && other.getStartElementReference()==null) || 
             (this.startElementReference!=null &&
              this.startElementReference.equals(other.getStartElementReference()))) &&
            ((this.steps==null && other.getSteps()==null) || 
             (this.steps!=null &&
              java.util.Arrays.equals(this.steps, other.getSteps()))) &&
            ((this.subflows==null && other.getSubflows()==null) || 
             (this.subflows!=null &&
              java.util.Arrays.equals(this.subflows, other.getSubflows()))) &&
            ((this.textTemplates==null && other.getTextTemplates()==null) || 
             (this.textTemplates!=null &&
              java.util.Arrays.equals(this.textTemplates, other.getTextTemplates()))) &&
            ((this.variables==null && other.getVariables()==null) || 
             (this.variables!=null &&
              java.util.Arrays.equals(this.variables, other.getVariables()))) &&
            ((this.waits==null && other.getWaits()==null) || 
             (this.waits!=null &&
              java.util.Arrays.equals(this.waits, other.getWaits())));
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
        if (getActionCalls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActionCalls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActionCalls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApexPluginCalls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApexPluginCalls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApexPluginCalls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssignments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChoices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChoices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChoices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConstants() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConstants());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConstants(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDecisions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDecisions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDecisions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDynamicChoiceSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDynamicChoiceSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDynamicChoiceSets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormulas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFormulas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFormulas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInterviewLabel() != null) {
            _hashCode += getInterviewLabel().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLoops() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLoops());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLoops(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProcessMetadataValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcessMetadataValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcessMetadataValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProcessType() != null) {
            _hashCode += getProcessType().hashCode();
        }
        if (getRecordCreates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordCreates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordCreates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordDeletes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordDeletes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordDeletes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordLookups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordLookups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordLookups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecordUpdates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecordUpdates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecordUpdates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScreens() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScreens());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScreens(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartElementReference() != null) {
            _hashCode += getStartElementReference().hashCode();
        }
        if (getSteps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSteps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSteps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubflows() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubflows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubflows(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTextTemplates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTextTemplates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTextTemplates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVariables() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariables());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariables(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWaits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWaits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWaits(), i);
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
        new org.apache.axis.description.TypeDesc(Flow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Flow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "actionCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowActionCall"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apexPluginCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "apexPluginCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowApexPluginCall"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "assignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowAssignment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("choices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "choices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowChoice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constants");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "constants"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowConstant"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decisions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "decisions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowDecision"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicChoiceSets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dynamicChoiceSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowDynamicChoiceSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formulas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "formulas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowFormula"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interviewLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "interviewLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("loops");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "loops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowLoop"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processMetadataValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "processMetadataValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowMetadataValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "processType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowProcessType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordCreates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recordCreates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRecordCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordDeletes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recordDeletes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRecordDelete"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordLookups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recordLookups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRecordLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordUpdates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "recordUpdates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowRecordUpdate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screens");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "screens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowScreen"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startElementReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "startElementReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "steps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowStep"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subflows");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "subflows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowSubflow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textTemplates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "textTemplates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowTextTemplate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variables");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "variables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowVariable"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "waits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "FlowWait"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
