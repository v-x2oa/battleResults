package exe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "totalresults")
public class TotalResults {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "totalMatch")
	private Integer totalMatch;

	@Column(name = "totalWin")
	private Integer totalWin;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTotalMatch() {
		return totalMatch;
	}

	public void setTotalMatch(Integer totalMatch) {
		this.totalMatch = totalMatch;
	}

	public Integer getTotalWin() {
		return totalWin;
	}

	public void setAge(Integer totalWin) {
		this.totalWin = totalWin;
	}
}
