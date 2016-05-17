package com.ainosoft.seleniumplacescraper.pojo;

// Generated 4 May, 2016 4:15:46 PM by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ProxyDetails generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ProxyDetails", catalog = "SeleniumPlacesScraper")
public class ProxyDetailsPojo implements java.io.Serializable {

	private Long id;
	private String ipAddress;
	private String ipPort;
	private String ipAddressAndPort;
	private Boolean status;
	private String url;
	private Date createdOn;
	private Date modifiedOn;

	public ProxyDetailsPojo() {
	}

	public ProxyDetailsPojo(String ipAddress, String ipPort,
			String ipAddressAndPort, Boolean status,
			String url, Date createdOn, Date modifiedOn) {
		this.ipAddress = ipAddress;
		this.ipPort = ipPort;
		this.ipAddressAndPort = ipAddressAndPort;
		this.status = status;
		this.url = url;
		this.createdOn = createdOn;
		this.modifiedOn = modifiedOn;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "ip_address", length = 45)
	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Column(name = "ip_port", length = 45)
	public String getIpPort() {
		return this.ipPort;
	}

	public void setIpPort(String ipPort) {
		this.ipPort = ipPort;
	}

	@Column(name = "ip_address_and_port", length = 45)
	public String getIpAddressAndPort() {
		return this.ipAddressAndPort;
	}

	public void setIpAddressAndPort(String ipAddressAndPort) {
		this.ipAddressAndPort = ipAddressAndPort;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Column(name = "url", length = 100)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on", length = 19, nullable = false)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modified_on", length = 19)
	public Date getModifiedOn() {
		return this.modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
}