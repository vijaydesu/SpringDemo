/**
 * 
 */
package com.test.ioc;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;



/**
 * @author Admin
 *
 */
public class Player {
	
	private int id;
	private String name;
	private String city;
	private List<String> teamList;
	private Set<String> citiesVisited;
	private Map<String,Integer> totalRunsByYear;
	/*private String currentTeam;
	private int noofmatches;
	private int Rank;
	*/
	
	public Player(){}
	
	public Player(int id, String name,String city){
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	//Testing constructor ambiguity
	
	public Player(String name,int id, String city){
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	
	/**
	 * @return the teamList
	 */
	public List<String> getTeamList() {
		return teamList;
	}

	/**
	 * @param teamList the teamList to set
	 */
	public void setTeamList(List<String> teamList) {
		this.teamList = teamList;
	}

	/**
	 * @return the citiesVisited
	 */
	public Set<String> getCitiesVisited() {
		return citiesVisited;
	}

	/**
	 * @param citiesVisited the citiesVisited to set
	 */
	public void setCitiesVisited(Set<String> citiesVisited) {
		this.citiesVisited = citiesVisited;
	}

	/**
	 * @return the totalRunsByYear
	 */
	public Map<String, Integer> getTotalRunsByYear() {
		return totalRunsByYear;
	}

	/**
	 * @param totalRunsByYear the totalRunsByYear to set
	 */
	public void setTotalRunsByYear(Map<String, Integer> totalRunsByYear) {
		this.totalRunsByYear = totalRunsByYear;
	}
	
	public String format(Collection c){
		
		if(c instanceof List)
		{
			return listToString((List<String>)c);
		}		
		else if(c instanceof Set)
		{
			return setToString((Set<String>)c);
		}
		else if(c instanceof Map)
		{
			return mapToString((Map<String,Integer>)c);
		}
		
		return null;
		
	}

	private String mapToString(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return null;
	}

	private String setToString(Set<String> set) {
		// TODO Auto-generated method stub
		return null;
	}

	private String listToString(List<String> list) {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString(){
		return ("Player ID : "+id
				+"\nPlayer Name : "+name
				+"\nPlayer City : "+city
				+"\nTeams Played : "+ ((teamList!=null)?teamList.toString():"")
				+"\nCities Visited :  "+((citiesVisited!=null)?citiesVisited.toString():"")
				+"\nTotal Runs By Year : "+((totalRunsByYear!=null)?totalRunsByYear.toString():"")); 
	}
	
	
}
