/**
 * Report.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class Report  extends com.sforce.soap._2006._04.metadata.Metadata  implements java.io.Serializable {
    private com.sforce.soap._2006._04.metadata.ReportAggregate[] aggregates;

    private com.sforce.soap._2006._04.metadata.Report[] block;

    private com.sforce.soap._2006._04.metadata.ReportBlockInfo blockInfo;

    private com.sforce.soap._2006._04.metadata.ReportBucketField[] buckets;

    private com.sforce.soap._2006._04.metadata.ReportChart chart;

    private com.sforce.soap._2006._04.metadata.ReportColorRange[] colorRanges;

    private com.sforce.soap._2006._04.metadata.ReportColumn[] columns;

    private com.sforce.soap._2006._04.metadata.ReportCrossFilter[] crossFilters;

    private com.sforce.soap._2006._04.metadata.CurrencyIsoCode currency;

    private com.sforce.soap._2006._04.metadata.ReportDataCategoryFilter[] dataCategoryFilters;

    private java.lang.String description;

    private java.lang.String division;

    private com.sforce.soap._2006._04.metadata.ReportFilter filter;

    private com.sforce.soap._2006._04.metadata.ReportFormat format;

    private com.sforce.soap._2006._04.metadata.ReportGrouping[] groupingsAcross;

    private com.sforce.soap._2006._04.metadata.ReportGrouping[] groupingsDown;

    private java.lang.String[] historicalSelector;

    private java.lang.String name;

    private com.sforce.soap._2006._04.metadata.ReportParam[] params;

    private java.lang.String reportType;

    private java.lang.String roleHierarchyFilter;

    private java.lang.Integer rowLimit;

    private java.lang.String scope;

    private java.lang.Boolean showCurrentDate;

    private java.lang.Boolean showDetails;

    private java.lang.String sortColumn;

    private com.sforce.soap._2006._04.metadata.SortOrder sortOrder;

    private java.lang.String territoryHierarchyFilter;

    private com.sforce.soap._2006._04.metadata.ReportTimeFrameFilter timeFrameFilter;

    private java.lang.String userFilter;

    public Report() {
    }

    public Report(
           java.lang.String fullName,
           com.sforce.soap._2006._04.metadata.ReportAggregate[] aggregates,
           com.sforce.soap._2006._04.metadata.Report[] block,
           com.sforce.soap._2006._04.metadata.ReportBlockInfo blockInfo,
           com.sforce.soap._2006._04.metadata.ReportBucketField[] buckets,
           com.sforce.soap._2006._04.metadata.ReportChart chart,
           com.sforce.soap._2006._04.metadata.ReportColorRange[] colorRanges,
           com.sforce.soap._2006._04.metadata.ReportColumn[] columns,
           com.sforce.soap._2006._04.metadata.ReportCrossFilter[] crossFilters,
           com.sforce.soap._2006._04.metadata.CurrencyIsoCode currency,
           com.sforce.soap._2006._04.metadata.ReportDataCategoryFilter[] dataCategoryFilters,
           java.lang.String description,
           java.lang.String division,
           com.sforce.soap._2006._04.metadata.ReportFilter filter,
           com.sforce.soap._2006._04.metadata.ReportFormat format,
           com.sforce.soap._2006._04.metadata.ReportGrouping[] groupingsAcross,
           com.sforce.soap._2006._04.metadata.ReportGrouping[] groupingsDown,
           java.lang.String[] historicalSelector,
           java.lang.String name,
           com.sforce.soap._2006._04.metadata.ReportParam[] params,
           java.lang.String reportType,
           java.lang.String roleHierarchyFilter,
           java.lang.Integer rowLimit,
           java.lang.String scope,
           java.lang.Boolean showCurrentDate,
           java.lang.Boolean showDetails,
           java.lang.String sortColumn,
           com.sforce.soap._2006._04.metadata.SortOrder sortOrder,
           java.lang.String territoryHierarchyFilter,
           com.sforce.soap._2006._04.metadata.ReportTimeFrameFilter timeFrameFilter,
           java.lang.String userFilter) {
        super(
            fullName);
        this.aggregates = aggregates;
        this.block = block;
        this.blockInfo = blockInfo;
        this.buckets = buckets;
        this.chart = chart;
        this.colorRanges = colorRanges;
        this.columns = columns;
        this.crossFilters = crossFilters;
        this.currency = currency;
        this.dataCategoryFilters = dataCategoryFilters;
        this.description = description;
        this.division = division;
        this.filter = filter;
        this.format = format;
        this.groupingsAcross = groupingsAcross;
        this.groupingsDown = groupingsDown;
        this.historicalSelector = historicalSelector;
        this.name = name;
        this.params = params;
        this.reportType = reportType;
        this.roleHierarchyFilter = roleHierarchyFilter;
        this.rowLimit = rowLimit;
        this.scope = scope;
        this.showCurrentDate = showCurrentDate;
        this.showDetails = showDetails;
        this.sortColumn = sortColumn;
        this.sortOrder = sortOrder;
        this.territoryHierarchyFilter = territoryHierarchyFilter;
        this.timeFrameFilter = timeFrameFilter;
        this.userFilter = userFilter;
    }


    /**
     * Gets the aggregates value for this Report.
     * 
     * @return aggregates
     */
    public com.sforce.soap._2006._04.metadata.ReportAggregate[] getAggregates() {
        return aggregates;
    }


    /**
     * Sets the aggregates value for this Report.
     * 
     * @param aggregates
     */
    public void setAggregates(com.sforce.soap._2006._04.metadata.ReportAggregate[] aggregates) {
        this.aggregates = aggregates;
    }

    public com.sforce.soap._2006._04.metadata.ReportAggregate getAggregates(int i) {
        return this.aggregates[i];
    }

    public void setAggregates(int i, com.sforce.soap._2006._04.metadata.ReportAggregate _value) {
        this.aggregates[i] = _value;
    }


    /**
     * Gets the block value for this Report.
     * 
     * @return block
     */
    public com.sforce.soap._2006._04.metadata.Report[] getBlock() {
        return block;
    }


    /**
     * Sets the block value for this Report.
     * 
     * @param block
     */
    public void setBlock(com.sforce.soap._2006._04.metadata.Report[] block) {
        this.block = block;
    }

    public com.sforce.soap._2006._04.metadata.Report getBlock(int i) {
        return this.block[i];
    }

    public void setBlock(int i, com.sforce.soap._2006._04.metadata.Report _value) {
        this.block[i] = _value;
    }


    /**
     * Gets the blockInfo value for this Report.
     * 
     * @return blockInfo
     */
    public com.sforce.soap._2006._04.metadata.ReportBlockInfo getBlockInfo() {
        return blockInfo;
    }


    /**
     * Sets the blockInfo value for this Report.
     * 
     * @param blockInfo
     */
    public void setBlockInfo(com.sforce.soap._2006._04.metadata.ReportBlockInfo blockInfo) {
        this.blockInfo = blockInfo;
    }


    /**
     * Gets the buckets value for this Report.
     * 
     * @return buckets
     */
    public com.sforce.soap._2006._04.metadata.ReportBucketField[] getBuckets() {
        return buckets;
    }


    /**
     * Sets the buckets value for this Report.
     * 
     * @param buckets
     */
    public void setBuckets(com.sforce.soap._2006._04.metadata.ReportBucketField[] buckets) {
        this.buckets = buckets;
    }

    public com.sforce.soap._2006._04.metadata.ReportBucketField getBuckets(int i) {
        return this.buckets[i];
    }

    public void setBuckets(int i, com.sforce.soap._2006._04.metadata.ReportBucketField _value) {
        this.buckets[i] = _value;
    }


    /**
     * Gets the chart value for this Report.
     * 
     * @return chart
     */
    public com.sforce.soap._2006._04.metadata.ReportChart getChart() {
        return chart;
    }


    /**
     * Sets the chart value for this Report.
     * 
     * @param chart
     */
    public void setChart(com.sforce.soap._2006._04.metadata.ReportChart chart) {
        this.chart = chart;
    }


    /**
     * Gets the colorRanges value for this Report.
     * 
     * @return colorRanges
     */
    public com.sforce.soap._2006._04.metadata.ReportColorRange[] getColorRanges() {
        return colorRanges;
    }


    /**
     * Sets the colorRanges value for this Report.
     * 
     * @param colorRanges
     */
    public void setColorRanges(com.sforce.soap._2006._04.metadata.ReportColorRange[] colorRanges) {
        this.colorRanges = colorRanges;
    }

    public com.sforce.soap._2006._04.metadata.ReportColorRange getColorRanges(int i) {
        return this.colorRanges[i];
    }

    public void setColorRanges(int i, com.sforce.soap._2006._04.metadata.ReportColorRange _value) {
        this.colorRanges[i] = _value;
    }


    /**
     * Gets the columns value for this Report.
     * 
     * @return columns
     */
    public com.sforce.soap._2006._04.metadata.ReportColumn[] getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this Report.
     * 
     * @param columns
     */
    public void setColumns(com.sforce.soap._2006._04.metadata.ReportColumn[] columns) {
        this.columns = columns;
    }

    public com.sforce.soap._2006._04.metadata.ReportColumn getColumns(int i) {
        return this.columns[i];
    }

    public void setColumns(int i, com.sforce.soap._2006._04.metadata.ReportColumn _value) {
        this.columns[i] = _value;
    }


    /**
     * Gets the crossFilters value for this Report.
     * 
     * @return crossFilters
     */
    public com.sforce.soap._2006._04.metadata.ReportCrossFilter[] getCrossFilters() {
        return crossFilters;
    }


    /**
     * Sets the crossFilters value for this Report.
     * 
     * @param crossFilters
     */
    public void setCrossFilters(com.sforce.soap._2006._04.metadata.ReportCrossFilter[] crossFilters) {
        this.crossFilters = crossFilters;
    }

    public com.sforce.soap._2006._04.metadata.ReportCrossFilter getCrossFilters(int i) {
        return this.crossFilters[i];
    }

    public void setCrossFilters(int i, com.sforce.soap._2006._04.metadata.ReportCrossFilter _value) {
        this.crossFilters[i] = _value;
    }


    /**
     * Gets the currency value for this Report.
     * 
     * @return currency
     */
    public com.sforce.soap._2006._04.metadata.CurrencyIsoCode getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Report.
     * 
     * @param currency
     */
    public void setCurrency(com.sforce.soap._2006._04.metadata.CurrencyIsoCode currency) {
        this.currency = currency;
    }


    /**
     * Gets the dataCategoryFilters value for this Report.
     * 
     * @return dataCategoryFilters
     */
    public com.sforce.soap._2006._04.metadata.ReportDataCategoryFilter[] getDataCategoryFilters() {
        return dataCategoryFilters;
    }


    /**
     * Sets the dataCategoryFilters value for this Report.
     * 
     * @param dataCategoryFilters
     */
    public void setDataCategoryFilters(com.sforce.soap._2006._04.metadata.ReportDataCategoryFilter[] dataCategoryFilters) {
        this.dataCategoryFilters = dataCategoryFilters;
    }

    public com.sforce.soap._2006._04.metadata.ReportDataCategoryFilter getDataCategoryFilters(int i) {
        return this.dataCategoryFilters[i];
    }

    public void setDataCategoryFilters(int i, com.sforce.soap._2006._04.metadata.ReportDataCategoryFilter _value) {
        this.dataCategoryFilters[i] = _value;
    }


    /**
     * Gets the description value for this Report.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Report.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the division value for this Report.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this Report.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the filter value for this Report.
     * 
     * @return filter
     */
    public com.sforce.soap._2006._04.metadata.ReportFilter getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this Report.
     * 
     * @param filter
     */
    public void setFilter(com.sforce.soap._2006._04.metadata.ReportFilter filter) {
        this.filter = filter;
    }


    /**
     * Gets the format value for this Report.
     * 
     * @return format
     */
    public com.sforce.soap._2006._04.metadata.ReportFormat getFormat() {
        return format;
    }


    /**
     * Sets the format value for this Report.
     * 
     * @param format
     */
    public void setFormat(com.sforce.soap._2006._04.metadata.ReportFormat format) {
        this.format = format;
    }


    /**
     * Gets the groupingsAcross value for this Report.
     * 
     * @return groupingsAcross
     */
    public com.sforce.soap._2006._04.metadata.ReportGrouping[] getGroupingsAcross() {
        return groupingsAcross;
    }


    /**
     * Sets the groupingsAcross value for this Report.
     * 
     * @param groupingsAcross
     */
    public void setGroupingsAcross(com.sforce.soap._2006._04.metadata.ReportGrouping[] groupingsAcross) {
        this.groupingsAcross = groupingsAcross;
    }

    public com.sforce.soap._2006._04.metadata.ReportGrouping getGroupingsAcross(int i) {
        return this.groupingsAcross[i];
    }

    public void setGroupingsAcross(int i, com.sforce.soap._2006._04.metadata.ReportGrouping _value) {
        this.groupingsAcross[i] = _value;
    }


    /**
     * Gets the groupingsDown value for this Report.
     * 
     * @return groupingsDown
     */
    public com.sforce.soap._2006._04.metadata.ReportGrouping[] getGroupingsDown() {
        return groupingsDown;
    }


    /**
     * Sets the groupingsDown value for this Report.
     * 
     * @param groupingsDown
     */
    public void setGroupingsDown(com.sforce.soap._2006._04.metadata.ReportGrouping[] groupingsDown) {
        this.groupingsDown = groupingsDown;
    }

    public com.sforce.soap._2006._04.metadata.ReportGrouping getGroupingsDown(int i) {
        return this.groupingsDown[i];
    }

    public void setGroupingsDown(int i, com.sforce.soap._2006._04.metadata.ReportGrouping _value) {
        this.groupingsDown[i] = _value;
    }


    /**
     * Gets the historicalSelector value for this Report.
     * 
     * @return historicalSelector
     */
    public java.lang.String[] getHistoricalSelector() {
        return historicalSelector;
    }


    /**
     * Sets the historicalSelector value for this Report.
     * 
     * @param historicalSelector
     */
    public void setHistoricalSelector(java.lang.String[] historicalSelector) {
        this.historicalSelector = historicalSelector;
    }


    /**
     * Gets the name value for this Report.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Report.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the params value for this Report.
     * 
     * @return params
     */
    public com.sforce.soap._2006._04.metadata.ReportParam[] getParams() {
        return params;
    }


    /**
     * Sets the params value for this Report.
     * 
     * @param params
     */
    public void setParams(com.sforce.soap._2006._04.metadata.ReportParam[] params) {
        this.params = params;
    }

    public com.sforce.soap._2006._04.metadata.ReportParam getParams(int i) {
        return this.params[i];
    }

    public void setParams(int i, com.sforce.soap._2006._04.metadata.ReportParam _value) {
        this.params[i] = _value;
    }


    /**
     * Gets the reportType value for this Report.
     * 
     * @return reportType
     */
    public java.lang.String getReportType() {
        return reportType;
    }


    /**
     * Sets the reportType value for this Report.
     * 
     * @param reportType
     */
    public void setReportType(java.lang.String reportType) {
        this.reportType = reportType;
    }


    /**
     * Gets the roleHierarchyFilter value for this Report.
     * 
     * @return roleHierarchyFilter
     */
    public java.lang.String getRoleHierarchyFilter() {
        return roleHierarchyFilter;
    }


    /**
     * Sets the roleHierarchyFilter value for this Report.
     * 
     * @param roleHierarchyFilter
     */
    public void setRoleHierarchyFilter(java.lang.String roleHierarchyFilter) {
        this.roleHierarchyFilter = roleHierarchyFilter;
    }


    /**
     * Gets the rowLimit value for this Report.
     * 
     * @return rowLimit
     */
    public java.lang.Integer getRowLimit() {
        return rowLimit;
    }


    /**
     * Sets the rowLimit value for this Report.
     * 
     * @param rowLimit
     */
    public void setRowLimit(java.lang.Integer rowLimit) {
        this.rowLimit = rowLimit;
    }


    /**
     * Gets the scope value for this Report.
     * 
     * @return scope
     */
    public java.lang.String getScope() {
        return scope;
    }


    /**
     * Sets the scope value for this Report.
     * 
     * @param scope
     */
    public void setScope(java.lang.String scope) {
        this.scope = scope;
    }


    /**
     * Gets the showCurrentDate value for this Report.
     * 
     * @return showCurrentDate
     */
    public java.lang.Boolean getShowCurrentDate() {
        return showCurrentDate;
    }


    /**
     * Sets the showCurrentDate value for this Report.
     * 
     * @param showCurrentDate
     */
    public void setShowCurrentDate(java.lang.Boolean showCurrentDate) {
        this.showCurrentDate = showCurrentDate;
    }


    /**
     * Gets the showDetails value for this Report.
     * 
     * @return showDetails
     */
    public java.lang.Boolean getShowDetails() {
        return showDetails;
    }


    /**
     * Sets the showDetails value for this Report.
     * 
     * @param showDetails
     */
    public void setShowDetails(java.lang.Boolean showDetails) {
        this.showDetails = showDetails;
    }


    /**
     * Gets the sortColumn value for this Report.
     * 
     * @return sortColumn
     */
    public java.lang.String getSortColumn() {
        return sortColumn;
    }


    /**
     * Sets the sortColumn value for this Report.
     * 
     * @param sortColumn
     */
    public void setSortColumn(java.lang.String sortColumn) {
        this.sortColumn = sortColumn;
    }


    /**
     * Gets the sortOrder value for this Report.
     * 
     * @return sortOrder
     */
    public com.sforce.soap._2006._04.metadata.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this Report.
     * 
     * @param sortOrder
     */
    public void setSortOrder(com.sforce.soap._2006._04.metadata.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the territoryHierarchyFilter value for this Report.
     * 
     * @return territoryHierarchyFilter
     */
    public java.lang.String getTerritoryHierarchyFilter() {
        return territoryHierarchyFilter;
    }


    /**
     * Sets the territoryHierarchyFilter value for this Report.
     * 
     * @param territoryHierarchyFilter
     */
    public void setTerritoryHierarchyFilter(java.lang.String territoryHierarchyFilter) {
        this.territoryHierarchyFilter = territoryHierarchyFilter;
    }


    /**
     * Gets the timeFrameFilter value for this Report.
     * 
     * @return timeFrameFilter
     */
    public com.sforce.soap._2006._04.metadata.ReportTimeFrameFilter getTimeFrameFilter() {
        return timeFrameFilter;
    }


    /**
     * Sets the timeFrameFilter value for this Report.
     * 
     * @param timeFrameFilter
     */
    public void setTimeFrameFilter(com.sforce.soap._2006._04.metadata.ReportTimeFrameFilter timeFrameFilter) {
        this.timeFrameFilter = timeFrameFilter;
    }


    /**
     * Gets the userFilter value for this Report.
     * 
     * @return userFilter
     */
    public java.lang.String getUserFilter() {
        return userFilter;
    }


    /**
     * Sets the userFilter value for this Report.
     * 
     * @param userFilter
     */
    public void setUserFilter(java.lang.String userFilter) {
        this.userFilter = userFilter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Report)) return false;
        Report other = (Report) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.aggregates==null && other.getAggregates()==null) || 
             (this.aggregates!=null &&
              java.util.Arrays.equals(this.aggregates, other.getAggregates()))) &&
            ((this.block==null && other.getBlock()==null) || 
             (this.block!=null &&
              java.util.Arrays.equals(this.block, other.getBlock()))) &&
            ((this.blockInfo==null && other.getBlockInfo()==null) || 
             (this.blockInfo!=null &&
              this.blockInfo.equals(other.getBlockInfo()))) &&
            ((this.buckets==null && other.getBuckets()==null) || 
             (this.buckets!=null &&
              java.util.Arrays.equals(this.buckets, other.getBuckets()))) &&
            ((this.chart==null && other.getChart()==null) || 
             (this.chart!=null &&
              this.chart.equals(other.getChart()))) &&
            ((this.colorRanges==null && other.getColorRanges()==null) || 
             (this.colorRanges!=null &&
              java.util.Arrays.equals(this.colorRanges, other.getColorRanges()))) &&
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              java.util.Arrays.equals(this.columns, other.getColumns()))) &&
            ((this.crossFilters==null && other.getCrossFilters()==null) || 
             (this.crossFilters!=null &&
              java.util.Arrays.equals(this.crossFilters, other.getCrossFilters()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.dataCategoryFilters==null && other.getDataCategoryFilters()==null) || 
             (this.dataCategoryFilters!=null &&
              java.util.Arrays.equals(this.dataCategoryFilters, other.getDataCategoryFilters()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.division==null && other.getDivision()==null) || 
             (this.division!=null &&
              this.division.equals(other.getDivision()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.groupingsAcross==null && other.getGroupingsAcross()==null) || 
             (this.groupingsAcross!=null &&
              java.util.Arrays.equals(this.groupingsAcross, other.getGroupingsAcross()))) &&
            ((this.groupingsDown==null && other.getGroupingsDown()==null) || 
             (this.groupingsDown!=null &&
              java.util.Arrays.equals(this.groupingsDown, other.getGroupingsDown()))) &&
            ((this.historicalSelector==null && other.getHistoricalSelector()==null) || 
             (this.historicalSelector!=null &&
              java.util.Arrays.equals(this.historicalSelector, other.getHistoricalSelector()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.params==null && other.getParams()==null) || 
             (this.params!=null &&
              java.util.Arrays.equals(this.params, other.getParams()))) &&
            ((this.reportType==null && other.getReportType()==null) || 
             (this.reportType!=null &&
              this.reportType.equals(other.getReportType()))) &&
            ((this.roleHierarchyFilter==null && other.getRoleHierarchyFilter()==null) || 
             (this.roleHierarchyFilter!=null &&
              this.roleHierarchyFilter.equals(other.getRoleHierarchyFilter()))) &&
            ((this.rowLimit==null && other.getRowLimit()==null) || 
             (this.rowLimit!=null &&
              this.rowLimit.equals(other.getRowLimit()))) &&
            ((this.scope==null && other.getScope()==null) || 
             (this.scope!=null &&
              this.scope.equals(other.getScope()))) &&
            ((this.showCurrentDate==null && other.getShowCurrentDate()==null) || 
             (this.showCurrentDate!=null &&
              this.showCurrentDate.equals(other.getShowCurrentDate()))) &&
            ((this.showDetails==null && other.getShowDetails()==null) || 
             (this.showDetails!=null &&
              this.showDetails.equals(other.getShowDetails()))) &&
            ((this.sortColumn==null && other.getSortColumn()==null) || 
             (this.sortColumn!=null &&
              this.sortColumn.equals(other.getSortColumn()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.territoryHierarchyFilter==null && other.getTerritoryHierarchyFilter()==null) || 
             (this.territoryHierarchyFilter!=null &&
              this.territoryHierarchyFilter.equals(other.getTerritoryHierarchyFilter()))) &&
            ((this.timeFrameFilter==null && other.getTimeFrameFilter()==null) || 
             (this.timeFrameFilter!=null &&
              this.timeFrameFilter.equals(other.getTimeFrameFilter()))) &&
            ((this.userFilter==null && other.getUserFilter()==null) || 
             (this.userFilter!=null &&
              this.userFilter.equals(other.getUserFilter())));
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
        if (getAggregates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAggregates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAggregates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBlock() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlock());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlock(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBlockInfo() != null) {
            _hashCode += getBlockInfo().hashCode();
        }
        if (getBuckets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuckets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuckets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChart() != null) {
            _hashCode += getChart().hashCode();
        }
        if (getColorRanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColorRanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColorRanges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCrossFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrossFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrossFilters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDataCategoryFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataCategoryFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataCategoryFilters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDivision() != null) {
            _hashCode += getDivision().hashCode();
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getGroupingsAcross() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupingsAcross());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupingsAcross(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroupingsDown() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupingsDown());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupingsDown(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHistoricalSelector() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistoricalSelector());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistoricalSelector(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReportType() != null) {
            _hashCode += getReportType().hashCode();
        }
        if (getRoleHierarchyFilter() != null) {
            _hashCode += getRoleHierarchyFilter().hashCode();
        }
        if (getRowLimit() != null) {
            _hashCode += getRowLimit().hashCode();
        }
        if (getScope() != null) {
            _hashCode += getScope().hashCode();
        }
        if (getShowCurrentDate() != null) {
            _hashCode += getShowCurrentDate().hashCode();
        }
        if (getShowDetails() != null) {
            _hashCode += getShowDetails().hashCode();
        }
        if (getSortColumn() != null) {
            _hashCode += getSortColumn().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getTerritoryHierarchyFilter() != null) {
            _hashCode += getTerritoryHierarchyFilter().hashCode();
        }
        if (getTimeFrameFilter() != null) {
            _hashCode += getTimeFrameFilter().hashCode();
        }
        if (getUserFilter() != null) {
            _hashCode += getUserFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Report.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Report"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "aggregates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportAggregate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("block");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "block"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "Report"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "blockInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportBlockInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buckets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "buckets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportBucketField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "chart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportChart"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colorRanges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "colorRanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportColorRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportColumn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crossFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "crossFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportCrossFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "CurrencyIsoCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCategoryFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "dataCategoryFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportDataCategoryFilter"));
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
        elemField.setFieldName("division");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportFormat"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupingsAcross");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "groupingsAcross"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportGrouping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupingsDown");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "groupingsDown"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportGrouping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historicalSelector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "historicalSelector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "snapshot"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("params");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "params"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportParam"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "reportType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleHierarchyFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "roleHierarchyFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "rowLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showCurrentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showCurrentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "showDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sortColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SortOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territoryHierarchyFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "territoryHierarchyFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeFrameFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "timeFrameFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "ReportTimeFrameFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "userFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
