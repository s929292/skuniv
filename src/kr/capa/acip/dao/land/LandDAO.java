package kr.capa.acip.dao.land;

import java.util.List;

import kr.capa.acip.vo.land.LandVO;

//���� dao�������̽�
public interface LandDAO {
	public int insertLand(LandVO land)throws RuntimeException;
	public LandVO selectLand(int lnum)throws RuntimeException;
	public List<LandVO> selectAll()throws RuntimeException;
}