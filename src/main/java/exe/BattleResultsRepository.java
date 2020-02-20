package exe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BattleResultsRepository extends JpaRepository<TotalResults, Integer> {

}