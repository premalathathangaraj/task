package com.projectflowershpo.model;

import java.util.Objects;

public class User {
	    
	    private String name;
		private String emailId;
		private String password;
		private String address;
		private long mobileNumber;
		
		
		
		
		
		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(String name, String emailId, String password, String address, long mobileNumber) {
			super();
			this.name = name;
			this.emailId = emailId;
			this.password = password;
			this.address = address;
			this.mobileNumber = mobileNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(long mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		@Override
		public String toString() {
			return "User [name=" + name + ", emailId=" + emailId + ", password=" + password + ", address=" + address
					+ ", mobileNumber=" + mobileNumber + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(address, emailId, mobileNumber, name, password);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			return Objects.equals(address, other.address) && Objects.equals(emailId, other.emailId)
					&& mobileNumber == other.mobileNumber && Objects.equals(name, other.name)
					&& Objects.equals(password, other.password);
		}
		
		
		
		
}	
		
		
		
		
		