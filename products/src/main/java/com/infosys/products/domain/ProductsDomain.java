package com.infosys.products.domain;

public class ProductsDomain {
	private Long pid;
	private String pname;
	private String prating;
	private String pcategory;
	private Long pprice;
	private String pimage;
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
	public String getPimage() {
		return pimage;
	}
	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

}
