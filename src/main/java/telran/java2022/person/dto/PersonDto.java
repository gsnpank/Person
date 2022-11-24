package telran.java2022.person.dto;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class PersonDto {
	 Integer id;
	 String name;
	 LocalDate birthDate;
	 AddressDto address;
}
