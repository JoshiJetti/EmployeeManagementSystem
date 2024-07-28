package com.emp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

		@Id
		@Column(name="EmployeeName")
		private String ename;
		@Column(name="Designation")
		private String desg;
		private double salary;
		private String email;
		@Column(name="Mobile")
		private long phno;
		private String qualification;
		private String manager;
		private String gender;
		public Employee() {
			super();
		}
		public Employee(String ename, String desg, double salary, String email, long phno, String qualification,
				String manager, String gender) {
			super();
			this.ename = ename;
			this.desg = desg;
			this.salary = salary;
			this.email = email;
			this.phno = phno;
			this.qualification = qualification;
			this.manager = manager;
			this.gender = gender;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getDesg() {
			return desg;
		}
		public void setDesg(String desg) {
			this.desg = desg;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getPhno() {
			return phno;
		}
		public void setPhno(long phno) {
			this.phno = phno;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public String getManager() {
			return manager;
		}
		public void setManager(String manager) {
			this.manager = manager;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "Employee [ename=" + ename + ", desg=" + desg + ", salary=" + salary + ", email=" + email + ", phno="
					+ phno + ", qualification=" + qualification + ", manager=" + manager + ", gender=" + gender + "]";
		}
		
		
		
		
		
}
