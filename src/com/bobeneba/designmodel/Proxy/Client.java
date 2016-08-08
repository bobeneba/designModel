package com.bobeneba.designmodel.Proxy;

public class Client {
	private static Searcher searcher;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		searcher = new Proxy();
		String useId = "Admin";
		String searchType = "search_by_account_number";
		String result = searcher.doSearch(useId, searchType);
		System.out.println(result);
	}

}
