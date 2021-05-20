package JavaKamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import JavaKamp.hrms.business.abstracts.JobPositionService;
import JavaKamp.hrms.dataAccess.abstracts.JobPositionDao;
import JavaKamp.hrms.entities.concretes.JobPosition;

public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}


	@Override
	public List<JobPosition> getAll() {
		
		return this.jobPositionDao.findAll();
	}

}
