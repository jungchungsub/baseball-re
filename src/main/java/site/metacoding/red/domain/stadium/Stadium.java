package site.metacoding.red.domain.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Stadium {
	private Integer id;
	private Integer no; // dbì ìë ê°
	private String name;
	private Timestamp createdAt;
}	
