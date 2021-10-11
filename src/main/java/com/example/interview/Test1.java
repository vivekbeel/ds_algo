package com.example.interview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


class Emp{
	String empId;
	String empName;
	Address address;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Emp(String empId,String empName,Address address) {
		// TODO Auto-generated constructor stub
		this.empId=empId;
		this.empName=empName;
		this.address=address;
	}
	@Override
	public int hashCode() {
		final int temp = 14*Integer.valueOf(empId);
        int ans = 1;
        ans = temp * ans ;
        return ans;
	}
	@Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Emp other = (Emp)o;
        if (this.empId != other.empId) {
            return false;
        }
        return true;
    }

}

class Address{
	String city;
	String country;
	public Address(String city,String country) {
		// TODO Auto-generated constructor stub
		this.city=city;
		this.country=country;
	}
	@Override
	public int hashCode() {
		final int temp = 14;
        int ans = 1;
        ans = temp * ans ;
        return ans;
	}
	@Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Address other = (Address)o;
        if (this.city != other.city) {
            return false;
        }
        return true;
    }

}
class MyNameComp implements Comparator<Emp> {

    public int compare(Emp o1, Emp o2) {
           return o1.getEmpName().compareTo(o2.getEmpName());
    }

}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Emp, Object> map=new TreeMap<Emp, Object>(new MyNameComp());
		Map<Emp, Object> map1=new HashMap<Emp, Object>();
		map.put(new Emp("1", "vivek",new Address("sikar", "india")), 12);
		map.put(new Emp("1", "vivek",new Address("sikar", "india")), 13);
		map1.put(new Emp("1", "vivek",new Address("sikar", "india")), 14);
		map1.put(new Emp("1", "vivek",new Address("sikar", "india")), 15);
		System.out.println(map.size());
		System.out.println(map1.size());
		System.out.println(map.get(new Emp("1", "vivek",new Address("sikar", "india"))));
		System.out.println(map1.get(new Emp("1", "vivek",new Address("sikar", "india"))));
	}

}
