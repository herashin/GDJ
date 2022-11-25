package com.gdu.movie.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {
	
	private int no;
	private String title;
	private String genre;
	private String description;
	private int star;
	
}
