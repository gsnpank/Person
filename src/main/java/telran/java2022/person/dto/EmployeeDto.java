package telran.java2022.person.dto;

import lombok.Getter;

@Getter
public class EmployeeDto extends PersonDto {
	String company;
	Integer salary;
}
