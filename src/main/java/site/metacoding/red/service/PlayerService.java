package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;

import site.metacoding.red.web.dto.player.PlayerInsertReqDto;

// 서비스는 Dao 조합하고, 트랜잭션을 관리한다.

@RequiredArgsConstructor
@Service // IoC 등록
public class PlayerService {

	// DI

	private final PlayerDao playerDao;

	public List<Player> 목록보기() {
		return playerDao.findAll();
	}

	public void 선수등록(PlayerInsertReqDto playerInsertReqDto) {
		playerDao.insert(playerInsertReqDto.toEntity());
	}
	
	public void 선수삭제(Integer id) {
		playerDao.deleteById(id);
	}

	// Controller는 DTO로 받고, DAO는 Entity로 넘기자. (Insert, Update)
//	public void 경기장등록(StadiumInertReqDto stadiumInertReqDto) {
//		stadiumDao.insert(stadiumInertReqDto.toEntity());
//	}
}
