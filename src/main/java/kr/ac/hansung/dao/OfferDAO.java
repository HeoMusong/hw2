package kr.ac.hansung.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Offer;

@Repository
public class OfferDAO {

	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from class";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}

	// querying and returning a single object
	public Offer getOffer(String id) {
		String sqlStatement = "select * from class where id=?";

		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { id }, new OfferMapper());
	}

	// querying and returning multiple object
	public List<Offer> getOffers() {
		String sqlStatement = "select * from class";

		return jdbcTemplateObject.query(sqlStatement, new OfferMapper());
	}
	
	// querying and returning multiple object
		public List<Offer> getOffers2(int year, int semester) {
			String sqlStatement = "select * from class where (year=? and semester=?)";

			return jdbcTemplateObject.query(sqlStatement, new Object[] { year, semester }, new OfferMapper());
		}

	public boolean insert(Offer offer) {

		int year = offer.getYear();
		int semester = offer.getSemester();
		String code = offer.getCode();
		String subject = offer.getSubject();
		String classify = offer.getClassify();
		int credit = offer.getCredit();

		String sqlStatement = "insert into class (year, semester, code, subject, classify, credit) values (?,?,?,?,?,?)";
		return (jdbcTemplateObject.update(sqlStatement,
				new Object[] { year, semester, code, subject, classify, credit }) == 1);
	}

	public boolean update(Offer offer) {

		int id = offer.getId();
		int year = offer.getYear();
		int semester = offer.getSemester();
		String code = offer.getCode();
		String subject = offer.getSubject();
		String classify = offer.getClassify();
		int credit = offer.getCredit();

		String sqlStatement = "update class set year=?, semester=?, code=?, subject=?, classify=?, credit=? where id=?";
		return (jdbcTemplateObject.update(sqlStatement,
				new Object[] { year, semester, code, subject, classify, credit, id }) == 1);
	}
	
	public boolean delete(int id) {
		String sqlStatement = "delete from class where id=?";
		return(jdbcTemplateObject.update(sqlStatement, new Object[] {id}) == 1);
	}
}
