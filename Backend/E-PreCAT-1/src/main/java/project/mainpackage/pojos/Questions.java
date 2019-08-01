package project.mainpackage.pojos;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="questions")
@EntityListeners(AuditingEntityListener.class)
public class Questions {
	
	@Id
	@Column(name = "QID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Qid;
	
	@Column(name = "Question")
	private String Question;
	
	@Column(name = "OP1")
	private int Option1;
	
	@Column(name = "OP2")
	private int Option2;
	
	@Column(name = "OP3")
	private int Option3;
	
	@Column(name = "OP4")
	private int Option4;
	
	@Column(name = "answer")
	private int answer;
	
	@ManyToOne
	@JoinColumn(name="SID")
	private Subject subject;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "ResponseID")
	Set<UserResponse> response = new HashSet<UserResponse>();
	
	public Questions() {
		super();
	}

	public int getQid() {
		return Qid;
	}

	public void setQid(int qid) {
		Qid = qid;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public int getOption1() {
		return Option1;
	}

	public void setOption1(int option1) {
		Option1 = option1;
	}

	public int getOption2() {
		return Option2;
	}

	public void setOption2(int option2) {
		Option2 = option2;
	}

	public int getOption3() {
		return Option3;
	}

	public void setOption3(int option3) {
		Option3 = option3;
	}

	public int getOption4() {
		return Option4;
	}

	public void setOption4(int option4) {
		Option4 = option4;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	

}
