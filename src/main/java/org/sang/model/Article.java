package org.sang.model;

public class Article {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.id
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.title
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.categoryId
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	private Integer categoryid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.file
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	private String file;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.date
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	private String date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.user_id
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	private Integer userId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.id
	 * @return  the value of article.id
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.id
	 * @param id  the value for article.id
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.title
	 * @return  the value of article.title
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.title
	 * @param title  the value for article.title
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.categoryId
	 * @return  the value of article.categoryId
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	public Integer getCategoryid() {
		return categoryid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.categoryId
	 * @param categoryid  the value for article.categoryId
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.file
	 * @return  the value of article.file
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	public String getFile() {
		return file;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.file
	 * @param file  the value for article.file
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	public void setFile(String file) {
		this.file = file;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.date
	 * @return  the value of article.date
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	public String getDate() {
		return date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.date
	 * @param date  the value for article.date
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.user_id
	 * @return  the value of article.user_id
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.user_id
	 * @param userId  the value for article.user_id
	 * @mbg.generated  Tue Nov 07 16:00:47 CST 2017
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}