package com.example.callingApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PostOffice {
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Description")
	private String Description;
	
	
	@JsonProperty("BranchType")
	private String BranchType;
	
	
	@JsonProperty("DeliveryStatus")
	private String DeliveryStatus;
	
	
	@JsonProperty("Circle")
	private String Circle;
	
	
	@JsonProperty("District")
	private String District;
	
	
	@JsonProperty("Division")
	private String Division;
	
	
	@JsonProperty("Region")
	private String Region;


	@JsonProperty("Block")
	private String Block;
	
	
	
	@JsonProperty("State")
	private String State;
	
	
	@JsonProperty("Country")
	private String Country;
	
	@JsonProperty("Pincode")
	private String Pincode;
	
	
}