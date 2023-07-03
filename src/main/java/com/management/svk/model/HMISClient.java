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
@Table(name = "hmis_client")
public class HMISClient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hmis_client_id")
	private Integer id;

//	@NotBlank
	@Size(max = 20)
	@Column(name = "hmis_client_name")
	private String clientName;

//	@NotBlank
	@Size(max = 20)
	@Column(name = "hmis_hospital_name")
	private String hospitalName;

//	@NotBlank
	@Size(max = 50)
//	@Email
	@Column(name = "email")
	private String email;

//	@NotBlank
	@Size(max = 50)
//	@Addressing
	@Column(name = "address")
	private String address;

//	@NotBlank
	@Size(max = 50)
//	@Addressing
	@Column(name = "mobile_no")
	private String mobileNumber;

//	@NotBlank
	@Size(max = 50)
//	@Addressing
	@Column(name = "client_code")
	private String clientCode;

//	@NotBlank
	@Size(max = 20)
	@Column(name = "start_date")
	private String startDate;

//	@NotBlank
	@Size(max = 20)
	@Column(name = "end_date")
	private String endDate;

//	@NotBlank
	@Size(max = 20)
	@Column(name = "created_date")
	private String createdDate;

//	@NotBlank
	@Size(max = 20)
	@Column(name = "updated_date")
	private String updatedDate;

//	@NotBlank
	@Size(max = 20)
	@Column(name = "created_by")
	private String createdBy;

//	@NotBlank
	@Size(max = 20)
	@Column(name = "updated_by")
	private String updatedBy;

//	@NotBlank
	@Size(max = 20)
	@Column(name = "deleted_by")
	private String deletedBy;

//	@NotBlank
	@Size(max = 20)
	@Column(name = "deleteFlag")
	private String deleteFlag = "0";

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	@Override
	public String toString() {
		return "HMISClient [id=" + id + ", clientName=" + clientName + ", hospitalName=" + hospitalName + ", email="
				+ email + ", address=" + address + ", mobileNumber=" + mobileNumber + ", clientCode=" + clientCode
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy
				+ ", deletedBy=" + deletedBy + ", deleteFlag=" + deleteFlag + "]";
	}

}
