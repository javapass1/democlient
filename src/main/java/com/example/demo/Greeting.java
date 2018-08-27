package com.example.demo;

public class Greeting {

	private  long id;
    public long getId() {
		return id;
	}



	public String getContent() {
		return content;
	}



	private  String content;
    
    public Greeting() {
       
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

 
}
