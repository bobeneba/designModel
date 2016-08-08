package com.bobeneba.designmodel.Proxy;

import javax.accessibility.AccessibleValue;

public class Proxy implements Searcher {

	public RealSearcher search;
	public UsageLogger logger;
	public AcessValidator ac;
	
	public Proxy(){
		search = new RealSearcher();
	}
	@Override
	public String doSearch(String userId, String searchType) {
		// TODO Auto-generated method stub
		if(checkAccess(userId)){
			String result = search.doSearch(userId, searchType);
					logUsage(userId);
					return result;
		}else{
			return null;
		}
	}
	private boolean checkAccess(String userId){
		ac = new AcessValidator();
		return ac.vaidateUser(userId);
	}
	private void logUsage(String userId){
		logger = new UsageLogger();
		logger.setUserId(userId);
	}

}
