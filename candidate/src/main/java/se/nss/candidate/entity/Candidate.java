/**
 * 
 */
package se.nss.candidate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

/**
 * @author yokum
 *
 */
@Entity
@Table(name = "candidate")
public class Candidate {
	// An autogenerated id (unique for each user in the db)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	private String name;

	@NotNull
	private String email;

	// @NotNull
	private String resumeHeadline;

	// @NotNull
	private String currentLocation;

	// @NotNull
	private String cityName;

	// @NotNull
	private Integer totalExperience;

	// @NotNull
	private Integer annualSalary;

	// @NotNull
	private String mobile;

	@Version
	private long version;

	public Candidate() {
		// TODO Auto-generated constructor stub
	}

	public Candidate(String email, String name) {
		this.email = email;
		this.name = name;
	}

	public Candidate(long id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the resumeHeadline
	 */
	public String getResumeHeadline() {
		return resumeHeadline;
	}

	/**
	 * @param resumeHeadline
	 *            the resumeHeadline to set
	 */
	public void setResumeHeadline(String resumeHeadline) {
		this.resumeHeadline = resumeHeadline;
	}

	/**
	 * @return the currentLocation
	 */
	public String getCurrentLocation() {
		return currentLocation;
	}

	/**
	 * @param currentLocation
	 *            the currentLocation to set
	 */
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName
	 *            the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the totalExperience
	 */
	public Integer getTotalExperience() {
		return totalExperience;
	}

	/**
	 * @param totalExperience
	 *            the totalExperience to set
	 */
	public void setTotalExperience(Integer totalExperience) {
		this.totalExperience = totalExperience;
	}

	/**
	 * @return the annualSalary
	 */
	public Integer getAnnualSalary() {
		return annualSalary;
	}

	/**
	 * @param annualSalary
	 *            the annualSalary to set
	 */
	public void setAnnualSalary(Integer annualSalary) {
		this.annualSalary = annualSalary;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the version
	 */
	public long getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(long version) {
		this.version = version;
	}

}
