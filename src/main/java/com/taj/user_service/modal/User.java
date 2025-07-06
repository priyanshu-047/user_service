package com.taj.user_service.modal;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;


@Entity
@Data
public class User {
  
	@Id
	@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty
	private String name;
    @Email
	private String email;
    @NotEmpty
	private String password;
    @NumberFormat(style = Style.NUMBER)
	private int phoneNumber;
	
	
}
