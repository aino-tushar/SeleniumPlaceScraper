package com.ainosoft.seleniumplacescraper.manager;

import java.util.ArrayList;

import com.ainosoft.seleniumplacescraper.dao.ProxyDetailsDao;
import com.ainosoft.seleniumplacescraper.pojo.ProxyDetailsPojo;
import com.ainosoft.seleniumplacescraper.scraper.ProxyScraper;
import com.ainosoft.seleniumplacescraper.util.ScraperLogger;

/**
 * @author nalanda@ainosoft.com
 */
public class ProxyManager implements Manager {

	@SuppressWarnings("unused")
	private static ScraperLogger scraperLogger = new ScraperLogger("ProxyManager");

	ProxyDetailsDao proxyDao = new ProxyDetailsDao();
	ProxyScraper proxyScraper = new ProxyScraper();

	@Override
	public void initializeAndStart(String url, String textToSearch) {
		try {
			proxyScraper.setUrl(url);

			ArrayList<ProxyDetailsPojo> proxyPojoList = proxyScraper.startScrapingFetchProxyList();
			if(proxyPojoList!=null){
				if(!proxyPojoList.isEmpty()){
					for(ProxyDetailsPojo proxyPojo : proxyPojoList){
						proxyDao.saveProxyPojo(proxyPojo);
					}
				}
			}
		} catch (Exception e) {
			ScraperLogger.log("ProxyManager :: initializeAndStart() ::",e); 
		}
	}

	public ArrayList<ProxyDetailsPojo> getValidProxyList(){
		try {
			ArrayList<ProxyDetailsPojo> validProxyList = proxyDao.getValidProxyList();
			return validProxyList;
		} catch (Exception e) {
			ScraperLogger.log("ProxyManager :: getValidProxyList() ::",e); 
		}
		return null;
	}
	
	public void updateProxyStatus(ArrayList<ProxyDetailsPojo> proxyPojoList){ 
		try {
			proxyDao.updateProxyStatus(proxyPojoList);
		} catch (Exception e) {
			ScraperLogger.log("ProxyManager :: updateProxyStatus() ::",e); 
		}
	}
}