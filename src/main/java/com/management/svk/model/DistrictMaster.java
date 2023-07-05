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
@Table(name = "district_master")
public class DistrictMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "district_id")
	private Integer districtId;

	//@Size(max = 20)
	@Column(name = "districtcode")
	private Integer districtCode;

	@NotBlank
	@Size(max = 50)
	@Column(name = "districtnameenglish")
	private String districtName;

	@NotBlank
	@Size(max = 50)
	@Column(name = "districtlocalname")
	private String districtLocalName;

	// @NotBlank
	@Size(max = 10)
	@Column(name = "district_status")
	private String districtStatus = "N";

	@Column(name = "state_id")
	private Integer stateId=1;

//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "taluka_id", referencedColumnName = "talukaId")
//   // @JsonIgnoreProperties("storyList")
//	private TalukaMaster talukaMaster;

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "districtMaster")
//	private List<TalukaMaster> talukaMasters;

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public Integer getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(Integer districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDistrictLocalName() {
		return districtLocalName;
	}

	public void setDistrictLocalName(String districtLocalName) {
		this.districtLocalName = districtLocalName;
	}

	public String getDistrictStatus() {
		return districtStatus;
	}

	public void setDistrictStatus(String districtStatus) {
		this.districtStatus = districtStatus;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

}
