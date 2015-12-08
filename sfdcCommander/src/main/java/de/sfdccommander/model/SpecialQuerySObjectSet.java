/**
 * 
 */
package de.sfdccommander.model;

import java.util.HashSet;

/**
 * @author jochen
 *
 */
public class SpecialQuerySObjectSet extends HashSet<String> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public SpecialQuerySObjectSet() {
        super();
        init();
    }

    private void init() {
        this.add("CollaborationGroupRecord");
        this.add("ContentDocumentLink");
        this.add("ContentFolderMember");
        this.add("EntityParticle");
        this.add("FieldDefinition");
        this.add("IdeaComment");
        this.add("ListViewChartInstance");
        this.add("PicklistValueInfo");
        this.add("PlatformAction");
        this.add("RelationshipDomain");
        this.add("RelationshipInfo");
        this.add("ServiceFieldDataType");
        this.add("UserEntityAccess");
        this.add("UserFieldAccess");
        this.add("UserRecordAccess");
        this.add("UserProfileFeed");
        this.add("Vote");
    }

}
