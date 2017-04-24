package se.nss.candidate.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.nss.candidate.dao.CandidateDao;
import se.nss.candidate.entity.Candidate;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	private CandidateDao candidateDao;

	@Override
	public Candidate findByEmail(String email) {
		return candidateDao.findByEmail(email);
	}

	@Override
	public Candidate save(Candidate candidate) {
		return candidateDao.save(candidate);

	}

	@Override
	public void delete(Candidate candidate) {
		candidateDao.delete(candidate);

	}

	@Override
	public Optional<Candidate> findOne(long id) {
		return candidateDao.findOne(id);
	}

}
