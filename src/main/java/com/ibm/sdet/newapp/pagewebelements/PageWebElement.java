package com.ibm.sdet.newapp.pagewebelements;

public class PageWebElement {

	public static final String APPLICATION_URL = "http://elearningm1.upskills.in/"; 
	
	// IDs
	public static final String USERNAME = "login";
	public static final String PASSWORD = "password"; 
	public static final String LOGIN_BUTTON = "form-login_submitAuth"; 
	public static final String SUBJECT_LINE = "compose_message_title";
	public static final String SEND_MESSAGE_BUTTON = "compose_message_compose";
	public static final String FIRST_NAME_TEXT_BOX = "registration_firstname";
	public static final String LAST_NAME_TEXT_BOX = "registration_lastname";
	public static final String EMAIL_TEXT_BOX = "registration_email";
	public static final String USERNAME_TEXT_BOX = "username";
	public static final String PASSWORD_TEXT_BOX = "pass1";
	public static final String CONFIRM_PASSWORD_TEXT_BOX = "pass2";
	public static final String REGISTER_BUTTON = "registration_submit";
	
	//Xpath
	public static final String ACTUAL_CONFIRMATION_MESSAGE = "/html/body/main/section/div/div[2]/div[1]/div/article/div/p[1]";
	public static final String ACTUAL_MAIL_SENT_CONFIRM_MESSAGE = "/html/body/main/section/div/div[2]/div/div[1]";
	public static final String USER_IMAGE = "//*[@id=\"user_image_block\"]/div/a/img";
	public static final String USER_EMAIL = "//*[@id=\"sn-avatar-one\"]/div/ul/li[2]/a/div";
	public static final String REGISTRATION_CONFIRM_MESSAGE = "/html/body/main/section/div/div[2]/div/p[1]";
	public static final String SEND_TO_TEXT_BOX = "//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input";
	public static final String SELECT_EMAIL_ID = "//*[@id=\"select2-compose_message_users-results\"]/li[2]";
	public static final String MESSAGE = "/html/body";
	public static final String USER_PROFILE_EMAIL_ID = "//*[@id=\"navbar\"]//ul[2]/li[2]/ul/li[1]/div/p";
	
	public static final String USER_PROFILE_IMAGE = "//*[@id=\"navbar\"]/ul[2]/li[2]/a/img";
	//Tags
	public static final String MESSAGE_TEXT_BOX = "/html/body"; 
	
	//Links
	public static final String SIGN_UP_LINK = "Sign up!";
}
