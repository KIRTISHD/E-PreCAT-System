package project.mainpackage.pojos;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="user_response")
@EntityListeners(AuditingEntityListener.class)
public class UserResponse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "ResponseID")
	private Integer ResponseID;
	
	
	@ManyToOne
	@JoinColumn(name="QID")
	private Questions question;
	
	@ManyToOne
	@JoinColumn(name="UID")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="TestID")
	private Test test;
	
	
	private int selectedAnswer;


	public UserResponse() {
		super();
	}


	public Integer getResponseID() {
		return ResponseID;
	}


	public void setResponseID(Integer responseID) {
		ResponseID = responseID;
	}

/*
	public Questions getQuestion() {
		return question;
	}


	public void setQuestion(Questions question) {
		this.question = question;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Test getTest() {
		return test;
	}


	public void setTest(Test test) {
		this.test = test;
	}
*/

	public int getSelectedAnswer() {
		return selectedAnswer;
	}


	public void setSelectedAnswer(int selectedAnswer) {
		this.selectedAnswer = selectedAnswer;
	}
	
	
}
