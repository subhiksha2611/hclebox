package com.ebox;

public abstract class EventAbstract {
protected String name,detail,type,organiser;
EventAbstract(){
	
}
EventAbstract(String n,String d,String t,String o){
	this.name=n;
	this.detail=d;
	this.type=t;
	this.organiser=o;
}
protected String getName() {
	return name;
}
protected void setName(String n) {
	this.name = n;
}
protected String getDetail() {
	return detail;
}
protected void setDetail(String d) {
	this.detail = d;
}
protected String getType() {
	return type;
}
protected void setType(String t) {
	this.type = t;
}
protected String getOrganiser() {
	return organiser;
}
protected void setOrganiser(String o) {
	this.organiser = o;
}
abstract double calculateAmount();
}


