package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import repositories.ActorRepository;
import repositories.CommentRepository;

@Service
@Transactional
public class ActorService {

	@Autowired
	private ActorRepository actorRepository;


	public ActorService() {
		super();
	}
}
