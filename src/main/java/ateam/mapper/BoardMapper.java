package ateam.mapper;

import java.util.List;

import ateam.dto.BoardDTO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface BoardMapper {

	public List<BoardDTO> boardList();
}
