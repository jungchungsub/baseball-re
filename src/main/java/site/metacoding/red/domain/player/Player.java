package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
	private Integer id;
	private String name;
	private String position;
	private Integer teamId;
	private Timestamp createdAt;
	
	private String no;
	private String teamName;
}	
