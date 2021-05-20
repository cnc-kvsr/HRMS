package JavaKamp.hrms.business.abstracts;

import java.util.List;

import JavaKamp.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
