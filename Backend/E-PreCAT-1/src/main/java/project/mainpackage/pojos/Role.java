package project.mainpackage.pojos;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="role")
@EntityListeners(AuditingEntityListener.class)
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "ROLEID")
	private Integer ROLEID;
	

	@Column(name= "RoleName")
	private String RoleName;
	

	@Column(name= "RoleDescription")
	private String RoleDescription;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "role")
	Set<User> user = new HashSet<User>();


	public Role() {
		super();
	}


	public int getRoleId() {
		return ROLEID;
	}


	public void setRoleId(int roleId) {
		ROLEID = roleId;
	}


	public String getRoleName() {
		return RoleName;
	}


	public void setRoleName(String roleName) {
		RoleName = roleName;
	}


	public String getRoleDescription() {
		return RoleDescription;
	}


	public void setRoleDescription(String roleDescription) {
		RoleDescription = roleDescription;
	}


	@Override
	public String toString() {
		return "Role [ROLEID=" + ROLEID + ", RoleName=" + RoleName + ", RoleDescription=" + RoleDescription + "]";
	}
	
	

}
