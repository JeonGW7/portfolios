package com.spring.model.product;

public class Computer {
	//변수
	private String name; //컴퓨터 이름
	private String cpu;
	private String memory;
	private String disk;
	
	//생성자
	public Computer(String name){
		this.name=name;
	}
	
	//getter,setter 
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getDisk() {
		return disk;
	}

	public void setDisk(String disk) {
		this.disk = disk;
	}
	
	//기타 메서드 
	public String getContents(){
		return name+"["+cpu+"CPU, "+memory+" MEM,"+disk+" HDD]"; 
	}
}//class-end
