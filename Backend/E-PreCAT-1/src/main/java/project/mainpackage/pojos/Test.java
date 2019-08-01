package project.mainpackage.pojos;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="test")
@EntityListeners(AuditingEntityListener.class)
public class Test {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "TestID")
	private Integer TestID;
	
	@ManyToOne
	@JoinColumn(name="SID")
	private Subject subject;
	

	@Column(name= "NoOfQuestions")
	private int QNO;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "ResponseID")
	Set<UserResponse> response = new HashSet<UserResponse>();
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "STID")
	Set<UserStatistics> statistics = new HashSet<UserStatistics>();

	
	//----------------------
	
	/*
	public Set<UserResponse> getResponse() {
		return response;
	}


	public void setResponse(Set<UserResponse> response) {
		this.response = response;
	}
*/

	public Test() {
		super();
	}


	public Integer getTestID() {
		return TestID;
	}


	public void setTestID(Integer testID) {
		TestID = testID;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public int getQNO() {
		return QNO;
	}


	public void setQNO(int qNO) {
		QNO = qNO;
	}

/*
	public Set<UserStatistics> getStatistics() {
		return statistics;
	}


	public void setStatistics(Set<UserStatistics> statistics) {
		this.statistics = statistics;
	}
	*/
	
	
}
