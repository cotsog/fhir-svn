package org.hl7.fhir.instance.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Sun, Nov 30, 2014 07:25+1100 for FHIR v0.3.0

import java.util.*;

import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.instance.model.annotations.ResourceDef;
import org.hl7.fhir.instance.model.annotations.SearchParamDefinition;
import org.hl7.fhir.instance.model.annotations.Block;
import org.hl7.fhir.instance.model.annotations.Child;
import org.hl7.fhir.instance.model.annotations.Description;
/**
 * This resource provides Enrollment and plan details from the processing of an Enrollment resource.
 */
@ResourceDef(name="EnrollmentResponse", profile="http://hl7.org/fhir/Profile/EnrollmentResponse")
public class EnrollmentResponse extends DomainResource {

    public enum RSLink {
        /**
         * The processing completed without errors.
         */
        COMPLETE, 
        /**
         * The processing identified with errors.
         */
        ERROR, 
        /**
         * added to help the parsers
         */
        NULL;
        public static RSLink fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("complete".equals(codeString))
          return COMPLETE;
        if ("error".equals(codeString))
          return ERROR;
        throw new Exception("Unknown RSLink code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case COMPLETE: return "complete";
            case ERROR: return "error";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case COMPLETE: return "";
            case ERROR: return "";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case COMPLETE: return "The processing completed without errors.";
            case ERROR: return "The processing identified with errors.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case COMPLETE: return "complete";
            case ERROR: return "error";
            default: return "?";
          }
        }
    }

  public static class RSLinkEnumFactory implements EnumFactory {
    public Enum<?> fromCode(String codeString) throws Exception {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("complete".equals(codeString))
          return RSLink.COMPLETE;
        if ("error".equals(codeString))
          return RSLink.ERROR;
        throw new Exception("Unknown RSLink code '"+codeString+"'");
        }
    public String toCode(Enum<?> code) throws Exception {
      if (code == RSLink.COMPLETE)
        return "complete";
      if (code == RSLink.ERROR)
        return "error";
      return "?";
      }
    }

    /**
     * The Response Business Identifier.
     */
    @Child(name="identifier", type={Identifier.class}, order=-1, min=1, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="Business Identifier", formalDefinition="The Response Business Identifier." )
    protected List<Identifier> identifier;

    /**
     * Original request resource referrence.
     */
    @Child(name="request", type={Enrollment.class}, order=0, min=0, max=1)
    @Description(shortDefinition="Claim reference", formalDefinition="Original request resource referrence." )
    protected Reference request;

    /**
     * The actual object that is the target of the reference (Original request resource referrence.)
     */
    protected Enrollment requestTarget;

    /**
     * Original request Business Identifer.
     */
    @Child(name="requestIdentifier", type={Identifier.class}, order=1, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="Business identifiers of resource triggering adjudication", formalDefinition="Original request Business Identifer." )
    protected List<Identifier> requestIdentifier;

    /**
     * Transaction status: error, complete.
     */
    @Child(name="outcome", type={CodeType.class}, order=2, min=0, max=1)
    @Description(shortDefinition="complete | error", formalDefinition="Transaction status: error, complete." )
    protected Enumeration<RSLink> outcome;

    /**
     * A description of the status of the adjudication.
     */
    @Child(name="disposition", type={StringType.class}, order=3, min=0, max=1)
    @Description(shortDefinition="Disposition Message", formalDefinition="A description of the status of the adjudication." )
    protected StringType disposition;

    /**
     * The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.
     */
    @Child(name="ruleset", type={Coding.class}, order=4, min=0, max=1)
    @Description(shortDefinition="Resource version", formalDefinition="The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources." )
    protected Coding ruleset;

    /**
     * The style (standard) and version of the original material which was converted into this resource.
     */
    @Child(name="originalRuleset", type={Coding.class}, order=5, min=0, max=1)
    @Description(shortDefinition="Original version", formalDefinition="The style (standard) and version of the original material which was converted into this resource." )
    protected Coding originalRuleset;

    /**
     * The date when the enclosed suite of services were performed or completed.
     */
    @Child(name="date", type={DateType.class}, order=6, min=0, max=1)
    @Description(shortDefinition="Creation date", formalDefinition="The date when the enclosed suite of services were performed or completed." )
    protected DateType date;

    /**
     * The Insurer who produced this adjudicated response.
     */
    @Child(name="organization", type={Organization.class}, order=7, min=0, max=1)
    @Description(shortDefinition="Insurer", formalDefinition="The Insurer who produced this adjudicated response." )
    protected Reference organization;

    /**
     * The actual object that is the target of the reference (The Insurer who produced this adjudicated response.)
     */
    protected Organization organizationTarget;

    /**
     * The practitioner who is responsible for the services rendered to the patient.
     */
    @Child(name="requestProvider", type={Practitioner.class}, order=8, min=0, max=1)
    @Description(shortDefinition="Responsible practitioner", formalDefinition="The practitioner who is responsible for the services rendered to the patient." )
    protected Reference requestProvider;

    /**
     * The actual object that is the target of the reference (The practitioner who is responsible for the services rendered to the patient.)
     */
    protected Practitioner requestProviderTarget;

    /**
     * The organization which is responsible for the services rendered to the patient.
     */
    @Child(name="requestOrganization", type={Organization.class}, order=9, min=0, max=1)
    @Description(shortDefinition="Responsible organization", formalDefinition="The organization which is responsible for the services rendered to the patient." )
    protected Reference requestOrganization;

    /**
     * The actual object that is the target of the reference (The organization which is responsible for the services rendered to the patient.)
     */
    protected Organization requestOrganizationTarget;

    private static final long serialVersionUID = -239057236L;

    public EnrollmentResponse() {
      super();
    }

    /**
     * @return {@link #identifier} (The Response Business Identifier.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #identifier} (The Response Business Identifier.)
     */
    // syntactic sugar
    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    /**
     * @return {@link #request} (Original request resource referrence.)
     */
    public Reference getRequest() { 
      if (this.request == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.request");
        else if (Configuration.doAutoCreate())
          this.request = new Reference();
      return this.request;
    }

    public boolean hasRequest() { 
      return this.request != null && !this.request.isEmpty();
    }

    /**
     * @param value {@link #request} (Original request resource referrence.)
     */
    public EnrollmentResponse setRequest(Reference value) { 
      this.request = value;
      return this;
    }

    /**
     * @return {@link #request} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Original request resource referrence.)
     */
    public Enrollment getRequestTarget() { 
      if (this.requestTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.request");
        else if (Configuration.doAutoCreate())
          this.requestTarget = new Enrollment();
      return this.requestTarget;
    }

    /**
     * @param value {@link #request} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Original request resource referrence.)
     */
    public EnrollmentResponse setRequestTarget(Enrollment value) { 
      this.requestTarget = value;
      return this;
    }

    /**
     * @return {@link #requestIdentifier} (Original request Business Identifer.)
     */
    public List<Identifier> getRequestIdentifier() { 
      if (this.requestIdentifier == null)
        this.requestIdentifier = new ArrayList<Identifier>();
      return this.requestIdentifier;
    }

    public boolean hasRequestIdentifier() { 
      if (this.requestIdentifier == null)
        return false;
      for (Identifier item : this.requestIdentifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #requestIdentifier} (Original request Business Identifer.)
     */
    // syntactic sugar
    public Identifier addRequestIdentifier() { //3
      Identifier t = new Identifier();
      if (this.requestIdentifier == null)
        this.requestIdentifier = new ArrayList<Identifier>();
      this.requestIdentifier.add(t);
      return t;
    }

    /**
     * @return {@link #outcome} (Transaction status: error, complete.). This is the underlying object with id, value and extensions. The accessor "getOutcome" gives direct access to the value
     */
    public Enumeration<RSLink> getOutcomeElement() { 
      if (this.outcome == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.outcome");
        else if (Configuration.doAutoCreate())
          this.outcome = new Enumeration<RSLink>();
      return this.outcome;
    }

    public boolean hasOutcomeElement() { 
      return this.outcome != null && !this.outcome.isEmpty();
    }

    public boolean hasOutcome() { 
      return this.outcome != null && !this.outcome.isEmpty();
    }

    /**
     * @param value {@link #outcome} (Transaction status: error, complete.). This is the underlying object with id, value and extensions. The accessor "getOutcome" gives direct access to the value
     */
    public EnrollmentResponse setOutcomeElement(Enumeration<RSLink> value) { 
      this.outcome = value;
      return this;
    }

    /**
     * @return Transaction status: error, complete.
     */
    public RSLink getOutcome() { 
      return this.outcome == null ? null : this.outcome.getValue();
    }

    /**
     * @param value Transaction status: error, complete.
     */
    public EnrollmentResponse setOutcome(RSLink value) { 
      if (value == null)
        this.outcome = null;
      else {
        if (this.outcome == null)
          this.outcome = new Enumeration<RSLink>();
        this.outcome.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #disposition} (A description of the status of the adjudication.). This is the underlying object with id, value and extensions. The accessor "getDisposition" gives direct access to the value
     */
    public StringType getDispositionElement() { 
      if (this.disposition == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.disposition");
        else if (Configuration.doAutoCreate())
          this.disposition = new StringType();
      return this.disposition;
    }

    public boolean hasDispositionElement() { 
      return this.disposition != null && !this.disposition.isEmpty();
    }

    public boolean hasDisposition() { 
      return this.disposition != null && !this.disposition.isEmpty();
    }

    /**
     * @param value {@link #disposition} (A description of the status of the adjudication.). This is the underlying object with id, value and extensions. The accessor "getDisposition" gives direct access to the value
     */
    public EnrollmentResponse setDispositionElement(StringType value) { 
      this.disposition = value;
      return this;
    }

    /**
     * @return A description of the status of the adjudication.
     */
    public String getDisposition() { 
      return this.disposition == null ? null : this.disposition.getValue();
    }

    /**
     * @param value A description of the status of the adjudication.
     */
    public EnrollmentResponse setDisposition(String value) { 
      if (Utilities.noString(value))
        this.disposition = null;
      else {
        if (this.disposition == null)
          this.disposition = new StringType();
        this.disposition.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #ruleset} (The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.)
     */
    public Coding getRuleset() { 
      if (this.ruleset == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.ruleset");
        else if (Configuration.doAutoCreate())
          this.ruleset = new Coding();
      return this.ruleset;
    }

    public boolean hasRuleset() { 
      return this.ruleset != null && !this.ruleset.isEmpty();
    }

    /**
     * @param value {@link #ruleset} (The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.)
     */
    public EnrollmentResponse setRuleset(Coding value) { 
      this.ruleset = value;
      return this;
    }

    /**
     * @return {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
     */
    public Coding getOriginalRuleset() { 
      if (this.originalRuleset == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.originalRuleset");
        else if (Configuration.doAutoCreate())
          this.originalRuleset = new Coding();
      return this.originalRuleset;
    }

    public boolean hasOriginalRuleset() { 
      return this.originalRuleset != null && !this.originalRuleset.isEmpty();
    }

    /**
     * @param value {@link #originalRuleset} (The style (standard) and version of the original material which was converted into this resource.)
     */
    public EnrollmentResponse setOriginalRuleset(Coding value) { 
      this.originalRuleset = value;
      return this;
    }

    /**
     * @return {@link #date} (The date when the enclosed suite of services were performed or completed.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.date");
        else if (Configuration.doAutoCreate())
          this.date = new DateType();
      return this.date;
    }

    public boolean hasDateElement() { 
      return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() { 
      return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (The date when the enclosed suite of services were performed or completed.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public EnrollmentResponse setDateElement(DateType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return The date when the enclosed suite of services were performed or completed.
     */
    public DateAndTime getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date when the enclosed suite of services were performed or completed.
     */
    public EnrollmentResponse setDate(DateAndTime value) { 
      if (value == null)
        this.date = null;
      else {
        if (this.date == null)
          this.date = new DateType();
        this.date.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #organization} (The Insurer who produced this adjudicated response.)
     */
    public Reference getOrganization() { 
      if (this.organization == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.organization");
        else if (Configuration.doAutoCreate())
          this.organization = new Reference();
      return this.organization;
    }

    public boolean hasOrganization() { 
      return this.organization != null && !this.organization.isEmpty();
    }

    /**
     * @param value {@link #organization} (The Insurer who produced this adjudicated response.)
     */
    public EnrollmentResponse setOrganization(Reference value) { 
      this.organization = value;
      return this;
    }

    /**
     * @return {@link #organization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The Insurer who produced this adjudicated response.)
     */
    public Organization getOrganizationTarget() { 
      if (this.organizationTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.organization");
        else if (Configuration.doAutoCreate())
          this.organizationTarget = new Organization();
      return this.organizationTarget;
    }

    /**
     * @param value {@link #organization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The Insurer who produced this adjudicated response.)
     */
    public EnrollmentResponse setOrganizationTarget(Organization value) { 
      this.organizationTarget = value;
      return this;
    }

    /**
     * @return {@link #requestProvider} (The practitioner who is responsible for the services rendered to the patient.)
     */
    public Reference getRequestProvider() { 
      if (this.requestProvider == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.requestProvider");
        else if (Configuration.doAutoCreate())
          this.requestProvider = new Reference();
      return this.requestProvider;
    }

    public boolean hasRequestProvider() { 
      return this.requestProvider != null && !this.requestProvider.isEmpty();
    }

    /**
     * @param value {@link #requestProvider} (The practitioner who is responsible for the services rendered to the patient.)
     */
    public EnrollmentResponse setRequestProvider(Reference value) { 
      this.requestProvider = value;
      return this;
    }

    /**
     * @return {@link #requestProvider} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The practitioner who is responsible for the services rendered to the patient.)
     */
    public Practitioner getRequestProviderTarget() { 
      if (this.requestProviderTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.requestProvider");
        else if (Configuration.doAutoCreate())
          this.requestProviderTarget = new Practitioner();
      return this.requestProviderTarget;
    }

    /**
     * @param value {@link #requestProvider} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The practitioner who is responsible for the services rendered to the patient.)
     */
    public EnrollmentResponse setRequestProviderTarget(Practitioner value) { 
      this.requestProviderTarget = value;
      return this;
    }

    /**
     * @return {@link #requestOrganization} (The organization which is responsible for the services rendered to the patient.)
     */
    public Reference getRequestOrganization() { 
      if (this.requestOrganization == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.requestOrganization");
        else if (Configuration.doAutoCreate())
          this.requestOrganization = new Reference();
      return this.requestOrganization;
    }

    public boolean hasRequestOrganization() { 
      return this.requestOrganization != null && !this.requestOrganization.isEmpty();
    }

    /**
     * @param value {@link #requestOrganization} (The organization which is responsible for the services rendered to the patient.)
     */
    public EnrollmentResponse setRequestOrganization(Reference value) { 
      this.requestOrganization = value;
      return this;
    }

    /**
     * @return {@link #requestOrganization} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The organization which is responsible for the services rendered to the patient.)
     */
    public Organization getRequestOrganizationTarget() { 
      if (this.requestOrganizationTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EnrollmentResponse.requestOrganization");
        else if (Configuration.doAutoCreate())
          this.requestOrganizationTarget = new Organization();
      return this.requestOrganizationTarget;
    }

    /**
     * @param value {@link #requestOrganization} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The organization which is responsible for the services rendered to the patient.)
     */
    public EnrollmentResponse setRequestOrganizationTarget(Organization value) { 
      this.requestOrganizationTarget = value;
      return this;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("identifier", "Identifier", "The Response Business Identifier.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("request", "Reference(Enrollment)", "Original request resource referrence.", 0, java.lang.Integer.MAX_VALUE, request));
        childrenList.add(new Property("requestIdentifier", "Identifier", "Original request Business Identifer.", 0, java.lang.Integer.MAX_VALUE, requestIdentifier));
        childrenList.add(new Property("outcome", "code", "Transaction status: error, complete.", 0, java.lang.Integer.MAX_VALUE, outcome));
        childrenList.add(new Property("disposition", "string", "A description of the status of the adjudication.", 0, java.lang.Integer.MAX_VALUE, disposition));
        childrenList.add(new Property("ruleset", "Coding", "The version of the style of resource contents. This should be mapped to the allowable profiles for this and supporting resources.", 0, java.lang.Integer.MAX_VALUE, ruleset));
        childrenList.add(new Property("originalRuleset", "Coding", "The style (standard) and version of the original material which was converted into this resource.", 0, java.lang.Integer.MAX_VALUE, originalRuleset));
        childrenList.add(new Property("date", "date", "The date when the enclosed suite of services were performed or completed.", 0, java.lang.Integer.MAX_VALUE, date));
        childrenList.add(new Property("organization", "Reference(Organization)", "The Insurer who produced this adjudicated response.", 0, java.lang.Integer.MAX_VALUE, organization));
        childrenList.add(new Property("requestProvider", "Reference(Practitioner)", "The practitioner who is responsible for the services rendered to the patient.", 0, java.lang.Integer.MAX_VALUE, requestProvider));
        childrenList.add(new Property("requestOrganization", "Reference(Organization)", "The organization which is responsible for the services rendered to the patient.", 0, java.lang.Integer.MAX_VALUE, requestOrganization));
      }

      public EnrollmentResponse copy() {
        EnrollmentResponse dst = new EnrollmentResponse();
        copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.request = request == null ? null : request.copy();
        if (requestIdentifier != null) {
          dst.requestIdentifier = new ArrayList<Identifier>();
          for (Identifier i : requestIdentifier)
            dst.requestIdentifier.add(i.copy());
        };
        dst.outcome = outcome == null ? null : outcome.copy();
        dst.disposition = disposition == null ? null : disposition.copy();
        dst.ruleset = ruleset == null ? null : ruleset.copy();
        dst.originalRuleset = originalRuleset == null ? null : originalRuleset.copy();
        dst.date = date == null ? null : date.copy();
        dst.organization = organization == null ? null : organization.copy();
        dst.requestProvider = requestProvider == null ? null : requestProvider.copy();
        dst.requestOrganization = requestOrganization == null ? null : requestOrganization.copy();
        return dst;
      }

      protected EnrollmentResponse typedCopy() {
        return copy();
      }

      public boolean isEmpty() {
        return super.isEmpty() && (identifier == null || identifier.isEmpty()) && (request == null || request.isEmpty())
           && (requestIdentifier == null || requestIdentifier.isEmpty()) && (outcome == null || outcome.isEmpty())
           && (disposition == null || disposition.isEmpty()) && (ruleset == null || ruleset.isEmpty())
           && (originalRuleset == null || originalRuleset.isEmpty()) && (date == null || date.isEmpty())
           && (organization == null || organization.isEmpty()) && (requestProvider == null || requestProvider.isEmpty())
           && (requestOrganization == null || requestOrganization.isEmpty());
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.EnrollmentResponse;
   }

  @SearchParamDefinition(name="requestidentifier", path="EnrollmentResponse.requestIdentifier", description="The business identifier of the claim", type="token" )
  public static final String SP_REQUESTIDENTIFIER = "requestidentifier";
  @SearchParamDefinition(name="identifier", path="EnrollmentResponse.identifier", description="The business identifier of the Explanation of Benefit", type="token" )
  public static final String SP_IDENTIFIER = "identifier";

}
