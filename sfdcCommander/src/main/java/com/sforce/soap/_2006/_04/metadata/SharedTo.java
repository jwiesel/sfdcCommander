/**
 * SharedTo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2006._04.metadata;

public class SharedTo  implements java.io.Serializable {
    private java.lang.String allCustomerPortalUsers;

    private java.lang.String allInternalUsers;

    private java.lang.String allPartnerUsers;

    private java.lang.String[] group;

    private java.lang.String[] groups;

    private java.lang.String[] managerSubordinates;

    private java.lang.String[] managers;

    private java.lang.String[] portalRole;

    private java.lang.String[] portalRoleAndSubordinates;

    private java.lang.String[] queue;

    private java.lang.String[] role;

    private java.lang.String[] roleAndSubordinates;

    private java.lang.String[] roleAndSubordinatesInternal;

    private java.lang.String[] roles;

    private java.lang.String[] rolesAndSubordinates;

    private java.lang.String[] territories;

    private java.lang.String[] territoriesAndSubordinates;

    private java.lang.String[] territory;

    private java.lang.String[] territoryAndSubordinates;

    public SharedTo() {
    }

    public SharedTo(
           java.lang.String allCustomerPortalUsers,
           java.lang.String allInternalUsers,
           java.lang.String allPartnerUsers,
           java.lang.String[] group,
           java.lang.String[] groups,
           java.lang.String[] managerSubordinates,
           java.lang.String[] managers,
           java.lang.String[] portalRole,
           java.lang.String[] portalRoleAndSubordinates,
           java.lang.String[] queue,
           java.lang.String[] role,
           java.lang.String[] roleAndSubordinates,
           java.lang.String[] roleAndSubordinatesInternal,
           java.lang.String[] roles,
           java.lang.String[] rolesAndSubordinates,
           java.lang.String[] territories,
           java.lang.String[] territoriesAndSubordinates,
           java.lang.String[] territory,
           java.lang.String[] territoryAndSubordinates) {
           this.allCustomerPortalUsers = allCustomerPortalUsers;
           this.allInternalUsers = allInternalUsers;
           this.allPartnerUsers = allPartnerUsers;
           this.group = group;
           this.groups = groups;
           this.managerSubordinates = managerSubordinates;
           this.managers = managers;
           this.portalRole = portalRole;
           this.portalRoleAndSubordinates = portalRoleAndSubordinates;
           this.queue = queue;
           this.role = role;
           this.roleAndSubordinates = roleAndSubordinates;
           this.roleAndSubordinatesInternal = roleAndSubordinatesInternal;
           this.roles = roles;
           this.rolesAndSubordinates = rolesAndSubordinates;
           this.territories = territories;
           this.territoriesAndSubordinates = territoriesAndSubordinates;
           this.territory = territory;
           this.territoryAndSubordinates = territoryAndSubordinates;
    }


    /**
     * Gets the allCustomerPortalUsers value for this SharedTo.
     * 
     * @return allCustomerPortalUsers
     */
    public java.lang.String getAllCustomerPortalUsers() {
        return allCustomerPortalUsers;
    }


    /**
     * Sets the allCustomerPortalUsers value for this SharedTo.
     * 
     * @param allCustomerPortalUsers
     */
    public void setAllCustomerPortalUsers(java.lang.String allCustomerPortalUsers) {
        this.allCustomerPortalUsers = allCustomerPortalUsers;
    }


    /**
     * Gets the allInternalUsers value for this SharedTo.
     * 
     * @return allInternalUsers
     */
    public java.lang.String getAllInternalUsers() {
        return allInternalUsers;
    }


    /**
     * Sets the allInternalUsers value for this SharedTo.
     * 
     * @param allInternalUsers
     */
    public void setAllInternalUsers(java.lang.String allInternalUsers) {
        this.allInternalUsers = allInternalUsers;
    }


    /**
     * Gets the allPartnerUsers value for this SharedTo.
     * 
     * @return allPartnerUsers
     */
    public java.lang.String getAllPartnerUsers() {
        return allPartnerUsers;
    }


    /**
     * Sets the allPartnerUsers value for this SharedTo.
     * 
     * @param allPartnerUsers
     */
    public void setAllPartnerUsers(java.lang.String allPartnerUsers) {
        this.allPartnerUsers = allPartnerUsers;
    }


    /**
     * Gets the group value for this SharedTo.
     * 
     * @return group
     */
    public java.lang.String[] getGroup() {
        return group;
    }


    /**
     * Sets the group value for this SharedTo.
     * 
     * @param group
     */
    public void setGroup(java.lang.String[] group) {
        this.group = group;
    }

    public java.lang.String getGroup(int i) {
        return this.group[i];
    }

    public void setGroup(int i, java.lang.String _value) {
        this.group[i] = _value;
    }


    /**
     * Gets the groups value for this SharedTo.
     * 
     * @return groups
     */
    public java.lang.String[] getGroups() {
        return groups;
    }


    /**
     * Sets the groups value for this SharedTo.
     * 
     * @param groups
     */
    public void setGroups(java.lang.String[] groups) {
        this.groups = groups;
    }

    public java.lang.String getGroups(int i) {
        return this.groups[i];
    }

    public void setGroups(int i, java.lang.String _value) {
        this.groups[i] = _value;
    }


    /**
     * Gets the managerSubordinates value for this SharedTo.
     * 
     * @return managerSubordinates
     */
    public java.lang.String[] getManagerSubordinates() {
        return managerSubordinates;
    }


    /**
     * Sets the managerSubordinates value for this SharedTo.
     * 
     * @param managerSubordinates
     */
    public void setManagerSubordinates(java.lang.String[] managerSubordinates) {
        this.managerSubordinates = managerSubordinates;
    }

    public java.lang.String getManagerSubordinates(int i) {
        return this.managerSubordinates[i];
    }

    public void setManagerSubordinates(int i, java.lang.String _value) {
        this.managerSubordinates[i] = _value;
    }


    /**
     * Gets the managers value for this SharedTo.
     * 
     * @return managers
     */
    public java.lang.String[] getManagers() {
        return managers;
    }


    /**
     * Sets the managers value for this SharedTo.
     * 
     * @param managers
     */
    public void setManagers(java.lang.String[] managers) {
        this.managers = managers;
    }

    public java.lang.String getManagers(int i) {
        return this.managers[i];
    }

    public void setManagers(int i, java.lang.String _value) {
        this.managers[i] = _value;
    }


    /**
     * Gets the portalRole value for this SharedTo.
     * 
     * @return portalRole
     */
    public java.lang.String[] getPortalRole() {
        return portalRole;
    }


    /**
     * Sets the portalRole value for this SharedTo.
     * 
     * @param portalRole
     */
    public void setPortalRole(java.lang.String[] portalRole) {
        this.portalRole = portalRole;
    }

    public java.lang.String getPortalRole(int i) {
        return this.portalRole[i];
    }

    public void setPortalRole(int i, java.lang.String _value) {
        this.portalRole[i] = _value;
    }


    /**
     * Gets the portalRoleAndSubordinates value for this SharedTo.
     * 
     * @return portalRoleAndSubordinates
     */
    public java.lang.String[] getPortalRoleAndSubordinates() {
        return portalRoleAndSubordinates;
    }


    /**
     * Sets the portalRoleAndSubordinates value for this SharedTo.
     * 
     * @param portalRoleAndSubordinates
     */
    public void setPortalRoleAndSubordinates(java.lang.String[] portalRoleAndSubordinates) {
        this.portalRoleAndSubordinates = portalRoleAndSubordinates;
    }

    public java.lang.String getPortalRoleAndSubordinates(int i) {
        return this.portalRoleAndSubordinates[i];
    }

    public void setPortalRoleAndSubordinates(int i, java.lang.String _value) {
        this.portalRoleAndSubordinates[i] = _value;
    }


    /**
     * Gets the queue value for this SharedTo.
     * 
     * @return queue
     */
    public java.lang.String[] getQueue() {
        return queue;
    }


    /**
     * Sets the queue value for this SharedTo.
     * 
     * @param queue
     */
    public void setQueue(java.lang.String[] queue) {
        this.queue = queue;
    }

    public java.lang.String getQueue(int i) {
        return this.queue[i];
    }

    public void setQueue(int i, java.lang.String _value) {
        this.queue[i] = _value;
    }


    /**
     * Gets the role value for this SharedTo.
     * 
     * @return role
     */
    public java.lang.String[] getRole() {
        return role;
    }


    /**
     * Sets the role value for this SharedTo.
     * 
     * @param role
     */
    public void setRole(java.lang.String[] role) {
        this.role = role;
    }

    public java.lang.String getRole(int i) {
        return this.role[i];
    }

    public void setRole(int i, java.lang.String _value) {
        this.role[i] = _value;
    }


    /**
     * Gets the roleAndSubordinates value for this SharedTo.
     * 
     * @return roleAndSubordinates
     */
    public java.lang.String[] getRoleAndSubordinates() {
        return roleAndSubordinates;
    }


    /**
     * Sets the roleAndSubordinates value for this SharedTo.
     * 
     * @param roleAndSubordinates
     */
    public void setRoleAndSubordinates(java.lang.String[] roleAndSubordinates) {
        this.roleAndSubordinates = roleAndSubordinates;
    }

    public java.lang.String getRoleAndSubordinates(int i) {
        return this.roleAndSubordinates[i];
    }

    public void setRoleAndSubordinates(int i, java.lang.String _value) {
        this.roleAndSubordinates[i] = _value;
    }


    /**
     * Gets the roleAndSubordinatesInternal value for this SharedTo.
     * 
     * @return roleAndSubordinatesInternal
     */
    public java.lang.String[] getRoleAndSubordinatesInternal() {
        return roleAndSubordinatesInternal;
    }


    /**
     * Sets the roleAndSubordinatesInternal value for this SharedTo.
     * 
     * @param roleAndSubordinatesInternal
     */
    public void setRoleAndSubordinatesInternal(java.lang.String[] roleAndSubordinatesInternal) {
        this.roleAndSubordinatesInternal = roleAndSubordinatesInternal;
    }

    public java.lang.String getRoleAndSubordinatesInternal(int i) {
        return this.roleAndSubordinatesInternal[i];
    }

    public void setRoleAndSubordinatesInternal(int i, java.lang.String _value) {
        this.roleAndSubordinatesInternal[i] = _value;
    }


    /**
     * Gets the roles value for this SharedTo.
     * 
     * @return roles
     */
    public java.lang.String[] getRoles() {
        return roles;
    }


    /**
     * Sets the roles value for this SharedTo.
     * 
     * @param roles
     */
    public void setRoles(java.lang.String[] roles) {
        this.roles = roles;
    }

    public java.lang.String getRoles(int i) {
        return this.roles[i];
    }

    public void setRoles(int i, java.lang.String _value) {
        this.roles[i] = _value;
    }


    /**
     * Gets the rolesAndSubordinates value for this SharedTo.
     * 
     * @return rolesAndSubordinates
     */
    public java.lang.String[] getRolesAndSubordinates() {
        return rolesAndSubordinates;
    }


    /**
     * Sets the rolesAndSubordinates value for this SharedTo.
     * 
     * @param rolesAndSubordinates
     */
    public void setRolesAndSubordinates(java.lang.String[] rolesAndSubordinates) {
        this.rolesAndSubordinates = rolesAndSubordinates;
    }

    public java.lang.String getRolesAndSubordinates(int i) {
        return this.rolesAndSubordinates[i];
    }

    public void setRolesAndSubordinates(int i, java.lang.String _value) {
        this.rolesAndSubordinates[i] = _value;
    }


    /**
     * Gets the territories value for this SharedTo.
     * 
     * @return territories
     */
    public java.lang.String[] getTerritories() {
        return territories;
    }


    /**
     * Sets the territories value for this SharedTo.
     * 
     * @param territories
     */
    public void setTerritories(java.lang.String[] territories) {
        this.territories = territories;
    }

    public java.lang.String getTerritories(int i) {
        return this.territories[i];
    }

    public void setTerritories(int i, java.lang.String _value) {
        this.territories[i] = _value;
    }


    /**
     * Gets the territoriesAndSubordinates value for this SharedTo.
     * 
     * @return territoriesAndSubordinates
     */
    public java.lang.String[] getTerritoriesAndSubordinates() {
        return territoriesAndSubordinates;
    }


    /**
     * Sets the territoriesAndSubordinates value for this SharedTo.
     * 
     * @param territoriesAndSubordinates
     */
    public void setTerritoriesAndSubordinates(java.lang.String[] territoriesAndSubordinates) {
        this.territoriesAndSubordinates = territoriesAndSubordinates;
    }

    public java.lang.String getTerritoriesAndSubordinates(int i) {
        return this.territoriesAndSubordinates[i];
    }

    public void setTerritoriesAndSubordinates(int i, java.lang.String _value) {
        this.territoriesAndSubordinates[i] = _value;
    }


    /**
     * Gets the territory value for this SharedTo.
     * 
     * @return territory
     */
    public java.lang.String[] getTerritory() {
        return territory;
    }


    /**
     * Sets the territory value for this SharedTo.
     * 
     * @param territory
     */
    public void setTerritory(java.lang.String[] territory) {
        this.territory = territory;
    }

    public java.lang.String getTerritory(int i) {
        return this.territory[i];
    }

    public void setTerritory(int i, java.lang.String _value) {
        this.territory[i] = _value;
    }


    /**
     * Gets the territoryAndSubordinates value for this SharedTo.
     * 
     * @return territoryAndSubordinates
     */
    public java.lang.String[] getTerritoryAndSubordinates() {
        return territoryAndSubordinates;
    }


    /**
     * Sets the territoryAndSubordinates value for this SharedTo.
     * 
     * @param territoryAndSubordinates
     */
    public void setTerritoryAndSubordinates(java.lang.String[] territoryAndSubordinates) {
        this.territoryAndSubordinates = territoryAndSubordinates;
    }

    public java.lang.String getTerritoryAndSubordinates(int i) {
        return this.territoryAndSubordinates[i];
    }

    public void setTerritoryAndSubordinates(int i, java.lang.String _value) {
        this.territoryAndSubordinates[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharedTo)) return false;
        SharedTo other = (SharedTo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allCustomerPortalUsers==null && other.getAllCustomerPortalUsers()==null) || 
             (this.allCustomerPortalUsers!=null &&
              this.allCustomerPortalUsers.equals(other.getAllCustomerPortalUsers()))) &&
            ((this.allInternalUsers==null && other.getAllInternalUsers()==null) || 
             (this.allInternalUsers!=null &&
              this.allInternalUsers.equals(other.getAllInternalUsers()))) &&
            ((this.allPartnerUsers==null && other.getAllPartnerUsers()==null) || 
             (this.allPartnerUsers!=null &&
              this.allPartnerUsers.equals(other.getAllPartnerUsers()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              java.util.Arrays.equals(this.group, other.getGroup()))) &&
            ((this.groups==null && other.getGroups()==null) || 
             (this.groups!=null &&
              java.util.Arrays.equals(this.groups, other.getGroups()))) &&
            ((this.managerSubordinates==null && other.getManagerSubordinates()==null) || 
             (this.managerSubordinates!=null &&
              java.util.Arrays.equals(this.managerSubordinates, other.getManagerSubordinates()))) &&
            ((this.managers==null && other.getManagers()==null) || 
             (this.managers!=null &&
              java.util.Arrays.equals(this.managers, other.getManagers()))) &&
            ((this.portalRole==null && other.getPortalRole()==null) || 
             (this.portalRole!=null &&
              java.util.Arrays.equals(this.portalRole, other.getPortalRole()))) &&
            ((this.portalRoleAndSubordinates==null && other.getPortalRoleAndSubordinates()==null) || 
             (this.portalRoleAndSubordinates!=null &&
              java.util.Arrays.equals(this.portalRoleAndSubordinates, other.getPortalRoleAndSubordinates()))) &&
            ((this.queue==null && other.getQueue()==null) || 
             (this.queue!=null &&
              java.util.Arrays.equals(this.queue, other.getQueue()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              java.util.Arrays.equals(this.role, other.getRole()))) &&
            ((this.roleAndSubordinates==null && other.getRoleAndSubordinates()==null) || 
             (this.roleAndSubordinates!=null &&
              java.util.Arrays.equals(this.roleAndSubordinates, other.getRoleAndSubordinates()))) &&
            ((this.roleAndSubordinatesInternal==null && other.getRoleAndSubordinatesInternal()==null) || 
             (this.roleAndSubordinatesInternal!=null &&
              java.util.Arrays.equals(this.roleAndSubordinatesInternal, other.getRoleAndSubordinatesInternal()))) &&
            ((this.roles==null && other.getRoles()==null) || 
             (this.roles!=null &&
              java.util.Arrays.equals(this.roles, other.getRoles()))) &&
            ((this.rolesAndSubordinates==null && other.getRolesAndSubordinates()==null) || 
             (this.rolesAndSubordinates!=null &&
              java.util.Arrays.equals(this.rolesAndSubordinates, other.getRolesAndSubordinates()))) &&
            ((this.territories==null && other.getTerritories()==null) || 
             (this.territories!=null &&
              java.util.Arrays.equals(this.territories, other.getTerritories()))) &&
            ((this.territoriesAndSubordinates==null && other.getTerritoriesAndSubordinates()==null) || 
             (this.territoriesAndSubordinates!=null &&
              java.util.Arrays.equals(this.territoriesAndSubordinates, other.getTerritoriesAndSubordinates()))) &&
            ((this.territory==null && other.getTerritory()==null) || 
             (this.territory!=null &&
              java.util.Arrays.equals(this.territory, other.getTerritory()))) &&
            ((this.territoryAndSubordinates==null && other.getTerritoryAndSubordinates()==null) || 
             (this.territoryAndSubordinates!=null &&
              java.util.Arrays.equals(this.territoryAndSubordinates, other.getTerritoryAndSubordinates())));
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
        if (getAllCustomerPortalUsers() != null) {
            _hashCode += getAllCustomerPortalUsers().hashCode();
        }
        if (getAllInternalUsers() != null) {
            _hashCode += getAllInternalUsers().hashCode();
        }
        if (getAllPartnerUsers() != null) {
            _hashCode += getAllPartnerUsers().hashCode();
        }
        if (getGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManagerSubordinates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManagerSubordinates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManagerSubordinates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManagers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManagers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManagers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPortalRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortalRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortalRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPortalRoleAndSubordinates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortalRoleAndSubordinates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortalRoleAndSubordinates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQueue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoleAndSubordinates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoleAndSubordinates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoleAndSubordinates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoleAndSubordinatesInternal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoleAndSubordinatesInternal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoleAndSubordinatesInternal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRolesAndSubordinates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRolesAndSubordinates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRolesAndSubordinates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTerritories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTerritories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTerritories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTerritoriesAndSubordinates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTerritoriesAndSubordinates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTerritoriesAndSubordinates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTerritory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTerritory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTerritory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTerritoryAndSubordinates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTerritoryAndSubordinates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTerritoryAndSubordinates(), i);
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
        new org.apache.axis.description.TypeDesc(SharedTo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "SharedTo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allCustomerPortalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allCustomerPortalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allInternalUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allInternalUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allPartnerUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "allPartnerUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "groups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerSubordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "managerSubordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "managers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "portalRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalRoleAndSubordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "portalRoleAndSubordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "queue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleAndSubordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "roleAndSubordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleAndSubordinatesInternal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "roleAndSubordinatesInternal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "roles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolesAndSubordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "rolesAndSubordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territories");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "territories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territoriesAndSubordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "territoriesAndSubordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "territory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territoryAndSubordinates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://soap.sforce.com/2006/04/metadata", "territoryAndSubordinates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
