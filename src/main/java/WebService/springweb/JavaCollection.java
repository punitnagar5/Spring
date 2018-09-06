package WebService.springweb;

import java.util.*;

public class JavaCollection {

	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;
	
	public void setaddressList(List addressList)
	{
		this.addressList = addressList;
	}
	
	public void setaddressSet(Set addressSet)
	{
		this.addressSet = addressSet;
	}
	 
	public void setaddressMap(Map addressMap)
	{
		this.addressMap = addressMap;
	}
	public void setaddressProp(Properties addressProp)
	{
		this.addressProp = addressProp;
	}
	
	public List getaddressList() {
		System.out.println("List Elements :"  + addressList);
		return addressList;
	}
	
	public Set getaddressSet()
	{
		 System.out.println("Set Elements :"  + addressSet);
		return addressSet;
	}
	public Map getaddressMap()
	{
		System.out.println("Map Elements :"  + addressMap);
		return addressMap;
	}
	
	public Properties getaddressProp()
	{
		System.out.println("Property Elements :"  + addressProp);
		return addressProp;
	}
}
