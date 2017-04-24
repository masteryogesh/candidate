package se.nss.candidate.service;

import java.util.Optional;

import se.nss.candidate.entity.Candidate;

public interface CandidateService {

	public Candidate findByEmail(String email);

	public Candidate save(Candidate candidate);

	public void delete(Candidate candidate);

	public Optional<Candidate>  findOne(long id);

}
