	package com.example.demo;
	
	import org.springframework.stereotype.Component;
	
	@Component
	public class Products {
	
		private int id;
		private String pname;
		private String batchno;
		private double price;
		private int noofproduct;
		
		
	
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public String getBatchno() {
			return batchno;
		}

		public void setBatchno(String batchno) {
			this.batchno = batchno;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getNoofproduct() {
			return noofproduct;
		}

		public void setNoofproduct(int noofproduct) {
			this.noofproduct = noofproduct;
		}

		public Products(int id, String pname, String batchno, double price, int noofproduct) {
			super();
			this.id = id;
			this.pname = pname;
			this.batchno = batchno;
			this.price = price;
			this.noofproduct = noofproduct;
		}
	
		public Products() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	}
