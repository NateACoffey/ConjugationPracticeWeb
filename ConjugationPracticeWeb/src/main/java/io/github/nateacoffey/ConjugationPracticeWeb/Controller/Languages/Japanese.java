package io.github.nateacoffey.ConjugationPracticeWeb.Controller.Languages;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Japanese {
	
	
	@Id
	private String ending;
	
	@Column(name = "causative_negative_plain")
	private String causativeNegativePlain;
	
	@Column(name = "causative_negative_polite")
	private String causativeNegativePolite;
	
	@Column(name = "causative_plain")
	private String causativePlain;
	
	@Column(name = "causative_polite")
	private String causativePolite;
	
	@Column(name = "conditional")
	private String conditional;
	
	@Column(name = "conditional_negative")
	private String conditionalNegative;
	
	@Column(name = "past_negative_plain")
	private String pastNegativePlain;
	
	@Column(name = "past_negative_polite")
	private String pastNegativePolite;
	
	@Column(name = "past_plain")
	private String pastPlain;
	
	@Column(name = "past_polite")
	private String pastPolite;
	
	@Column(name = "potential_negative_plain")
	private String potentialNegativePlain;
	
	@Column(name = "potential_negative_polite")
	private String potentialNegativePolite;
	
	@Column(name = "potential_plain")
	private String potentialPlain;
	
	@Column(name = "potential_polite")
	private String potentialPolite;
	
	@Column(name = "present_negative_plain")
	private String presentNegativePlain;
	
	@Column(name = "present_negative_polite")
	private String presentNegativePolite;
	
	@Column(name = "present_polite")
	private String presentPolite;
	
	@Column(name = "te_form")
	private String teForm;
	
	@Column(name = "volitional_plain")
	private String volitionalPlain;
	
	@Column(name = "volitional_polite")
	private String volitionalPolite;
	
	
	
	public String getEnding() {
		return ending;
	}
	
	public void setEnding(String ending) {
		this.ending = ending;
	}

	public String getCausativeNegativePlain() {
		return causativeNegativePlain;
	}

	public void setCausativeNegativePlain(String causativeNegativePlain) {
		this.causativeNegativePlain = causativeNegativePlain;
	}

	public String getCausativeNegativePolite() {
		return causativeNegativePolite;
	}

	public void setCausativeNegativePolite(String causativeNegativePolite) {
		this.causativeNegativePolite = causativeNegativePolite;
	}

	public String getCausativePlain() {
		return causativePlain;
	}

	public void setCausativePlain(String causativePlain) {
		this.causativePlain = causativePlain;
	}

	public String getCausativePolite() {
		return causativePolite;
	}

	public void setCausativePolite(String causativePolite) {
		this.causativePolite = causativePolite;
	}

	public String getConditional() {
		return conditional;
	}

	public void setConditional(String conditional) {
		this.conditional = conditional;
	}

	public String getConditionalNegative() {
		return conditionalNegative;
	}

	public void setConditionalNegative(String conditionalNegative) {
		this.conditionalNegative = conditionalNegative;
	}

	public String getPastNegativePlain() {
		return pastNegativePlain;
	}

	public void setPastNegativePlain(String pastNegativePlain) {
		this.pastNegativePlain = pastNegativePlain;
	}

	public String getPastNegativePolite() {
		return pastNegativePolite;
	}

	public void setPastNegativePolite(String pastNegativePolite) {
		this.pastNegativePolite = pastNegativePolite;
	}

	public String getPastPlain() {
		return pastPlain;
	}

	public void setPastPlain(String pastPlain) {
		this.pastPlain = pastPlain;
	}

	public String getPastPolite() {
		return pastPolite;
	}

	public void setPastPolite(String pastPolite) {
		this.pastPolite = pastPolite;
	}

	public String getPotentialNegativePlain() {
		return potentialNegativePlain;
	}

	public void setPotentialNegativePlain(String potentialNegativePlain) {
		this.potentialNegativePlain = potentialNegativePlain;
	}

	public String getPotentialNegativePolite() {
		return potentialNegativePolite;
	}

	public void setPotentialNegativePolite(String potentialNegativePolite) {
		this.potentialNegativePolite = potentialNegativePolite;
	}

	public String getPotentialPlain() {
		return potentialPlain;
	}

	public void setPotentialPlain(String potentialPlain) {
		this.potentialPlain = potentialPlain;
	}

	public String getPotentialPolite() {
		return potentialPolite;
	}

	public void setPotentialPolite(String potentialPolite) {
		this.potentialPolite = potentialPolite;
	}

	public String getPresentNegativePlain() {
		return presentNegativePlain;
	}

	public void setPresentNegativePlain(String presentNegativePlain) {
		this.presentNegativePlain = presentNegativePlain;
	}

	public String getPresentNegativePolite() {
		return presentNegativePolite;
	}

	public void setPresentNegativePolite(String presentNegativePolite) {
		this.presentNegativePolite = presentNegativePolite;
	}

	public String getPresentPolite() {
		return presentPolite;
	}

	public void setPresentPolite(String presentPolite) {
		this.presentPolite = presentPolite;
	}

	public String getTeForm() {
		return teForm;
	}

	public void setTeForm(String teForm) {
		this.teForm = teForm;
	}

	public String getVolitionalPlain() {
		return volitionalPlain;
	}

	public void setVolitionalPlain(String volitionalPlain) {
		this.volitionalPlain = volitionalPlain;
	}

	public String getVolitionalPolite() {
		return volitionalPolite;
	}

	public void setVolitionalPolite(String volitionalPolite) {
		this.volitionalPolite = volitionalPolite;
	}
	
	
}
