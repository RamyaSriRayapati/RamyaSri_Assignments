package com.teamb.Restfulwebservices3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
@Component
public class locationResource {
	static HashMap<Integer,location>locationIdMap;
	
	public locationResource() 
	{
		locationIdMap=new HashMap<Integer,location>();
			
			location indiaCountry=new location(1,"INDIA","Delhi","DalluPura");
			location usCountry=new location(99501,"USA","AK","ANCHORAGE");
			location ukCountry=new location(3,"UK","London","Bromley");
         
			
			locationIdMap.put(1, indiaCountry);
			locationIdMap.put(99501, usCountry);
			locationIdMap.put(3, ukCountry);
			
	}
	public List getAllCountries() {
		List countries =new ArrayList(locationIdMap.values());
		return countries;
	}
	public location getlocationbyID(int id)
	{
		location loc=locationIdMap.get(id);
		return loc;
	}
}
