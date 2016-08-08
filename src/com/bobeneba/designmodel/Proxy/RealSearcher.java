package com.bobeneba.designmodel.Proxy;

public class RealSearcher implements Searcher {

	public RealSearcher(){
		
	}
	@Override
	public String doSearch(String userId, String searchType) {
		// TODO Auto-generated method stub
		String sql ="Select * from data_table where key_col='"+searchType;
		return sql;
	}

}
