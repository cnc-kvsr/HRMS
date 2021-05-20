package JavaKamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_positions")
public class JobPosition {

	@Id
	@GeneratedValue
	@Column(name="job_id")
	private int jobId;
	
	@Column(name="job_title")
	private String jobTitle;
	
	@Column(name="job_details")
	private String jobDetails;
	
	public JobPosition() {}

	public JobPosition(int jobId, String jobTitle, String jobDetails) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.jobDetails = jobDetails;
	}
	
	
}
