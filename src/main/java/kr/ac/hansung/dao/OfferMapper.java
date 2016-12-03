package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.model.Offer;

public class OfferMapper implements RowMapper<Offer> {

	@Override
	public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {

		Offer offer = new Offer();

		offer.setId(rs.getInt("id"));
		offer.setYear(rs.getInt("year"));
		offer.setSemester(rs.getInt("semester"));
		offer.setCode(rs.getString("code"));
		offer.setSubject(rs.getString("subject"));
		offer.setClassify(rs.getString("classify"));
		offer.setCredit(rs.getInt("credit"));

		return offer;

	}
}
