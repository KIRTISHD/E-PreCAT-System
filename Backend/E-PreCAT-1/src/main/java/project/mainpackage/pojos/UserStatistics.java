package project.mainpackage.pojos;

import java.time.LocalDate;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="user_statistics")
@EntityListeners(AuditingEntityListener.class)
public class UserStatistics {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "STID")
	private Integer STID;
	
	/*@ManyToOne
	@JoinColumn(name="UID")*/
	@OneToOne
	@JoinColumn(name = "UID")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="TestID")
	private Test test;
	
	private int marks;
	
	private LocalDate TestDate;
	
	
	public UserStatistics() {
		super();
	}

	public Integer getSTID() {
		return STID;
	}

	public void setSTID(Integer sTID) {
		STID = sTID;
	}

	/*
	public User getUser() {
		return user;
	}
*/
	public void setUser(User user) {
		this.user = user;
	}
	

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public LocalDate getTestDate() {
		return TestDate;
	}

	public void setTestDate(LocalDate testDate) {
		TestDate = testDate;
	}

	

}
