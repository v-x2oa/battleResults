package exe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TotalResultsService {
	@Autowired
	BattleResultsRepository battleResultsRepository;

	public List<TotalResults> findAll() {
		return battleResultsRepository.findAll();
	}
}
