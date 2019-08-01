package project.mainpackage.pojos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="user")
@EntityListeners(AuditingEntityListener.class)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "UID")
	private Integer UID;
	
	
	private String username;
	private String password;
	private String email;
	private int phoneno;
	private LocalDate dob;
	
	@ManyToOne
	@JoinColumn(name="ROLEID")
	private Role role;
	
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "ResponseID",fetch = FetchType.LAZY)
	Set<UserResponse> response = new HashSet<UserResponse>();
	
	/*@OneToMany(cascade=CascadeType.ALL, mappedBy = "STID")
	Set<UserStatistics> statistics = new HashSet<UserStatistics>();*/
	
	@OneToOne(mappedBy = "user")
	UserStatistics statistics ;

	public Set<UserResponse> getResponse() {
		return response;
	}

	public void setResponse(Set<UserResponse> response) {
		this.response = response;
	}

	public User() {
		super();
	}
	
	

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Integer getUID() {
		return UID;
	}

	public void setUID(Integer uID) {
		UID = uID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public LocalDate getDOB() {
		return dob;
	}

	public void setDOB(LocalDate dOB) {
		this.dob = dOB;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User(String username, String password, String email, int phoneno, LocalDate dOB, Role role) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneno = phoneno;
		this.dob = dOB;
		this.role = role;
	}

	public User(String username, String password, String email, int phoneno, LocalDate dob, Role role,
			Set<UserResponse> response) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneno = phoneno;
		this.dob = dob;
		this.role = role;
		this.response = response;
	}

	public User(Integer uID, String username, String password, String email, int phoneno, LocalDate dob, Role role,
			Set<UserResponse> response, UserStatistics statistics) {
		super();
		UID = uID;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneno = phoneno;
		this.dob = dob;
		this.role = role;
		this.response = response;
		this.statistics = statistics;
	}
	
	

	public User(Integer uID, String username, String password, String email, int phoneno, LocalDate dob, Role role) {
		super();
		UID = uID;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneno = phoneno;
		this.dob = dob;
		this.role = role;
	}
	
	

	public User(Integer uID, String username, Role role) {
		super();
		UID = uID;
		this.username = username;
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [UID=" + UID + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", phoneno=" + phoneno + ", dob=" + dob + ", role=" + role +"";
	}

}
