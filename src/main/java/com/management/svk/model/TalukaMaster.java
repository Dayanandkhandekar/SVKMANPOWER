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
@Table(name = "taluka_master")
public class TalukaMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer talukaId;

	@NotBlank
	@Size(max = 50)
	@Column(name = "districtcode")
	private Integer districtCode;

	// @NotBlank
	@Size(max = 50)
	@Column(name = "subdistrictcode")
	private Integer subDistrictCode;

	@Size(max = 50)
	@Column(name = "subdistrictnameenglish")
	private String subDistrictNameEnglish;

	@Size(max = 50)
	@Column(name = "subdistrictlocalname")
	private String subDistrictLocalName;

	// @NotBlank
	@Size(max = 10)
	private String talukaStatus = "N";

	public Integer getTalukaId() {
		return talukaId;
	}

	public void setTalukaId(Integer talukaId) {
		this.talukaId = talukaId;
	}

	public Integer getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(Integer districtCode) {
		this.districtCode = districtCode;
	}

	public Integer getSubDistrictCode() {
		return subDistrictCode;
	}

	public void setSubDistrictCode(Integer subDistrictCode) {
		this.subDistrictCode = subDistrictCode;
	}

	public String getSubDistrictNameEnglish() {
		return subDistrictNameEnglish;
	}

	public void setSubDistrictNameEnglish(String subDistrictNameEnglish) {
		this.subDistrictNameEnglish = subDistrictNameEnglish;
	}

	public String getSubDistrictLocalName() {
		return subDistrictLocalName;
	}

	public void setSubDistrictLocalName(String subDistrictLocalName) {
		this.subDistrictLocalName = subDistrictLocalName;
	}

	public String getTalukaStatus() {
		return talukaStatus;
	}

	public void setTalukaStatus(String talukaStatus) {
		this.talukaStatus = talukaStatus;
	}

//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "district_id")
//	// @JsonIgnoreProperties("storyList")
//	private DistrictMaster districtMaster;

}
