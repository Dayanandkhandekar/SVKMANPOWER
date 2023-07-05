package com.management.svk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "state_master")
public class StateMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "state_id")
	private Integer stateId;

	@NotBlank
	@Size(max = 50)
	@Column(name = "statecode")
	private String stateCode;

	// @NotBlank
	@Size(max = 50)
	@Column(name = "statenameenglish")
	private String stateNameEnglish;

	// @NotBlank
	@Size(max = 20)
	@Column(name = "stateocalname")
	private String stateLocalName;

	@NotBlank
	@Size(max = 10)
	@Column(name = "state_status")
	private String stateStatus = "N";

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateNameEnglish() {
		return stateNameEnglish;
	}

	public void setStateNameEnglish(String stateNameEnglish) {
		this.stateNameEnglish = stateNameEnglish;
	}

	public String getStateLocalName() {
		return stateLocalName;
	}

	public void setStateLocalName(String stateLocalName) {
		this.stateLocalName = stateLocalName;
	}

	public String getStateStatus() {
		return stateStatus;
	}

	public void setStateStatus(String stateStatus) {
		this.stateStatus = stateStatus;
	}

	

}
