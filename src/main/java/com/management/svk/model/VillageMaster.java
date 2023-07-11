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
@Table(name = "village_master")
public class VillageMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "village_id")
	private Integer villageId;

	@NotBlank
	@Size(max = 50)
	@Column(name = "districtcode")
	private String districtCode;

	@NotBlank
	@Size(max = 50)
	@Column(name = "subdistrictcode")
	private String subDistrictCode;

	@NotBlank
	@Size(max = 50)
	@Column(name = "villagecode")
	private String villageCode;

	// @NotBlank
	@Size(max = 50)
	@Column(name = "villagenameenglish")
	private String villageNameEnglish;

	// @NotBlank
	@Size(max = 20)
	@Column(name = "villageocalname")
	private String villageLocalName;

	@NotBlank
	@Size(max = 10)
	@Column(name = "village_status")
	private String villageStatus = "N";

	public Integer getVillageId() {
		return villageId;
	}

	public void setVillageId(Integer villageId) {
		this.villageId = villageId;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getSubDistrictCode() {
		return subDistrictCode;
	}

	public void setSubDistrictCode(String subDistrictCode) {
		this.subDistrictCode = subDistrictCode;
	}

	public String getVillageCode() {
		return villageCode;
	}

	public void setVillageCode(String villageCode) {
		this.villageCode = villageCode;
	}

	public String getVillageNameEnglish() {
		return villageNameEnglish;
	}

	public void setVillageNameEnglish(String villageNameEnglish) {
		this.villageNameEnglish = villageNameEnglish;
	}

	public String getVillageLocalName() {
		return villageLocalName;
	}

	public void setVillageLocalName(String villageLocalName) {
		this.villageLocalName = villageLocalName;
	}

	public String getVillageStatus() {
		return villageStatus;
	}

	public void setVillageStatus(String villageStatus) {
		this.villageStatus = villageStatus;
	}

}
