package com.infosys.products.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
	@Column(name="pid")
	private Long pid;
	@Column(name="pname")
	private String pname;
	@Column(name="pdescription")
	private String pdescription;
	@Column(name="prating")
	private String prating;
	@Column(name="pcategory")
	private String pcategory;
	@Column(name="pprice")
	private Long pprice;
	@Column(name="pcolour")
	private String pcolour;
	@Column(name="pimage")
	private String pimage;
	@Column(name="pspecification")
	private String pspecification;
	@Column(name="pfirstavailable")
	private String pfirstavailable;
	@Column(name="plastavailable")
	private String plastavailable;
	@Column(name="sid")
	private String sid;
	@Column(name="sdiscount")
	private String sdiscount;
	@Column(name="squantity")
	private Integer squantity;
	@Column(name="sshippingcharges")
	private Integer sshippingcharges;
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	public String getPrating() {
		return prating;
	}
	public void setPrating(String prating) {
		this.prating = prating;
	}
	public String getPcategory() {
		return pcategory;
	}
	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}
	public Long getPprice() {
		return pprice;
	}
	public void setPprice(Long pprice) {
		this.pprice = pprice;
	}
	public String getPcolour() {
		return pcolour;
	}
	public void setPcolour(String pcolour) {
		this.pcolour = pcolour;
	}
	public String getPimage() {
		return pimage;
	}
	public void setPimage(String pimage) {
		this.pimage = pimage;
	}
	public String getPspecification() {
		return pspecification;
	}
	public void setPspecification(String pspecification) {
		this.pspecification = pspecification;
	}
	public String getPfirstavailable() {
		return pfirstavailable;
	}
	public void setPfirstavailable(String pfirstavailable) {
		this.pfirstavailable = pfirstavailable;
	}
	public String getPlastavailable() {
		return plastavailable;
	}
	public void setPlastavailable(String plastavailable) {
		this.plastavailable = plastavailable;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSdiscount() {
		return sdiscount;
	}
	public void setSdiscount(String sdiscount) {
		this.sdiscount = sdiscount;
	}
	public Integer getSquantity() {
		return squantity;
	}
	public void setSquantity(Integer squantity) {
		this.squantity = squantity;
	}
	public Integer getSshippingcharges() {
		return sshippingcharges;
	}
	public void setSshippingcharges(Integer sshippingcharges) {
		this.sshippingcharges = sshippingcharges;
	}

}
