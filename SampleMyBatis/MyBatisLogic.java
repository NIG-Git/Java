package sysblo.logic;

import org.apache.ibatis.session.SqlSession;

import sysblo.client.CustomerInfoTblMapper;
import sysblo.entity.CustomerInfoTbl;
import sysblo.util.SessionUtil;


public class MyBatisLogic {

	private static CustomerInfoTblMapper mapper;

	public CustomerInfoTbl execute(){

		//セッション作成
		SqlSession session = SessionUtil.createSessino();

		//Mapper取得
		mapper = session.getMapper(CustomerInfoTblMapper.class);

		try{

			//主キーからレコードを取得するメソッド実行
			CustomerInfoTbl tbl = mapper.selectByPrimaryKey("1234567");

			return tbl;

		}finally{

			session.close();

		}

	}

}
