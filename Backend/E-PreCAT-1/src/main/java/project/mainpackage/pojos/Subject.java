package project.mainpackage.pojos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="subject")
@EntityListeners(AuditingEntityListener.class)
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "SID")
	private Integer SubjectID;
	
	
	@Column(name= "SujectName")
	private String SubjectName;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "subject")
	Set<Questions> question = new HashSet<Questions>();
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "subject")
	List<Test> test = new ArrayList<Test>();
	

	public Subject() {
		super();
	}

	public int getSubjectID() {
		return SubjectID;
	}


	public void setSubjectID(int subjectID) {
		SubjectID = subjectID;
	}


	public String getSubjectName() {
		return SubjectName;
	}


	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

/*
	public Set<Questions> getQuestion() {
		return question;
	}


	public void setQuestion(Set<Questions> question) {
		this.question = question;
	}
	*/
}
