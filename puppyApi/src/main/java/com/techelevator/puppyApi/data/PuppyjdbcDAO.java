package com.techelevator.puppyApi.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.puppyApi.model.Puppy;

@Component
public class PuppyjdbcDAO implements PuppyDAO {

	private JdbcTemplate jdbcTemplate;
	
	
	
	public PuppyjdbcDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Puppy> getPuppies() {
		List <Puppy> puppyList = new ArrayList<Puppy>();
		String sqlGetAllPuppies = "SELECT * FROM puppies";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlGetAllPuppies);
		while (result.next()) {
			int id = result.getInt("id");
			String name = result.getString("name");
			int weight = result.getInt("weight");
			String gender = result.getString("gender");
			boolean paperTrained = result.getBoolean("paper_trained");
			
			Puppy puppy = new Puppy(id, name, weight, gender, paperTrained);
			puppyList.add(puppy);
		}
		return puppyList;
	}

	@Override
	public Puppy getPuppy(int id) {
		Puppy puppy = null;
		String sqlGetPuppies = "SELECT * FROM puppies WHERE id = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlGetPuppies, id);
		while (result.next()) {
			int thisId = result.getInt("id");
			String name = result.getString("name");
			int weight = result.getInt("weight");
			String gender = result.getString("gender");
			boolean paperTrained = result.getBoolean("paper_trained");
			
			puppy = new Puppy(thisId, name, weight, gender, paperTrained);
		}
		return puppy;
	}

	@Override
	public Puppy savePuppy(Puppy puppyToSave) {
		String name = puppyToSave.getName();
		int weight = puppyToSave.getWeight();
		String gender = puppyToSave.getGender();
		boolean paperTrained = puppyToSave.isPaperTrained();
		
		Puppy puppy = new Puppy(name, weight, gender, paperTrained);
		
		String sql = "INSERT INTO puppies(name, weight,gender, paper_trained) VALUES(?, ?, ?, ?)";
		jdbcTemplate.update(sql, name, weight, gender, paperTrained);
		
		return puppy;
	}

	@Override
	public void removePuppy(int id) {
		String sql = "DELETE FROM puppies WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public Puppy editPuppy(Puppy puppyToSave) {
		// TODO Auto-generated method stub
		return null;
	}

}
