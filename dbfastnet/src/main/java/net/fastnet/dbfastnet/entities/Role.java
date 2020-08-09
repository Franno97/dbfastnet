package net.fastnet.dbfastnet.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "roleId")
		private int id;

		@Column(name = "roleName")
		private String role;

		@Column(name = "roleDesc")
		private String desc;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
}
