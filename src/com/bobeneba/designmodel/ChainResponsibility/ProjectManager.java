package com.bobeneba.designmodel.ChainResponsibility;

public class ProjectManager extends Handler {
	
	
	
	@Override
	public String handleFeeRequest(String user, double fee) {
		// TODO Auto-generated method stub
		String str ="";
		if(fee <500){
			str = "成功：项目经理统一"+user + ":聚餐费用，金额："+fee;
		}else{
			if(getSuccessor()!=null){
				return getSuccessor().handleFeeRequest(user, fee);
			}
		}
		return str;
	}
	
}
