package com.science.action;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import com.science.dao.CityDao;
import com.science.model.City;

public class CityActionDemo extends ActionSupport {
	private CityDao dao = new CityDao();
	private int id ;
	private List<City> province;
	private List<City> citys;
	private List<City> areas;

	public String list() throws Exception {
		province = dao.searchChildCityById(1);
		if(id!=0){
			City city = dao.inqueryCityById(id);
			switch (city.getClassType()) {
			case 1://省
				citys = dao.searchChildCityById(id);
				break;
			case 2://市
				citys = dao.searchChildCityById(city.getClassParentId());
				areas = dao.searchChildCityById(id);
				break;
			}
		}
		return SUCCESS;
	}
	public String cityListInit() {
		return "cityListInit";
	}
	public void cityList() throws Exception {
		Gson gson = new Gson();
		//jsp传入-1代表查询所有省
		if(id==-1){
			citys = dao.searchChildCityById(1);
		}else{
			citys = dao.searchChildCityById(id);
			
		}
		HttpServletResponse response =ServletActionContext.getResponse();
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(gson.toJson(citys));
	} 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public List<City> getProvince() {
		return province;
	}

	public void setProvince(List<City> province) {
		this.province = province;
	}

	public List<City> getCitys() {
		return citys;
	}

	public void setCitys(List<City> citys) {
		this.citys = citys;
	}

	public List<City> getAreas() {
		return areas;
	}

	public void setAreas(List<City> areas) {
		this.areas = areas;
	}

	
	

}
