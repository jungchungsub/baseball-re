package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;
import site.metacoding.red.web.dto.stadium.StadiumInertReqDto;
import site.metacoding.red.web.dto.team.TeamInsertReqDto;

// 서비스는 Dao 조합하고, 트랜잭션을 관리한다.

@RequiredArgsConstructor
@Service // IoC 등록
public class TeamService {
	
	// DI
	private final TeamDao teamDao;

	public List<Team> 목록보기(){
		return teamDao.findAll();
	}
	
	public void 팀등록(TeamInsertReqDto teamInsertReqDto) {
		teamDao.insert(teamInsertReqDto.toEntity());
	}
	
	public void 팀삭제(Integer id) {
		teamDao.deleteById(id);
	}
	
	
	// Controller는 DTO로 받고, DAO는 Entity로 넘기자. (Insert, Update)
//	public void 경기장등록(StadiumInertReqDto stadiumInertReqDto) {
//		stadiumDao.insert(stadiumInertReqDto.toEntity());
//	}
}
