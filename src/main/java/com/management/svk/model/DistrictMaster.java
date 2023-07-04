package com.management.svk.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name = "district_master")
public class DistrictMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "district_id")
	private Integer districtId;
	
	@NotBlank
	@Size(max = 50)
	@Column(name = "district_name")
	private String districtName;
	
	//@NotBlank
	@Size(max = 50)
	@Column(name = "district_desc")
	private String districtDesc;
	
	//@NotBlank
	@Size(max = 20)
	@Column(name = "district_code")
	private String districtCode;
	
	@NotBlank
	@Size(max = 10)
	@Column(name = "district_status")
	private String districtStatus;
	
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "taluka_id", referencedColumnName = "talukaId")
//   // @JsonIgnoreProperties("storyList")
//	private TalukaMaster talukaMaster;
	
	
	

	
}
