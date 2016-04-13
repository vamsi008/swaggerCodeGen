package com.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-04-13T14:21:10.620+05:30")
public class Employee   {
  
  private Integer empID = null;
  private String empName = null;
  private String empEmail = null;
  private String managerID = null;
  private List<String> projectIDs = new ArrayList<String>();

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("empID")
  public Integer getEmpID() {
    return empID;
  }
  public void setEmpID(Integer empID) {
    this.empID = empID;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("empName")
  public String getEmpName() {
    return empName;
  }
  public void setEmpName(String empName) {
    this.empName = empName;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("empEmail")
  public String getEmpEmail() {
    return empEmail;
  }
  public void setEmpEmail(String empEmail) {
    this.empEmail = empEmail;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("managerID")
  public String getManagerID() {
    return managerID;
  }
  public void setManagerID(String managerID) {
    this.managerID = managerID;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("projectIDs")
  public List<String> getProjectIDs() {
    return projectIDs;
  }
  public void setProjectIDs(List<String> projectIDs) {
    this.projectIDs = projectIDs;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(empID, employee.empID) &&
        Objects.equals(empName, employee.empName) &&
        Objects.equals(empEmail, employee.empEmail) &&
        Objects.equals(managerID, employee.managerID) &&
        Objects.equals(projectIDs, employee.projectIDs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empID, empName, empEmail, managerID, projectIDs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    
    sb.append("    empID: ").append(toIndentedString(empID)).append("\n");
    sb.append("    empName: ").append(toIndentedString(empName)).append("\n");
    sb.append("    empEmail: ").append(toIndentedString(empEmail)).append("\n");
    sb.append("    managerID: ").append(toIndentedString(managerID)).append("\n");
    sb.append("    projectIDs: ").append(toIndentedString(projectIDs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

