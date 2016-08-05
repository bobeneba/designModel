package com.bobeneba.designmodel.Prosingleton;
/**
*
*                     _oo0oo_
*                    o8888888o
*                    88" . "88
*                    (| -_- |)
*                    0\  =  /0
*                  ___/`---'\___
*                .' \\|     |// '.
*               / \\|||  :  |||// \
*              / _||||| -:- |||||- \
*             |   | \\\  -  /// |   |
*             | \_|  ''\---/''  |_/ |
*             \  .-\__  '-'  ___/-. /
*           ___'. .'  /--.--\  `. .'___
*        ."" '<  `.___\_<|>_/___.' >' "".
*       | | :  `- \`.;`\ _ /`;.`/ - ` : | |
*       \  \ `_.   \_ __\ /__ _/   .-` /  /
*   =====`-.____`.___ \_____/___.-`___.-'=====
*                     `=---='
*
*   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*               佛祖开光  永无bug
/**   
* @Title: file_name 
* @Package package_name 
* @Description: TODO 读取配置 properties文件
* @author bobeneba dengtao139796@gmail.com
* @date 2016年8月5日 上午10:29:14 
* @version V1.0   
*/
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigManager {

	private static final String PFILE = System.getProperty("user.dir")+"/src/com/bobeneba/designmodel/Prosingleton"+File.separator+"Singleton.properties";
	private static ConfigManager instance = new ConfigManager();
	
	private File file = null;
	private long lastModifiedTime = 0;
	private Properties props = null;
	
	private ConfigManager(){
		file = new File(PFILE);
		lastModifiedTime = file.lastModified();
		System.out.println("lastModifiedTime"+lastModifiedTime);
		if(lastModifiedTime ==0){
			System.out.println(PFILE + "::file does not exist");
		}
		props= new Properties();
		try {
			props.load(new FileInputStream(PFILE));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	synchronized  public static ConfigManager getInstance(){
		return instance;
	}
	final public Object getConfigItem(String name, Object defaultVal){
		long newTime = file.lastModified();
		if(newTime == 0){
			if(lastModifiedTime==0){
				System.out.println(PFILE + "::file does not exist");
			}
			else{
				System.out.println(PFILE + "::file was deleted");
			}
			return defaultVal;
		}
		else if(newTime > lastModifiedTime){
			props.clear();
			try {
				System.out.println("reload");
				props.load(new FileInputStream(PFILE));
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		lastModifiedTime = newTime;
		Object val = props.getProperty(name);
		if(val==null){
			return defaultVal;
		}else{
			return val;
		}
		
		
	}
}
