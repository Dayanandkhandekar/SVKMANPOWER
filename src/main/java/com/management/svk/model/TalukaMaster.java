package com.management.svk.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "taluka_master")
public class TalukaMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer talukaId;

	@NotBlank
	@Size(max = 50)
	private String talukaName;

	// @NotBlank
	@Size(max = 50)
	private String talukaDesc;

	// @NotBlank
	@Size(max = 20)
	private String talukaCode;

	@NotBlank
	@Size(max = 10)
	private String talukaStatus;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "district_id", referencedColumnName = "districtId")
	// @JsonIgnoreProperties("storyList")
	private DistrictMaster districtMaster;

	public Integer getTalukaId() {
		return talukaId;
	}

	public void setTalukaId(Integer talukaId) {
		this.talukaId = talukaId;
	}

	public String getTalukaName() {
		return talukaName;
	}

	public void setTalukaName(String talukaName) {
		this.talukaName = talukaName;
	}

	public String getTalukaDesc() {
		return talukaDesc;
	}

	public void setTalukaDesc(String talukaDesc) {
		this.talukaDesc = talukaDesc;
	}

	public String getTalukaCode() {
		return talukaCode;
	}

	public void setTalukaCode(String talukaCode) {
		this.talukaCode = talukaCode;
	}

	public String getTalukaStatus() {
		return talukaStatus;
	}

	public void setTalukaStatus(String talukaStatus) {
		this.talukaStatus = talukaStatus;
	}

	public DistrictMaster getDistrictMaster() {
		return districtMaster;
	}

	public void setDistrictMaster(DistrictMaster districtMaster) {
		this.districtMaster = districtMaster;
	}

	@Override
	public String toString() {
		return "TalukaMaster [talukaId=" + talukaId + ", talukaName=" + talukaName + ", talukaDesc=" + talukaDesc
				+ ", talukaCode=" + talukaCode + ", talukaStatus=" + talukaStatus + ", districtMaster=" + districtMaster
				+ "]";
	}
	
	

}
