package com.bean;

import java.io.Serializable;

/**
 * @author Vinay Singh Rawat
 * @Description This a a simple bean class which will represent an article
 */
public class Article implements Serializable{
	private static final long serialVersionUID = -822312181022679845L;
	//private int id;
	private int Id;
	//private String title;
	private String Title;
	//private String content;
	private String Descriptn;
	private String Featured_Image;
	private int Movie_Length_in_mins;
	private String Movie_Release_Date;
	
	public Article() {
		
	}

	public Article(int id, String title, String descriptn, String featured_Image, int movie_Length_in_mins,
			String movie_Release_Date) {
		super();
		this.Id = id;
		this.Title = title;
		this.Descriptn = descriptn;
		this.Featured_Image = featured_Image;
		this.Movie_Length_in_mins = movie_Length_in_mins;
		this.Movie_Release_Date = movie_Release_Date;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public String getDescriptn() {
		return Descriptn;
	}

	public void setDescriptn(String descriptn) {
		this.Descriptn = descriptn;
	}

	public String getFeatured_Image() {
		return Featured_Image;
	}

	public void setFeatured_Image(String featured_Image) {
		this.Featured_Image = featured_Image;
	}

	public int getMovie_Length_in_mins() {
		return Movie_Length_in_mins;
	}

	public void setMovie_Length_in_mins(int movie_Length_in_mins) {
		this.Movie_Length_in_mins = movie_Length_in_mins;
	}

	public String getMovie_Release_Date() {
		return Movie_Release_Date;
	}

	public void setMovie_Release_Date(String movie_Release_Date) {
		this.Movie_Release_Date = movie_Release_Date;
	}

	/*public static long getSerialversionuid() {
		return serialVersionUID;
	}
	*/
	
}
	/*public Article(int id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
*/